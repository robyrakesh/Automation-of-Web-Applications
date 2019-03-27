package com.blackboard.ui.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.pagefactory.DefaultElementLocator;

public class Homepage {

	static WebDriver driver;
	
	@FindBy(xpath = "//*[@id='loginBox']/h2")
	WebElement LoginwithUWIN;
	

	@FindBy(xpath = "//*[@id='username']")
	WebElement UserName;

	@FindBy(xpath = "//*[@id='password']")
	WebElement Password;

	@FindBy(xpath = "/html/body/div/div/div/div[1]/form/div[3]/button")
	WebElement LoginButton;

	@FindBy(xpath = "//*[@id='Courses.label']")
	WebElement CoursesTab;

	

	
	public Homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void loginToApplication(String username, String Pass) throws InterruptedException {
		//String winHandleBefore = driver.getWindowHandle();
		Thread.sleep(1000);
		System.out.println("hii");
	
	//	LoginwithUWIN.click();
		
		UserName.sendKeys(username);
		
		Password.sendKeys(Pass);
		
		LoginButton.click();
		Thread.sleep(3000);
		

		
}
	
	public void openCourses() {
		CoursesTab.click();
	}
}