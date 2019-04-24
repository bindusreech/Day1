package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium12dayq5 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jashu\\eclipse-workspace\\Selenium12day\\drivers\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.get("https://www.facebook.com/");
d.manage().window().maximize();

WebElement login=d.findElement(By.id("email"));
WebElement pwd=d.findElement(By.id("pass"));

JavascriptExecutor js=(JavascriptExecutor)d;
js.executeScript("arguments[0].setAttribute('value','Hello')",login);
js.executeScript("arguments[0].setAttribute('value','password')", pwd);

WebElement btnlogin =d.findElement(By.xpath("//input[@value='Log In']"));
js.executeScript("arguments[0].click()", btnlogin);

}
}
