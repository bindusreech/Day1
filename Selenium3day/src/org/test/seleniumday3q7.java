package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumday3q7 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jashu\\eclipse-workspace\\Selenium3day\\drivers\\chromedriver.exe");
	
	WebDriver d=new ChromeDriver();
	d.get("https://www.cleartrip.com/trains");
	d.manage().window().maximize();
	
WebElement	frmstn = d.findElement(By.id("from_station"));
frmstn.sendKeys("chennai");

WebElement tostn = d.findElement(By.id("to_station"));
tostn.sendKeys("hyd");

WebElement Class = d.findElement(By.id("trainClass"));
Class.sendKeys("Sleeper (SL)");
	
}		
}
