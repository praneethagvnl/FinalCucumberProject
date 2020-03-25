package com.stepdefinition;

import com.pages.searchStorePage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class searchStoreSteps {
	searchStorePage searchstorepage = new searchStorePage();

	@Given("^launch the chrome application$")
	public void launch_the_chrome_application() throws Throwable {
		searchstorepage.url();
	}

	@When("^open the home page of given webapplication$")
	public void open_the_home_page_of_given_webapplication() throws Throwable {
		searchstorepage.LoginPage();
	}

	@Then("^login to the webapplication using username and password$")
	public void login_to_the_webapplication_using_username_and_password() throws Throwable {
		searchstorepage.LoginDeatils();
	}

	@Then("^click on the login button and the page navigates to next page$")
	public void click_on_the_login_button_and_the_page_navigates_to_next_page() throws Throwable {
		searchstorepage.submit();
	}

	@Then("^go to my stores option in the footer$")
	public void go_to_my_stores_option_in_the_footer() throws Throwable {
		searchstorepage.myStores();
	}

	@Then("^give pincode of the area to be searched$")
	public void give_pincode_of_the_area_to_be_searched() throws Throwable {
		searchstorepage.pinCode();
	}

	@Then("^change radius to 25$")
	public void change_radius_to_25() throws Throwable {
		searchstorepage.radius();
	}

	@Then("^click on search button$")
	public void click_on_search_button() throws Throwable {
		searchstorepage.search();
	}
}