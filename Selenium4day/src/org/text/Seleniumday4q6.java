package org.text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumday4q6 {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jashu\\eclipse-workspace\\Selenium3day\\drivers\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.get("http://www.greenstechnologys.com/testimonial.html ");
d.manage().window().maximize();	
	
WebElement para1=d.findElement(By.xpath("//strong[contains(text(),'Sekhar C')]"));
String text1 = para1.getText();
System.out.println(text1);
	}}
