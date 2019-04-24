package org.text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumday4q12 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jashu\\eclipse-workspace\\Selenium3day\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.snapdeal.com/");
	d.manage().window().maximize();	
	Thread.sleep(1000);
		
	WebElement close=d.findElement(By.xpath("//*[@id=\"cartModal\"]/div[2]/div/section/div/div[1]/span"));
	close.click();
	Thread.sleep(1000);
	
	WebElement para1=d.findElement(By.xpath("//span[contains(text(),'Cart')]"));
para1.click();
Thread.sleep(1000);

WebElement para2=d.findElement(By.xpath("checkout-continue"));
	String checkout = para2.getAttribute("value");
System.out.println(checkout);

}
}
