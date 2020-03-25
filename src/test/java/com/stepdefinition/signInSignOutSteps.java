package com.stepdefinition;

import com.pages.signInSignOut;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class signInSignOutSteps {
	signInSignOut signinsignout = new signInSignOut();

	@Given("^the users launches the chrome application$")
	public void the_user_launches_the_chrome_application() throws Throwable {
		signinsignout.url();
	}

	@When("^the users opens the Yourlogo Home Page$")
	public void the_user_opens_the_yourlogo_home_page() throws Throwable {
		signinsignout.LoginPage();
	}

	@Then("^the users login using uname and paswrd$")
	public void the_user_login_using_uname_and_paswrd() throws Throwable {
		signinsignout.LoginDeatils();
	}

	@Then("^click on the login butn user nagivate to the next page$")
	public void click_on_the_login_btn_user_nagivate_to_the_next_page() throws Throwable {
		signinsignout.submit();
	}

	@Then("^click on the signout button user navigate to next page$")
	public void click_on_the_signout_button_user_navigate_to_next_page() throws Throwable {
		signinsignout.signOut();
	}
}