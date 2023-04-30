package com.AddactinTestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features\\Adactin2.feature" , glue = "com.AddactinStepDefinition")
public class AdactTestRunner {

}
