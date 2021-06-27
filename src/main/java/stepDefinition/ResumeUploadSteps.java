package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NaukriHomePage;
import common.BasePage;
import common.Utilities;

public class ResumeUploadSteps {

	@Given("The user has provided a valid set of Credentials")
	public void the_user_has_provided_a_valid_set_of_credentials() throws Exception {
	    try {
			String credentials = Utilities.getProperty("credentials");
			String decoded = Utilities.decode(credentials);
			String[] creds = decoded.split(":");
			System.setProperty("username", creds[0]);
			System.setProperty("password", creds[1]);
			//Uncomment below line to check decoded credentials in console 
			System.out.println(creds[0] + " --- " + creds[1]);
		}
	    catch (Exception e) {
			throw new Exception ("Invalid Credentials");
		}
	}

	@When("The code is able to open the Naukri website")
	public void the_code_is_able_to_open_the_naukri_website() throws Exception {
	    BasePage.goTo(Utilities.getProperty("URL"));
	}

	@When("The code is able to login with the credentials")
	public void the_code_is_able_to_login_with_the_credentials() {
	    NaukriHomePage homePage = new NaukriHomePage();
	    homePage.getLoginButton().click();
	}

	@Then("The latest resume is updated to the Naurki Portal")
	public void the_latest_resume_is_updated_to_the_naurki_portal() {
	    System.out.println("trying to upload the resume");
	}

}
