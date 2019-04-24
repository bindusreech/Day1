package org.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium12dayq2 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jashu\\eclipse-workspace\\Selenium12day\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.greenstechnologys.com/");
	d.manage().window().maximize();	

	WebElement down = d.findElement(By.xpath("//span[text()='Greens Technologys Overall Reviews']"));
JavascriptExecutor js=(JavascriptExecutor)d;
js.executeScript("arguments[0].scrollIntoView(true)",down);
Thread.sleep(3000);

WebElement review=d.findElement(By.xpath("(//div[@class='box'])[2]"));
System.out.println(review.getText());
}}
