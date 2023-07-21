@CreateAccount
Feature: Web Create New Account
  As a new user, I want to create an account in Magento Website

  @REG01 @Positive
  Scenario Outline: Verify to create new account using valid credentials
    Given I already access the website and go to Create an Account page
    When I input First Name for create account <first_name>
    And I input Last Name for create account <last_name>
    And I want to input Email for create account <email>
    And I want to input Password for create account <password>
    And I input Confirm Password for create account <confirm_password>
    And I click Create an Account button
    Then I should see the next step for Create an Account: <status>

    Examples: 
      | first_name | last_name | email  | password    | confirm_password | status  |
      | random     | random    | random | ABCde!12345 | ABCde!12345      | success |

  @REG02 @Negative
  Scenario Outline: Verify to create new account without enter any data into the fields
    Given I already access the website and go to Create an Account page
    When I input First Name for create account <first_name>
    And I input Last Name for create account <last_name>
    And I want to input Email for create account <email>
    And I want to input Password for create account <password>
    And I input Confirm Password for create account <confirm_password>
    And I click Create an Account button
    Then I should see the next step for Create an Account: <status>

    Examples: 
      | first_name | last_name | email | password | confirm_password | status              |
      | empty      | empty     | empty | empty    | empty            | required all fields |

  @REG03 @Negative
  Scenario Outline: Verify to create new account with invalid email: <condition>
    Given I already access the website and go to Create an Account page
    When I input First Name for create account <first_name>
    And I input Last Name for create account <last_name>
    And I want to input Email for create account <email>
    And I want to input Password for create account <password>
    And I input Confirm Password for create account <confirm_password>
    And I click Create an Account button
    Then I should see the next step for Create an Account: <status>

    Examples: 
      | first_name | last_name | email                  | password    | confirm_password | status           | condition                       |
      | Silmi      | Fillah    | magento.silmi@test.com | ABCde!12345 | ABCde!12345      | registered email | registered email                |
      | Andrew     | White     | andrewhite@mailtest    | ABCde!12345 | ABCde!12345      | invalid email    | non-TLD email                   |
      | Mia        | Clark     | miaclarkmailtest.co.id | ABCde!12345 | ABCde!12345      | invalid email    | without @                       |
      | Rebecca    | Anderson  | mrs.andersongmail      | ABCde!12345 | ABCde!12345      | invalid email    | without @ and non-TLD email     |
      | Danny      | Miller    | @yahoo.co.id           | ABCde!12345 | ABCde!12345      | invalid email    | incomplete email (without name) |

  @REG04 @Negative
  Scenario Outline: Verify to create new account with invalid password: <condition>
    Given I already access the website and go to Create an Account page
    When I input First Name for create account <first_name>
    And I input Last Name for create account <last_name>
    And I want to input Email for create account <email>
    And I want to input Password for create account <password>
    And I input Confirm Password for create account <confirm_password>
    And I click Create an Account button
    Then I should see the next step for Create an Account: <status>

    Examples: 
      | first_name | last_name | email                    | password    | confirm_password | status                   | condition                      |
      | Andrew     | White     | andrewhite@mailtest.com  | andrewhite5 | andrewhite5      | password criteria        | doesn't meet password criteria |
      | Mia        | Clark     | miaclark@mailtest.co.id  | clark       | clark            | password less than 8     | password less than 8           |
      | Rebecca    | Anderson  | mrs.anderson@gmail.com   | Becc@3      | Becc@3           | password less than 8     | meet criteria but less than 8  |
      | Danny      | Miller    | miller_danny@yahoo.co.id | miller!100  | miller!!!001     | invalid confirm password | value is not the same          |

  @REG05 @Negative
  Scenario Outline: Verify to create new account with empty fields: <condition>
    Given I already access the website and go to Create an Account page
    When I input First Name for create account <first_name>
    And I input Last Name for create account <last_name>
    And I want to input Email for create account <email>
    And I want to input Password for create account <password>
    And I input Confirm Password for create account <confirm_password>
    And I click Create an Account button
    Then I should see the next step for Create an Account: <status>

    Examples: 
      | first_name | last_name | email                    | password    | confirm_password | status                    | condition              |
      | empty      | White     | andrewhite@mailtest.com  | andreWhite5 | andreWhite5      | required first name       | empty first name       |
      | Mia        | empty     | miaclark@mailtest.co.id  | Mrs.clark10 | Mrs.clark10      | required last name        | empty last name        |
      | Rebecca    | Anderson  | empty                    | Beccaaa@3   | Beccaaa@3        | required email            | empty email            |
      | Danny      | Miller    | miller_danny@yahoo.co.id | empty       | miller!!001      | required password         | empty password         |
      | Lucas      | Ford      | lucas.1000@ymail.com     | lucas!123   | empty            | required confirm password | empty confirm password |
