@Negative-Add_Checkin-Feature
Feature: Functional Add Checkin

  Background:1.Cicle-staging app already installed on phone
             2.User must already sign in into app
             3.User must be entered into Sekolah QA Headquarter Page
             4.User must be entered into Div Cilsy Teams Page

  @Negative-Add_Checkin-01
  Scenario: User add new checkin without input text in type your question field
    Given Navigate user to checkin page
      When User tap create checkin button
        And User tap type your question field
        And User select the day
        And User tap start collecting answers button
          Then User get pop up alert question must be filled

  @Negative-Add_Checkin-02
  Scenario: User Add Checkin with Input Empty Text using Spaces button As Empty Character in Type Your Question Field
    Given Navigate user to checkin page
      When User tap create checkin button
        And User tap type your question field
        And User input empty text using spaces button as empty character in type your question field
        And User select the day
        And User set the time
        And User tap start collecting answers button
          Then User get pop up alert question must be filled

  @Negative-Add_Checkin-03
  Scenario: User Add New Checkin without Select The Days
    Given Navigate user to checkin page
      When User tap create checkin button
        And User tap type your question field
        And User input text in type your question field
        And User set the time
        And User tap start collecting answers button
          Then User get pop up alert how often the question is asked to be filled in

  @Negative-Add_Checkin-04
  Scenario: User Add New Checkin without set the time
    Given Navigate user to checkin page
      When User tap create checkin button
        And User tap type your question field
        And User input text in type your question field
        And User select the day
        And User tap start collecting answers button
          Then User get pop up alert time must be filled

  @Negative-Add_Checkin-05
  Scenario: User Add New Checkin with input invalid time
    Given Navigate user to checkin page
      When User tap create checkin button
        And User tap type your question field
        And User input text in type your question field
        And User select the day
        And User tap set time button
        And User tap switch to input time mode
        And User Input invalid hour
        And User Input invalid minute
        And User tap pm button
        And User tap ok button to enter time
          Then User get alert enter a valid time

  @Negative-Add_Checkin-06
  Scenario: User add new check in by adding already notified members
    Given Navigate user to checkin page
      When User tap create checkin button
        And User tap type your question field
        And User input text in type your question field
        And User select the day
        And User set the time
        And User tap add member button
        And User select member already notified
        And User tap done button
          Then User can view that users who have been added cannot be added back


