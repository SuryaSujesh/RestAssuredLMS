
@positiveDelete
Feature: Delete request on All Modules positive scenarios

 Background: User sets Authorization
			Given User sets authorization to NO Auth
			
 @submitdelbyid
  	Scenario: Check if user able to delete a batch with valid batch ID
    Given User creates DELETE Request for the LMS API endpoint
    When User calls "DelSubmitID" with "deletesubmitid" HTTPS Request
    Then User receives 200Ok status with message
 
 
 
  @Assignmentdelbyid
  	Scenario: Check if user able to delete a batch with valid assignment ID
    Given User creates DELETE Request for the LMS API endpoint
    When User calls "DeleteassignID" with "deleteassignid" HTTPS Request
    Then User receives 200Ok status with message
    
    @userdelbyid
  Scenario: Check if user able to delete a batch with valid user ID
    Given User creates DELETE Request for the LMS API endpoint
    When User calls "DeleteUserID" with "deleteuserid" HTTPS Request
    Then User receives 200Ok status with message
    
    
  @batchdelbyid
  Scenario: Check if user able to delete a batch with valid batch ID
    Given User creates DELETE Request for the LMS API endpoint
    When User calls "DeleteBatchID" with "deletebatchid" HTTPS Request
    Then User receives 200Ok status with message

  @progdelbyid
  Scenario: Check if user able to delete a program with valid program ID
    Given User creates DELETE Request for the LMS API endpoint
    When User calls "DeleteProgramID" with "deleteprogramid" HTTPS Request
    Then User receives 200Ok status with message

  
    
	 @programpost
  Scenario Outline: check if user able to create a program with valid endpoint and request body
    Given user creates POST request for the LMS API endpoint from  "<testcaseName>" and "<Sheetname>"
    When user call "AddProgram" with "post" http request
    Then API call is success with status code201
    Then verify the programId in json Response body

    Examples: 
      | testcaseName | Sheetname |
      | Prog_1       | Program   |
   

  @progdelbyname
  Scenario: Check if user able to delete a program with valid program name
    Given User creates DELETE Request for the LMS API endpoint
    When User calls "DeleteProgramName" with "deletename" HTTPS Request
    Then User receives 200Ok status with message
