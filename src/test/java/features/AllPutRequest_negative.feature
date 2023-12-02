@PutRequest_Negative

Feature: Put  Negative Scenarios

  Background: User sets Authorization
    Given User sets authorization to NO Auth

  @ProgPut_invalidID
  Scenario Outline: check if user able to update a program with invalid ID
    Given user creates PUT request with Invalid ID for the LMS API endpoint from  "<testcaseName>" and "<Sheetname>"
    When user call "updateprogram" with "PutProgram" http request for Put
    Then User receives 404NotFound status code with message and boolean success details

    Examples: 
      | testcaseName | Sheetname |
      | Progput_10   | Response_Program |
      
     
    
    @ProgPut_InvalidProgname
     Scenario Outline: check if user able to update a program with invalid program name
    Given user creates PUT request with Invalid name for the LMS API endpoint
    When user call "updateprogramname" with "PutProgramname" http request for Put
    Then User receives 404NotFound status code with message and boolean success details
    
     
    
    
    @batchPut_invalidID
  Scenario Outline: check if user able to update a batch with invalid ID
    Given user creates PUT request with Invalid batchID for the LMS API endpoint from  "<testcaseName>" and "<Sheetname>"
    When user call "updatebatchbyid" with "Putbatchid" http request for Put
    Then User receives 404NotFound status code with message and boolean success details

      Examples: 
|testcaseName|Sheetname|
| batchupdate10 | Response_Batch |
      
      
    
    @PUTuser_INVALIDid
  Scenario Outline: Check if user able to update a user with INvalid User Id and request body
    Given user creates put request for invalid user the LMS API endpoint from  "<testcaseName>" and "<Sheetname>"
    When user call "updateuser" with "PutUser" http request for Put
    Then  User receives 404NotFound status code with message and boolean success details

    Examples: 
      | testcaseName | Sheetname     |
      | Userupdate10 | Response_User |
      
    
     
      
      
      @update_rolestatus_invalidID
      Scenario Outline: Check if user able to update a user role status with Invalid User Id 
    Given user creates put request on user for changing role status with invalid data "<testcaseName>" and "<Sheetname>"
    When user call "updateuserrolestatus" with "PutforUserrolestatus" http request for Put
    Then User receives 404NotFound status code with message and boolean success details

    Examples: 
      | testcaseName | Sheetname     |
      | Userupdate10  | Response_User |
      
    
      @putAssign_invalidID
 
  Scenario Outline: Check if user able to update a Assignment with invalid AssignmentId and request body
    Given user creates put request on Assignment with Invalid Id  "<testcaseName>" and "<Sheetname>"
    When user call "updateAssign" with "putAssign" http request for Put
    Then User receives 404NotFound status code with message and boolean success details

    Examples: 
      | testcaseName | Sheetname     |
      | assignupdate10 | Response_Assign |
    
  @putResubmit_invalidID
     Scenario Outline: Check if user able to update a submission with invalid submission Id and request body
    Given user creates put request on Invalid submitid "<testcaseName>" and "<Sheetname>"
    When user call "updateAssignsubmit" with "putAssignsubmit" http request for Put
    Then User receives 404NotFound status code with message and boolean success details

    Examples: 
      | testcaseName   | Sheetname         |
      | AssignSubmit_1 | Assignmnet_Submit |
      
      
    @putgradeAssignSubmit_invalidID
     Scenario Outline: Check if user able to update a grades with invalid submission Id and request body
    Given user creates put request on grades Invalid submitid "<testcaseName>" and "<Sheetname>"
    When user call "putgradeAssignment" with "putAssignsubmit" http request for Put
    Then User receives 404NotFound status code with message and boolean success details

    Examples: 
      | testcaseName   | Sheetname         |
      | AssignSubmit_1 | Assignmnet_Submit |
      
   
    
    
    
    