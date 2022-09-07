package steps;


import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project.BackgroundPage;
import project.BasePage;

public class ChangeColorStepDefenition extends BasePage{

	BackgroundPage backgroundPage;
	
	@Before
	public void init() {
	
		initDriver();
		backgroundPage=PageFactory.initElements(driver, BackgroundPage.class);
	}
	
	@Given("user is on techfios project page")
	public void user_is_on_techfios_project_page() {
		driver.get("http://techfios.com/test/101/");

	}
	@Given("{string} button exists")
	public void button_exists(String string) {
		backgroundPage.verifySkyBlueButtonExists();
	}
	@When("user clicks on the button")
	public void user_clicks_on_the_button() {
		backgroundPage.clickOnBlueButton();
	}
	@Then("the background color will change to sky blue")
	public void the_background_color_will_change_to_sky_blue() {
		backgroundPage.verifyBlueBackgroundColor();
		tearDown();
	}
	@When("{string} button found")
	public void button_found(String string) {
		backgroundPage.verifyWhiteColorButtonExists();
	}
	@When("user clicks on that button")
	public void user_clicks_on_that_button() {
		backgroundPage.clisckOnWhiteButton();
	}
	@Then("background color changes to white")
	public void background_color_changes_to_white() {
		backgroundPage.verifyWhiteBackgroundColor();
	}

	
	
	
	
}
