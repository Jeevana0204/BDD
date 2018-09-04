package com.cg.project.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.github.beans.Google;
import com.cg.github.beans.RedBus;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class GoogleSearchFeatureStepDefinition {
	private WebDriver driver;
	private Google googleSearch;
	@Before
	public void setUpEnv1() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	}
	@Given("^User is on google homepage$")
	public void user_is_on_google_homepage() throws Throwable {
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://www.google.com/");
		 googleSearch=new Google();
			PageFactory.initElements(driver, googleSearch);
	      
	}

	@When("^User searches for 'Agile methodology' term$")
	public void user_searches_for_Agile_methodology_term() throws Throwable {
	    
		/*WebElement searchElement=driver.findElement(By.id("lst-ib"));
		searchElement.sendKeys("Agile methodology");
		searchElement.submit();*/
		googleSearch.setSearch("Agile methodology");
		
		googleSearch.submit();
				
	    
	}

	@Then("^All pages linked with 'Agile methodolgy' should be displayed$")
	public void all_pages_linked_with_Agile_methodolgy_should_be_displayed() throws Throwable {
	    		String actualTitle=driver.getTitle();
	    		String expectedTitle="Agile methodology - Google Search";
	    		Assert.assertEquals(expectedTitle, actualTitle);
	    		driver.close();	
		}
	

}

