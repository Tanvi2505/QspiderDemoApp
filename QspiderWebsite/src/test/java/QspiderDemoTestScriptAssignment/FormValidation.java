package QspiderDemoTestScriptAssignment;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import QspidersDemoAppAssignment.QspiderDemoApp;

public class FormValidation extends QspiderDemoApp{
	@Test
	public void tc_10() throws InterruptedException {
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[11]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("fullName")).sendKeys("Tanvi Suryawanshi");
		driver.findElement(By.id("emailId")).sendKeys("suryawanshitanvi468@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Tanvi@2505");
		driver.findElement(By.id("mobile")).sendKeys("9132633232");
		WebElement city = driver.findElement(By.id("city"));
		Select sel1 = new Select(city);
		sel1.selectByVisibleText("Pune");
		
		WebElement file = driver.findElement(By.xpath("//input[@type='file']"));
		File upload = new File("C:\\Users\\HP\\Desktop.pdf");
		String absolutePath = upload.getAbsolutePath();
		file.sendKeys(absolutePath);
        Thread.sleep(2000);
		
		
	}
}
