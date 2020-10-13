package com.zak.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(DeviseConverterProperties.class)
@ConditionalOnClass(DeviseConverter.class)
public class DeviseConverterAutoconfiguration{

    @Autowired
    private DeviseConverterProperties dCP;

    @Bean
    @ConditionalOnMissingBean
    DeviseConverterConfig deviseConverterConfig(){
        double euroValue = (dCP.getEuroValue() == 0)? Double.parseDouble(System.getProperty("device-converter.values.euroValue")) : dCP.getEuroValue();
        double dollarValue = (dCP.getDollarValue() == 0)? Double.parseDouble(System.getProperty("device-converter.values.dollarValue")) : dCP.getDollarValue();
        DeviseConverterConfig deviseConverterConfig = new DeviseConverterConfig(euroValue,dollarValue);
        return deviseConverterConfig;
    }

    @Bean
    @ConditionalOnMissingBean
    DeviseConverter deviseConverter(DeviseConverterConfig deviseConverterConfig){
        return new DeviseConverter(deviseConverterConfig);
    }

}