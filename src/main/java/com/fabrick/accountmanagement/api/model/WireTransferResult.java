package com.fabrick.accountmanagement.api.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "moneyTransferId", "status", "direction", "creditor", "debtor", "cro", "uri", "trn", "description", "createdDatetime", "accountedDatetime", "debtorValueDate", "creditorValueDate", "amount", "isUrgent", "isInstant", "feeType", "feeAccountId", "fees", "hasTaxRelief" })
public class WireTransferResult {

	@JsonProperty("moneyTransferId")
	private String moneyTransferId;
	@JsonProperty("status")
	private String status;
	@JsonProperty("direction")
	private String direction;
	@JsonProperty("creditor")
	private Creditor creditor;
	@JsonProperty("debtor")
	private Debtor debtor;
	@JsonProperty("cro")
	private String cro;
	@JsonProperty("uri")
	private String uri;
	@JsonProperty("trn")
	private String trn;
	@JsonProperty("description")
	private String description;
	@JsonProperty("createdDatetime")
	private String createdDatetime;
	@JsonProperty("accountedDatetime")
	private String accountedDatetime;
	@JsonProperty("debtorValueDate")
	private String debtorValueDate;
	@JsonProperty("creditorValueDate")
	private String creditorValueDate;
	@JsonProperty("amount")
	private Amount amount;
	@JsonProperty("isUrgent")
	private Boolean isUrgent;
	@JsonProperty("isInstant")
	private Boolean isInstant;
	@JsonProperty("feeType")
	private String feeType;
	@JsonProperty("feeAccountId")
	private String feeAccountId;
	@JsonProperty("fees")
	private List<Fee> fees = new ArrayList<Fee>();
	@JsonProperty("hasTaxRelief")
	private Boolean hasTaxRelief;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public WireTransferResult() {
	}

	/**
	 *
	 * @param cro
	 * @param isUrgent
	 * @param amount
	 * @param fees
	 * @param feeAccountId
	 * @param moneyTransferId
	 * @param isInstant
	 * @param description
	 * @param debtorValueDate
	 * @param feeType
	 * @param uri
	 * @param hasTaxRelief
	 * @param trn
	 * @param debtor
	 * @param creditorValueDate
	 * @param creditor
	 * @param createdDatetime
	 * @param accountedDatetime
	 * @param status
	 * @param direction
	 */
	public WireTransferResult(String moneyTransferId, String status, String direction, Creditor creditor, Debtor debtor, String cro, String uri, String trn, String description, String createdDatetime, String accountedDatetime, String debtorValueDate, String creditorValueDate, Amount amount, Boolean isUrgent, Boolean isInstant, String feeType, String feeAccountId, List<Fee> fees,
			Boolean hasTaxRelief) {
		super();
		this.moneyTransferId = moneyTransferId;
		this.status = status;
		this.direction = direction;
		this.creditor = creditor;
		this.debtor = debtor;
		this.cro = cro;
		this.uri = uri;
		this.trn = trn;
		this.description = description;
		this.createdDatetime = createdDatetime;
		this.accountedDatetime = accountedDatetime;
		this.debtorValueDate = debtorValueDate;
		this.creditorValueDate = creditorValueDate;
		this.amount = amount;
		this.isUrgent = isUrgent;
		this.isInstant = isInstant;
		this.feeType = feeType;
		this.feeAccountId = feeAccountId;
		this.fees = fees;
		this.hasTaxRelief = hasTaxRelief;
	}

	@JsonProperty("moneyTransferId")
	public String getMoneyTransferId() {
		return moneyTransferId;
	}

	@JsonProperty("moneyTransferId")
	public void setMoneyTransferId(String moneyTransferId) {
		this.moneyTransferId = moneyTransferId;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(String status) {
		this.status = status;
	}

	@JsonProperty("direction")
	public String getDirection() {
		return direction;
	}

	@JsonProperty("direction")
	public void setDirection(String direction) {
		this.direction = direction;
	}

	@JsonProperty("creditor")
	public Creditor getCreditor() {
		return creditor;
	}

	@JsonProperty("creditor")
	public void setCreditor(Creditor creditor) {
		this.creditor = creditor;
	}

	@JsonProperty("debtor")
	public Debtor getDebtor() {
		return debtor;
	}

	@JsonProperty("debtor")
	public void setDebtor(Debtor debtor) {
		this.debtor = debtor;
	}

	@JsonProperty("cro")
	public String getCro() {
		return cro;
	}

	@JsonProperty("cro")
	public void setCro(String cro) {
		this.cro = cro;
	}

	@JsonProperty("uri")
	public String getUri() {
		return uri;
	}

	@JsonProperty("uri")
	public void setUri(String uri) {
		this.uri = uri;
	}

	@JsonProperty("trn")
	public String getTrn() {
		return trn;
	}

	@JsonProperty("trn")
	public void setTrn(String trn) {
		this.trn = trn;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("createdDatetime")
	public String getCreatedDatetime() {
		return createdDatetime;
	}

	@JsonProperty("createdDatetime")
	public void setCreatedDatetime(String createdDatetime) {
		this.createdDatetime = createdDatetime;
	}

	@JsonProperty("accountedDatetime")
	public String getAccountedDatetime() {
		return accountedDatetime;
	}

	@JsonProperty("accountedDatetime")
	public void setAccountedDatetime(String accountedDatetime) {
		this.accountedDatetime = accountedDatetime;
	}

	@JsonProperty("debtorValueDate")
	public String getDebtorValueDate() {
		return debtorValueDate;
	}

	@JsonProperty("debtorValueDate")
	public void setDebtorValueDate(String debtorValueDate) {
		this.debtorValueDate = debtorValueDate;
	}

	@JsonProperty("creditorValueDate")
	public String getCreditorValueDate() {
		return creditorValueDate;
	}

	@JsonProperty("creditorValueDate")
	public void setCreditorValueDate(String creditorValueDate) {
		this.creditorValueDate = creditorValueDate;
	}

	@JsonProperty("amount")
	public Amount getAmount() {
		return amount;
	}

	@JsonProperty("amount")
	public void setAmount(Amount amount) {
		this.amount = amount;
	}

	@JsonProperty("isUrgent")
	public Boolean getIsUrgent() {
		return isUrgent;
	}

	@JsonProperty("isUrgent")
	public void setIsUrgent(Boolean isUrgent) {
		this.isUrgent = isUrgent;
	}

	@JsonProperty("isInstant")
	public Boolean getIsInstant() {
		return isInstant;
	}

	@JsonProperty("isInstant")
	public void setIsInstant(Boolean isInstant) {
		this.isInstant = isInstant;
	}

	@JsonProperty("feeType")
	public String getFeeType() {
		return feeType;
	}

	@JsonProperty("feeType")
	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}

	@JsonProperty("feeAccountId")
	public String getFeeAccountId() {
		return feeAccountId;
	}

	@JsonProperty("feeAccountId")
	public void setFeeAccountId(String feeAccountId) {
		this.feeAccountId = feeAccountId;
	}

	@JsonProperty("fees")
	public List<Fee> getFees() {
		return fees;
	}

	@JsonProperty("fees")
	public void setFees(List<Fee> fees) {
		this.fees = fees;
	}

	@JsonProperty("hasTaxRelief")
	public Boolean getHasTaxRelief() {
		return hasTaxRelief;
	}

	@JsonProperty("hasTaxRelief")
	public void setHasTaxRelief(Boolean hasTaxRelief) {
		this.hasTaxRelief = hasTaxRelief;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
