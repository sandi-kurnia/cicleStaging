@Negative-Edit_Checkin-Feature
Feature: Functional Edit Checkin Testing
  Background:1.User already open chrome browser
             2.User access "https://staging.cicle.app"
             3.User must already sign in into app
             4.User must be entered into Sekolah QA Cilsy Headquarter Page
             5.User must be entered into Div Cilsy Teams Page

  @Negative-Edit_Checkin-01
  Scenario:User edit checkin with input empty text in type your question field
    Given Navigate user to checkin page
      When User click one of question detail
        And User click three dot button
          Then User get dialog box to edit or archive this question
      When User click edit button
        And User click type your question field
        And User delete previous text in type your question field
        And User input empty text in type your question field
        And User click save changes button
          Then User failed to update checkin

  @Negative-Edit_Checkin-02
  Scenario:User edit checkin with input empty text using spaces button as empty character in type your question field
    Given Navigate user to checkin page
      When User click one of question detail
        And User click three dot button
          Then User get dialog box to edit or archive this question
      When User click edit button
        And User click type your question field
        And User delete previous text in type your question field
        And User input empty text using space button as empty character in type your question field
        And User click save changes button
          Then User failed to update checkin


