package com.pfs.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.pfs.automation.util.Page;
import com.pfs.automation.util.PageObject;

@PageObject
public class SearchResultPage extends Page {

	@FindBy(linkText="Toto (band) - Wikipedia, the free encyclopedia")
	public WebElement result;

	@Override
	public String getUrl() {
		return null;
	}
}
