package com.beto.data_driven.config;

import org.springframework.boot.test.context.SpringBootTest;

import com.beto.data_driven.DataDrivenApplication;

import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = DataDrivenApplication.class) 
public class CucumberSpringConfiguration {
}