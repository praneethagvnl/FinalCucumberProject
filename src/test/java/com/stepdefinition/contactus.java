package com.stepdefinition;

import java.io.IOException;

import com.pages.contactusPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class contactus {

	contactusPage sign = new contactusPage();

	@Given("^the user launch the chrome application$")
	public void the_user_launch_the_chrome_application() throws IOException {
		// Write code here that turns the phrase above into concrete actions
		sign.url();
	}

	@When("^the user open the Yourlogo Home page$")
	public void the_user_open_the_Myntra_Home_page() {
		// Write code here that turns the phrase above into concrete actions
		sign.LoginPage();
	}

	@Then("^the user login using username and password$")
	public void the_user_login_using_username_and_password() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions

		sign.LoginDeatils();

	}

	@Then("^click on the login button user nagivate to the next page$")
	public void click_on_the_login_button_user_nagivate_to_the_next_page() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		sign.submit();

	}

	@Then("^click on the contact us button and navigate to next page$")
	public void click_on_the_contact_us_button_and_navigate_to_next_page() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		sign.contactus();

	}

}