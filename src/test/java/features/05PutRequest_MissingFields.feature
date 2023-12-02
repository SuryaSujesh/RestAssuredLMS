 
 @PutRequest_missingFields

Feature: update all data with missing fields and valid ids-  Negative Scenarios

  Background: User sets Authorization
    Given User sets authorization to NO Auth
 
 @ProgPut_missingField
  Scenario: check if user able to update a program with missing field
    Given user creates PUT request with missing data for the LMS API endpoint
    When user calls "updateprogram" with "PutProgram" http request for Put
   # Then User receives 400BadRequest status code with message and boolean success details
    
    @ProgPutname_missingField
	  Scenario: check if user able to update a program with missing field and valid program name
	    Given user creates PUT request with missing data and valid name for the LMS API endpoint
	    When user calls "updateprogramname" with "PutProgramname" http request for Put
	    #Then User receives 400BadRequest status code with message and boolean success details
	    
	    @batchPut_missingField
  Scenario: check if user able to update a batch with missing field
    Given user creates PUT request with missing batch data for the LMS API endpoint
    When user calls "updatebatchbyid" with "Putbatchid" http request for Put
    Then User receives 400BadRequest status code with message and boolean success details
    
     @PutUSer_missingFields
  Scenario: Check if user able to update a user with missing fields
    Given user creates put request for missing fields and valid user the LMS API endpoint
    When user calls "updateuser" with "PutUser" http request for Put
    Then  User receives 400BadRequest status code with message and boolean success details
    
     @update_rolestatus_missing
      Scenario: Check if user able to update a user role status with missing data
    Given user creates put request on user for changing role status with missing data 
    When user calls "updateuserrolestatus" with "PutforUserrolestatus" http request for Put
    Then User receives 400BadRequest status code with message and boolean success details
    
     @assignUSerrole_missingdata
     Scenario: Check if user able to assign user to program batch with missing data
    Given user creates put request on user assign user to program batch with missing data 
    When user calls "updateuserrolestatus" with "PutUserprogbatch" http request for Put
    Then User receives 400BadRequest status code with message and boolean success details
    
      @assignUSer_invalidUserID
    Scenario: Check if user able to assign user to program batch with invalid ID
    Given user creates put request on user to assign user to program batch with InvalidID 
    When user calls "updateuserrolestatus" with "PutUserprogbatch" http request for Put
    Then User receives 400BadRequest status code with message and boolean success details
    
    @PutAssign_missingfield
    Scenario: Check if user able to update a Assignment with missing fields
    Given user creates put request on Assignment with missing field
    When user calls "updateAssign" with "putAssign" http request for Put
    Then User receives 400BadRequest status code with message and boolean success details
    
    @resubmit_missingFields
   Scenario Outline: Check if user able to resubmit with missing fields and request body
    Given user creates put request on missing fields "<testcaseName>" and "<Sheetname>"
    When user calls "updateAssignsubmit" with "putGRADEsubmit" http request for Put
    Then User receives 400BadRequest status code with message and boolean success details
    
     Examples: 
      | testcaseName   | Sheetname         |
      | AssignSubmit_1 | Assignmnet_Submit |
      
       @putgradeAssign_missingfield
     Scenario Outline: Check if user able to update a grades with missing fields 
    Given user creates put request on grades with missing fields "<testcaseName>" and "<Sheetname>"
    When user calls "putgradeAssignment" with "putGRADEsubmit" http request for Put
    Then User receives 400BadRequest status code with message and boolean success details

    Examples: 
      | testcaseName   | Sheetname         |
      | AssignSubmit_1 | Assignmnet_Submit |
      