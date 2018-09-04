package com.cg.bdd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Bdd_html {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		//checkBoxTest();
		//radioButton();
		selectTest();

	}
	private static void checkBoxTest() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\bdd.html");
		WebElement checkbox=driver.findElement(By.id("mayoCheckbox"));
		Thread.sleep(1000);
		checkbox.click();
		if(checkbox.isSelected())
			System.out.println("Value of checkbox :-"+checkbox.getAttribute("value"));
	}
	private static void radioButton() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\Radio.html");
	By elements=By.name("color");
	List<WebElement> radioButtons=driver.findElements(elements);
	WebElement radioBtn=radioButtons.get(1);
	radioBtn.click();
	for(WebElement radioButton:radioButtons)
	{
		if(radioButton.isSelected())
		{
			System.out.println(radioButton.getAttribute("value"));
		}
	}
	}	
	private static void selectTest() 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\select.html");
		WebElement selectElement=driver.findElement(By.id("select1"));
		Select select=new Select(selectElement);
		select.selectByVisibleText("Maybe");
		
		
	}
	
	}


