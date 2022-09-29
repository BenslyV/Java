Feature: Create new deal using Maps

Scenario: Create new deal using maps
    Given Login to create new deal using maps
    |username|password|
    |bensly.v@gmail.com| Rohit12#|
    When Navigate to deal and create new deal maps
    |Title|Description|Next Steps|
    |Mr Trump|Test Deal1| Test next1|
    |Mr Boris|test Deal2| Test next2|
    Then Close browser once deals created maps