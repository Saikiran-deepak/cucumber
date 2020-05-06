Feature: Myntra credit end to end

  Background: 
    Given Open browser And enter url
    Then Enter email and password from path
    Then click on login

  Scenario: CouponsEndToEnd
    Then Click on myntra credit under profile
    Then Click on toptp button
    Then Select or enter amount valid amount
    Then Click on login button
    Then Enter card detail
    Then Click on Pay Now
    Then close the browser
