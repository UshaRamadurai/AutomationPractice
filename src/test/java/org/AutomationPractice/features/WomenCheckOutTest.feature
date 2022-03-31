Feature: Women Check Out functionality for Automation practice

  Scenario: Check Out Happy path
    Given The user is logged in successfully and is on Home Page
    When Hover on the Women Tab
    When Click on Casual Dresses
    And Hover on the Product Image
    When Click on Add to Cart button
    When Click on Proceed to checkout button
    Then Order page should be displayed
    When Click on Summary Proceed to checkout button
    When Click on Address Proceed to checkout button
    When Click on Agree check box button
    When Click on Shipping Proceed to checkout button
    When Click on Pay by bank wire button
    Then My Store page should be displayed
    When Click on I confirm my order button
    Then ORDER CONFIRMATION is displayed









