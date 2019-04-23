package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumday3q4 {
public static void main(String[] args) {
	//set property
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jashu\\eclipse-workspace\\Selenium3day\\drivers\\chromedriver.exe");
	
	//launch browser
	WebDriver d = new ChromeDriver();
	//url
	d.get("https://www.toolsqa.com/automation-practice-form/");
d.manage().window().maximize();	
//find locator for firstname
	WebElement textfname = d.findElement(By.xpath("//input[@name='firstname']"));
//insert
	textfname.sendKeys("abcd");

//find locator for lastname
		WebElement textlname = d.findElement(By.xpath("//input[@name='lastname']"));
		//insert
		textlname.sendKeys("efgh");

//find locator for radiobtn gender
		WebElement radiobtn = d.findElement(By.xpath("//input[@id='sex-1']"));
		radiobtn.click();
	
//find locator for radiobtn exp yrs
		WebElement rbtn = d.findElement(By.xpath("//input[@id='exp-3']"));
		rbtn.click();

//find locator for date
		WebElement txtdate = d.findElement(By.xpath("//input[@id='datepicker']"));
		txtdate.sendKeys("01/10/1990");
		
//find locator for continents dropdown
		WebElement conti = d.findElement(By.id("continents"));
		conti.sendKeys("Africa");
		}}