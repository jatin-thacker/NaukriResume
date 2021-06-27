#Author: jatin.thacker@hotmail.com

Feature: Update Naukri profile every morning 

	Scenario: Check the numbers of experience is updated 
    Given The user has the resume in the necessary directory
    And The user has provided his original joining date 
    When The code calculates the number of experience 
    And The resume is reviewed
    Then The resume is updated and converted to PDF 
    And The files are closed 
    And The PDF resume is saved
  
  Scenario: Check the numbers of experience is updated 
  	Given The user has the resume in the necessary directory
    And The user has provided a valid set of Credentials 
    When The code is able to open the Naukri website 
    And The code is able to login with the credentials
    Then The latest resume is updated to the Naurki Portal 