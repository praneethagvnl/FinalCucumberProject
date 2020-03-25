package com.stepdefinition;

import com.pages.clearEmailPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class clearEmailSteps {
	clearEmailPage clearemailpage = new clearEmailPage();

	@Given("^launch chrome application$")
	public void launch_chrome_application() throws Throwable {
		clearemailpage.url();
	}

	@When("^open home page of given webapplication$")
	public void open_home_page_of_given_webapplication() throws Throwable {
		clearemailpage.LoginPage();
	}

	@Then("^login to webapplication using username and password$")
	public void login_to_webapplication_using_username_and_password() throws Throwable {
		clearemailpage.LoginDeatils();
	}

	@Then("^click on login button and the page navigates to next page$")
	public void click_on_login_button_and_the_page_navigates_to_next_page() throws Throwable {
		clearemailpage.submit();
	}

	@Then("^go to my personal information option in the footer$")
	public void go_to_my_personal_information_option_in_the_footer() throws Throwable {
		clearemailpage.mypersonalinfo();
	}

	@Then("^clear the  email data displayed to the given$")
	public void assertion_of_email_data_displayed_to_the_given() throws Throwable {
		clearemailpage.clearEmail();
	}

}