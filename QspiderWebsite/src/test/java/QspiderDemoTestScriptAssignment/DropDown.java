package QspiderDemoTestScriptAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import QspidersDemoAppAssignment.QspiderDemoApp;

public class DropDown extends QspiderDemoApp{
	@Test
	public void tc_08() throws InterruptedException {
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[9]")).click();
		Thread.sleep(2000);
		//Single Select
		WebElement countrycode = driver.findElement(By.id("country_code"));
		Select sel = new Select(countrycode);
		sel.selectByVisibleText("+91");
		Thread.sleep(2000);
		driver.findElement(By.id("phone")).sendKeys("9132633232");
		Thread.sleep(2000);
		driver.findElement(By.id("female")).click();
		Thread.sleep(2000);
		WebElement country = driver.findElement(By.id("select3"));
		Select sel1 = new Select(country);
		sel1.selectByVisibleText("India");
		Thread.sleep(2000);
//		WebElement product = driver.findElement(By.id("select7"));
//		Select sel2 = new Select(product);
//		sel1.selectByVisibleText("2");
//		Thread.sleep(2000);
		//Multiple Select
		WebElement multiple = driver.findElement(By.partialLinkText("Multi"));
		Select mul = new Select(multiple);
		mul.selectByVisibleText("Fjallraven - Foldsac...");
		mul.selectByVisibleText("Mens Cotton Jacket...");
		mul.selectByVisibleText("Mens Casual Slim Fit...");
		
		
	}
}
