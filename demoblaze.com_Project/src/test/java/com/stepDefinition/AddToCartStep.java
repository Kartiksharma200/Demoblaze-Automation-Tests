package com.stepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pageObject.AddToCart;
import com.pageObject.loginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartStep {
	WebDriver driver2;
	AddToCart cart;
	loginPage login;

	@Given("I open the homepage")
	public void i_open_the_homepage() {
		
	        if (driver2 == null) {  
	            //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // Set correct path
	            driver2 = new ChromeDriver();
	            driver2.manage().window().maximize();
	            driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        }
	    
		String baseUrl = "https://www.demoblaze.com/";
		driver2.get(baseUrl);
		driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver2.manage().window().maximize();
		
	}
	
	@Given("login with valid data")
	public void login_with_valid_data() throws InterruptedException {
		cart = new AddToCart(driver2);
		cart.enterlogindetails();
		System.out.println("<---------Successful login---------->");
	
	}


	@When("I add the Iphone phone to cart")
	public void i_add_the_iphone_phone_to_cart() throws InterruptedException {
		cart = new AddToCart(driver2);
		Thread.sleep(3000);
		cart.addToPhone();
	}

	@And("click Laptops categorie button")
	public void click_laptops_categorie_button() throws InterruptedException {
		cart.clickOnlaptop();
	}

	@When("I add the Macbook Air laptop to cart")
	public void i_add_the_macbook_air_laptop_to_cart() throws InterruptedException {
		cart.addToLaptop();
	}

	@And("Click on the monitors categories")
	public void click_on_the_monitors_categories() {
		cart.clickOnMonitor();
	}

	@And("I add the ASUS Full HD monitor to cart")
	public void i_add_the_asus_full_hd_monitor_to_cart() throws InterruptedException {
		cart.addToMonitor();
	}

	@And("I verify the cart contains three products")
	public void i_verify_the_cart_contains_three_products() throws InterruptedException {
		cart.verifyCart();
		System.out.println("<-----------Successful added to cart Product---------->");
	}

	@Then("close the tab")
	public void close_the_tab() {
		cart.closebrowser();

	}

}
