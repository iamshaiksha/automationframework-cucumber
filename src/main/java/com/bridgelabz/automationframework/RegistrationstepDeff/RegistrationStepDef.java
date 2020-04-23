package com.bridgelabz.automationframework.RegistrationstepDeff;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationStepDef {
	WebDriver driver;
	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:/Users/rahi/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("localhost:4200/register");
		driver.manage().window().maximize();
		//*[@id="mat-input-3"]
	}

	@When("^I entered name \"([^\"]*)\" email \"([^\"]*)\" password \"([^\"]*)\" mobilenumber \"([^\"]*)\"$")
	public void i_entered_name_email_password_mobilenumber(String arg1, String arg2, String arg3, String arg4) throws Throwable {

		 driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("shaiksha");
		 driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys("shaiksha123@gmail.com");
		 driver.findElement(By.xpath("//input[@id='mat-input-2']")).sendKeys("Shaiksha@123");
		 driver.findElement(By.xpath("//input[@id='mat-input-3']")).clear();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//input[@id='mat-input-3']")).sendKeys("7993374636");	
		}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		driver.findElement(By.xpath("/html/body/app-root/app-registration/div/mat-card/div[5]/button[1]")).click();
		Thread.sleep(450000);
	}
}
