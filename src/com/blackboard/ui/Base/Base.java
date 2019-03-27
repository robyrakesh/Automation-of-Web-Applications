package com.blackboard.ui.Base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base{
	
	
	public static WebDriver driver;
	static String  url= "https://blackboard.uwindsor.ca/";
	static String  browser= "chrome";
	
	public static void init(){
		selectBrowser(browser);
		getUrl(url);
		//String log4jConfPath = "log4j.properties";
		//PropertyConfigurator.configure(log4jConfPath);
	}
	
	public static void selectBrowser(String browser){
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Roby\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("edge")){
			
			
			driver = new EdgeDriver();
			
			
		}
		else {
			System.out.println("Unrecognized browser name");
		}
		
	}
	
	public static void getUrl(String url){
		//log.info("Navigating to:-"+url);
		try {
		    Runtime.getRuntime().exec("RunDll32.exe InetCpl.cpl,ClearMyTracksByProcess 255");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		driver.get(url);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"loginBox\"]/h2")).click();

		
	}
}