package stepDefinitions;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	@Given("^user is on NetBanking landing page$")
	public void user_is_on_NetBanking_landing_page() {
//		code must be here
		System.out.println("Navigated to url");
		
	}
	@When("^user login in to application with user and password$")
	public void user_is_in_to_application_with_user_and_password() {
//		code must be here
		System.out.println("Login succesfully");
		
	}
	@Then("^Home page is poplute$")
	public void Home_page_is_poplute() {
//		code here
		System.out.println("Validate home page");
		
	}
	@When("user login in to application with {string} and password {string}")
	public void user_login_in_to_application_with_and_password(String string, String string2) {
	    System.out.println(string);
	    System.out.println(string2);
	   
	}
	@Then("cards are displayed {string}")
	public void cards_are_displayed(String string) {
	    System.out.println(string);
	}

	
	@And("^cards are displayed$")
	public void cards_are_displayed() {
//		code must be here
		System.out.println("validat cards");
	}
	
	@When ("^user sign up with the following details$")
	public void user_sign_up_with_the_following_details(DataTable data){
		List<List<String>>obj=data.asLists();
		System.out.println(obj.get(0).get(0));
		System.out.println(obj.get(0).get(1));
		System.out.println(obj.get(0).get(2));
		System.out.println(obj.get(0).get(3));
		
	}

}
