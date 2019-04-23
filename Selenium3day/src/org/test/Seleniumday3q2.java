package org.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumday3q2 {
public static void main(String[] args) {
	//set property
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jashu\\eclipse-workspace\\Selenium3day\\drivers\\chromedriver.exe");
	
	//launch browser
	WebDriver d = new ChromeDriver();
	//url
	d.get("https://www.facebook.com/");
	
	//find locator for username
	WebElement textusr = d.findElement(By.id("email"));
	//insert
	textusr.sendKeys("abc@gmail.com");
	//find locator of pwd
	WebElement textpwd = d.findElement(By.id("pass"));
	//insert
	textpwd.sendKeys("test123");
	
	//to locate a button
	WebElement btnlogin = d.findElement(By.xpath("//input[@value='Log In']"));
	
	//to click a button
	btnlogin.click();

}
}
