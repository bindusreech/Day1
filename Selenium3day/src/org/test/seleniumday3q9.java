package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumday3q9 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jashu\\eclipse-workspace\\Selenium3day\\drivers\\chromedriver.exe");
	
	WebDriver d = new ChromeDriver();
	d.get("http://www.flipkart.com/");
d.manage().window().maximize();	

WebElement signin= d.findElement(By.xpath("//a[@href='/account/login?ret=/']"));
signin.click();

	
}	
}
