package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumday3q8 {
	public static void main(String[] args) {
		
		//set property
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jashu\\eclipse-workspace\\Selenium3day\\drivers\\chromedriver.exe");
			
			//launch browser
			WebDriver d = new ChromeDriver();
			//url
			d.get("http://www.greenstechnologies.in/selenium-training.php");
		d.manage().window().maximize();	

		//to locate a button
		WebElement btnlogin = d.findElement(By.xpath("//a[@href='http://traininginchennai.in/core%20java%20material.pdf']"));
		
		//to click a button
		btnlogin.click();
	}
}
