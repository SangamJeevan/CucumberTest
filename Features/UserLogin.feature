Feature: Website Login

  Scenario: Logo presence in homepage
    Given I launch chrome browser
    When I open website homepage
    Then I verify logo on homepage
    And close browser