package org.text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumday4q14 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jashu\\eclipse-workspace\\Selenium3day\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com/ ");
	d.manage().window().maximize();	
		
	WebElement close = d.findElement(By.xpath("(//button[contains(text(),'')])[2]"));
	close.click();
	Thread.sleep(1000);
	
	WebElement elec=d.findElement(By.xpath("//span[contains(text(),'Electronics')]"));
	String elect = elec.getAttribute("value");
System.out.println(elect);
	Thread.sleep(1000);

WebElement tv=d.findElement(By.xpath("//span[contains(text(),'TVs & Appliances')]"));
tv.click();	
String tvandapp = tv.getAttribute("value");
System.out.println(tvandapp);
Thread.sleep(1000);
}
}
