package com.orangeHRM_runner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.orange.genric.base_class;

public class loginscript extends base_class {
	@Test
	
	public void login() throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.className("oxd-userdropdown-tab")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
	}
}
