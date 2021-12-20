package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.utils.SeleniumUtils;

public class AmazonPage extends SeleniumUtils  {

	private WebDriver driver;

	// 1. By Locators: OR
	private By emailId = By.id("email");
	private By password = By.id("passwd");
	private By signInButton = By.id("SubmitLogin");
	private By forgotPwdLink = By.linkText("Forgot your password?111");

	// 2. Constructor of the page class:
	public AmazonPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. page actions: features(behavior) of the page the form of methods:

	public String getAmazonPageTitle() {
		String title = getPageTitle();
		return title;
	}

	public boolean isForgotPwdLinkExist() {
		return driver.findElement(forgotPwdLink).isDisplayed();
	}

	public void enterUserName(String username) {
		driver.findElement(emailId).sendKeys(username);
	}

	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}

	public void clickOnLogin() {
		driver.findElement(signInButton).click();
	}


	}
	


