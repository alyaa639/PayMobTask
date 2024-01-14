Feature: creating new user account
  Scenario Outline:
    Given luma website opened successfully
    When click on create new account button in landing page
    Then create new account page should be displayed
    When enter first "<first name>" name in create new customer account page
    And enter last name "<last name>" in create new customer account page
    And scroll down to confirm password filed
    And enter your email "<email>" in create new customer account page
    And enter password "<password>" in create new customer account page
    And reenter the password "<password>" in create new customer account page
    And click on create an account button in create new customer account page
    Then home page should be displayed
    Examples:
      | first name | last name | email               | password    |  |
      | Alyaa      | Mohamed   | alyaa1111@gmail.com | Password123 |  |
