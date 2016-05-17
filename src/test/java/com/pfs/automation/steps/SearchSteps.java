package com.pfs.automation.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.pfs.automation.domain.User;
import com.pfs.automation.pages.HomePage;
import com.pfs.automation.pages.SearchResultPage;
import com.pfs.automation.repositories.UserRepository;
import com.pfs.automation.util.Steps;

@Steps
public class SearchSteps {

	private static final Logger log = LoggerFactory.getLogger(SearchSteps.class.getName());
	
	@Autowired
	private HomePage homePage;

	@Autowired
	private UserRepository userRepository;
	
	private SearchResultPage searchResultPage;

	@Given("user is at homepage")
	public void gotoHomepage() {
		log.info("saving user");
		userRepository.save(new User());
		homePage.getTitle();
	}
	
	@When("user inserts $name")
	public void setQuery(String name) {
		searchResultPage = homePage.search(name);
	}
	
	@Then("result page contains results")
	public void containsResults() {
		Assert.assertNotNull(searchResultPage);
	}
}
