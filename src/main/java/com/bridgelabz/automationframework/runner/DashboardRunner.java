package com.bridgelabz.automationframework.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/java/com/bridgelabz/automationframework/features/DashboardFeature.feature",
glue="com.bridgelabz.automationframework.DashboardStepDef",
monochrome=true,
strict=true,
dryRun=false)
public class DashboardRunner {

	public static void main(String[] args) {	
	}

}
