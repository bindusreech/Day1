package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumday3q10 {
public static void main(String[] args) {
		//set property
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jashu\\eclipse-workspace\\Selenium3day\\drivers\\chromedriver.exe");
			
//launch browser
			WebDriver d = new ChromeDriver();
			//url
d.get("http://www.amazon.in/");
d.manage().window().maximize();	

		//to locate a button
		WebElement btnlogin = d.findElement(By.xpath("//a[@href='contact.php']"));
		
		//to click a button
		btnlogin.click();

		//find locator for name
		WebElement textname = d.findElement(By.xpath("//input[@id='InputName']"));
	//insert
		textname.sendKeys("abcd");
		
		//find locator for email
		WebElement textemail = d.findElement(By.xpath("//input[@id='InputEmail1']"));
	//insert
		textemail.sendKeys("abcd@gmail.com");
				
		//find locator for courses dropdown
				WebElement course = d.findElement(By.name("courses"));
				course.sendKeys("azure");
	
				
}
	
	
}
