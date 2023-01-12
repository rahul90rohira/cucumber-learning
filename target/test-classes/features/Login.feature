Feature: User login scenario

  Background: Valid Connection
    Given Chrome browser is installed in system
    When Click browser will open the browser
    Then check all browser link is displayed

  Scenario: Login with valid credentials
    Given  User is on NetBanking Login Page
    When  User login with valid username "Rahul" and password "1234"
    Then  user should be navigate into NetBank Home Page
    And  All Credit card display "true"
    But No promotion message display

 @SmokeTest
  Scenario: Login with InValid credentials
    Given  User is on NetBanking Login Page
    When  User login with valid username "Rohit" and password "4321"
    Then  user should be navigate into NetBank Home Page
    And  All Credit card display "false"
    But No promotion message display

 @SmokeTest
  Scenario: Signup on NetBanking
    Given  User is on NetBanking Login Page
    When  User Signup with following details
      | rahul| rohira | gwalior | MP| rahul@gmail.com|INDIA
      | sunny|hundwani| CT      | US|sunny@gmail.com |USA
    Then  user should be navigate into NetBank Home Page
    And  All Credit card display "false"
    But No promotion message display


  Scenario Outline: Login with Valid Parameter credentials
    Given  User is on NetBanking Login Page
    When  User log in with username <username> and password <password>
    Then  user should be navigate into NetBank Home Page
    And  All Credit card display "false"
    But No promotion message display

    Examples:
    | username | password |
    | rahul    | rohira   |
    | ajay     | rahore   |
    | sanajay  | Gautam   |


