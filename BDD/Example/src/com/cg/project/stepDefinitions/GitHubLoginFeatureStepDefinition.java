package com.cg.project.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.github.beans.LoginPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class GitHubLoginFeatureStepDefinition {
	private WebDriver driver;
	
	private LoginPage loginPage;
	@Before
	public void setUpEnv1()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	}
	@Given("^User will be on login page of Github$")
	public void user_will_be_on_login_page_of_Github() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://github.com/login");
		  loginPage=new LoginPage();
		  PageFactory.initElements(driver, loginPage);
		  
	    
	}

	@When("^User enters invalid username and password$")
	public void user_enters_invalid_username_and_password() throws Throwable {
		/*WebElement usernameElement=driver.findElement(By.id("login_field"));
		WebElement passwordElement=driver.findElement(By.id("password"));
		usernameElement.sendKeys("");
		passwordElement.sendKeys("");
usernameElement.submit();*/
		loginPage.setUsername("jeevana0204");
		loginPage.setPassowrd("Vijaya@123467");
		loginPage.clickSignIn();
	}

	@Then("^User cannot login to the github account$")
	public void user_cannot_login_to_the_github_account() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//String actualErrorMessage=driver.getTitle();
		//String actualErrorMessage=driver.findElement(By.xpath("//*[@id=\"js-flash-container\"]/div/div")).getText();
		String expectedErrorMessage="Incorrect username or password.";
		Assert.assertEquals(expectedErrorMessage, loginPage.getActualErrorMessageforinvalid());
		
	}

	@When("^User enters valid username and password$")
	public void user_enters_valid_username_and_password() throws Throwable {
		/*WebElement usernameElement=driver.findElement(By.id("login_field"));

		WebElement passwordElement=driver.findElement(By.id("password"));
		usernameElement.sendKeys("jeevana0204");
		passwordElement.sendKeys("Vijaya@123");
		usernameElement.submit();
*/		loginPage.setUsername("jeevana0204");
		loginPage.setPassowrd("Vijaya@1234");
		loginPage.clickSignIn();

	    
	}

	@Then("^User can login to the github account$")
	public void user_can_login_to_the_github_account() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//String actualErrorMessage=driver.findElement(By.xpath(""
				//+ "//*[@id=\"user-links\"]/li[3]/details/details-menu/ul/li[1]/a/strong")).getText();
				/*String actualErrorMessage=driver.findElement(By.xpath("//*[@id=\"user-links\"]"
						+ "/li[3]/details/details-menu/ul/li[1]/a/strong")).getText();*/
		String expectedErrorMessage="Jeevana0204";
		Assert.assertEquals(expectedErrorMessage, loginPage.getActualErrorMessageforValid());
		

	    
	}

		}
