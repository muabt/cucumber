package com.baithi.Cau2;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class ConverterSteps {
    Converter converter = null;
    double inputData = 0;
    double outputActual =0;
        @Given("a calculator")
        public void aCalculator() {
           converter = new Converter();
        }

    @And("user input {double}")
    public void user_input(double input){
        inputData=input;
    }

    @When("user click button C to F")
    public void userClickButtonCF() {
        outputActual = converter.convertCtoF(inputData);
    }

    @Then("result C to F is {double}")
    public void resultCToFIsCToF(double C2F) {
        Assertions.assertTrue(Math.abs(C2F-outputActual)<0.001);
    }

    @When("user click button F to C")
    public void userClickButtonFC() {
            outputActual = converter.convertFtoC(inputData);
    }

    @Then("result F to C is {double}")
    public void resultFToCIsFToC(double F2C) {
            Assertions.assertTrue(Math.abs(F2C-outputActual)<0.001);
    }

}

