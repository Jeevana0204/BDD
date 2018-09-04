package com.cg.github.beans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Google {
	@FindBy(how=How.ID,id="lst-ib")
	private WebElement search;
	@FindBy(how=How.XPATH,xpath="//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]")
	private WebElement button;
	public String getSearch() {
		return search.getAttribute("value");
	}
	public void setSearch(String search) {
		this.search.sendKeys(search);
	}
	public void submit()
	{
		button.click();

	}
}
