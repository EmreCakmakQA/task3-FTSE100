Feature: FTSE 100
  I want to get the top riser and faller from the ftse 100 site


  Scenario: Open the site and get the name of the top riser and faller
    Given I can open the site
    When I click risers
    And fallers
    Then I get their names

