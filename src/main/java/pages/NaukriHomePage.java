package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BasePage;

public class NaukriHomePage extends BasePage{

	By loginButtonLocator = By.id("login_Layer");
	
	
	
	//Functions start here 
	public WebElement getLoginButton() {
		return BasePage.driver.findElement(loginButtonLocator);
	}
	
}