Feature: Myntra Insider See more

  Background: 
    Given Open browser And enter url
    Then Enter email and password from path
    Then click on login

  Scenario: See more button is working or not
    Then click on myntra insider under profle
    Then Click on see more button
    Then close the browser
