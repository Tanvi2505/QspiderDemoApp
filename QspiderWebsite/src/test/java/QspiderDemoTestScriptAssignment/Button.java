package QspiderDemoTestScriptAssignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import QspidersDemoAppAssignment.QspiderDemoApp;

public class Button extends  QspiderDemoApp {
	
	@Test
	public void tc_02() throws InterruptedException {
		Actions act = new Actions(driver);
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[2]")).click();
		Thread.sleep(2000);	
		driver.findElement(By.id("btn")).click();
		Thread.sleep(2000);	
		//Right Click
		driver.findElement(By.partialLinkText("Right")).click();
		Thread.sleep(2000);	
		WebElement rightclick = driver.findElement(By.id("btn_a"));
		act.contextClick(rightclick).perform();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//div[@class='py-1 ps-1 hover:bg-orange-300']")).click();
		Thread.sleep(2000);	
		//Double Click
		driver.findElement(By.partialLinkText("Double")).click();
		Thread.sleep(2000);	
		WebElement doubletap = driver.findElement(By.id("btn_a"));
		act.doubleClick(doubletap).perform();
		Thread.sleep(2000);	
		//Submit Click
		driver.findElement(By.partialLinkText("Submit")).click();
		Thread.sleep(2000);	
		driver.findElement(By.id("sat_a")).click();
		Thread.sleep(2000);	
		driver.findElement(By.id("btn_abh")).click();		
	}
}
