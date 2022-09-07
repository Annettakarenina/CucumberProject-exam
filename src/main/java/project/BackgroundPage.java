package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BackgroundPage {
	
	WebDriver driver;
	String color;

	public BackgroundPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	@FindBy(how = How.XPATH, using = "//button[text()='Set SkyBlue Background']")
	WebElement SET_BLUE_BACKGROUND_ELEMENT;
	@FindBy(how = How.XPATH, using ="//body[@style='background-color: skyblue;']")
	WebElement BLUE_BACKGROUND_COLOR_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[text()='Set White Background']")
	WebElement SET_WHITE_BACKGROUND_BUTTON_ELEMENT;
	@FindBy(how=How.XPATH, using="//body[@style='background-color: white;']") WebElement WHITE_BACKGROUND_COLOR_ELEMENT;
	
	public void verifySkyBlueButtonExists() {
		if(SET_BLUE_BACKGROUND_ELEMENT.isDisplayed());{
			System.out.println("Set blue background button found");
		}
	}
	public void clickOnBlueButton() {
		SET_BLUE_BACKGROUND_ELEMENT.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void verifyBlueBackgroundColor() {
		color=BLUE_BACKGROUND_COLOR_ELEMENT.getAttribute("style");
		if(color.equalsIgnoreCase("background-color: skyblue;")) {
			System.out.println("The background color is sky blue now");
		}
	}
	public void verifyWhiteColorButtonExists() {
		if(SET_WHITE_BACKGROUND_BUTTON_ELEMENT.isDisplayed()) {
		System.out.println("Set white background button found");
		}
	}
	public void clisckOnWhiteButton() {
		SET_WHITE_BACKGROUND_BUTTON_ELEMENT.click();
	}
	public void verifyWhiteBackgroundColor() {
		color=WHITE_BACKGROUND_COLOR_ELEMENT.getAttribute("style");
		if(color.equalsIgnoreCase("background-color: white;")) {
			System.out.println("The background color is white now");
		}
	}	
}
