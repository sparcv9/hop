/*
 * Copyright 2015 the original author or authors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.rabbitmq.http.client.domain;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

//{"src-uri":  "amqp://",              "src-queue":  "my-queue",
//    "dest-uri": "amqp://remote-server", "dest-queue": "another-queue"}

public class ShovelDetails {

	@JsonProperty("src-uri")
	private String sourceURI;
	@JsonProperty("src-exchange")
	private String sourceExchange;
	@JsonProperty("src-queue")
	private String sourceQueue;

	@JsonProperty("dest-uri")
	private String destURI;
	@JsonProperty("dest-exchange")
	private String destExchange;
	@JsonProperty("dest-queue")
	private String destQueue;

	@JsonProperty("reconnect-delay")
	private long reconnectDelay;
	@JsonProperty("add-forward-headers")
	private boolean addForwardHeaders;

	@JsonProperty("publish-properties")
	private Map<String, Object> publishProperties;

	public ShovelDetails() {
	}

	public ShovelDetails(String sourceURI, String destURI, long reconnectDelay, boolean addForwardHeaders, Map<String, Object> publishProperties) {
		this.sourceURI = sourceURI;
		this.destURI = destURI;
		this.reconnectDelay = reconnectDelay;
		this.addForwardHeaders = addForwardHeaders;
		this.publishProperties = publishProperties;
	}

	public String getSourceURI() {
		return sourceURI;
	}

	public void setSourceURI(String sourceURI) {
		this.sourceURI = sourceURI;
	}

	public String getSourceExchange() {
		return sourceExchange;
	}

	public void setSourceExchange(String sourceExchange) {
		this.sourceExchange = sourceExchange;
	}

	public String getSourceQueue() {
		return sourceQueue;
	}

	public void setSourceQueue(String sourceQueue) {
		this.sourceQueue = sourceQueue;
	}

	public String getDestURI() {
		return destURI;
	}

	public void setDestURI(String destURI) {
		this.destURI = destURI;
	}

	public String getDestExchange() {
		return destExchange;
	}

	public void setDestExchange(String destExchange) {
		this.destExchange = destExchange;
	}

	public String getDestQueue() {
		return destQueue;
	}

	public void setDestQueue(String destQueue) {
		this.destQueue = destQueue;
	}

	public long getReconnectDelay() {
		return reconnectDelay;
	}

	public void setReconnectDelay(long reconnectDelay) {
		this.reconnectDelay = reconnectDelay;
	}

	public boolean isAddForwardHeaders() {
		return addForwardHeaders;
	}

	public void setAddForwardHeaders(boolean addForwardHeaders) {
		this.addForwardHeaders = addForwardHeaders;
	}

	public Map<String, Object> getPublishProperties() {
		return publishProperties;
	}

	public void setPublishProperties(Map<String, Object> publishProperties) {
		this.publishProperties = publishProperties;
	}

	@Override
	public String toString() {
		return "ShovelDetails{" + "sourceURI=" + sourceURI + ", sourceExchange=" + sourceExchange + ", sourceQueue=" + sourceQueue + ", destURI=" + destURI
				+ ", destExchange='" + destExchange + '\'' + ", destQueue='" + destQueue + '\'' + ", reconnectDelay='" + reconnectDelay + '\''
				+ ", addForwardHeaders='" + addForwardHeaders + '\'' + ", publishProperties='" + publishProperties + '}';
	}
}
