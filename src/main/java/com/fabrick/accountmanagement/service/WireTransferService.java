package com.fabrick.accountmanagement.service;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

import javax.net.ssl.SSLContext;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.BasicHttpClientConnectionManager;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.ssl.TrustStrategy;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.fabrick.accountmanagement.api.model.WireTransfer;
import com.fabrick.accountmanagement.api.model.WireTransferResult;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class WireTransferService {

	@Autowired
	ObjectMapper objectMapper;

	@Value("${domain}")
	private String domain;

	@Value("${auth_schema}")
	private String auth_schema;

	@Value("${api_key}")
	private String api_key;

	public WireTransferResult moneyTrasfers(Long accountId, WireTransfer wireTransfer) throws KeyManagementException, NoSuchAlgorithmException, KeyStoreException, ClientProtocolException, IOException {

		String json = objectMapper.writeValueAsString(wireTransfer);

		TrustStrategy acceptingTrustStrategy = (cert, authType) -> true;
		SSLContext sslContext = SSLContexts.custom().loadTrustMaterial(null, acceptingTrustStrategy).build();
		SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslContext, NoopHostnameVerifier.INSTANCE);

		Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory>create().register("https", sslsf).register("http", new PlainConnectionSocketFactory()).build();

		BasicHttpClientConnectionManager connectionManager = new BasicHttpClientConnectionManager(socketFactoryRegistry);

		CloseableHttpClient httpClient = HttpClients.custom().setSSLSocketFactory(sslsf).setConnectionManager(connectionManager).build();

		HttpPost httpPost = new HttpPost(domain + "/api/gbs/banking/v4.0/accounts/" + accountId + "/payments/money-transfers");
		httpPost.setHeader("Accept", "application/json");
		httpPost.setHeader("Content-type", "application/json");
		httpPost.setHeader("Auth-Schema", auth_schema);
		httpPost.setHeader("Api-Key", api_key);
		httpPost.setEntity(new StringEntity(json));
		CloseableHttpResponse httpResponse = httpClient.execute(httpPost);

		String entity = EntityUtils.toString(httpResponse.getEntity());
		WireTransferResult wireTransferResult = objectMapper.readValue(entity, WireTransferResult.class);

		return wireTransferResult;
	}

}
