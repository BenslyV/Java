Feature: Create new deal

Scenario: Create new deal
    Given Login to create new deal
    |bensly.v@gmail.com| Rohit12#|
    When Navigate to deal and create new deal
    |Mr|Test Deal| Test next|
    Then Close browser once deals created