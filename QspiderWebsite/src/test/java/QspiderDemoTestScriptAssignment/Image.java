package QspiderDemoTestScriptAssignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import QspidersDemoAppAssignment.QspiderDemoApp;

public class Image extends QspiderDemoApp {
	@Test
	public void tc_06() throws InterruptedException {
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Clickable")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@title='Mens Clothing']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='block pb-3']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@title='Womens Clothing']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='block pb-3']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@title='Watches']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='block pb-3']")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Similar")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Without")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Broken")).click();
		
	}
}