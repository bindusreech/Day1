package org.text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumday4q5 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jashu\\eclipse-workspace\\Selenium3day\\drivers\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.get("http://www.greenstechnologys.com/index.html");
d.manage().window().maximize();	

WebElement para =d.findElement(By.xpath("//span[contains(text(),'Greens Technology OMR')]"));
String text=para.getText();
System.out.println(text);
	
WebElement para1=d.findElement(By.xpath("(//strong[contains(text(),'OMR')])[1]"));
String text1 = para1.getText();
System.out.println(text1);

WebElement para2=d.findElement(By.xpath("(//strong[contains(text(),'college')])[1]"));
String text2 = para2.getText();
System.out.println(text2);

WebElement para3=d.findElement(By.xpath("//strong[contains(text(),'upstairs')]"));
String text3 = para3.getText();
System.out.println(text3);

WebElement para4=d.findElement(By.xpath("(//strong[contains(text(),'college')])[2]"));
String text4 = para4.getText();
System.out.println(text4);

WebElement para5=d.findElement(By.xpath("(//span[contains(text(),'89399')])[2]"));
String text5 = para5.getText();
System.out.println(text5);
}
}
