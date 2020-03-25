package com.stepdefinition;

import com.pages.MultipleLogins;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MultiLoginSteps {

	MultipleLogins multipleLogins=new MultipleLogins();
	
	@Given("^launching the webapplication$")
	public void the_user_launch_the_chrome_application()  {
	   
		multipleLogins.url();
	}
	
	@When("^opens the yourlogo Home page$")
	public void the_user_open_the_Myntra_Home_page() throws InterruptedException {
	   
		multipleLogins.LoginPage();
	}
	

	
	  @Then("^enters the (.+)$")
	    public void the_user_enters_the(String username) throws Throwable {
			System.out.println("username "+username);
			multipleLogins.UserName(username);
	    }
	

	
    @And("^enter the password (.+)$")
    public void the_user_enters_the_pas(String password) throws Throwable {
    	System.out.println("password " +password);
    	multipleLogins.Password(password);
    }

	
	
	
	@Then("^click on the login button it will navigate to the next page$")
	public void click_on_the_login_button_user_nagivate_to_the_next_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		multipleLogins.submit();
	
	}
	
	
	 @Then("^logout from the webapplication$")
	 public void logout_from_the_webapplication() throws InterruptedException  {
		 multipleLogins.Logout();
		 
	 }
	      
}
