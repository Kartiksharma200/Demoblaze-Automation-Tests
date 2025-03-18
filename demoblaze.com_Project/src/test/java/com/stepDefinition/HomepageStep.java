package com.stepDefinition;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.pageObject.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomepageStep {

	WebDriver driver;
	HomePage home;

	@BeforeTest
	@Given("user is on the homepage")
	public void user_is_on_the_homepage() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
	}

	@When("check the tittle of the page")
	public void check_the_tittle_of_the_page() {
		home = new HomePage(driver);
		home.isLogoDisplayed();
		
	}

	@Then("verify the tittle is PRODUCT STORE")
	public void verify_the_tittle_is_product_store() throws InterruptedException {
//		home.isLogoDisplayed();
		if(home.isLogoDisplayed()) {
			System.out.println("<----------Verify Tittle of the HomePage----------->");
		}else {
			System.out.println("<----------Tittle Verification failed------------>");
		}
		Thread.sleep(2000);
	}

	@AfterTest
	@And("close browser")
	public void close_browser() {
		driver.close();
	}
	
	
	@Given("user is on HomePage")
	public void user_is_on_home_page() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
	}

	@When("click on the Laptops categories")
	public void click_on_the_laptops_categorie() {
		home = new HomePage(driver);
		home.laptops();
	}

	@When("verify the all product are related to laptops")
	public void verify_the_all_product_are_related_to_laptops() throws InterruptedException {
		;
		if(home.verifyLaptops()) {
			System.out.println("<---------Verify Laptops------->");
		}else {
			System.out.println("<----------Not Verify Laptops--------->");
		}
		Thread.sleep(2000);
	}

	@Then("click on the Monitors categories")
	public void click_on_the_monitors_categories() {
		home.monitors();
	}

	@Then("Verify the all products are related to Monitors")
	public void verify_the_all_products_are_related_to_monitors() throws InterruptedException {
		
		if(home.verifyMonitors()) {
			System.out.println("<---------Verify Monitors------->");
		}else {
			System.out.println("<---------Not Verify Monitors------->");
		}
		Thread.sleep(2000);
	}

	@Then("click on the Phones categories")
	public void click_on_the_phones_categories() {
		home.phones();
	}

	@Then("Verify the all products are related to Phones")
	public void verify_the_all_products_are_related_to_phones() throws InterruptedException {
	
		if(home.verifyPhones()) {
			System.out.println("<---------Verify Phones------->");
		}else {
			System.out.println("<---------Not Verify phones------->");
		}
		Thread.sleep(2000);
	}
	@And("close the homepage browser")
	public void close_the_homepage_browser() {
		driver.close();
	}


}
