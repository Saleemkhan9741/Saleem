package com.hospitality.mmtrip.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hospitality.amzn.GenericsUtilities.BaseClass;

public class Login extends BaseClass {
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);	
		}

	@FindBy(xpath="//li[@data-cy='account']")
	private WebElement loginOrcreateaccountbtn;
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement enteremailIDtxtbox;
	
	@FindBy(xpath="//button[@data-cy='continueBtn']")
	private WebElement continuebttn;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement passwordtxtbox;
	
	@FindBy(xpath="//button[@data-cy='login']")
	private WebElement loginbtn;
	
		public void logintoApp(String Username, String Password) throws InterruptedException {
			Thread.sleep(2000);
			loginOrcreateaccountbtn.click();
			enteremailIDtxtbox.sendKeys(Username);
			continuebttn.click();
			passwordtxtbox.sendKeys(Password);
			loginbtn.click();
		}
}
