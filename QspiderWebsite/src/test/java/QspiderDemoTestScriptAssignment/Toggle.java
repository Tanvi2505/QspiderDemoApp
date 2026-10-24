package QspiderDemoTestScriptAssignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import QspidersDemoAppAssignment.QspiderDemoApp;

public class Toggle extends QspiderDemoApp {
	@Test
	public void tc_07() throws InterruptedException {
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[7]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@class='inline-flex items-center cursor-pointer']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//label[@class='inline-flex items-center cursor-pointer'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//label[@class='inline-flex items-center cursor-pointer'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//label[@class='inline-flex items-center cursor-pointer'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("togglers")).click();
	}
}