Feature: All Post Negative Scenarios

  Background: User sets Authorization
    Given User sets authorization to NO Auth

  @ProgPost_nameExists
  Scenario Outline: check if user able to create a program with existing program name
    Given user creates POST request with existing prog name for the LMS API endpoint from  "<testcaseName>" and "<Sheetname>"
    When user call "AddProgram" with "post" http request for users
    Then User receives BadRequest status code with message and boolean success details

    Examples: 
      | testcaseName | Sheetname |
      | Prog_1       | Program   |

  @ProgPost_missingField
  Scenario Outline: check if user able to create a program with missing field
    Given user creates POST request with missingfield for the LMS API endpoint from  "<testcaseName>" and "<Sheetname>"
    When user call "AddProgram" with "post" http request for users
    Then User receives BadRequest status code with message and boolean success details

    Examples: 
      | testcaseName | Sheetname |
      | Prog_1       | Program   |

     

  @BatchPost_nameExists
  Scenario Outline: check if user able to create a batch with existing batch name
    Given user creates POST request with existing batch name for the LMS API endpoint from  "<testcaseName>" and "<Sheetname>"
    When user call "AddBatch" with "post" http request for users 
    Then User receives BadRequest status code with message and boolean success details

    Examples: 
      | testcaseName | Sheetname |
      | Prog_1       | Program   |

  @BatchPost_missingField
  Scenario Outline: check if user able to create a batch with missing field
    Given user creates POST request with missingfield in batch for the LMS API endpoint from  "<testcaseName>" and "<Sheetname>"
    When user call "AddBatch" with "post" http request for users
    Then User receives BadRequest status code with message and boolean success details

    Examples: 
      |testcaseName|Sheetname|
			| ProgBatch_1  |   Batch |
			
			
			@user_phoneExists
			Scenario Outline: check if user able to create a user with existing phone number
    Given user creates user with existing phone number for the LMS API endpoint from  "<testcaseName>" and "<Sheetname>"
    When user call "AddUsers" with "post" http request for users
    Then User receives BadRequest status code with message and boolean success details

    Examples: 
      | testcaseName | Sheetname |
      | User_1  |   User |
      
      
				@user_missingField
			Scenario Outline: check if user able to create a program with missing field
    Given user creates user with a missing field for the LMS API endpoint from  "<testcaseName>" and "<Sheetname>"
    When user call "AddUsers" with "post" http request for users
    Then User receives BadRequest status code with message and boolean success details

    Examples: 
      | testcaseName | Sheetname |
      | User_1  |   User |
      
      
      @Assign_ExistValue
      Scenario Outline: check if user able to create a assignment with existing value
    Given user creates Assignment with existing value for the LMS API endpoint from  "<testcaseName>" and "<Sheetname>"
    When user call "AddAssignment" with "post" http request for users
    Then User receives BadRequest status code with message and boolean success details
     Examples: 
|testcaseName|Sheetname|
| Assign_1 |   Assignment |


		 @Assign_missingField
      Scenario Outline: check if user able to create a assignment with missing field
    Given user creates Assignment with missing value for the LMS API endpoint from  "<testcaseName>" and "<Sheetname>"
    When user call "AddAssignment" with "post" http request for users
    Then User receives BadRequest status code with message and boolean success details
     Examples: 
|testcaseName|Sheetname|
| Assign_1 |   Assignment |
		
		
		@Submit_Existvalue
      Scenario Outline: check if user able to submit Assignment with existing value
    Given user submits assignment with existing value for the LMS API endpoint from  "<testcaseName>" and "<Sheetname>"
    When user call "SubmitAssgn" with "post" http request for users
    Then User receives BadRequest status code with message and boolean success details
     Examples: 
|testcaseName|Sheetname|
| AssignSubmit_1 |   Assignmnet_Submit |

		
		 @Submit_missingField
      Scenario Outline: check if user able to create a assignment with missing field
    Given user submits assignment with missing value for the LMS API endpoint from  "<testcaseName>" and "<Sheetname>"
    When user call "SubmitAssgn" with "post" http request for users
    Then User receives BadRequest status code with message and boolean success details
     Examples: 
|testcaseName|Sheetname|
| AssignSubmit_1 |   Assignmnet_Submit |
    
    
    