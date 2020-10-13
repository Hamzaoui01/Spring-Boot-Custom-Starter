package com.zak.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "devise-converter.values")
public class DeviseConverterProperties {
    private double euroValue;
    private double dollarValue;

    public void setDollarValue(double dollarValue) {
        this.dollarValue = dollarValue;
    }

    public void setEuroValue(double euroValue) {
        this.euroValue = euroValue;
    }

    public double getDollarValue() {
        return dollarValue;
    }

    public double getEuroValue() {
        return euroValue;
    }
}
