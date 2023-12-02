@AllGet_Requests
Feature: Positive Scenarios of All modules Get requests

  Background: User sets Authorization
    Given User sets authorization to NO Auth

@GetAllProg

Scenario: Check if user able to retrieve a all programs
    Given User creates GET Request for the LMS API endpoint
    When User calls "GetallProgs" with "getAll" HTTPS Request for get
    Then User receives  status code200 ok with message


@prog_GetByID
Scenario: Check if user able to retrieve a program by ID
    Given User creates GET Request for the LMS API endpoint
    When User calls "GetByProgID" with "getProgID" HTTPS Request for get
    Then User receives  status code200 ok with message

@GetAllBatches
Scenario: Check if user able to retrieve a all batches
    Given User creates GET Request for the LMS API endpoint
    When User calls "GetAllBatches" with "getAll" HTTPS Request for get
    Then User receives  status code200 ok with message
    
    @batch_GetByID
Scenario: Check if user able to retrieve a batch by ID
    Given User creates GET Request for the LMS API endpoint
    When User calls "GetBAtchID" with "getByBatchID" HTTPS Request for get
    Then User receives  status code200 ok with message
    

  @User_ByID
  Scenario: Check if user able to retrieve a user with valid User ID
    Given User creates GET Request for the LMS API endpoint
    When User calls "GetUserId" with "GetByUSerID" HTTPS Request for get
    Then User receives  status code200 ok with message

  @UserRoles
  Scenario: Check if user able to retrieve a user roles LMS API
    Given User creates GET Request for the LMS API endpoint
    When User calls "GetRoles" with "getRoles" HTTPS Request for get
    Then User receives  status code200 ok with message

  @AllStaff
  Scenario: Check if user able to retrieve all staff with valid LMS API
    Given User creates GET Request for the LMS API endpoint
    When User calls "GetAllStaff" with "allStaff" HTTPS Request for get
    Then User receives  status code200 ok with message

  @Assign_getAll
  Scenario: Check if user able to retrieve a record with LMS API
    Given User creates GET Request for the LMS API endpoint
    When User calls "GetAllAssign" with "getAll" HTTPS Request for get
    Then User receives  status code200 ok with message

  @Assign_BYID
  Scenario: Check if user able to retrieve a record By Assignment ID with LMS API
    Given User creates GET Request for the LMS API endpoint
    When User calls "GetAssignID" with "GetAssignID" HTTPS Request for get
    Then User receives  status code200 ok with message

  @Assign_ByBatchID
  Scenario: Check if user able to retrieve a record  By BatchID with LMS API
    Given User creates GET Request for the LMS API endpoint
    When User calls "GetAssignByBAtch" with "getByBatchID" HTTPS Request for get
    Then User receives  status code200 ok with message

  @Submit-GetAll
  Scenario: Check if user able to retrieve all submissions with LMS API
    Given User creates GET Request for the LMS API endpoint
    When User calls "GetAllSubmissions" with "getAll" HTTPS Request for get
    Then User receives  status code200 ok with message

  @Submit-GetByAssId
  Scenario: Check if user able to retrieve submissions by AssignmentID with LMS API
    Given User creates GET Request for the LMS API endpoint
    When User calls "GetSubByAssign" with "GetAssignID" HTTPS Request for get

  @Submit-GetByStudentID
  Scenario: Check if user able to retrieve grades by studentID with LMS API
    Given User creates GET Request for the LMS API endpoint
    When User calls "GetgradByStudentID" with "GetstudentID" HTTPS Request for get

  @Submit-GetgradByBatchID
  Scenario: Check if user able to retrieve grades by batchID with LMS API
    Given User creates GET Request for the LMS API endpoint
    When User calls "GetgradByBatchID" with "getByBatchID" HTTPS Request for get
    Then User receives  status code200 ok with message

  @Submit-GetByuserId
  Scenario: Check if user able to retrieve submissions by userID with LMS API
    Given User creates GET Request for the LMS API endpoint
    When User calls "GetSubsByUserId" with "GetByUSerID" HTTPS Request for get
    Then User receives  status code200 ok with message

  @Submit-GetByBatchId
  Scenario: Check if user able to retrieve submissions by userID with LMS API
    Given User creates GET Request for the LMS API endpoint
    When User calls "GetSubBYBAtchID" with "getByBatchID" HTTPS Request for get
    Then User receives  status code200 ok with message
