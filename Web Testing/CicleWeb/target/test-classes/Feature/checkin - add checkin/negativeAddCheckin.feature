@Negative-Add_Checkin-Feature
Feature: Functional add checkin

  Background:1.User already open chrome browser
             2.User access "https://staging.cicle.app"
             3.User must already sign in into app
             4.User must be entered into Sekolah QA Cilsy Headquarter Page
             5.User must be entered into Div Cilsy Teams Page

  @Negative-Add_Checkin-01
  Scenario: User add checkin without input text in type your question field
    Given Navigate user to checkin page
      When User click create checkin button
        And User click type your question field
        And User set a day
        And User click time field
        And User input valid time
        And User click add button to wanna be notified
          Then User get dialog box to add or remove subscriber
      When User click checkbox button to add subscriber
        And User click done button
          Then User can view that subscriber success to add
      When User click private button
        And User click Start collecting answers button
          Then User failed to add new checkin

  @Negative-Add_Checkin-02
  Scenario: User add checkin with input empty text using spaces button as empty character in type your question field
    Given Navigate user to checkin page
      When User click create checkin button
        And User click type your question field
        And User input empty text using space button as empty character in type your question field
        And User set a day
        And User click time field
        And User input valid time
        And User click add button to wanna be notified
          Then User get dialog box to add or remove subscriber
      When User click checkbox button to add subscriber
        And User click done button
          Then User can view that subscriber success to add
      When User click private button
        And User click Start collecting answers button
          Then User failed to add new checkin with input empty text using space button as character

  @Negative-Add_Checkin-03
  Scenario: User add checkin with input invalid time without fill question field
    Given Navigate user to checkin page
      When User click create checkin button
        And User click type your question field
        And User select all day
        And User click time field
        And User input invalid time
        And User click Start collecting answers button
          Then User failed to add new checkin