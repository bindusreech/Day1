package org.text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumday4q11 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jashu\\eclipse-workspace\\Selenium3day\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.adactin.com/HotelApp/");
	d.manage().window().maximize();	
		
	WebElement para1=d.findElement(By.id("username"));
	para1.sendKeys("abc@gmail.com");
	String uname = para1.getAttribute("value");
System.out.println(uname);

WebElement para2=d.findElement(By.id("password"));
	para2.sendKeys("asdfgh");
	String pwd = para2.getAttribute("value");
System.out.println(pwd);
}}
