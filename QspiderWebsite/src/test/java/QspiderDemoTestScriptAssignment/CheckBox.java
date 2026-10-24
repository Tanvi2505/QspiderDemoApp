package QspiderDemoTestScriptAssignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import QspidersDemoAppAssignment.QspiderDemoApp;

public class CheckBox extends  QspiderDemoApp  {
	@Test
	public void tc_04() throws InterruptedException {
	driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[4]")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("domain_a")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("domain_b")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("domain_c")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("domain_d")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("mode_a")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("mode_b")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("mode_c")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("mode_d")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("mode_e")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("mode_f")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("mode_g")).click();	
	Thread.sleep(2000);
	}
}
