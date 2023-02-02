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

public class PhoneExtension {
	WebDriver driver;
	
  @Test
  public void f() throws Exception {
	  
	  //Enter username	  
	 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/form/div[1]/div/div/div/input")).sendKeys("jay@qq.com");
	  	  
	  //Enter password
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/form/div[2]/div/div/div/input")).sendKeys("ck123456");
	  
	  //click login button
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/form/div[3]/div/button")).click();
	  
	  Thread.sleep(5000);
	  
	  //Dropdown button	   
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div/div[2]/div[3]/div/div[1]/div/i")).click();
		  
		//Selecting English	
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div/div[2]/div[3]/div/div[2]/ul[2]/li[1]")).click();
		
		//Node List
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div/ul/li[1]")).click();
	  
	
	
	//Click Extension List
	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div/ul/li[2]/span")).click();
		
		
	//Add
	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[2]/div[1]/div[1]/button")).click();
	
	//extension List-Add Name 
			
	driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[2]/form/div[1]/div[1]/div/div/div/div/input")).sendKeys("Automate5");	
	
	//extension List-Add Password 
	
	driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[2]/form/div[1]/div[2]/div/div/div/div/input")).sendKeys("Automate2");	
	
	//extension List-Extension
	
	driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[2]/form/div[2]/div[2]/div/div/div/div/input")).sendKeys("9004");	
	
	  Thread.sleep(2000);
	  
		//extension List- Select Node
	
	driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[2]/form/div[2]/div[1]/div/div/div/div[1]/div/i")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[2]/form/div[2]/div[1]/div/div/div/div[2]/ul[2]/li")).click();
	
	Thread.sleep(2000);
	
	//extension List-Save Button
	
	driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[2]/form/div[3]/button[2]")).click();
	
	Thread.sleep(2000);
	
	
	  
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
	  
	  Assert.assertEquals(WinTitle, "voip-boss - Extensions List");
	  
	  System.out.println("Test Completed : Extension Created Successfully");
	  

	  
	  
  }

}
