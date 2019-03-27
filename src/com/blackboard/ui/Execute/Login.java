package com.blackboard.ui.Execute;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.blackboard.ui.Actions.*;
import com.blackboard.ui.Base.Base;


public class Login extends Base {

	
	 static Homepage homepage;
	 static Courses courses;
	 
	 
	 
	 public static void marketing() throws InterruptedException {
		 
		 courses = new Courses(driver);
		 courses.MarketingDetails();
		  WebElement actionbutton = driver.findElement(By.xpath("//*[@id='actionsMenu']"));
		Actions action = new Actions(driver);
			
			action.moveToElement(actionbutton);
		 
	 }
	

	public static void main(String[] args) throws InterruptedException {
		     init();
			homepage = new Homepage(driver);
			homepage.loginToApplication("kaur17o", "Kasmeen@234");
			homepage.openCourses();	
			marketing();
			}

	
}

