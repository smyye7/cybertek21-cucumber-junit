Feature: Library app login feature
  As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts are: librarian, student, admin
  # this is how you comment in the feature file

  @wip //work in progress
  Scenario: Login as Librarian
    Given user is on the login page
    When user enter librarian username
    And user enter librarian password
    Then user should see dashboard

    #WINDOW alt + enter

  Scenario: Login as student


