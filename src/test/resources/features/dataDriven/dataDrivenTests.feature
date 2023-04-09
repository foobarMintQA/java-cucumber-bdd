Feature: Verify successful user login
  As a valid user
  I go to website and Login

  Scenario Outline: Login by entering username and password
    Given I am on website
    Then I enter username as "<username>" with emp code <empCode>
    Then I enter password as "<password>"
    When I hit enter
    Then I successfully logged in

    Examples:
      | username | empCode | password |
      | admin    | 123     | admin123 |
      | owner    | 321     | owner123 |

  Scenario: Login by entering username and password
    Given I am on website
    Then I enter username with emp code empCode
      | admin    | 123     |
      | owner    | 321     |
    Then I enter password as "admin123"
    When I hit enter
    Then I successfully logged in