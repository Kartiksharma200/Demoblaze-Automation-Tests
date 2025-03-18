package com.stepDefinition;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.pageObject.loginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {

	WebDriver driver;
	loginPage login;

	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
	    login = new loginPage(driver); // Initialize loginPage with driver
	}

	@When("User click on the Login button")
	public void user_click_on_the_login_button() throws InterruptedException {
		Thread.sleep(2000);
		login.clickHomePageLoginBtn();
	}

	@When("enter the valid {string} and {string}")
	public void enter_the_valid_and(String username, String password) throws InterruptedException {
		//login = new loginPage(driver);
		login.enterUsername(username);
		Thread.sleep(2000);
		login.enterPassword(password);
	}

	@Then("click on the Login button")
	public void click_on_the_login_button() throws InterruptedException {
		Thread.sleep(2000);
		login.clickLoginBtn();
		Thread.sleep(2000);
	}
	@Then("Verify the login")
	public void verify_the_login() {
		
		if(login.verifyLogin()) {
			System.out.println("<----------Successful Login---------->");
		}else {
			System.out.println("<-----------Login Faild------------>");
		}
	    
	}
	@Then("handle the alert")
	public void handle_the_alert() {
	   Alert loginAlert  = driver.switchTo().alert();
	   loginAlert.accept();
	}


	@And("close the browser")
	public void close_the_browser() {
		driver.close();
	}
}
