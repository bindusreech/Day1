package org.text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumday4q2 {
	public static void main(String[] args) {
		//set property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jashu\\eclipse-workspace\\Selenium3day\\drivers\\chromedriver.exe");
		
		//launch browser
		WebDriver d = new ChromeDriver();
		//url
		d.get("http://www.greenstechnologys.com/selenium-course-content.html");
	d.manage().window().maximize();	

	//to locate a 3rdpara
	WebElement para = d.findElement(By.xpath("//p[contains(text(),'Our')]"));
	String text = para.getText();
		System.out.println(text);
	WebElement para1 = d.findElement(By.xpath("//strong[contains(text(),'Appium')]"));
	String text1 = para1.getText();
		System.out.println(text1);
		
		
	}
	}
