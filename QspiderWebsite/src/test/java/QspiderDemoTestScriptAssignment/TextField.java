package QspiderDemoTestScriptAssignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import QspidersDemoAppAssignment.QspiderDemoApp;

public class TextField extends QspiderDemoApp {
	@Test (enabled = false)
	public void tc_01() throws InterruptedException {
		driver.findElement(By.xpath("//section[@class='poppins text-[14px]']")).click();
		Thread.sleep(2000);	
		driver.findElement(By.id("name")).sendKeys("Tanvi");
		Thread.sleep(2000);	
		driver.findElement(By.id("email")).sendKeys("suryawanshitanvi468@gmail.com");
		Thread.sleep(2000);	
		driver.findElement(By.id("password")).sendKeys("Tanvi@2505");
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);	
		
	}

}
