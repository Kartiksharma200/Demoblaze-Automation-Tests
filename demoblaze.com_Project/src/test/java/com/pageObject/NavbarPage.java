package com.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavbarPage {
	
	private WebDriver driver;
	
//	By Product_Store_btn = By.xpath("//a[@id='nava']");
//	By Home_btn = By.xpath("//li[@class='nav-item active']//a[@class='nav-link']");
//	By Contact_Us_btn = By.xpath("//a[normalize-space()='Contact']");
//	By About_btn = By.xpath("//a[normalize-space()='About us']");
//	By Cart_btn = By.xpath("//a[@id='cartur']");
//	By Logout_btn = By.xpath("//a[@id='logout2']");
//	By Login_btn = By.xpath("//a[@id='login2']");
//	By SignUp_btn = By.xpath("//a[@id='signin2']");
	@FindBy (xpath = "//a[@id='nava']")
	WebElement ProductStore_btn;
	
	@FindBy (xpath = "//li[@class='nav-item active']//a[@class='nav-link']")
	WebElement Home_btn;
	
	@FindBy (xpath = "//a[normalize-space()='Contact']")
	WebElement ContactUs_btn;
	
	@FindBy (xpath = "//a[normalize-space()='About us']")
	WebElement About_btn;
	
	@FindBy (xpath = "//a[@id='cartur']")
	WebElement Cart_btn;
	
	@FindBy (xpath = "//a[@id='login2']")
	WebElement Login_btn;
	
	@FindBy (xpath = "//a[@id='signin2']")
	WebElement SignUp_btn;
	
	@FindBy (xpath = "//a[@id='logout2']")
	WebElement Logout_btn;
	
	public NavbarPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void verifyProduct_Store_btn() {
		if(ProductStore_btn.isDisplayed()) {
			System.out.println("<--------Verify ProductStore-------->");
		}else {
			System.out.println("<---------Failed to Verify ProductStore-------->");
		}
	}
	
	public void verifyHome_btn() {
		if(Home_btn.isDisplayed()) {
			System.out.println("<--------Verify Home-------->");
		}else {
			System.out.println("<---------Failed to Verify Home-------->");
		}
	}
	
	public void verifyContactUs_btn() {
		if(ContactUs_btn.isDisplayed()) {
			System.out.println("<--------Verify Contact Us-------->");
		}else {
			System.out.println("<---------Failed to Verify Contact Us-------->");
		}
	}
	
	public void verifyAbout_btn() {
		if(About_btn.isDisplayed()) {
			System.out.println("<--------Verify About-------->");
		}else {
			System.out.println("<---------Failed to Verify About-------->");
		}
	}
	
	public void varifyCart_btn() {
		if(Cart_btn.isDisplayed()) {
			System.out.println("<--------Verify Cart-------->");
		}else {
			System.out.println("<---------Failed to Verify Cart-------->");
		}
	}
	
	public void verifyLogout_btn() {
		if(Logout_btn.isDisplayed()) {
			System.out.println("<--------Verify Logout-------->");
		}else {
			System.out.println("<---------Failed to Verify Logout-------->");
		}
	}
	
	public void verifyLogin_btn() {
		if(Login_btn.isDisplayed()) {
			System.out.println("<--------Verify Login-------->");
		}else {
			System.out.println("<---------Failed to Verify Login-------->");
		}
	}
	
	public void verifySignUp_btn() {
		if(SignUp_btn.isDisplayed()) {
			System.out.println("<--------Verify Sign Up-------->");
		}else {
			System.out.println("<---------Failed to Verify Sign Up-------->");
		}
	}
	
	public void clickOntheContact() throws InterruptedException {
		Home_btn.click();
		WebElement tittle_Contact = driver.findElement(By.id("exampleModalLabel"));
		if(tittle_Contact.isDisplayed()) {
			System.out.println("<--------Verify Contact Pop Tittle-------->");
		}else {
			System.out.println("<---------Failed to Verify Contact Pop--------->");
		}
		driver.findElement(By.id("recipient-email")).sendKeys("Kartiksharma@gmail.com");
		driver.findElement(By.id("recipient-name")).sendKeys("Kartik Sharma");
		driver.findElement(By.id("message-text")).sendKeys("Hello Demoblaze......!");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class=\"btn btn-primary\"])[1]")).click();
	}
	
	public void clickOntheAbout() throws InterruptedException {
		About_btn.click();
		WebElement tittle_About = driver.findElement(By.id("videoModalLabel"));
		if(tittle_About.isDisplayed()) {
			System.out.println("<--------Verify About Section------->");
		}else {
			System.out.println("<---------Failed to verify About section------->");
		}
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='videoModal']//button[@type='button'][normalize-space()='Close']")).click();
	}
	
	public void clickOnCart() throws InterruptedException {
		Cart_btn.click();
		String AccUrl = driver.getCurrentUrl();
		String ExpUrl = "https://www.demoblaze.com/cart.html";
		if(AccUrl.equals(ExpUrl)) {
			System.out.println("<--------Verify Cart-------->");
		}else {
			System.out.println("<--------Failed to Verify Cart------->");
		}
		
		Thread.sleep(2000);
		ProductStore_btn.click();
	}
	
	public void clickOnLogin() throws InterruptedException {
		Login_btn.click();
		WebElement VerifyLogin = driver.findElement(By.id("loginpassword"));
		if(VerifyLogin.isDisplayed()) {
			System.out.println("<--------Verify Login Page----->");
		}else {
			System.out.println("<---------Failed Login Page-------->");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class=\"btn btn-secondary\"])[3]")).click();
	}
	
	public void clickOnSignUp() throws InterruptedException {
		SignUp_btn.click();
		WebElement VerifyLogin = driver.findElement(By.id("sign-username"));
		if(VerifyLogin.isDisplayed()) {
			System.out.println("<--------Verify SignUp Page----->");
		}else {
			System.out.println("<---------Failed SignUp Page-------->");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class=\"btn btn-secondary\"])[2]")).click();
	}
	
	

}
