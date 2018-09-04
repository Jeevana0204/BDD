package com.cg.project.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.github.beans.GitHub;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GitHubRegistrationFeatureStepDefinition {
	private WebDriver driver;
	private GitHub gh;
	@Before
	public void setUpEnv1()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	}
	@Given("^User will be on the signup page of GitHub$")
	public void user_will_be_on_the_signup_page_of_GitHub() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://github.com/join?source=experiment-header-control-home");
          gh=new GitHub();
          PageFactory.initElements(driver, gh);
		
		
	}

	@When("^User enters valid username,email and password$")
	public void user_enters_valid_username_email_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		/*WebElement username=driver.findElement(By.id("user_login"));
		WebElement email=driver.findElement(By.id("user_email"));
		WebElement password=driver.findElement(By.id("user_password"));
		username.sendKeys("abchellohiiiibyee");
		email.sendKeys("hellohiibye7898854@gmail.com");
		password.sendKeys("hiihellobyee7894576");
		username.submit();*/
		gh.setUsername("gdjfsfdk");
		gh.setEmail("asdghb@gmail.com");
		gh.setPassword("ahgl4jh@1");
	gh.clickSignIn();
	    
	}

	@Then("^GitHub account will be created for the user$")
	public void github_account_will_be_created_for_the_user() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//String actualTitle=driver.getTitle();
		String actualTitle=driver.findElement(By.xpath("//*[@id=\"js-pjax-container\"]/div/div[1]/h1")).getText();
		String expectedTitle="Welcome to GitHub";
		//String expectedTitle="GitHub . Where software is built";
		Assert.assertEquals(expectedTitle, actualTitle);
		driver.close();
	}


	@When("^User enters invalid username$")
	public void user_enters_invalid_username() throws Throwable {
		/*WebElement username=driver.findElement(By.id("user_login"));
		WebElement email=driver.findElement(By.id("user_email"));
		WebElement password=driver.findElement(By.id("user_password"));
		username.sendKeys("abc");
		email.sendKeys("hellohiibyeee7895@gmail.com");
		password.sendKeys("hellohiibyee789456");
		username.submit();*/
		gh.setUsername("abc");
		gh.setPassword("dfhks@123");
		gh.setEmail("hdjkl@gmail.com");
	
	    gh.clickSignIn();
	}

	@Then("^Invalid username will be displayed$")
	public void invalid_username_will_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String actualTitle=driver.findElement(By.xpath("//*[@id=\"signup-form\"]/auto-check[1]/dl/dd[2]")).getText();
		String expectedTitle="Login is already taken";
		Assert.assertEquals(expectedTitle, actualTitle);
		driver.close();
	} 

	@When("^User enters invalid email$")
	public void user_enters_invalid_email() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		/*WebElement username=driver.findElement(By.id("user_login"));
		WebElement email=driver.findElement(By.id("user_email"));
		WebElement password=driver.findElement(By.id("user_password"));
		username.sendKeys("byeehiihello12588");
		email.sendKeys("abc@gmail.com");
		password.sendKeys("byeehiiihello5789456");
		username.submit();*/
		gh.setUsername("hhhhhhcj");
		gh.setEmail("hhjjl");
		gh.setPassword("ashdjk1234");
		gh.clickSignIn();
	}

	@Then("^Invalid email will be displayed$")
	public void invalid_email_will_be_displayed() throws Throwable {
		String actualTitle=driver.findElement(By.xpath("//*[@id=\"signup-form\"]/auto-check[2]/dl/dd[2]")).getText();
				String expectedTitle="Email is invalid or already taken";

				Assert.assertEquals(expectedTitle, actualTitle);
				driver.close();
	    
	}
	

@When("^User enters passowrd less than (\\d+) characters$")
public void user_enters_passowrd_less_than_characters(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	/*WebElement username=driver.findElement(By.id("user_login"));
	WebElement email=driver.findElement(By.id("user_email"));
	WebElement password=driver.findElement(By.id("user_password"));
	username.sendKeys("hiihellobyee1258885");
	email.sendKeys("hellobyeehii789541@gmail.com");
	password.sendKeys("abc12");
	username.submit();*/
    gh.setUsername("jksdfnh");
    gh.setEmail("asdhgj@gmail.com");
    gh.setPassword("dsag");
    gh.clickSignIn();
}

@Then("^invalid password will be displayed$")
public void invalid_password_will_be_displayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	String actualTitle=driver.findElement(By.xpath("//*[@id=\"signup-form\"]/dl/dd[2]")).getText();
	String expectedTitle="Password is too short (minimum is 7 characters) and has been compromised in a third party data breach" ;
	Assert.assertEquals(expectedTitle, actualTitle);
	driver.close();
}
@When("^User enters password without numbers$")
public void user_enters_password_without_numbers() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	/*WebElement username=driver.findElement(By.id("user_login"));
	WebElement email=driver.findElement(By.id("user_email"));
	WebElement password=driver.findElement(By.id("user_password"));
	username.sendKeys("hiihellobyeeabc1258885");
	email.sendKeys("hellohiiabcbyee@gmail.com");
	password.sendKeys("abcxycbj");
	username.submit();*/
    gh.setUsername("jggggggkg");
    gh.setEmail("sdhgjasdk@gmail.com");
    gh.setPassword("sdhgdjkb");
    gh.clickSignIn();
}

@Then("^Invalid password will be dispalyed$")
public void invalid_password_will_be_dispalyed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	String actualTitle=driver.findElement(By.xpath("//*[@id=\"signup-form\"]/dl/dd[2]")).getText();
			String expectedTitle="Password needs at least one number";
			Assert.assertEquals(expectedTitle, actualTitle);
    driver.close();
    
}



	
	}
