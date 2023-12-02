@update
Feature: Title of your feature
  I want to use this template for my feature file

  @UpdateAssignmentSubmit
  Scenario Outline: Check if user able to update a user with valid submission Id and request body
    Given user creates put request on Assignmentsubmit "<testcaseName>" and "<Sheetname>"
    When user call "updateAssignsubmit" with "putAssignsubmit" http request to update
    Then Request should be successful with status code200

    Examples: 
      | testcaseName   | Sheetname         |
      | AssignSubmit_1 | Assignmnet_Submit |
      
      
       @UpdateGradeAssignmentSubmit
  Scenario Outline: Check if user able to update a grade assignment with valid submission Id and request body
    Given user creates put request on Grade Assignmentsubmit "<testcaseName>" and "<Sheetname>"
    When user call "putgradeAssignment" with "putAssignsubmit" http request to update
    Then Request should be successful with status code200

    Examples: 
      | testcaseName   | Sheetname         |
      | AssignSubmit_1 | Assignmnet_Submit |
      
      

  @UpdateAssignment
  Scenario Outline: Check if user able to update a records with valid Assignment Id and request body
    Given user creates put request on Assignment  "<testcaseName>" and "<Sheetname>"
    When user call "updateAssign" with "putAssign" http request to update
    Then Request should be successful with status code200

    Examples: 
      | testcaseName   | Sheetname       |
      | assignupdate10 | Response_Assign |

  @updatebyuserid
  Scenario Outline: Check if user able to update a user with valid User Id and request body
    Given user creates put request for the LMS API endpoint from  "<testcaseName>" and "<Sheetname>"
    When user call "updateuser" with "PutUser" http request to update
    Then Request should be successful with status code200

    Examples: 
      | testcaseName | Sheetname     |
      | Userupdate10 | Response_User |

  @updatebybatchid
  Scenario Outline: Check if user able to update a batch with valid batch Id and request body
    Given user creates put request on bath for the LMS API endpoint from bath id "<testcaseName>" and "<Sheetname>"
    When user call "updatebatchbyid" with "Putbatchid" http request to update
    Then Request should be successful with status code200

    Examples: 
      | testcaseName  | Sheetname      |
      | batchupdate10 | Response_Batch |

  @updatebyprogramname
  Scenario Outline: Check if user able to update a program with valid program name and request body
    Given user creates put  request on programname for the LMS API endpoint from  "<testcaseName>" and "<Sheetname>"
    When user call "updateprogramname" with "PutProgramname" http request to update
    Then Request should be successful with status code200

    Examples: 
      | testcaseName | Sheetname        |
      | Progput_10   | Response_Program |

  @updatebyprogramid
  Scenario Outline: Check if user able to update a program with valid program Id and request body
    Given user creates put  request on program for the LMS API endpoint from  "<testcaseName>" and "<Sheetname>"
    When user call "updateprogram" with "PutProgram" http request to update
    Then Request should be successful with status code200

    Examples: 
      | testcaseName | Sheetname        |
      | Progput_10   | Response_Program |
      
      
      @AssignUpdateUserRoleProgramBatchStatus
  Scenario Outline: Check if user able to update a userroleprogram batch with valid User Id and request body
    Given user creates put request for UserRoleProgramBatchStatus the LMS API endpoint from  "<testcaseName>" and "<Sheetname>"
    When user call "updateuserprogbatch" with "PutUserprogbatch" http request to update
    Then Request should be successful with status code200

    Examples: 
      | testcaseName | Sheetname     |
      | Userupdate10  | Response_User |
      
       @Userpost
  Scenario Outline: check if user able to create a new user with valid endpoint and request body
    Given user creates User POST request for the LMS API endpoint from  "<testcaseName>" and "<Sheetname>"
    When user call "AddUsers" with "post" http request
    Then API call for User module is success with status code201
    Then verify the userID in json Response body

    Examples: 
      | testcaseName | Sheetname |
      | User_3      | User      |
  

  @updatebyuserrolestatus
  Scenario Outline: Check if user able to update a user with valid User Id and request body
    Given user creates put request on user for changing role status  "<testcaseName>" and "<Sheetname>"
    When user call "updateuserrolestatus" with "PutforUserrolestatus" http request to update
    Then Request should be successful with status code200

    Examples: 
      | testcaseName | Sheetname     |
      | Userupdate10  | Response_User |

  