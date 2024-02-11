Feature: creating new user account
  Scenario Outline: paying a payroll
    Given open mercury demo website
    When click on accounts button on side menu
    And  click on credit card button in side menu
    And  click on pay button in credit card page
    And  click on review button in make a credit payment over relay in credit card page
    And  click on confirm payment button in make a credit payment over relay in credit card page
    Then success message "<message>" should be displayed in make a credit payment over relay in credit card page
    When click on all done button in make a credit payment over relay in credit card page

    Examples:
      | message         |  |  |  |  |
      | Payment applied |  |  |  |  |


  Scenario Outline: pay treasury from your account to another account
    Given open mercury demo website
    When click on accounts button on side menu
    And click on treasury button on side menu
    And  click on transfer funds spinner in transfer funds page
    And click on transfer out funds in transfer funds page
    And enter the amount "<amount>" needed to transfer in transfer details page
    And click on transfer to spinner in transfer details page
    And select ops payroll option in transfer to dropdown menu in transfer details page
    And click on next button in transfer details page
    And click on transfer button in review transfer details page
    Then transfer message "<message>" appeared successfully
    Examples:
      | amount | message                                               |  |
      | 124000 | You’ve made a transfer from Treasury to Ops / Payroll |  |
  Scenario Outline:fail pay treasury from your account to the same account
    Given open mercury demo website
    When click on accounts button on side menu
    And click on treasury button on side menu
    And  click on transfer funds spinner in transfer funds page
    And click on transfer out funds in transfer funds page
    And enter the amount "<amount>" needed to transfer in transfer details page
    And click on transfer to spinner in transfer details page
    And select treasury option in transfer to dropdown menu in transfer details page
    And error message "<error>" should be displayed
    Examples:
      | amount | error |
      |12500   |You can't send to/from the same account|

  Scenario Outline:fail pay treasury with amount more than the current amount limit
    Given open mercury demo website
    When click on accounts button on side menu
    And click on treasury button on side menu
    And  click on transfer funds spinner in transfer funds page
    And click on transfer out funds in transfer funds page
    And enter the amount "<amount>" needed to transfer in transfer details page
   Then error message "<message>" indicates that amount more than the avilabe should be displayed
    Examples:
      | amount | message |
    | 500000 |This account does not have enough funds.|

  Scenario Outline:request fund
    Given open mercury demo website
    When click on capital in side menu in home page
    And  click on Venture Debt in capital page
    And  click on request fund button in capital page
    And  enter the amount "<amount>" you want to request in request fund page
    And  click on next button in request fund page
    And  click on next button in destination fund page
    And  click on request fund button in review page
    And  click on agree button in review page
    And success message "<message>" in Request done page should be displayed
    Examples:
      | amount | message |
    |125000  | You’ve requested $56,456 USD from your Venture Debt loan|

