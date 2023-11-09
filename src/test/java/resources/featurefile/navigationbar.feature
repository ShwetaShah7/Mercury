Feature: Navigation Bar
 As a user I want to verify that I can reach to Awards and Accreditations through Navigation Bar successfully

  Scenario: User should be able to mousehover and navigate through navigation bar to reach award and accreditations successfully
    Given : I am on Home Page
    When I select Navigation Bar "News"
    And I click on Item "Awards and Accreditations"
    Then I verify the Awards page by Title "Awards and Accreditations"















