package org.text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumday4q13 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jashu\\eclipse-workspace\\Selenium3day\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
	d.manage().window().maximize();	
		
	WebElement para1=d.findElement(By.id("firstName"));
	para1.sendKeys("abcdf");
	String fname = para1.getAttribute("value");
System.out.println(fname);
Thread.sleep(1000);

WebElement para2=d.findElement(By.id("lastName"));
para2.sendKeys("cdefg");
String lasnam = para2.getAttribute("value");
System.out.println(lasnam);
Thread.sleep(1000);

WebElement para3=d.findElement(By.id("username"));
para3.sendKeys("abcdefg@gmail.com");
String email = para3.getAttribute("value");
System.out.println(email);
Thread.sleep(1000);

WebElement para4=d.findElement(By.xpath("(//input[contains(text(),'')])[4]"));
	para4.sendKeys("qwerty");
	String pwd = para4.getAttribute("value");
System.out.println(pwd);


WebElement para5=d.findElement(By.xpath("(//input[contains(text(),'')])[5]"));
	para5.sendKeys("qwerty");
	String pwdc = para5.getAttribute("value");
System.out.println(pwdc);
	}	
}
