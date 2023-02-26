Feature: Login into Amazon feature


  Scenario: Verify that user is able to login
    Given the user navigates to the home page
    When the user enters the valid user name
    Then the user will login into amazon


  Scenario: Verify that only valid user can login
    Given the user navigates to the homepage
    When the user enters the invalid user name
    Then the user can not login into amazon

    Scenario: User can access My orders
      Given the user navigates to the account page
      When the user click on my order
      Then the user navigates to my order page

  Scenario: User can access security
    Given the user navigates to the accountpage
    When the user click on security
    Then the user navigates to login and security page


Scenario Outline: User can access search bar
  Given the user navigates to the amazon home page
  When the user click on search bar "<searchField>" .
  Then the user find required object
  Examples:
  |searchField|
  |Mobile      |


