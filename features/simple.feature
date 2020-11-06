Feature: Belly

  Scenario Outline: a few cukes
    Given I have 42 cukes in my belly
    When I wait <hours> hours
    Then my belly should <effect>

    Examples:
      | hours | effect   |
      | 1     | 'squeak' |
      | 2     | 'growl'  |
      | 3     | 'scream' |


