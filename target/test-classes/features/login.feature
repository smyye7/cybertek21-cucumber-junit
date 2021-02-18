
@1
Feature: Library app login feature
  As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts are: librarian, student, admin
  # this is how you comment in the feature file

  Background: User is already in login page
    Given user is on the login page


  @librarian @employee
  Scenario: Login as Librarian
    When user enter librarian username
    And user enter librarian password
    Then user should see dashboard

    #WINDOW alt + enter
  @student
  Scenario: Login as student
    When user enters student username
    And user enters student password
    Then user should see dashboard

    #@wip #work in progress

  @admin @employee @db
  Scenario: Login as admin
    When user enter admin username
    And user enter admin  password
    Then user should see dashboard
