@tag
Feature: Login
  summary is to login

  @tag1
  Scenario: Admin page login
    Given I want to navigate to Admin page
    And Give user name
    And Give user password
    And Click Login
    When Login is successfull
    Then Display successful login message

    Examples: 
      | name  | password | status  |
      | name1 |     passowrd1 | success |
      | name2 |     password2 | Fail    |

  @tag2
  Scenario: Admin page login with user name and password inline
    Given I want to navigate to Admin page
    And Enter "UserName" and "Password"
    And Click Login
    When Login is successfull
    Then Display successful login message
    
        Examples: 
      | UserName | Password  |
      |     unameone | pwdone |
      |     unametwo | pwdtwo |