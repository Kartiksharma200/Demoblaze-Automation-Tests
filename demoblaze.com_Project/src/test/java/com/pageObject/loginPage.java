package com.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {

	WebDriver driver;
	By txt_username = By.xpath("//input[@id='loginusername']");
	By txt_password = By.xpath("//input[@id='loginpassword']");
	By btn_login = By.xpath("//button[normalize-space()='Log in']");
	By btn_login_homePage = By.xpath("//a[@id='login2']");
	By txt_verify_login = By.xpath("//a[@id='nameofuser']");

	public loginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickHomePageLoginBtn() {
		driver.findElement(btn_login_homePage).click();
	}

	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}

	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}

	public void clickLoginBtn() {
		driver.findElement(btn_login).click();
	}

	public void userLogin(String username, String password) {
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();
	}
	public boolean verifyLogin() {
//		driver.findElement(txt_verify_login);
		WebElement UserName = driver.findElement(By.xpath("//a[@id='nameofuser']"));
		if(UserName.isDisplayed()) {
			System.out.println("<---------verify username-------->");
		}else {
			System.out.println("<-----------failed to verify username----------->");
		}
		return false;

	}
	public void loginInHomePage() throws InterruptedException {
		driver.findElement(txt_username).sendKeys("Kartik1106");
		driver.findElement(txt_password).sendKeys("Jaishreeram");
		Thread.sleep(2000);
		driver.findElement(btn_login).click();
	}

}
