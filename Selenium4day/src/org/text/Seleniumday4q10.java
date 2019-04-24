package org.text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumday4q10 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jashu\\eclipse-workspace\\Selenium3day\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.gmail.com");
	d.manage().window().maximize();	
		
	WebElement para1=d.findElement(By.id("identifierId"));
	para1.sendKeys("abc@gmail.com");

}	
}
