@Login
  Feature: Login
    As a user i want to login to website sauce demo

  Scenario: Normal login
    Given User open the website sauce demo
    When User input "standard_user" as userName and input "secret_sauce" as password

#    Scenario Outline: Invalid login
#      Given User open the website sauce demo
#      When User input "<userName>" as userName and input "<password>" as password
#      Then User see error "<errorMessage>" on login page
#      Examples:
#        | userName | password | errorMessage                                                              |
#        | Taufik    | 123      | Epic sadface: Username and password do not match any user in this service |
#        |          | 123      | Epic sadface: Username is required                                        |
#        |          |          | Epic sadface: Username is required                                        |