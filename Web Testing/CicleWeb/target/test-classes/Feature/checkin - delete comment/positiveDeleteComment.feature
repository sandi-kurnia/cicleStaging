@Positive-Delete_Comment-Feature
Feature: Functional delete comment

  Background:1.User already open chrome browser
             2.User access "https://staging.cicle.app"
             3.User must already sign in into app
             4.User must be entered into Sekolah QA Cilsy Headquarter Page
             5.User must be entered into Div Cilsy Teams Page

  @Positive-Delete_Comment-01
  Scenario:User delete comment
    Given Navigate user to checkin page
      When User click one of question detail
        And User click three dot button in the comment details
        And User click delete button
          Then User get dialog box to delete comment
      When User click delete button to delete comment
          Then User success to delete comment

  @Positive-Delete_Comment-02
  Scenario:User cancel delete comment
    Given Navigate user to checkin page
      When User click one of question detail
        And User click three dot button in the comment details
        And User click delete button
          Then User get dialog box to delete comment
      When User click cancel button to cancel delete comment
          Then User dialog box to delete comment is closed