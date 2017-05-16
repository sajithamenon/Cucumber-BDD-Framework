$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "Login Feature",
  "description": "This feature is for the login functionality of the application for Admin and Supplier",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 16732326388,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Login with correct username and password for the admin",
  "description": "",
  "id": "login-feature;login-with-correct-username-and-password-for-the-admin",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I login with correct credentials",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should go to the adminDashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iLoginWithCorrectCredentials()"
});
formatter.result({
  "duration": 4520803572,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iShouldGoToTheAdminDashboard()"
});
formatter.result({
  "duration": 78469166,
  "status": "passed"
});
formatter.before({
  "duration": 14326057428,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Login with correct username and incorrect password",
  "description": "",
  "id": "login-feature;login-with-correct-username-and-incorrect-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I login with correct username and incorrect password",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I should not  go to the adminDashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iLoginWithCorrectUsernameAndIncorrectPassword()"
});
formatter.result({
  "duration": 3522517910,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iShouldNotGoToTheAdminDashboard()"
});
formatter.result({
  "duration": 70272079,
  "status": "passed"
});
formatter.before({
  "duration": 13665586405,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Login with incorrect username and correct password for the admin",
  "description": "",
  "id": "login-feature;login-with-incorrect-username-and-correct-password-for-the-admin",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "I login with incorrect email and correct password",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I should not  go to the adminDashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iLoginWithIncorrectEmailAndCorrectPassword()"
});
formatter.result({
  "duration": 3462606071,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iShouldNotGoToTheAdminDashboard()"
});
formatter.result({
  "duration": 66966560,
  "status": "passed"
});
formatter.before({
  "duration": 16277176880,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Login with empty credentials",
  "description": "",
  "id": "login-feature;login-with-empty-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "I login with empty credentials",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "I should not  go to the adminDashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iLoginWithEmptyCredentials()"
});
formatter.result({
  "duration": 3459488841,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iShouldNotGoToTheAdminDashboard()"
});
formatter.result({
  "duration": 89515063,
  "status": "passed"
});
formatter.before({
  "duration": 16773796559,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Login with empty userName and correct password",
  "description": "",
  "id": "login-feature;login-with-empty-username-and-correct-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 27,
  "name": "I login with empty userName and correct password",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "I should not  go to the adminDashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iLoginWithEmptyUserNameAndCorrectPassword()"
});
formatter.result({
  "duration": 3827801175,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iShouldNotGoToTheAdminDashboard()"
});
formatter.result({
  "duration": 82924946,
  "status": "passed"
});
formatter.before({
  "duration": 18179188020,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Login with empty  password and correct userName",
  "description": "",
  "id": "login-feature;login-with-empty--password-and-correct-username",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 33,
  "name": "I login with empty password and correct userName",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "I should not  go to the adminDashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iLoginWithEmptyPasswordAndCorrectUserName()"
});
formatter.result({
  "duration": 4305909315,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iShouldNotGoToTheAdminDashboard()"
});
formatter.result({
  "duration": 93994921,
  "status": "passed"
});
formatter.uri("RequestAccessPage.feature");
formatter.feature({
  "line": 1,
  "name": "An user must be able to register as a Nabca User",
  "description": "",
  "id": "an-user-must-be-able-to-register-as-a-nabca-user",
  "keyword": "Feature"
});
formatter.before({
  "duration": 24471049867,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Requesting acces as a supplier",
  "description": "",
  "id": "an-user-must-be-able-to-register-as-a-nabca-user;requesting-acces-as-a-supplier",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "the user is on the loginPage",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "click request access tab",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "enter the details of FirstName LastName Email and phone number",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "check the radio Button Named I am a Supplier",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Check the states Idaho and Montana",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Select a Suppplier name",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "enter a Supplier address",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "enter the city",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Select the state",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "enter the zipcode",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "select the country as United Staes",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Register",
  "keyword": "And "
});
formatter.match({
  "location": "RequstAccessPageSteps.theUserIsOnTheLoginPage()"
});
formatter.result({
  "duration": 1038945,
  "status": "passed"
});
formatter.match({
  "location": "RequstAccessPageSteps.clickRequestAccessTab()"
});
formatter.result({
  "duration": 3397910426,
  "status": "passed"
});
formatter.match({
  "location": "RequstAccessPageSteps.enterTheDetailsOfFirstNameLastNameEmailAndPhoneNumber()"
});
formatter.result({
  "duration": 1056144479,
  "status": "passed"
});
formatter.match({
  "location": "RequstAccessPageSteps.checkTheRadioButtonNamedIAmASupplier()"
});
formatter.result({
  "duration": 1802870441,
  "status": "passed"
});
formatter.match({
  "location": "RequstAccessPageSteps.checkTheStatesIdahoAndMontana()"
});
formatter.result({
  "duration": 723530092,
  "status": "passed"
});
formatter.match({
  "location": "RequstAccessPageSteps.selectASuppplierName()"
});
formatter.result({
  "duration": 31619436246,
  "status": "passed"
});
formatter.match({
  "location": "RequstAccessPageSteps.enterASupplierAddress()"
});
formatter.result({
  "duration": 365425235,
  "status": "passed"
});
formatter.match({
  "location": "RequstAccessPageSteps.enterTheCity()"
});
formatter.result({
  "duration": 242707352,
  "status": "passed"
});
formatter.match({
  "location": "RequstAccessPageSteps.selectTheState()"
});
formatter.result({
  "duration": 1089440852,
  "status": "passed"
});
formatter.match({
  "location": "RequstAccessPageSteps.enterTheZipcodeAs()"
});
formatter.result({
  "duration": 207759798,
  "status": "passed"
});
formatter.match({
  "location": "RequstAccessPageSteps.selectTheCountryAsUnitedStaes()"
});
formatter.result({
  "duration": 371292986,
  "status": "passed"
});
formatter.match({
  "location": "RequstAccessPageSteps.register()"
});
formatter.result({
  "duration": 291998821,
  "status": "passed"
});
formatter.before({
  "duration": 15401664759,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Requesting acces as a Broker",
  "description": "",
  "id": "an-user-must-be-able-to-register-as-a-nabca-user;requesting-acces-as-a-broker",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "the user is on the loginPage",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "click request access tab",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "enter the details of FirstName LastName Email and phone number",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "check the radio Button Named I am a Broker",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Check the states Idaho and Montana",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Select a Suppplier name",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "enter a Supplier address",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "enter the city",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Select the state",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "enter the zipcode",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "select the country as United Staes",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Enter the companyName",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "enter the company address",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "enter the company city",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Select the company state",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "Enetr the company Zip",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Register",
  "keyword": "And "
});
formatter.match({
  "location": "RequstAccessPageSteps.theUserIsOnTheLoginPage()"
});
formatter.result({
  "duration": 559736,
  "status": "passed"
});
formatter.match({
  "location": "RequstAccessPageSteps.clickRequestAccessTab()"
});
formatter.result({
  "duration": 3217274514,
  "status": "passed"
});
formatter.match({
  "location": "RequstAccessPageSteps.enterTheDetailsOfFirstNameLastNameEmailAndPhoneNumber()"
});
formatter.result({
  "duration": 1101251353,
  "status": "passed"
});
formatter.match({
  "location": "RequstAccessPageSteps.checkTheRadioButtonNamedIAmABroker()"
});
formatter.result({
  "duration": 1835058001,
  "status": "passed"
});
formatter.match({
  "location": "RequstAccessPageSteps.checkTheStatesIdahoAndMontana()"
});
formatter.result({
  "duration": 935861722,
  "status": "passed"
});
formatter.match({
  "location": "RequstAccessPageSteps.selectASuppplierName()"
});
formatter.result({
  "duration": 59038584651,
  "status": "passed"
});
formatter.match({
  "location": "RequstAccessPageSteps.enterASupplierAddress()"
});
formatter.result({
  "duration": 127446031,
  "status": "passed"
});
formatter.match({
  "location": "RequstAccessPageSteps.enterTheCity()"
});
formatter.result({
  "duration": 101111616,
  "status": "passed"
});
formatter.match({
  "location": "RequstAccessPageSteps.selectTheState()"
});
formatter.result({
  "duration": 671616788,
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate option with index: 51\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027Sajitha-PC\u0027, ip: \u0027169.254.58.61\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_91\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.Select.selectByIndex(Select.java:182)\r\n\tat com.threeothree.test.features.pages.RequestAccessPage.supp_state(RequestAccessPage.java:130)\r\n\tat com.threeothree.test.steps.RequstAccessPageSteps.selectTheState(RequstAccessPageSteps.java:53)\r\n\tat ✽.And Select the state(RequestAccessPage.feature:29)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "RequstAccessPageSteps.enterTheZipcodeAs()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RequstAccessPageSteps.selectTheCountryAsUnitedStaes()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RequstAccessPageSteps.enterTheCompanyName()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RequstAccessPageSteps.enterTheCompanyAddress()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RequstAccessPageSteps.enterTheCompanyCity()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RequstAccessPageSteps.selectTheCompanyState()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RequstAccessPageSteps.enetrTheCompanyZip()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RequstAccessPageSteps.register()"
});
formatter.result({
  "status": "skipped"
});
});