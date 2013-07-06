package com.hasfun.seoulsubway.common;

import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

public class MyRestTemplate extends RestTemplate {
	public MyRestTemplate() {
		if (getRequestFactory() instanceof SimpleClientHttpRequestFactory) {
			((SimpleClientHttpRequestFactory) getRequestFactory()).setConnectTimeout(10 * 1000);
			((SimpleClientHttpRequestFactory) getRequestFactory()).setReadTimeout(10 * 1000);
		} else if (getRequestFactory() instanceof HttpComponentsClientHttpRequestFactory) {
			((HttpComponentsClientHttpRequestFactory) getRequestFactory()).setReadTimeout(10 * 1000);
			((HttpComponentsClientHttpRequestFactory) getRequestFactory()).setConnectTimeout(10 * 1000);
		}
	}
}
