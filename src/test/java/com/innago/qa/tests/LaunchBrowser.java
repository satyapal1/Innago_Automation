package com.innago.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver;
		
		driver = new ChromeDriver();
		driver.get("https://qa-my.innago.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		  driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("again.bank2@yopmail.com");
		  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Pass@1234");
		  driver.findElement(By.xpath("//button[@id='signin-button']")).click();
		 
		  Thread.sleep(4000);
		  
		  driver.findElement(By.xpath("//span[normalize-space()='Applications']")).click();
		  
		//driver.close();
	}

}
