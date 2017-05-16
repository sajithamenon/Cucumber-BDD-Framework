
Feature: Login Feature
  This feature is for the login functionality of the application for Admin and Supplier

  Scenario: Login with correct username and password for the admin

   When I login with correct credentials
    Then I should go to the adminDashboard

  Scenario: Login with correct username and incorrect password

    When I login with correct username and incorrect password
    Then I should not  go to the adminDashboard

  Scenario: Login with incorrect username and correct password for the admin

    When I login with incorrect email and correct password
    Then I should not  go to the adminDashboard

  Scenario: Login with empty credentials

    When I login with empty credentials
    Then I should not  go to the adminDashboard

  Scenario: Login with empty userName and correct password

    When I login with empty userName and correct password
    Then I should not  go to the adminDashboard


  Scenario: Login with empty  password and correct userName

    When I login with empty password and correct userName
    Then I should not  go to the adminDashboard

