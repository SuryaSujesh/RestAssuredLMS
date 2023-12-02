@Delete_Negative
Feature: Delete Request for all modules with Invalid Data

  Background: User sets Authorization
    Given User sets authorization to NO Auth

  @DelSubmission_InvalidID
  Scenario: Check if user able to delete a batch with valid batch ID
    Given User creates DELETE Request with invalid inputs for the LMS API endpoint
    When User calls "DelSubmitID" with "deletesubmitid" HTTPS Request for delete
    Then User receives 404NotFound status with message

  @DelAssign_InvalidID
  Scenario: Check if user able to delete a batch with Invalid assignment ID
    Given User creates DELETE Request with invalid inputs for the LMS API endpoint
    When User calls "DeleteassignID" with "deleteassignid" HTTPS Request for delete
    Then User receives 404NotFound status with message

  @DelUSer_Invalidid
  Scenario: Check if user able to delete a batch with Invalid user ID
    Given User creates DELETE Request with invalid inputs for the LMS API endpoint
    When User calls "DeleteUserID" with "deleteuserid" HTTPS Request for delete
    Then User receives 404NotFound status with message

  @Delbatch_InvalidID
  Scenario: Check if user able to delete a batch with Invalid batch ID
    Given User creates DELETE Request with invalid inputs for the LMS API endpoint
    When User calls "DeleteBatchID" with "deletebatchid" HTTPS Request for delete
    Then User receives 404NotFound status with message

  @Delprog_Invalidname
  Scenario: Check if user able to delete a program with invalid program name
    Given User creates DELETE Request with invalid inputs for the LMS API endpoint
    When User calls "DeleteProgramName" with "deletename" HTTPS Request for delete
    Then User receives 404NotFound status with message

  @Delprog_invalidid
  Scenario: Check if user able to delete a program with invalid program ID
    Given User creates DELETE Request with invalid inputs for the LMS API endpoint
    When User calls "DeleteProgramID" with "deleteprogramid" HTTPS Request for delete
    Then User receives 404NotFound status with message
