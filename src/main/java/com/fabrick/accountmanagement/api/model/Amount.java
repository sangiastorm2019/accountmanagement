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
@JsonPropertyOrder({ "debtorAmount", "debtorCurrency", "creditorAmount", "creditorCurrency", "creditorCurrencyDate", "exchangeRate" })
public class Amount {

	@JsonProperty("debtorAmount")
	private Integer debtorAmount;
	@JsonProperty("debtorCurrency")
	private String debtorCurrency;
	@JsonProperty("creditorAmount")
	private Integer creditorAmount;
	@JsonProperty("creditorCurrency")
	private String creditorCurrency;
	@JsonProperty("creditorCurrencyDate")
	private String creditorCurrencyDate;
	@JsonProperty("exchangeRate")
	private Integer exchangeRate;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Amount() {
	}

	/**
	 *
	 * @param exchangeRate
	 * @param creditorAmount
	 * @param debtorAmount
	 * @param debtorCurrency
	 * @param creditorCurrencyDate
	 * @param creditorCurrency
	 */
	public Amount(Integer debtorAmount, String debtorCurrency, Integer creditorAmount, String creditorCurrency, String creditorCurrencyDate, Integer exchangeRate) {
		super();
		this.debtorAmount = debtorAmount;
		this.debtorCurrency = debtorCurrency;
		this.creditorAmount = creditorAmount;
		this.creditorCurrency = creditorCurrency;
		this.creditorCurrencyDate = creditorCurrencyDate;
		this.exchangeRate = exchangeRate;
	}

	@JsonProperty("debtorAmount")
	public Integer getDebtorAmount() {
		return debtorAmount;
	}

	@JsonProperty("debtorAmount")
	public void setDebtorAmount(Integer debtorAmount) {
		this.debtorAmount = debtorAmount;
	}

	@JsonProperty("debtorCurrency")
	public String getDebtorCurrency() {
		return debtorCurrency;
	}

	@JsonProperty("debtorCurrency")
	public void setDebtorCurrency(String debtorCurrency) {
		this.debtorCurrency = debtorCurrency;
	}

	@JsonProperty("creditorAmount")
	public Integer getCreditorAmount() {
		return creditorAmount;
	}

	@JsonProperty("creditorAmount")
	public void setCreditorAmount(Integer creditorAmount) {
		this.creditorAmount = creditorAmount;
	}

	@JsonProperty("creditorCurrency")
	public String getCreditorCurrency() {
		return creditorCurrency;
	}

	@JsonProperty("creditorCurrency")
	public void setCreditorCurrency(String creditorCurrency) {
		this.creditorCurrency = creditorCurrency;
	}

	@JsonProperty("creditorCurrencyDate")
	public String getCreditorCurrencyDate() {
		return creditorCurrencyDate;
	}

	@JsonProperty("creditorCurrencyDate")
	public void setCreditorCurrencyDate(String creditorCurrencyDate) {
		this.creditorCurrencyDate = creditorCurrencyDate;
	}

	@JsonProperty("exchangeRate")
	public Integer getExchangeRate() {
		return exchangeRate;
	}

	@JsonProperty("exchangeRate")
	public void setExchangeRate(Integer exchangeRate) {
		this.exchangeRate = exchangeRate;
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
