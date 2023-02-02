package com.testscenarios;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class PhoneLogin {
	WebDriver driver;
	
  @Test
  public void f() throws Exception {
		 
		driver.findElement(By.xpath("//*[@id='app']/div/div[1]/div[2]/div[1]/div/i")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='app']/div/div[1]/div[2]/div[2]/ul[2]/li[1]")).click();
		
		Thread.sleep(2000);
		
		
	  //Enter username	  
	 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/form/div[1]/div/div/div/input")).sendKeys("jay@qq.com");
	  	  
	  //Enter password
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/form/div[2]/div/div/div/input")).sendKeys("ck123456");
	  
	  //click login button
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/form/div[3]/div/button")).click();
	  
	  Thread.sleep(5000);
	  
		  
  }
  
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  WebDriverManager.chromedriver().setup();
	  
	  driver = new ChromeDriver();
	  
	  driver.get("https://testboss.aivoip.dev/login");
	  
	 driver.manage().window().maximize();

	  
	  
  }

  @AfterClass
  public void afterClass() {
	  
	  String WinTitle = driver.getTitle();
	  
	  System.out.println(WinTitle);
	  
	  Assert.assertEquals(WinTitle, "voip-boss - Home");
	  
	  System.out.println("Test Completed : Login page - Verified");
	  
	  //driver.quit();

	  
  }

}
