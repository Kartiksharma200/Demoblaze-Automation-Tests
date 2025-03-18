
package com.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;
	By btn_home = By.xpath("//li[@class='nav-item active']//a[@class='nav-link']");
	By btn_contact = By.xpath("//a[normalize-space()='Contact']");
	By btn_AboutUs = By.xpath("//a[normalize-space()='About us']");
	By btn_cart = By.xpath("//a[@id='cartur']");
	By btn_logIn = By.xpath("//a[@id='login2']");
	By btn_signUp = By.xpath("//a[@id='signin2']");
	// CATEGORIES
	By phones_categories = By.xpath("//div[@id='contcont']//a[2]");
	By phone = By.xpath("//a[normalize-space()='Iphone 6 32gb']");
	By laptops_categories = By.xpath("//a[3]");
	By Laptop = By.xpath("//a[normalize-space()='MacBook air']");
	By monitors_categories = By.xpath("//a[4]");
	By monitor = By.xpath("//a[normalize-space()='Apple monitor 24']");
	// LOG
	By homepage_logo = By.xpath("//a[@id='nava']");
	
	
	//CONSTRUCTOR
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isLogoDisplayed() {
		return driver.findElement(homepage_logo).isDisplayed();
	}

	public void phones() {
		driver.findElement(phones_categories).click();

	}

	public boolean verifyPhones() {
		return driver.findElement(phone).isDisplayed();
	}

	public void laptops() {
		driver.findElement(laptops_categories).click();
	}

	public boolean verifyLaptops() {
		return driver.findElement(Laptop).isDisplayed();
	}

	public void monitors() {
		driver.findElement(monitors_categories).click();

	}

	public boolean verifyMonitors() {
		return driver.findElement(monitor).isDisplayed();
	}

}
