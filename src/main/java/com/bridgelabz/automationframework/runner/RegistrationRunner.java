package com.bridgelabz.automationframework.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/java/com/bridgelabz/automationframework/features/RegistrationFeature.feature",
glue="com.bridgelabz.automationframework.RegistrationstepDeff",
monochrome=true,
strict=true,
dryRun=false)
public class RegistrationRunner {

	public static void main(String[] args) {
		

	}

}
