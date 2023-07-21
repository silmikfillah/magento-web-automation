@Logout
Feature: Web Logout
  As a user, I want logout from the Magento Website

  @LGT01 @Positive
  Scenario: Verify to logout
    Given I already login the website
    When I expand Header Menu
    And I click Sign Out Menu
    Then I signed out from the website successfully
