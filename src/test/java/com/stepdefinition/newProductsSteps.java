package com.stepdefinition;

import com.pages.newProductPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class newProductsSteps {
	newProductPage newproductpage = new newProductPage();

	@Given("^to launch chrome application$")
	public void to_launch_chrome_application() throws Throwable {
		newproductpage.url();
	}

	@When("^open home page of the given webapplication in opened browser$")
	public void open_home_page_of_the_given_webapplication() throws Throwable {
		newproductpage.LoginPage();
	}

	@Then("^login to web application using username and password$")
	public void login_to_web_application_using_username_and_password() throws Throwable {
		newproductpage.LoginDeatils();
	}

	@Then("^click on login button and the page navigate to next page$")
	public void click_on_login_button_and_the_page_navigate_to_next_page() throws Throwable {
		newproductpage.submit();
	}

	@Then("^select new products options from footer$")
	public void select_new_products_options_from_footer() throws Throwable {
		newproductpage.newProduct();
	}
}