package org.text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumday4q4 {
public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jashu\\eclipse-workspace\\Selenium6day\\drivers\\chromedriver.exe");
			WebDriver d = new ChromeDriver();
			d.get("https://www.google.co.in/webhp");
		d.manage().window().maximize();	

		WebElement close=d.findElement(By.xpath("//button[@class='close']"));
		close.click();
		WebElement para =d.findElement(By.xpath("(//span[@class='testimonial-content'])[1]"));
		String text=para.getText();
		System.out.println(text);


		}
}
