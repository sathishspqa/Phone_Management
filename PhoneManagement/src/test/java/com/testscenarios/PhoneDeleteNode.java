package com.testscenarios;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class PhoneDeleteNode {
	WebDriver driver;

	@Test
	public void f() throws Exception {

		// Enter username
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/form/div[1]/div/div/div/input"))
				.sendKeys("jay@qq.com");

		// Enter password
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/form/div[2]/div/div/div/input"))
				.sendKeys("ck123456");

		// click login button
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/form/div[3]/div/button")).click();

		Thread.sleep(2000);

		// Dropdown button
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div/div[2]/div[3]/div/div[1]/div/i")).click();

		// Selecting English
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div/div[2]/div[3]/div/div[2]/ul[2]/li[1]"))
				.click();

		// Node List
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div/ul/li[1]")).click();
		


		//Delete Node click and wait 
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[8]/div[2]/div/div/div/div/div[3]/button[2]")).click();
		
		
		
	  //JavascriptExecutor Jsexecutor = (JavascriptExecutor)driver;
		
	  //WebElement Cbutton = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/div/div[4]/div[2]/table/tbody/tr[2]/td[1]/div/div/button[3]/span"));
	  
		//Jsexecutor.executeScript("arguments[0].click();", Cbutton);
		
		//Actions action = new Actions(driver);
		
		//WebElement Dbutton = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/div/div[4]/div[2]/table/tbody/tr[2]/td[1]/div/div/button[3]/span"));
		
		//action.moveToElement(Dbutton);
		
		//action.click().build().perform();
		
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/div/div[4]/div[2]/table/tbody/tr[2]/td[1]/div/div/button[3]/span")).click();
		

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
		
		driver.quit();
		

	}

}
