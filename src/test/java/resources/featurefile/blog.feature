Feature: Blog
 As a user I want to verify that I can read any blog through Archive successfully

  Scenario: User should be able to successfully select from the dropdown list to read the blogs
    Given : I am on Home Page
    When I select "Resources" on Navigation Bar
    And I click on "Blog"
    And I verify the Blog page by Title "Blog"
    And I click on Most Recent and select "August 2023"
    And I verify the selection by Header Title "News for August 2023"
    Then I scroll down the page to select a blog to read















