package com.pageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {
	static WebDriver driver2;
	
	//Locators
	By btn_cart = By.xpath("//a[@id='cartur']");
	By phones_categories = By.xpath("//div[@id='contcont']//a[2]");
	By phone = By.xpath("//a[normalize-space()='Iphone 6 32gb']");
	By phone_tittle = By.xpath("//h2[@class='name']");
	By addtocart_phone_btn = By.xpath("//a[@class='btn btn-success btn-lg']");
	By laptops_categories = By.xpath("//a[3]");
	By Laptop = By.xpath("//a[normalize-space()='MacBook air']");
	By laptop_tittle = By.xpath("//h2[@class='name']");
	By monitors_categories = By.xpath("//a[4]");
	By monitor = By.xpath("//a[normalize-space()='Apple monitor 24']");
	
	
	//Constructor
	public AddToCart(WebDriver driver2) {
		AddToCart.driver2 = driver2;
	}
	
	//Methods
	public static void initiaqllization () {
	        if (driver2 == null) {  // Prevent multiple driver instances
	            System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // Set correct path
	            driver2 = new ChromeDriver();
	            driver2.manage().window().maximize();
	            driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        }
	    }
	
	public void enterlogindetails() throws InterruptedException {
		driver2.findElement(By.xpath("//a[@id='login2']")).click();
		Thread.sleep(2000);
		driver2.findElement(By.xpath("//input[@id='loginusername']")).sendKeys("Kartik1106");
		driver2.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("Jaishreeram");
		driver2.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
	}

	public void addToPhone() throws InterruptedException {
		driver2.findElement(phones_categories).click();
		Thread.sleep(3000);
		driver2.findElement(phone).click();
		driver2.findElement(phone_tittle).isDisplayed();
		Thread.sleep(3000);
		driver2.findElement(addtocart_phone_btn).click();
		Thread.sleep(2000);
		driver2.switchTo().alert().accept();
	}
	
	public void clickOnlaptop() throws InterruptedException {
		driver2.findElement(By.xpath("//a[@id='nava']")).click();
		driver2.findElement(laptops_categories).click();
		Thread.sleep(3000);
	}
	public void addToLaptop() throws InterruptedException {		
		driver2.findElement(Laptop).click();
		Thread.sleep(3000);
		driver2.findElement(laptop_tittle).isDisplayed();
		driver2.findElement(By.xpath("//a[@class='btn btn-success btn-lg']")).click();
		Thread.sleep(2000);
		driver2.switchTo().alert().accept();	
	}
	public void clickOnMonitor() {
		driver2.findElement(By.xpath("//a[@id='nava']")).click();
		driver2.findElement(monitors_categories).click();
		
	}
	public void addToMonitor() throws InterruptedException {
		driver2.findElement(monitor).click();
		driver2.findElement(By.xpath("//h2[@class='name']")).isDisplayed();
		driver2.findElement(By.xpath("//a[@class='btn btn-success btn-lg']")).click();
		Thread.sleep(2000);
		driver2.switchTo().alert().accept();
	}
	
	public void verifyCart() throws InterruptedException {
		driver2.findElement(By.xpath("//a[@id='nava']")).click();
		Thread.sleep(3000);
		driver2.findElement(btn_cart).click();
		Thread.sleep(5000);
		
	}
	public void closebrowser() {
		driver2.quit();
	}

}
