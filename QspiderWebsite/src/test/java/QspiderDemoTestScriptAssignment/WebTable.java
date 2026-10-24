package QspiderDemoTestScriptAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import QspidersDemoAppAssignment.QspiderDemoApp;

public class WebTable extends QspiderDemoApp {
	@Test
	public void tc_09() throws InterruptedException {
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[10]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class='no-use']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//div[@class='no-use'])[2]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//section[@class='relative']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@class='bg-red-500 hover:bg-red-700 text-white font-bold py-2 px-4 rounded m-2']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class='font-medium text-blue-600 dark:text-blue-500 hover:underline cursor-pointer']")).click();
		Thread.sleep(2000);

		WebElement item = driver.findElement(By.name("name"));
		Select sel = new Select(item);
		sel.selectByVisibleText("Apple iPhone");
		Thread.sleep(2000);

		WebElement quantity = driver.findElement(By.name("quantity"));
		Select sel1 = new Select(quantity);
		sel1.selectByVisibleText("4");
		Thread.sleep(2000);

		driver.findElement(By.id("updatebtn")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='bg-orange-600 rounded-md text-white font-bold p-2 py-1']")).click();
		Thread.sleep(2000);
		WebElement favourite = driver.findElement(By.id("selection"));
		Select sel2 = new Select(favourite);
		sel2.selectByVisibleText("Shoes");
		Thread.sleep(2000);
		WebElement quantity1 = driver.findElement(By.name("quantity"));
		Select sel3 = new Select(quantity1);
		sel3.selectByVisibleText("3");
		Thread.sleep(2000);

		driver.findElement(By.id("modalButton")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='no-use'])[3]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='no-use'])[4]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[@class='cursor-pointer bg-orange-300 hover:bg-orange-200 px-3 py-1 rounded']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//li[@class='cursor-pointer bg-orange-300 hover:bg-orange-200 px-3 py-1 rounded'])[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='no-use'])[5]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("deleteButton")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='no-use'])[6]")).click();
		Thread.sleep(2000);
		
		
	}
}