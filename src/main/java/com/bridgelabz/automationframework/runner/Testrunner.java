package com.bridgelabz.automationframework.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/java/com/bridgelabz/automationframework/features/loginFeatures.feature",
glue="com.bridgelabz.automationframework.stepDeff",
monochrome=true,
strict=true,
dryRun=false)
public class Testrunner {
}
