package com.zak.starter;
import org.junit.Test;

import org.junit.Assert;

public class DeviseConverterTest{

    private DeviseConverterConfig deviseConverterConfig = new DeviseConverterConfig(10,7);
@Test
public void should_Converte_MAD_to_EURO(){
        DeviseConverter deviseConverter = new DeviseConverter(deviseConverterConfig);
        Assert.assertTrue(deviseConverter.converteMadToEuro(8) == 80);
}

@Test
public void should_Converte_MAD_to_DOLLAR(){
        DeviseConverter deviseConverter = new DeviseConverter(deviseConverterConfig);
        Assert.assertTrue(70 == deviseConverter.converteMadToDollar(10));
}

}