package cUcpr;

import cucumber.api.java.en.*;

public class Login {

@Given("^I visit the website of rapid as a admin$")	
public void I_visit_the_website_of_rapid_as_a_admin()throws Throwable
{
	System.out.println("test data");
}

@When("^Click on the login button to redirect on sign in page$")
public void click_on_login_button()throws Throwable
{
	System.out.println("test data");
}

@And("^Enter username and password$")
public void enter_username_and_password()throws Throwable
{
	System.out.println("test data");
}
@Then("^click on signin button$")
public void click_on_sign_button()throws Throwable
{
	System.out.println("test data");
}

@And("^select the store from child store list$")
public void choose_child_store()throws Throwable
{
	System.out.println("test data");
}

@But("^I redirect on the Overview page$")
public void redirect_on_overview_page()throws Throwable
{
	System.out.println("test data");
}

}
