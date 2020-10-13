package com.zak.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeviseConverterApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DeviseConverterApplication.class,args);
    }


    @Autowired
    DeviseConverter deviseConverter;

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("10 MAD en Euro : "+ deviseConverter.converteMadToEuro(10) + " Euro");
        System.out.println("10 MAD en Dollar : "+ deviseConverter.converteMadToDollar(10) + " $");
    }
}