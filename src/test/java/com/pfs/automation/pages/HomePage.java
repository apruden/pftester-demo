package com.pfs.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;

import com.pfs.automation.util.Page;
import com.pfs.automation.util.PageObject;

@PageObject
public class HomePage extends Page {

	@FindBy(how = How.NAME, using = "q")
	private WebElement search;

	@Autowired
	private SearchResultPage searchResultPage;

	public SearchResultPage search(String query) {
		search.sendKeys(String.format("%s\n", query));
		search.submit();

		(new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("resultStats")));

		return searchResultPage;
	}

	@Override
	public String getUrl() {
		return "http://www.google.com";
	}
}
