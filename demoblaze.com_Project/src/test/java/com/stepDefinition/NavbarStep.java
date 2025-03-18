package com.stepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pageObject.NavbarPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavbarStep {
	
	WebDriver driver;
	NavbarPage navbar;
	
	
	
	@When("I should see the {string} link in the navbar")
	public void i_should_see_the_link_in_the_navbar(String string) {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
		navbar = new NavbarPage(driver);
		navbar.verifyHome_btn();
		navbar.verifyAbout_btn();
		navbar.verifyContactUs_btn();
		navbar.verifyLogin_btn();
		navbar.verifySignUp_btn();
		driver.close();
	    
	}

	@And("I should see the contact form")
	public void i_should_see_the_contact_form() throws InterruptedException {
	    navbar.clickOntheContact();
	}

	@And("I should see the about us section")
	public void i_should_see_the_about_us_section() throws InterruptedException {
	    navbar.clickOntheAbout();
	}

	@And("I should be navigated to the cart page")
	public void i_should_be_navigated_to_the_cart_page() throws InterruptedException {
	    navbar.clickOnCart();
	}

	@And("I should see the login form")
	public void i_should_see_the_login_form() throws InterruptedException {
	    navbar.clickOnLogin();
	}

	@Then("I should see the sign-up form")
	public void i_should_see_the_sign_up_form() throws InterruptedException {
		navbar.clickOnSignUp();
		driver.close();
	    
	}



}
