package cUcpr;

import org.testng.annotations.Test;

import cucumber.api.java.en.*;

public class Search {

		@Test(priority=1)
		@Given("^I visit the website as a guest user$")
		public void I_visit_the_website_as_a_guest_user()throws Throwable {
			
			System.out.println(">> Given - I visit the website as a guest user");
			
		}
		@Test(priority=2)
		@When("^I select the books option from the dropdown$")
		public void I_select_the_books_option_from_the_dropdown()throws Throwable  {
			
			System.out.println(">>When - I select the books option from the dropdown");
			
		}
		@Test(priority=3)
		@And("^I click on Search icon$")
		public void I_click_on_Search_icon()throws Throwable  {
			
			System.out.println(">>And - I click on Search icon");
			
		}
		@Test(priority=4)
		@Then("^I should see the books page loaded$")
		public void I_should_see_the_books_page_loaded()throws Throwable  {
			
			System.out.println(">>Then - I should see the books page loaded");
			
		}
		@Test(priority=5)
		@And("^I should see Books at Amazon as heading$")
		public void I_should_see_Books_at_Amazon_as_heading()throws Throwable {
			
			System.out.println(">>And - I should see Books at Amazon as heading");
			
		}
		@Test(priority=6)
		@But("^I should not see other category products$")
		public void I_should_not_see_other_category_products()throws Throwable {
			
			System.out.println(">>But - I should not see other category products");
			
		}
		@Test(priority=7)
		@When("^I select the Baby option from the dropdown$")
		public void I_select_the_Baby_option_from_the_dropdown()throws Throwable {
			
			System.out.println(">>When - I select the Baby option from the dropdown");
			
		}
		@Test(priority=8)
		@Then("^I should see the Baby page loaded$")
		public void I_should_see_the_Baby_page_loaded()throws Throwable {
			
			System.out.println(">>Then - I should see the Baby page loaded");
			
		}
		@Test(priority=9)
		@And("^I should see The baby store as heading$")
		public void I_should_see_The_baby_store_as_heading()throws Throwable {
			
			System.out.println(">>And - I should see The baby store as heading");
			
		}

	}


	

