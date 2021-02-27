package com.hospitality.amzn.GenericsUtilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.hospitality.mmtrip.pom.Login;

public class BaseClass implements PConstants {
	DataBaseUtilities dutil=new DataBaseUtilities();
	ExcelUtilities Exutil=new ExcelUtilities();
	FileUtilities futil=new FileUtilities();
	public WebDriver driver;
	
	
	@BeforeSuite
	public void cofigbeforesuite() throws Throwable {
		dutil.connectToDB();
	}
	
	@BeforeClass
	public void configbeforeclass() throws Throwable {
		String Browser = futil.getPropertyvalueforkey("browser");
		String url=futil.getPropertyvalueforkey("url");
		
		if(Browser.equals("chrome")) {
			System.setProperty(CHROME_KEY,CHROME_VALUE);
			driver=new ChromeDriver();
		}else if(Browser.equals("gecko")) {
			System.setProperty(GECKO_KEY,GECKO_VALUE);
			driver=new FirefoxDriver();
		}else if(Browser.equals("ie")) {
			driver=new InternetExplorerDriver();
		}else {
			System.out.println("Please specify the driver in config.prop");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	@BeforeMethod
	public  void configbeforetest() throws Throwable {
//		String Username = futil.getPropertyvalueforkey("username");
//		String Password=futil.getPropertyvalueforkey("password");
//		Login l=new Login(driver);
//		l.logintoApp(Username, Password);
	}
}
