package com.blackboard.ui.Actions;

import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.pagefactory.DefaultElementLocator;

public class Courses {

	static WebDriver driver;
	
	
	@FindBy(xpath = "//*[@id='_22_1termCourses_noterm']/ul/li[1]/a")
	WebElement Marketing;
	

	@FindBy(xpath = "//*[@id='_22_1termCourses_noterm']/ul/li[2]/a")
	WebElement AdvanceDB;


	@FindBy(xpath = "//*[@id='_22_1termCourses_noterm']/ul/li[3]/a")
	WebElement Advancesys;

	@FindBy(xpath = "//*[@id='_22_1termCourses_noterm']/ul/li[5]/a")
	WebElement Transform;

	@FindBy(xpath = "//*[@id='todoModule']/div/div[3]/div[2]/a[2]")
	WebElement GoButton;

	@FindBy(xpath = "//*[@id='actionsMenu']")
	WebElement ActionButton;
	
	@FindBy(xpath = "//*[@id='actionMenu_3']/ul/li[1]/a")
	WebElement expandall;

	
	

	
	public Courses(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	

	public void MarketingDetails() throws InterruptedException {
		Marketing.click();
		Thread.sleep(1000);
		GoButton.click();
		//ActionButton.click();
		
		Actions action = new Actions(Courses.driver);
	
		action.moveToElement(ActionButton);
		//action.click(expandall);
		
		
		//Select actions = new Select(Actions);
		//actions.deselectByVisibleText("Expand All");
		
	}
	
	public void DatabseDetails() {
		AdvanceDB.click();
		GoButton.click();
	}
	public void systemprogDetails() {
		Advancesys.click();
		GoButton.click();
	}
	public void transformDetails() {
		Transform.click();
		GoButton.click();
	}
}