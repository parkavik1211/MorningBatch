package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sample.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {
	
	@Given("To launch the browser and max the window")
	public void to_launch_the_browser_and_max_the_window() {
		browserLaunch();
		maxBrowser();
	    
	}

	@When("To launch the url of the given application")
	public void to_launch_the_url_of_the_given_application() {
		loadUrl("https://www.facebook.com/");
	   
	}

	@When("To pass the invalid username in email field")
	public void to_pass_the_invalid_username_in_email_field() {
		WebElement user = driver.findElement(By.id("email"));
		passTxt(user, "greens123@gmail.com");
	   
	}

	@When("To pass the valid passowrd in password field")
	public void to_pass_the_valid_passowrd_in_password_field() {
		WebElement pass = driver.findElement(By.name("pass"));
		passTxt(pass, "greens123#");
	   
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		WebElement btnLogin = driver.findElement(By.name("pass"));
		btnClick(btnLogin);
	    
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		closeTheBrowser();
	   
	}




}
