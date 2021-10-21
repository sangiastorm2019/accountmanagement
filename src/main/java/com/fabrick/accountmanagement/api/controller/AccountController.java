package com.fabrick.accountmanagement.api.controller;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fabrick.accountmanagement.api.model.WireTransfer;
import com.fabrick.accountmanagement.service.BalanceService;
import com.fabrick.accountmanagement.service.TransactionService;
import com.fabrick.accountmanagement.service.WireTransferService;

@RestController
@RequestMapping("/api/account")
public class AccountController {

	@Autowired
	BalanceService balanceService;

	@Autowired
	TransactionService transactionService;

	@Autowired
	WireTransferService wireTransferService;

	@GetMapping("/balance/{accountId}")
	public ResponseEntity<?> getBalance(@PathVariable("accountId") Long accountId) {

		try {
			return ResponseEntity.status(HttpStatus.OK).body(balanceService.getBalance(accountId));
		} catch (KeyManagementException | NoSuchAlgorithmException | KeyStoreException | IOException e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
	}

	@GetMapping("/transactions/{accountId}")
	public ResponseEntity<?> getTransactions(@PathVariable("accountId") Long accountId, @RequestParam(name = "fromAccountingDate") String fromAccountingDate, @RequestParam(name = "toAccountingDate") String toAccountingDate) {

		try {
			return ResponseEntity.status(HttpStatus.OK).body(transactionService.getTransactions(accountId, fromAccountingDate, toAccountingDate));
		} catch (KeyManagementException | NoSuchAlgorithmException | KeyStoreException | IOException e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
	}

	@PostMapping("/payments/{accountId}")
	public ResponseEntity<?> moneyTrasfers(@PathVariable("accountId") Long accountId, @Valid @RequestBody WireTransfer wireTransfer) {

		try {
			return ResponseEntity.status(HttpStatus.OK).body(wireTransferService.moneyTrasfers(accountId, wireTransfer));
		} catch (KeyManagementException | NoSuchAlgorithmException | KeyStoreException | IOException e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}

	}

}
