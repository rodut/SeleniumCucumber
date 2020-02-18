Feature: OrangeHRM Login

  Scenario: Logo presence on OrangeHRM home page
    Given I launch Chrome browser
    When I open OrangeHRM homepage
    Then I verify that the logo is present on page
    And I close the browser
