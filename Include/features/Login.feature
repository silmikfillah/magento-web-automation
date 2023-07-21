Feature: Web Login
  As a user, I want to login in Magento Website

  @LGN01 @Positive
  Scenario Outline: Verify to login using valid credentials
    Given I already access the website and go to Login page
    When I input Email <email>
    And I input Password <password>
    And I click Sign In button
    Then I should see the next step for login: <status>

    Examples: 
      | email                    | password    | status  |
      | magento.silmi@test.com   | ABCde!12345 | success |
      | silmi.k.fillah@gmail.com | Silmikf10   | success |

  @LGN02 @Negative
  Scenario Outline: Verify to login without enter any data into the fields
    Given I already access the website and go to Login page
    When I input Email <email>
    And I input Password <password>
    And I click Sign In button
    Then I should see the next step for login: <status>

    Examples: 
      | email | password | status              |
      | empty | empty    | required all fields |

  @LGN03 @Negative
  Scenario Outline: Verify to login with invalid email: <condition>
    Given I already access the website and go to Login page
    When I input Email <email>
    And I input Password <password>
    And I click Sign In button
    Then I should see the next step for login: <status>

    Examples: 
      | email                      | password    | status            | condition                       |
      | mail.unregistered@mail.com | ABCde!12345 | incorrect account | unregistered email              |
      | magento@mailtest           | ABCde!12345 | invalid email     | non-TLD email                   |
      | magentomailtest.com        | ABCde!12345 | invalid email     | without @                       |
      | @rocketmail.com            | ABCde!12345 | invalid email     | incomplete email (without name) |

  @LGN04 @Negative
  Scenario Outline: Verify to login with incorrect password
    Given I already access the website and go to Login page
    When I input Email <email>
    And I input Password <password>
    And I click Sign In button
    Then I should see the next step for login: <status>

    Examples: 
      | email                  | password    | status            |
      | magento.silmi@test.com | Abcdeee!123 | incorrect account |

  @LGN05 @Negative
  Scenario Outline: Verify to login with incorrect email and incorrect password
    Given I already access the website and go to Login page
    When I input Email <email>
    And I input Password <password>
    And I click Sign In button
    Then I should see the next step for login: <status>

    Examples: 
      | email               | password    | status            |
      | typo.silmi@test.com | Abcdeee!123 | incorrect account |
