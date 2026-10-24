package QspiderDemoTestScriptAssignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import QspidersDemoAppAssignment.QspiderDemoApp;

public class Link extends  QspiderDemoApp {
	@Test
	public void tc_03() throws InterruptedException {
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("men")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='bg-[#f97316] text-white rounded-sm px-3 text-3xl font-bold']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("women")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='bg-[#f97316] text-white rounded-sm px-3 text-3xl font-bold']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("electronics")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='bg-[#f97316] text-white rounded-sm px-3 text-3xl font-bold']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("beauty")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='bg-[#f97316] text-white rounded-sm px-3 text-3xl font-bold']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("contact")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("about")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("career")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("faq")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("pay")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ship")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("return")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("policy")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("use")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("security")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("privacy")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[3]")).click();
	}
}
