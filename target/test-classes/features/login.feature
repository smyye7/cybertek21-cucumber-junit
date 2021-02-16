Feature: Library app login feature
  As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts are: librarian, student, admin
  # this is how you comment in the feature file

  @librarian @employee
  Scenario: Login as Librarian
    Given user is on the login page
    When user enter librarian username
    And user enter librarian password
    Then user should see dashboard

    #WINDOW alt + enter
  @student
  Scenario: Login as student
    Given user is on the login page
    When user enters student username
    And user enters student password
    Then user should see dashboard

    #@wip #work in progress

  @admin @employee
  Scenario: Login as admin
    Given user is on the login page
    When user enter admin username
    And user enter admin  password
    Then user should see dashboard
