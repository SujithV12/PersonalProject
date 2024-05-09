package com.assignments;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;
public class UiTesting
{
	public WebDriver driver;
	@Test()
	
		public  void getcalley() throws InterruptedException, IOException 
		{
			 driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.getcalley.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			Dimension s = new Dimension(1920,1080);
			driver.manage().window().setSize(s);
			File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(f1, new File("C:\\Users\\Admin\\3D Objects\\uitestingchrome\\getcall1.png"));
			
			Thread.sleep(2000);
			
			Dimension s1 = new Dimension(1366,768);
			driver.manage().window().setSize(s1);
			File f2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(f2, new File("C:\\Users\\Admin\\3D Objects\\uitestingchrome\\getcall2.png"));
			
			Thread.sleep(2000);
			Dimension s2 = new Dimension(1536,864 );
			driver.manage().window().setSize(s2);
			File f3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(f3, new File("C:\\Users\\Admin\\3D Objects\\uitestingchrome\\getcall3.png"));
			
			Thread.sleep(2000);
			Dimension s3 = new Dimension(1536,864 );
			driver.manage().window().setSize(s3);
			File f4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(f4, new File("C:\\Users\\Admin\\3D Objects\\uitestingchrome\\getcall4.png"));
			
			Thread.sleep(2000);
			Dimension s4 = new Dimension(360,640 );
			driver.manage().window().setSize(s4);
			File f5 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(f5, new File("C:\\Users\\Admin\\3D Objects\\uitestingchrome\\getcall5.png"));
			
			Thread.sleep(2000);
			Dimension s5 = new Dimension(414,896 );
			driver.manage().window().setSize(s5);
			File f6= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(f6, new File("C:\\Users\\Admin\\3D Objects\\uitestingchrome\\getcall6.png"));
			

			Thread.sleep(2000);
			Dimension s6 = new Dimension(414,896 );
			driver.manage().window().setSize(s6);
			File f7= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(f7, new File("C:\\Users\\Admin\\3D Objects\\uitestingchrome\\getcall6.png"));
			
			Thread.sleep(2000);
			driver.close();
		}
	@Test()
	public void getcalley2() throws IOException, InterruptedException 
	{
		 driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.getcalley.com/calley-call-from-browser/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Dimension s8 = new Dimension(1920,1080);
		driver.manage().window().setSize(s8);
		File f8 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f8, new File("C:\\Users\\Admin\\3D Objects\\uitestingchrome\\getcalley7.png"));
		
		Thread.sleep(2000);
		
