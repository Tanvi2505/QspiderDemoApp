package QspiderDemoTestScriptAssignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import QspidersDemoAppAssignment.QspiderDemoApp;

public class RadioButton extends QspiderDemoApp {
	@Test
	public void tc_05() throws InterruptedException {
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[5]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("attended")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("attended_a")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("attended_b")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("attended_c")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("attended_d")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("attended_e")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("willing_a")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("willin_b")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("btn")).click();
		
	}
}
