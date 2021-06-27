package stepDefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xwpf.usermodel.XWPFDocument;

import common.Utilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ResumeUpdateSteps {

	@Given("The user has the resume in the necessary directory")
	public void the_user_has_the_resume_in_the_necessary_directory() throws Exception {
		
		String filepath = System.getProperty("user.dir") + "/src/test/resources/Resume/" + Utilities.getProperty("resume_file_name");
		try {
			XWPFDocument document = new XWPFDocument(new FileInputStream(new File(filepath)));
		} 
		catch (Exception e) {
			throw new Exception ("File not present at " + filepath);
		}
	}
	
	@Given("The user has provided his original joining date")
	public void the_user_has_provided_his_original_joining_date() {
	    System.out.println("will check career start date in property");
	}
	
	@When("The code calculates the number of experience")
	public void the_code_calculates_the_number_of_experience() {
	    System.out.println("will calculate the number of experience");
	}
	
	@When("The resume is reviewed")
	public void the_resume_is_reviewed() {
	    System.out.println("will review the resume ");
	}
	
	@Then("The resume is updated and converted to PDF")
	public void the_resume_is_updated_and_converted_to_pdf() {
	    System.out.println("will convert the resume to PDf");
	}
	
	@Then("The files are closed")
	public void the_files_are_closed() {
	    System.out.println("will close all the files");
	}
	
	@Then("The PDF resume is saved")
	public void the_pdf_resume_is_saved() {
		System.out.println("will save the resume");
	}

}
