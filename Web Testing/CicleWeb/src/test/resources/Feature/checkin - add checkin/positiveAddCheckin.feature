@Positive-Add_Checkin-Feature
Feature: Functional add checkin

  Background:1.User already open chrome browser
             2.User access "https://staging.cicle.app"
             3.User must already sign in into app
             4.User must be entered into Sekolah QA Cilsy Headquarter Page
             5.User must be entered into Div Cilsy Teams Page

  @Positive-Add_Checkin-01
  Scenario: User add checkin with input text in type your question field
    Given Navigate user to checkin page
      When User click create checkin button
        And User click type your question field
        And User input text in type your question field
        And User click Start collecting answers button
          Then User success to add new checkin

  @Positive-Add_Checkin-02
  Scenario:User add checkin with select one of day
    Given Navigate user to checkin page
      When User click create checkin button
        And User click type your question field
        And User input text in type your question field
        And User set a day
        And User click Start collecting answers button
          Then User success to add new checkin

  @Positive-Add_Checkin-03
  Scenario: User add checkin with select all day
    Given Navigate user to checkin page
      When User click create checkin button
        And User click type your question field
        And User input text in type your question field
        And User select all day
        And User click Start collecting answers button
          Then User success to add new checkin

  @Positive-Add_Checkin-04
  Scenario: User add checkin with input valid time
    Given Navigate user to checkin page
      When User click create checkin button
        And User click type your question field
        And User input text in type your question field
        And User select all day
        And User click time field
        And User input valid time
        And User click Start collecting answers button
          Then User success to add new checkin

  @Positive-Add_Checkin-05
  Scenario: User add checkin with select all subscriber
    Given Navigate user to checkin page
      When User click create checkin button
        And User click type your question field
        And User input text in type your question field
        And User set a day
        And User click time field
        And User input valid time
        And User click add button to wanna be notified
          Then User get dialog box to add or remove subscriber
      When User click select all user checkbox button
        And User click done button
          Then User can view that subscriber success to add
      When User click private button
        And User click Start collecting answers button
          Then User success to add new checkin

  @Positive-Add_Checkin-06
  Scenario:User cancel add checkin
    Given Navigate user to checkin page
      When User click create checkin button
        And User click type your question field
        And User input text in type your question field
        And User set a day
        And User click time field
        And User input valid time
        And User click add button to wanna be notified
          Then User get dialog box to add or remove subscriber
      When User click select all user checkbox button
        And User click done button
          Then User can view that subscriber success to add
      When User click private button
        And User click cancel changes button
          Then User can view that page edited is closed











