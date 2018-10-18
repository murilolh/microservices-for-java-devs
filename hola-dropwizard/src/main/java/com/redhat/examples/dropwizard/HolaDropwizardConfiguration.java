package com.redhat.examples.dropwizard;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.redhat.examples.dropwizard.resources.HelloSayingFactory;

import io.dropwizard.Configuration;

public class HolaDropwizardConfiguration extends Configuration {
	private HelloSayingFactory sayingFactory;

	@JsonProperty("helloapp")
	public HelloSayingFactory getSayingFactory() {
		return sayingFactory;
	}

	@JsonProperty("helloapp")
	public void setSayingFactory(HelloSayingFactory sayingFactory) {
		this.sayingFactory = sayingFactory;
	}
}
