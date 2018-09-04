package com.cg.github.beans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RedBus {
	@FindBy(how=How.ID,id="src")
private WebElement from;
	@FindBy(how=How.ID,id="dest")
private WebElement to;
	@FindBy(how=How.ID,id="onward_cal")
private WebElement onward;
	@FindBy(how=How.ID, id="search_btn")
	private WebElement button;
	@FindBy(how=How.XPATH,xpath="//*[@id=\"search\"]/div/div[1]/div/ul/li[1]")
	private WebElement fromxp;
	@FindBy(how=How.XPATH,xpath="//*[@id=\"search\"]/div/div[2]/div/ul/li[1]")
	private WebElement toxp;
	@FindBy(how=How.XPATH,xpath="//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[7]/td[4]")
	private WebElement onxp;
public String getFrom() {
	return from.getAttribute("value");
}
public void setFrom(String from) {
	this.from.sendKeys(from);
}
public String getTo() {
	return to.getAttribute("value");
}
public void setTo(String to) {
	this.to.sendKeys(to);
}
public String getOnward() {
	return onward.getAttribute("value");
}
public void setOnward(String onward) {
this.onward.sendKeys(onward);
}
public void fromxp()
{
	fromxp.click();
}
public void toxp()
{
	toxp.click();
}
public void onxp()
{
	onxp.click();
}
public void clickSrc()
{
	button.click();
}
}
