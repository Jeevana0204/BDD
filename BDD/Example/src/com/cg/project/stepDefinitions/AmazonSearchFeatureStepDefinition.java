package com.cg.project.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.github.beans.Amazon;
import com.cg.github.beans.LoginPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonSearchFeatureStepDefinition {
	private WebDriver driver;
	private Amazon amazon;

	@Before
	public void setUpEnv1() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	}

	@Given("^User is on amazon homepage$")
	public void user_is_on_amazon_homepage() throws Throwable {
		// System.setProperty("webdriver.chrome.driver",
		// "D:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		amazon = new Amazon();
		PageFactory.initElements(driver, amazon);

	}

	@When("^User searches for 'Redmi note (\\d+)'$")
	public void user_searches_for_Redmi_note(int arg1) throws Throwable {
		/*
		 * WebElement searchElement=driver.findElement(By.id("twotabsearchtextbox"));
		 * searchElement.sendKeys("Redmi note 4"); searchElement.submit();
		 */
		amazon.setSearch("redmi note4");
		amazon.submit();

	}

	@Then("^all mobiles linked with 'Redmi note (\\d+)' will be displayed$")
	public void all_mobiles_linked_with_Redmi_note_will_be_displayed(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actionsString
		// actualTitle=driver.getTitle();
		// String actualTitle=driver.getCurrentUrl();
		 String actualTitle=driver.getTitle();

		String expectedTitle = "Amazon.in: redmi note4 - Smartphones / Smartphones & Basic Mobiles: Electronics";
		Assert.assertEquals(expectedTitle, actualTitle);

	}

	@When("^there is no availabilty for a particular search$")
	public void there_is_no_availabilty_for_a_particular_search() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
		 /* WebElement searchElement=driver.findElement(By.id("twotabsearchtextbox"));
		  searchElement.sendKeys("xvnasdb"); searchElement.submit();
		 */
		amazon.setSearch("jsdgbfk");
		amazon.submit();

	}

	@Then("^it should display that your search did not match any products$")
	public void it_should_display_that_your_search_did_not_match_any_products() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// String
		// actualTitle=driver.findElement(By.xpath("//*[@id=\"noResultsTitle\"]/span")).getText();
		 String actualTitle=driver.getTitle();

		String expectedTitle = "Amazon.in: jsdgbfk";
		Assert.assertEquals(expectedTitle, actualTitle);

	}

}
