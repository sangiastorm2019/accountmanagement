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
@JsonPropertyOrder({ "feeCode", "description", "amount", "currency" })
public class Fee {

	@JsonProperty("feeCode")
	private String feeCode;
	@JsonProperty("description")
	private String description;
	@JsonProperty("amount")
	private Double amount;
	@JsonProperty("currency")
	private String currency;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Fee() {
	}

	/**
	 *
	 * @param amount
	 * @param feeCode
	 * @param description
	 * @param currency
	 */
	public Fee(String feeCode, String description, Double amount, String currency) {
		super();
		this.feeCode = feeCode;
		this.description = description;
		this.amount = amount;
		this.currency = currency;
	}

	@JsonProperty("feeCode")
	public String getFeeCode() {
		return feeCode;
	}

	@JsonProperty("feeCode")
	public void setFeeCode(String feeCode) {
		this.feeCode = feeCode;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
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

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
