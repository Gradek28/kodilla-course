Feature:  I want to play the FizzBuzz game

  Scenario Outline: Play FizzBuzz game
    Given number is <number>
    When I enter the number
    Then I should see <result>

    Examples:
      | number | result    |
      | 3      | "Fizz"      |
      | 5      | "Buzz"      |
      | 15     | "FizzBuzz"  |
      | 7      | "None"      |
      | 30     | "FizzBuzz"  |
      | 1      | "None"      |
      | 9      | "Fizz"      |