package org.text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumday4q9 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jashu\\eclipse-workspace\\Selenium3day\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.google.com//");
	d.manage().window().maximize();	
		
	WebElement para1=d.findElement(By.xpath("(//a[contains(text(),'')])[3]"));
para1.click();

WebElement para2=d.findElement(By.xpath("(//input[contains(text(),'')])[6]"));
para2.sendKeys("greens velmurugan");
para2.click();
Thread.sleep(2000);
}}
