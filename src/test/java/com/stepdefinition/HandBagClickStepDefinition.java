package com.stepdefinition;

import java.io.IOException;

import com.pages.HandBagsPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HandBagClickStepDefinition {
	HandBagsPage handbagpage=new HandBagsPage();
	
	
	@Given("^to launching application in chrome$")
	public void the_user_launch_the_chrome_application() throws IOException {
		// Write code here that turns the phrase above into concrete actions
		handbagpage.url();
	}

	@When("^open home page of the given webapplication$")
	public void the_user_open_the_yourlogo_Home_page() {
		// Write code here that turns the phrase above into concrete actions
		handbagpage.LoginPage();
	}

	@Then("^login to the web application using username and password$")
	public void the_user_login_using_username_and_password() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions

		handbagpage.LoginDeatils();

	}

	@Then("^click on home button to navigate to home page$")
	public void click_on_the_login_button_user_nagivate_to_the_next_page() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		handbagpage.submit();

	}

	@Then("^click on trendy handbags image and navigate to next page$")
	public void click_on_the_contact_us_button_and_navigate_to_next_page() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		handbagpage.handbagClick();

	}

}
