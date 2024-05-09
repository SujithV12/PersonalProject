package com.assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class AutomationTesting 
{

	public WebDriver driver;
	
@Test()
public void loginTest() throws InterruptedException, IOException
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://demo.dealsdray.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.findElement(By.id("mui-1")).sendKeys("prexo.mis@dealsdray.com");
	driver.findElement(By.id("mui-2")).sendKeys("prexo.mis@dealsdray.com");
	driver.findElement(By.xpath("//button[text()='Login']")).click();
	
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//span[text()='chevron_right']")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//span[text()='Orders']")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//button[text()='Add Bulk Orders']")).click();
	 driver.findElement(By.id("mui-7")).sendKeys("C:\\Users\\Admin\\3D Objects\\demo-data.xlsx");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[text()='Import']")).click();
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//button[text()='Validate Data']")).click();
	 Thread.sleep(2000);
	 
	 Alert alert = driver.switchTo().alert();
	 alert.accept();
	 Thread.sleep(2000);
	 
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement ele = driver.findElement(By.xpath("//input[@id='mui-572']"));
		jse.executeScript("arguments[0].scrollIntoView()",ele);
		
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\Users\\Admin\\3D Objects\\screenshot\\scrshot1.png"));
		
		
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		WebElement ele2= driver.findElement(By.xpath("//input[@id='mui-601']"));
		jse2.executeScript("arguments[0].scrollIntoView()",ele2);
			
		File f2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f2, new File("C:\\Users\\Admin\\3D Objects\\screenshot\\scrshot3.png"));
		
		Thread.sleep(2000); 
		driver.close();
}


}
