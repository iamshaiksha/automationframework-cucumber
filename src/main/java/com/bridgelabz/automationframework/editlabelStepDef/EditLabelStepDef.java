package com.bridgelabz.automationframework.editlabelStepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditLabelStepDef {
	
	WebDriver driver;
	@Given("^open chrome and start application for creating label$")
	public void open_chrome_and_start_application_for_creating_label() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:/Users/rahi/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("localhost:4200/login");
		driver.manage().window().maximize();
	}

	@When("^I entered email \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void i_entered_email_and_valid(String arg1, String arg2) throws Throwable {
		driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("iamshaiksha2019@gmail.com");
		 driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys("Shaiksha@123");

	}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/mat-card/div[3]/button[1]/span")).click();
	}

	@Then("^after login navigate to dashboard tap on mainmenu$")
	public void after_login_navigate_to_dashboard_tap_on_mainmenu() throws Throwable {
		try{
			Thread.sleep(5000);
		}catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		 driver.findElement(By.xpath(("/html/body/app-root/app-dashboard/div/div[1]/mat-toolbar/mat-toolbar-row/button/span/mat-icon"))).click();
		 try{
			Thread.sleep(5000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@When("^entered on edit label dailobox will popup in that create label$")
	public void entered_on_edit_label_dailobox_will_popup_in_that_create_label() throws Throwable {
		 driver.findElement(By.id("editlabel")).click();
		 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		driver.findElement(By.id("edit")).sendKeys("cucumber");
		driver.findElement(By.id("done")).click();
	}

	@Then("^click on done label created successfully$")
	public void click_on_done_label_created_successfully() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.id("done")).click();
	}
}
