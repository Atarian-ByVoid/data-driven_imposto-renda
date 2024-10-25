package com.beto.data_driven.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.boot.test.context.SpringBootTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@SpringBootTest
public class ImpostoSteps {
    private double renda;
    private double imposto;

    @Given("a renda de {double}")
    public void aRendaDe(double renda) {
        this.renda = renda;
    }

    @When("calcular o imposto")
    public void calcularOImposto() {
        if (renda <= 3000) {
            imposto = 0;
        } else if (renda <= 8000) {
            imposto = (renda - 3000) * 0.1; 
        } else {
            imposto = (renda - 8000) * 0.2 + 500; 
        }
    }

    @Then("o imposto deve ser {double}")
    public void oImpostoDeveSer(double impostoEsperado) {
        assertEquals(impostoEsperado, imposto, 0.01, "O valor do imposto calculado está incorreto.");
    }
}