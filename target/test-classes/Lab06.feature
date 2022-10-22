Feature: Payment Gateway Functional Test

  @Smoke @TC01 @Regression
  Scenario: Verify The header
    Given The user wants to go to Guru99Demo web page
    Then  The user wants to verify the header "Mother Elephant With Babies Soft Toy"

  @TC02 @Smoke @Regression
  Scenario: Verify the toy price is 20$
    Given The user wants to go to Guru99Demo web page
    Then The user wants to verify that the toy price is "Price: $20"

    @TC03 @Smoke @Regression
  Scenario: Verify the Url contain “payment-gateway”
    Given The user wants to go to Guru99Demo web page
      Then The user wants to verify that Url contains "payment-gateway"

  Scenario: Verify the the quantity as "5"
    Given The user wants to go to Guru99Demo web page
    When The user wants to buy elephant toys as "5"
    Then The user wants to click pay now Button
    And The user wants to enter payment information as
      | CardNumber      | 1111111111111111 |
      | ExpirationMonth | 12               |
      | ExpirationYear  | 2022             |
      | CVVCode         | 123              |
    Then The user wants to click on pay now button
    And The user wants to verify message as "Payment successfull!"

  Scenario Outline: Verify the various quantity
    Given The user wants to go to Guru99Demo web page
    When The user wants to verify the header "Mother Elephant With Babies Soft Toy"
    Then The user wants to verify that the toy price is "Price: $20"
    Then The user wants to verify that Url contains "payment-gateway"
    And The user wants to add new "<Quantity>"
    And The user wants to enter payment information as
      | CardNumber      | 5823698521478522 |
      | ExpirationMonth | 05               |
      | ExpirationYear  | 2028             |
      | CVVCode         | 256              |
    Then The user wants to click on pay now button
    And The user wants to verify message as "Payment successfull!"
    Examples:
      | Quantity |
      | 5        |
      | 8        |
      | 9        |
      | 2        |
      | 4        |