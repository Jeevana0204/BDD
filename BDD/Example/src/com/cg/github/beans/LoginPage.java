package com.cg.github.beans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	@FindBy(how = How.ID, id = "login_field")
	private WebElement username;
	
	@FindBy(how = How.ID, id = "password")
	private WebElement passowrd;
	
	@FindBy(how=How.NAME,name="commit")
	private WebElement button;
	//@FindBy(how = How.XPATH, xpath = "// div[@class='container']\"")
	
	@FindBy(how=How.XPATH,xpath="//*[@id=\"js-flash-container\"]/div/div")
	private WebElement actualErrorMessageforinvalid;
	
	@FindBy(how=How.XPATH,xpath="//*[@id=\"dashboard\"]/div[1]/div/div[2]/ul/li[1]/div/a/span[1]")
	private WebElement actualErrorMessageforValid;

	public String getActualErrorMessageforinvalid() {
		return actualErrorMessageforinvalid.getText();
	}

	

	public String getActualErrorMessageforValid() {
		return actualErrorMessageforValid.getText();
	}



	public void setActualErrorMessageforValid(WebElement actualErrorMessageforValid) {
		this.actualErrorMessageforValid = actualErrorMessageforValid;
	}



	public String getUsername() {
		return username.getAttribute("value");
	}

	public void setUsername(String username) {
		this.username.sendKeys(username);
	}

	public String getPassowrd() {
		return passowrd.getAttribute("value");
	}

	public void setPassowrd(String passowrd) {
		this.passowrd.sendKeys(passowrd);
	}

	public void clickSignIn() {
		// TODO Auto-generated method stub
		button.submit();
	}

}
