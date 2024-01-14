Feature: comparing two products and adding buying one of them

  Scenario Outline: customer compare between two products and buy one of them
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
    When click on luma home page in welcome page
    And scroll down to hot sellers section in home page
    And click on the second product in hot sellers section in home page
    And click on add product to comparison in second product page
    And click home button in second product page
    And scroll down to hot sellers section in home page
    And click on the third product in hot sellers section in home page
    And click on add product to comparison in third product page
    And click on comparison list button in third product page
    And click on add to cart of the second product in comparison page
    And select the white color in the second product page
    And select the small size in the second product page
    And click on add to cart button second product page
    And click on cart button in second product page
    And click on proceed to check out button in second product page
    And enter shipping address "<address>" in shipping address field in shipping page
    And enter city "<city>" in city field in shipping page
    And select the state from the state drop down menu in shipping page
    And enter postal code "<postal code>" in postal code field in shipping page
    And enter phone number"<mobile number>" in phone number filed in shipping page
    And click on shipping rate radio button
    And click on next button in shipping page
    And click on place order button in review and payments page
    Then success message should be "<success message>"
    Examples:
      | first name | last name | email                      | password     | address | postal code | success message              | mobile number | city      |  |
      | alyaa      | mohamed   | alyaamohame68978@gmail.com | Password123@ | arizona | 12345       | Thank you for your purchase! | 012235665885  | parkAvenu |  |

