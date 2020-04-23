package com.bridgelabz.automationframework.DashboardStepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DashboardStepDef {
	
	WebDriver driver;
	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
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

	@Then("^after login navigate to dashboard tap on note$")
	public void after_login_navigate_to_dashboard_tap_on_note() throws Throwable {
	
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='noteclick ']")).click(); 
	}

	@When("^i entered title \"([^\"]*)\" and description \"([^\"]*)\"$")
	public void i_entered_title_and_description(String arg1, String arg2) throws Throwable {
		Thread.sleep(5000);
	 driver.findElement(By.xpath("//textarea[@id='title']")).click();
//	 driver.findElement(By.id("description")).clear();
	 driver.findElement(By.xpath("//textarea[@id='title']")).sendKeys("cucumber testcase passed");
	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 driver.findElement(By.xpath("//textarea[@id='description']")).click();
//	 driver.findElement(By.id("description")).clear();
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys("selenieum testcase passed");
	}

	@Then("^click on close note created successfully$")
	public void click_on_close_note_created_successfully() throws Throwable {
	driver.findElement(By.xpath(("/html/body/app-root/app-dashboard/div/div[2]/mat-sidenav-container/mat-sidenav-content/app-note/div/mat-card/button/span"))).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div[2]/mat-sidenav-container/mat-sidenav-content/app-note/app-note-com/div/div[8]/div/span/mat-card/form/address/div[2]/app-icon/div[1]/button[3]/span/mat-icon")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("colorsetting")).click();
	Thread.sleep(3000);
	}
	
	
}
