package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumday3q5 {
public static void main(String[] args) {
	
	//set property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jashu\\eclipse-workspace\\Selenium3day\\drivers\\chromedriver.exe");
		
		//launch browser
		WebDriver d = new ChromeDriver();
		//url
		d.get("http://www.greenstechnologies.in/selenium-training.php");
	d.manage().window().maximize();	

	//to locate a button
	WebElement btnlogin = d.findElement(By.xpath("//a[@href='http://greenstech.in/interview-questions/cts.pdf#toolbar=0']"));
	
	//to click a button
	btnlogin.click();
	
}
}