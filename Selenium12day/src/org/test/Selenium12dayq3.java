package org.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium12dayq3 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jashu\\eclipse-workspace\\Selenium12day\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://toolsqa.com/");
	d.manage().window().maximize();	

	WebElement down = d.findElement(By.xpath("//a[text()='Katalon']"));
JavascriptExecutor js=(JavascriptExecutor)d;
js.executeScript("arguments[0].scrollIntoView(true)",down);
Thread.sleep(3000);
WebElement up =d.findElement(By.xpath("(//span[text()='Online Training'])[1]"));
js.executeScript("arguments[0].scrollIntoView(false)",up);
}
}