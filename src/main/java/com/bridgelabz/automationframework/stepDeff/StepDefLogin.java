package com.bridgelabz.automationframework.stepDeff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverLogLevel;
import org.openqa.selenium.firefox.FirefoxOptions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefLogin {
	WebDriver driver;
	
	
	@Given("^open firefox and start application$")
	public void open_firefox_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:/Users/rahi/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("localhost:4200/login");
		driver.manage().window().maximize();
	   
	}

	@When("^I entered email \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void i_entered_email_and_valid(String arg1, String arg2) throws Throwable {
//	    driver.findElement(By.id("email")).sendKeys("shaikshaiit@gmail.com");
//	    driver.findElement(By.id("pass")).sendKeys("Shaik@123");
		
		 driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("iamshaiksha2019@gmail.com");
		 driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys("Shaiksha@123");
		
		
	}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
//	    driver.findElement(By.id("loginbutton")).click();
		 driver.findElement(By.xpath("/html/body/app-root/app-login/div/mat-card/div[3]/button[1]/span")).click();
	}
	

}
