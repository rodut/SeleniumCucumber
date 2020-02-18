#Gherkin keywords: Feature, Scenario, Given, When, Then, And

# Feature : just one per .feature file
#   Scenario : as many as we need
#     Given - step is user to set the context, precondition
#     When - step is the action(condition)/interaction with the system
#     Then - step for representing the outcome, output
#     And - step for expanding the previous step

Feature: OrangeHRM Login

  Scenario: Logo presence on OrangeHRM home page
    Given I launch Chrome browser
    When I open OrangeHRM homepage
    Then I verify that the logo is present on page
    And I close the browser