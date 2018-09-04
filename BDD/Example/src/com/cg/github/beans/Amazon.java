 package com.cg.github.beans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Amazon {
	@FindBy(how = How.ID, id = "twotabsearchtextbox")
private WebElement search;
	
	@FindBy(how=How.CLASS_NAME, className="nav-input")
	private WebElement button;
	
	public String getSearch() {
		return search.getAttribute("value");
	}

	public void setSearch(String search) {
		this.search.sendKeys(search);
	}

	
	public void submit() {
		// TODO Auto-generated method stub
		button.submit();
	}

}
