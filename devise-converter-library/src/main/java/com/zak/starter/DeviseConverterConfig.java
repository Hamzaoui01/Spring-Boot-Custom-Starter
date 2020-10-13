package com.zak.starter;


import lombok.Value;

public class DeviseConverterConfig{

	private double euroValue;
	private double dollarValue;

	//@Value("${zak.test}")
	String value;
	public DeviseConverterConfig(double euroValue,double dollarValue){
		this.dollarValue = dollarValue;
		this.euroValue = euroValue;
	}
	public double getEuroValue(){
		return this.euroValue;
	}

	public double getDollarValue(){
		return this.dollarValue;
	}

}