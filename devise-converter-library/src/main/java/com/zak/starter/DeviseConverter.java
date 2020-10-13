package com.zak.starter;


public class DeviseConverter{

private final DeviseConverterConfig deviseConverterConfig;

public DeviseConverter(DeviseConverterConfig deviseConverterConfig){
	this.deviseConverterConfig = deviseConverterConfig;
}

public double converteMadToEuro(double amountToConverte){
	return this.deviseConverterConfig.getEuroValue()*amountToConverte;
}

public double converteMadToDollar(double amountToConverte){
	return this.deviseConverterConfig.getDollarValue()*amountToConverte;
}


}