		Dimension s9 = new Dimension(1366,768);
		driver.manage().window().setSize(s9);
		File f9 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f9, new File("C:\\Users\\Admin\\3D Objects\\uitestingchrome\\getcall8.png"));
		
		Thread.sleep(2000);
		Dimension s10 = new Dimension(1536,864 );
		driver.manage().window().setSize(s10);
		File f10 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f10, new File("C:\\Users\\Admin\\3D Objects\\uitestingchrome\\getcall9.png"));
		
		Thread.sleep(2000);
		Dimension s11 = new Dimension(1536,864 );
		driver.manage().window().setSize(s11);
		File f11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f11, new File("C:\\Users\\Admin\\3D Objects\\uitestingchrome\\getcall10.png"));
		
		Thread.sleep(2000);
		Dimension s12 = new Dimension(360,640 );
		driver.manage().window().setSize(s12);
		File f12 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f12, new File("C:\\Users\\Admin\\3D Objects\\uitestingchrome\\getcal11.png"));
		
		Thread.sleep(2000);
		Dimension s13 = new Dimension(414,896 );
		driver.manage().window().setSize(s13);
		File f13= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f13, new File("C:\\Users\\Admin\\3D Objects\\uitestingchrome\\getcall12.png"));
		

		Thread.sleep(2000);
		Dimension s14 = new Dimension(414,896 );
		driver.manage().window().setSize(s14);
		File f14= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f14, new File("C:\\Users\\Admin\\3D Objects\\uitestingchrome\\getcall13.png"));
		
		Thread.sleep(2000);
		driver.close();
	}
	
	@Test()
	public void getcalley3() throws IOException, InterruptedException 
	{
		 driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.getcalley.com/calley-pro-features/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Dimension s15 = new Dimension(1920,1080);
		driver.manage().window().setSize(s15);
		File f15= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f15, new File("C:\\Users\\Admin\\3D Objects\\uitestingchrome\\getcalley15.png"));
		
		Thread.sleep(2000);
		
		Dimension s16 = new Dimension(1366,768);
		driver.manage().window().setSize(s16);
		File f16 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f16, new File("C:\\Users\\Admin\\3D Objects\\uitestingchrome\\getcall16.png"));
		
		Thread.sleep(2000);
		Dimension s17 = new Dimension(1536,864 );
		driver.manage().window().setSize(s17);
		File f17 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f17, new File("C:\\Users\\Admin\\3D Objects\\uitestingchrome\\getcall7.png"));
		
		Thread.sleep(2000);
		Dimension s18 = new Dimension(1536,864 );
		driver.manage().window().setSize(s18);
		File f18 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f18, new File("C:\\Users\\Admin\\3D Objects\\uitestingchrome\\getcall18.png"));
		
		Thread.sleep(2000);
		Dimension s19 = new Dimension(360,640 );
		driver.manage().window().setSize(s19);
		File f19 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f19, new File("C:\\Users\\Admin\\3D Objects\\uitestingchrome\\getcall19.png"));
		
		Thread.sleep(2000);
		Dimension s20 = new Dimension(414,896 );
		driver.manage().window().setSize(s20);
		File f20= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f20, new File("C:\\Users\\Admin\\3D Objects\\uitestingchrome\\getcall20.png"));
		

		Thread.sleep(2000);
		Dimension s21 = new Dimension(414,896 );
		driver.manage().window().setSize(s21);
		File f21= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f21, new File("C:\\Users\\Admin\\3D Objects\\uitestingchrome\\getcall21.png"));
		
		Thread.sleep(2000);
		driver.close();
	}

	@Test()
	public void getcalley4() throws IOException, InterruptedException 
	{
		 driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.getcalley.com/best-auto-dialer-app/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Dimension s22 = new Dimension(1920,1080);
		driver.manage().window().setSize(s22);
		File f22= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f22, new File("C:\\Users\\Admin\\3D Objects\\uitestingchrome\\getcalley22.png"));
		
		Thread.sleep(2000);
		
		Dimension s23 = new Dimension(1366,768);
		driver.manage().window().setSize(s23);
		File f23 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f23, new File("C:\\Users\\Admin\\3D Objects\\uitestingchrome\\getcall23.png"));
		
		Thread.sleep(2000);
		Dimension s24 = new Dimension(1536,864 );
		driver.manage().window().setSize(s24);
		File f24 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f24, new File("C:\\Users\\Admin\\3D Objects\\uitestingchrome\\getcall24.png"));
		
		Thread.sleep(2000);
		Dimension s25 = new Dimension(1536,864 );
		driver.manage().window().setSize(s25);
		File f25 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f25, new File("C:\\Users\\Admin\\3D Objects\\uitestingchrome\\getcall25.png"));
		
		Thread.sleep(2000);
		Dimension s26 = new Dimension(360,640 );
		driver.manage().window().setSize(s26);
		File f26 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f26, new File("C:\\Users\\Admin\\3D Objects\\uitestingchrome\\getcall26.png"));
		
		Thread.sleep(2000);
		Dimension s27 = new Dimension(414,896 );
		driver.manage().window().setSize(s27);
		File f27= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f27, new File("C:\\Users\\Admin\\3D Objects\\uitestingchrome\\getcall27.png"));
		

		Thread.sleep(2000);
		Dimension s28 = new Dimension(414,896 );
		driver.manage().window().setSize(s28);
		File f28= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f28, new File("C:\\Users\\Admin\\3D Objects\\uitestingchrome\\getcall28.png"));
		
		Thread.sleep(2000);
		driver.close();
	}
	@Test()
	public void getcalley5() throws IOException, InterruptedException 
	{
		 driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.getcalley.com/how-calley-auto-dialer-app-works/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Dimension s29 = new Dimension(1920,1080);
		driver.manage().window().setSize(s29);
		File f29= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f29, new File("C:\\Users\\Admin\\3D Objects\\uitestingchrome\\getcalley2.0png"));
		
		Thread.sleep(2000);
		
		Dimension s30 = new Dimension(1366,768);
		driver.manage().window().setSize(s30);
		File f30 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f30, new File("C:\\Users\\Admin\\3D Objects\\uitestingchrome\\getcall30.png"));
		
		Thread.sleep(2000);
		Dimension s31 = new Dimension(1536,864 );
		driver.manage().window().setSize(s31);
		File f31 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f31, new File("C:\\Users\\Admin\\3D Objects\\uitestingchrome\\getcall31.png"));
		
		Thread.sleep(2000);
		Dimension s32 = new Dimension(1536,864 );
		driver.manage().window().setSize(s32);
		File f32 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f32, new File("C:\\Users\\Admin\\3D Objects\\uitestingchrome\\getcall32.png"));
		
		Thread.sleep(2000);
		Dimension s33 = new Dimension(360,640 );
		driver.manage().window().setSize(s33);
		File f33 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f33, new File("C:\\Users\\Admin\\3D Objects\\uitestingchrome\\getcall33.png"));
		
		Thread.sleep(2000);
		Dimension s34 = new Dimension(414,896 );
		driver.manage().window().setSize(s34);
		File f34= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f34, new File("C:\\Users\\Admin\\3D Objects\\uitestingchrome\\getcall34.png"));
		

		Thread.sleep(2000);
		Dimension s35 = new Dimension(414,896 );
		driver.manage().window().setSize(s35);
		File f35= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f35, new File("C:\\Users\\Admin\\3D Objects\\uitestingchrome\\getcall35.png"));
		
		Thread.sleep(2000);
		driver.close();
	}
	}
			


	

