package com.fabrick.accountmanagement.api.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "transactionId", "operationId", "accountingDate", "valueDate", "type", "amount", "currency", "description" })
public class List {

	@JsonProperty("transactionId")
	private String transactionId;
	@JsonProperty("operationId")
	private String operationId;
	@JsonProperty("accountingDate")
	private String accountingDate;
	@JsonProperty("valueDate")
	private String valueDate;
	@JsonProperty("type")
	private Type type;
	@JsonProperty("amount")
	private Double amount;
	@JsonProperty("currency")
	private String currency;
	@JsonProperty("description")
	private String description;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public List() {
	}

	/**
	 *
	 * @param accountingDate
	 * @param amount
	 * @param operationId
	 * @param description
	 * @param currency
	 * @param valueDate
	 * @param type
	 * @param transactionId
	 */
	public List(String transactionId, String operationId, String accountingDate, String valueDate, Type type, Double amount, String currency, String description) {
		super();
		this.transactionId = transactionId;
		this.operationId = operationId;
		this.accountingDate = accountingDate;
		this.valueDate = valueDate;
		this.type = type;
		this.amount = amount;
		this.currency = currency;
		this.description = description;
	}

	@JsonProperty("transactionId")
	public String getTransactionId() {
		return transactionId;
	}

	@JsonProperty("transactionId")
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	@JsonProperty("operationId")
	public String getOperationId() {
		return operationId;
	}

	@JsonProperty("operationId")
	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}

	@JsonProperty("accountingDate")
	public String getAccountingDate() {
		return accountingDate;
	}

	@JsonProperty("accountingDate")
	public void setAccountingDate(String accountingDate) {
		this.accountingDate = accountingDate;
	}

	@JsonProperty("valueDate")
	public String getValueDate() {
		return valueDate;
	}

	@JsonProperty("valueDate")
	public void setValueDate(String valueDate) {
		this.valueDate = valueDate;
	}

	@JsonProperty("type")
	public Type getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(Type type) {
		this.type = type;
	}

	@JsonProperty("amount")
	public Double getAmount() {
		return amount;
	}

	@JsonProperty("amount")
	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@JsonProperty("currency")
	public String getCurrency() {
		return currency;
	}

	@JsonProperty("currency")
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
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
