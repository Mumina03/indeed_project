@CRMLY10-226
Feature: user in login page logins and lands main page of Activity Stream


  Background: For the scenarios in the feature file, user is expected to be on login page and login
    Given user is on the login page
    When user enters valid login "hr100@cybertekschool.com" password "UserUser" and logins
    And user is on the main page of Activity Stream
    When user clicks send message box


  @CRMLY10-221
  Scenario: User should be able to add mentions
     And user adds a mention by clicking the Add Mention button
    Then the mention should be added to the message and visible on the Activity Stream

 @CRMLY10-222 @wip
  Scenario: User should be able to attach a link to the specified text
    When user types a message into the MESSAGE input box
    And user attaches a link to the text and saves
    And  user clicks the SEND button


  @CRMLY10-223 @wip
  Scenario: User should be able to insert YouTube and Vimeo video
    When user clicks insert video button
    And user inserts  YouTube or Vimeo video
    Then user clicks the SAVE button



  @CRMLY10-224 @wip
  Scenario: User should be able to cancel links and videos before sending the message
    When user attaches a link to the text and saves
    When user clicks insert video button
    And user inserts  YouTube or Vimeo video
    Then user clicks the SAVE button
    And user cancels links and video before sending the message by clicking the CANCEL button



  @CRMLY10-225 @wip
  Scenario: User should be able to remove tags before sending the message
    When user types a message into the MESSAGE input box
    And user adds a tag to the MESSAGE
    And  user removes the tag before sending the message by clicking the REMOVE button
    #And  user clicks the SEND button
