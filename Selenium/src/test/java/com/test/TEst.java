package com.test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TEst {
	
	public static WebDriver driver;

	@Before
	public void beforeTest() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	}
	
	
	
	@Test
	public void Test()
	{
		driver.get("https://www.google.com/");
	}
	
	
	@After
	public void afterEachTest()
	{
		
		driver.close();
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
