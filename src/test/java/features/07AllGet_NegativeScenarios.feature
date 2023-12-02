@AllGet_Negative
Feature: Positive Scenarios of All modules Get requests

  Background: User sets Authorization
    Given User sets authorization to NO Auth

 @Getprog_InvalidID
Scenario: Check if user able to retrieve a program by InvalidID
    Given User creates GET Request for invalid inputs the LMS API endpoint
    When User calls "GetByProgID" with "getProgID" HTTPS Request for Negative get request
    Then User receives NotFound404 message
 
 
  @batch_GetByID
Scenario: Check if user able to retrieve a batch by Invalid ID
    Given User creates GET Request for invalid inputs the LMS API endpoint
    When User calls "GetBAtchID" with "getByBatchID" HTTPS Request for Negative get request
    Then User receives NotFound404 message
 
  
 @GetUser_InvalidID
Scenario: Check if user able to retrieve a user with Invalid User ID
Given User creates GET Request for invalid inputs the LMS API endpoint
When User calls "GetUserIdInvalid" with "GetByUSerID" HTTPS Request for Negative get request
Then User receives NotFound404 message
 
  @GetAssign_BYID
  Scenario: Check if user able to retrieve a record By invalid Assignment ID with LMS API
    Given User creates GET Request for invalid inputs the LMS API endpoint
    When User calls "GetAssignID" with "GetAssignID" HTTPS Request for Negative get request
    Then User receives NotFound404 message

  @GetAssign_ByBatchID
  Scenario: Check if user able to retrieve a record  By invalid BatchID with LMS API
    Given User creates GET Request for invalid inputs the LMS API endpoint
    When User calls "GetAssignByBAtch" with "getByBatchID" HTTPS Request for Negative get request
    Then User receives NotFound404 message

  @GetSubmit-ByAssId
  Scenario: Check if user able to retrieve submissions by invalid AssignmentID with LMS API
    Given User creates GET Request for invalid inputs the LMS API endpoint
    When User calls "GetSubByAssign" with "GetAssignID" HTTPS Request for Negative get request
    Then User receives NotFound404 message

  @Getgrades-ByStudentID
  Scenario: Check if user able to retrieve grades by invalid studentID with LMS API
    Given User creates GET Request for invalid inputs the LMS API endpoint
    When User calls "GetgradByStudentID" with "GetstudentID" HTTPS Request for Negative get request
    Then User receives NotFound404 message

  @Getgrades-ByBatchID
  Scenario: Check if user able to retrieve grades by invalid batchID with LMS API
    Given User creates GET Request for invalid inputs the LMS API endpoint
    When User calls "GetgradByBatchID" with "getByBatchID" HTTPS Request for Negative get request
    Then User receives NotFound404 message

  @GetSubmit-ByuserId
  Scenario: Check if user able to retrieve submissions by invalid userID with LMS API
    Given User creates GET Request for invalid inputs the LMS API endpoint
    When User calls "GetSubsByUserId" with "GetByUSerID" HTTPS Request for Negative get request
    Then User receives NotFound404 message

  @GetSubmit-ByBatchId
  Scenario: Check if user able to retrieve submissions by invalid batchID with LMS API
    Given User creates GET Request for invalid inputs the LMS API endpoint
    When User calls "GetSubBYBAtchID" with "getInvalidBatchID" HTTPS Request for Negative get request
    Then User receives NotFound404 message
