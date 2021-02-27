package com.hospitality.mmtrip.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hospitality.amzn.GenericsUtilities.BaseClass;

public class Homepage extends BaseClass {
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//label[@for='fromCity']")
	private WebElement frombox;
	
	@FindBy(xpath="//input[@placeholder='From']")
	private WebElement fromtxtbox;
	
	@FindBy(xpath="//input[@placeholder='To']")
	private WebElement totxtbox;
	
	@FindBy(xpath="//span[.='DEPARTURE']")
	private WebElement deptbttn;
	
	@FindBy(xpath="(//div[@class='dateInnerCell'])[29]")
	private WebElement dptdate;
			
	@FindBy(xpath="//span[.='RETURN']")
	private WebElement returnbttn;
	
	@FindBy(xpath="(//div[@class='dateInnerCell'])[30]")
	private WebElement retundate;
	
	@FindBy(xpath="//a[.='Search']")
	private WebElement searchbttn;
	
	public WebElement Frombox() {
		return frombox;
	}

	public WebElement Fromtxtbox() {
		return fromtxtbox;
	}

	public WebElement Totxtbox() {
		return totxtbox;
	}

	public WebElement Deptbttn() {
		return deptbttn;
	}

	public WebElement Dptdate() {
		return dptdate;
	}

	public WebElement Returnbttn() {
		return returnbttn;
	}

	public WebElement Retundate() {
		return retundate;
	}

	public WebElement Searchbttn() {
		return searchbttn;
	}
	
	
	
	

}
