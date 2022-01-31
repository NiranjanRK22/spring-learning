package com.shristi.constr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Features {
	private String os;
	private String processor;

	public Features() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Features(String os, String processor) {
		super();
		this.os = os;
		this.processor = processor;
	}

	public String getOs() {
		return os;
	}

	@Value("android")
	public void setOs(String os) {
		this.os = os;
	}

	public String getProcessor() {
		return processor;
	}

	@Value("casc")
	public void setProcessor(String processor) {
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "Features [os=" + os + ", processor=" + processor + "]";
	}

}
