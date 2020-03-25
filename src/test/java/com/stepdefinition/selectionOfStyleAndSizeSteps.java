package com.stepdefinition;

import com.pages.selectionOfColourAndSize;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class selectionOfStyleAndSizeSteps {
	selectionOfColourAndSize selectionofsizeandstyle = new selectionOfColourAndSize();

	@Given("^the user launches the chromeapplication$")
	public void the_user_launches_the_chromeapplication() throws Throwable {
		selectionofsizeandstyle.url();
	}

	@When("^the users opens the Your logo Home Page$")
	public void the_users_opens_the_your_logo_home_page() throws Throwable {
		selectionofsizeandstyle.LoginPage();
	}

	@Then("^the user login to webapplication using uname and paswrd$")
	public void the_user_login_to_webapplication_using_uname_and_paswrd() throws Throwable {
		selectionofsizeandstyle.LoginDeatils();
	}

	@Then("^click on the login buttn user nagivate to the next page$")
	public void click_on_the_login_buttn_user_nagivate_to_the_next_page() throws Throwable {
		selectionofsizeandstyle.submit();
	}

	@Then("^click on the dresses button user navigate to next page$")
	public void click_on_the_dresses_button_user_navigate_to_next_page() throws Throwable {
		selectionofsizeandstyle.dressesFashion();
	}

	@Then("^select s size from the given options$")
	public void select_s_size_from_the_given_options() throws Throwable {
		selectionofsizeandstyle.s_Size();
	}

	@Then("^select girly style from the given options$")
	public void select_blue_colour_from_the_given_options() throws Throwable {
		selectionofsizeandstyle.girlyStyle();
	}
}