
@AllPost
Feature: post request of all modules

Background: User sets Authorization
			Given User sets authorization to NO Auth
  
  @programpost
  Scenario Outline: check if user able to create a program with valid endpoint and request body
    Given user creates POST request for the LMS API endpoint from  "<testcaseName>" and "<Sheetname>"
    When user call "AddProgram" with "post" http request
    Then API call is success with status code201
    Then verify the programId in json Response body
    
   Examples: 
|testcaseName|Sheetname|
| Prog_1  |   Program |
#| Prog_2  |   Program|

@batchpost
  Scenario Outline: check if user able to create a batch with valid endpoint and request body
    Given user creates Batch POST request for the LMS API endpoint from  "<testcaseName>" and "<Sheetname>"
    When user call "AddBatch" with "post" http request
    Then API call for batch is success with status code201
    Then verify the batchId in json Response body
    
   Examples: 
|testcaseName|Sheetname|
| ProgBatch_1  |   Batch |
#| ProgBatch_2  |   Batch|

@Userpost
  Scenario Outline: check if user able to create a new user with valid endpoint and request body
    Given user creates User POST request for the LMS API endpoint from  "<testcaseName>" and "<Sheetname>"
    When user call "AddUsers" with "post" http request
    Then API call for User module is success with status code201
    Then verify the userID in json Response body
    
   Examples: 
|testcaseName|Sheetname|
| User_1  |   User |
#| User_3  |   User|
#| User_2  |   User|

@AssignmentPost
 Scenario Outline: check if user able to add a record with valid endpoint and request body
    Given user creates Assignment POST request for the LMS API endpoint from  "<testcaseName>" and "<Sheetname>"
    When user call "AddAssignment" with "post" http request
    Then User receives status code201 as success 
    Then store the AssignID from json Response body
    
   Examples: 
|testcaseName|Sheetname|
| Assign_1 |   Assignment |
#| Assign_2  |   Assignment|

@SubmitAssignPost
 Scenario Outline: check if user able to submit an assignment with valid endpoint and request body
    Given user creates Submit Assign POST request for the LMS API endpoint from  "<testcaseName>" and "<Sheetname>"
    When user call "SubmitAssgn" with "post" http request
    Then User receives success code with response body
    Then store the SubmissionID from json Response body
    
   Examples: 
|testcaseName|Sheetname|
| AssignSubmit_1 |   Assignmnet_Submit |
#| AssignSubmit_2  |   Assignmnet_Submit|


