package com.cg.github.beans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GitHub {
	@FindBy(how=How.ID,id="user_login")
private WebElement username;
	@FindBy(how=How.ID,id="user_password")
private WebElement password;
	@FindBy(how=How.ID,id="user_email")
private WebElement email;
public String getUsername() {
		return username.getAttribute("value");
	}
	public void setUsername(String username) {
		this.username.sendKeys(username);
	}
	public String getPassword() {
		return password.getAttribute("value");
	}
	public void setPassword(String password) {
		this.password.sendKeys(password);
	}
	public String getEmail() {
		return email.getAttribute("value");
	}
	public void setEmail(String email) {
		this.email.sendKeys(email);
	}
	@FindBy(how=How.ID,id="signup_button")
private WebElement button;
public void clickSignIn()
{
	button.submit();
}
}
