package com.stepdefinition;

import com.pages.viewListOrGrid;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class viewListOrGridSteps {
	viewListOrGrid viewlistorgrid = new viewListOrGrid();

	@Given("^the user launches the chrome application$")
	public void the_user_launches_the_chrome_application() throws Throwable {
		viewlistorgrid.url();
	}

	@When("^the user opens the Yourlogo Home Page$")
	public void the_user_opens_the_yourlogo_home_page() throws Throwable {
		viewlistorgrid.LoginPage();
	}

	@Then("^the user login using uname and paswrd$")
	public void the_user_login_using_uname_and_paswrd() throws Throwable {
		viewlistorgrid.LoginDeatils();
	}

	@Then("^click on the login btn user nagivate to the next page$")
	public void click_on_the_login_btn_user_nagivate_to_then_next_page() throws Throwable {
		viewlistorgrid.submit();
	}

	@Then("^click on the women button user navigate to next page$")
	public void click_on_the_women_button_user_navigate_to_next_page() throws Throwable {
		viewlistorgrid.womenFashion();
	}

	@Then("^select highest price sort by option$")
	public void select_highest_price_sort_by_option() throws Throwable {
		viewlistorgrid.sortbyhighestprice();
	}

	@Then("^select the list view option$")
	public void select_the_list_view_option() throws Throwable {
		viewlistorgrid.listview();
	}

}