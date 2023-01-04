@Positive-Add_Checkin-Feature
Feature: Functional Add Checkin

  Background:1.Cicle-staging app already installed on phone
             2.User must already sign in into app
             3.User must be entered into Sekolah QA Headquarter Page
             4.User must be entered into Div Cilsy Teams Page

  @Positive-Add_Checkin-01
  Scenario: User add new checkin
    Given Navigate user to checkin page
      When User tap create checkin button
        And User tap type your question field
        And User input text in type your question field
        And User select the day
        And User set the time
        And User tap start collecting answers button
          Then User success to add new checkin

  @Positive-Add_Checkin-02
  Scenario: User add new checkin with select all day
    Given Navigate user to checkin page
    When User tap create checkin button
    And User tap type your question field
    And User input text in type your question field
    And User select all days
    And User set the time
    And User tap start collecting answers button
    Then User success to add new checkin

  @Positive-Add_Checkin-03
  Scenario: User add new checkin for private only
    Given Navigate user to checkin page
      When User tap create checkin button
        And User tap type your question field
        And User input text in type your question field
        And User select the day
        And User set the time
        And User tap switch button to private
        And User tap start collecting answers button
          Then User success to add new checkin

  @Positive-Add_Checkin-04
  Scenario: User add new checkin with unselect all member companies to be notified
    Given Navigate user to checkin page
      When User tap create checkin button
        And User tap type your question field
        And User input text in type your question field
        And User select the day
        And User set the time
        And User tap add member button
        And User tap 2 times in select all checkbox to deselect
        And User tap done button
          Then User can view that notified member not appears
        And User tap start collecting answers button
          Then User success to add new checkin

  @Positive-Add_Checkin-05
  Scenario: User Add New Check-In with Input Valid Time
    Given Navigate user to checkin page
    When User tap create checkin button
      And User tap type your question field
      And User input text in type your question field
      And User select the day
      And User tap set time button
      And User tap switch to input time mode
      And User Input valid hour
      And User Input valid minute
      And User tap pm button
      And User tap ok button to enter time
      And User tap start collecting answers button
        Then User success to add new checkin



