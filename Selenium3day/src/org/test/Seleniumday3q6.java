package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumday3q6 {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jashu\\eclipse-workspace\\Selenium3day\\drivers\\chromedriver.exe");


WebDriver e=new ChromeDriver();
e.get("https://www.redbus.in/");
e.manage().window().maximize();	

//find login button
WebElement btnsign= e.findElement(By.xpath("//div[@id='signin-block']"));
btnsign.click();

//to find locator for sign in
WebElement signin= e.findElement(By.id("signInLink"));

}
	
	
}
