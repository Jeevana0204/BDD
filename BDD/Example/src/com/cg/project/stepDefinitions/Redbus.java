package com.cg.project.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.github.beans.RedBus;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Redbus {
	WebDriver driver;
	private RedBus rb;

	@Before
	public void setUpEnv1() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	}

	@Given("^User will be on the homepage of redbus$")
	public void user_will_be_on_the_homepage_of_redbus() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// System.setProperty("webdriver.chrome.driver",
		// "D:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		rb = new RedBus();
		PageFactory.initElements(driver, rb);

	}

	@When("^User enters valid source,destination and onward date$")
	public void user_enters_valid_source_destination_and_onward_date() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		/*
		 * WebElement source = driver.findElement(By.id("src")); WebElement destination
		 * = driver.findElement(By.id("dest")); WebElement onward =
		 * driver.findElement(By.id("onward_cal"));
		 */
		// WebElement
		// submit=driver.findElement(By.xpath("/html/body/div[1]/div[4]/button"));
		// WebElement onward=driver.findElement(By.className("fl icon-calendar_icon-new
		// icon-onward-calendar icon"));
		/*
		 * source.sendKeys("Bangalore"); Thread.sleep(2000); source =
		 * driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[1]/div/ul/li[1]"));
		 * source.click(); destination.sendKeys("Hyderabad"); Thread.sleep(2000);
		 * destination =
		 * driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[2]/div/ul/li[1]"));
		 * destination.click(); onward.sendKeys("30-Aug-2018"); Thread.sleep(2000);
		 * onward = driver.findElement(By.xpath(
		 * "//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[7]/td[4]"));
		 * onward.click();
		 * 
		 * WebElement submit = driver.findElement(By.id("search_btn"));
		 * 
		 * submit.click();
		 */

		rb.setFrom("Bangalore");
		Thread.sleep(2000);
		rb.fromxp();

		rb.setTo("Hyderabad");
		Thread.sleep(2000);
		rb.toxp();
		rb.setOnward("30-Aug-2018");
		Thread.sleep(2000);
		rb.onxp();
		rb.clickSrc();

	}

	@Then("^all buses available on that particular day will be displayed$")
	public void all_buses_available_on_that_particular_day_will_be_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		String actualTitle = driver.getCurrentUrl();
		String expectedTitle = "https://www.redbus.in/search?fromCityName=Bangalore&"
				+ "fromCityId=122&toCityName=Hyderabad&toCityId=124&onward=30-Aug-2018&opId=0&busType=Any";
		Assert.assertEquals(expectedTitle, actualTitle);

	}

}
