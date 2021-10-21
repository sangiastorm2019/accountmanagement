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
@JsonPropertyOrder({ "status", "error", "payload" })
public class BalanceResult {

	@JsonProperty("status")
	private String status;
	@JsonProperty("error")
	private List<Error> error = new ArrayList<Error>();
	@JsonProperty("payload")
	private Payload payload;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public BalanceResult() {
	}

	/**
	 *
	 * @param payload
	 * @param error
	 * @param status
	 */
	public BalanceResult(String status, List<Error> error, Payload payload) {
		super();
		this.status = status;
		this.error = error;
		this.payload = payload;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(String status) {
		this.status = status;
	}

	@JsonProperty("error")
	public List<Error> getError() {
		return error;
	}

	@JsonProperty("error")
	public void setError(List<Error> error) {
		this.error = error;
	}

	@JsonProperty("payload")
	public Payload getPayload() {
		return payload;
	}

	@JsonProperty("payload")
	public void setPayload(Payload payload) {
		this.payload = payload;
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
