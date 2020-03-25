package com.stepdefinition;

import com.pages.CreditSlipsPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreditSlipsSteps {
	CreditSlipsPage sreditslippage = new CreditSlipsPage();

	@Given("^the users launches the chromeapplication$")
	public void the_users_launches_the_chromeapplication() throws Throwable {
		sreditslippage.url();
	}

	@When("^the users opens the Your logo main Page$")
	public void the_users_opens_the_your_logo_main_page() throws Throwable {
		sreditslippage.LoginPage();
	}

	@Then("^the user login to webapplication using usrname and passwrd$")
	public void the_user_login_to_webapplication_using_usrname_and_passwrd() throws Throwable {
		sreditslippage.LoginDeatils();
	}

	@Then("^click on the login btton user nagivate to the next page$")
	public void click_on_the_login_btton_user_nagivate_to_the_next_page() throws Throwable {
		sreditslippage.submit();
	}

	@Then("^go to credit slips options from footer$")
	public void go_to_credit_slips_options_from_footer() throws Throwable {
		sreditslippage.creditSlips();
	}

	@Then("^get the info displayed$")
	public void get_the_info_displayed() throws Throwable {
		sreditslippage.infoDisplayed();
	}
}