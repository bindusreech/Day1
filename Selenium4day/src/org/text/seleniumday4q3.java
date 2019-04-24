package org.text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumday4q3 {
public static void main(String[] args) {
//set property
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jashu\\eclipse-workspace\\Selenium3day\\drivers\\chromedriver.exe");
	//launch browser
	WebDriver d = new ChromeDriver();
	//url
	d.get("http://www.greenstechnologys.com/oracle-training.html");
d.manage().window().maximize();	

//to locate a 1st para
WebElement para =d.findElement(By.xpath("//p[contains(text(),'Awarded')]"));
String text=para.getText();
System.out.println(text);
//to locate a 2nd para
WebElement para1 = d.findElement(By.xpath("//p[contains(text(),'Rated')]"));
	String text1 = para1.getText();
	System.out.println(text1);	
}
}

