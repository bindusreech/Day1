package org.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium12dayq4 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jashu\\eclipse-workspace\\Selenium12day\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.greenstechnologys.com/selenium-course-content.html");
	d.manage().window().maximize();	

	//WebElement cls=d.findElement(by.)
	WebElement down = d.findElement(By.xpath("//p[contains(text(),'Looking')]"));
JavascriptExecutor js=(JavascriptExecutor)d;
js.executeScript("arguments[0].scrollIntoView(true)",down);
Thread.sleep(3000);
WebElement up =d.findElement(By.xpath("(//h2[contains(text(),'Best Selenium training')])[2]"));
js.executeScript("arguments[0].scrollIntoView(false)",up);
Actions a=new Actions(d);
a.doubleClick(up).perform();
Thread.sleep(3000);
}
}
