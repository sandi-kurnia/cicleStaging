@Positive-Edit_Checkin-Feature
Feature: Functional edit checkin

  Background:1.Cicle-staging app already installed on phone
             2.User must already sign in into app
             3.User must be entered into Sekolah QA Headquarter Page
             4.User must be entered into Div Cilsy Teams Page

  @Positive-Edit_Checkin-01
  Scenario: User edits checkin by changing the question type
    Given Navigate user to checkin page
      When User tap one of question detail
        And User tap three dot button
        And User tap edit button
        And User tap type your question field
        And User input text in type your question field
        And User tap save changes button
          Then User success to update new checkin

  @Positive-Edit_Checkin-02
  Scenario: User edits checkin by changing the days
    Given Navigate user to checkin page
      When User tap one of question detail
        And User tap three dot button
        And User tap edit button
        And User tap type your question field
        And User input text in type your question field
        And User set other day
        And User tap save changes button
          Then User success to update new checkin

  @Positive-Edit_Checkin-03
  Scenario: User edits checkin by changing time
    Given Navigate user to checkin page
      When User tap one of question detail
        And User tap three dot button
        And User tap edit button
        And User tap type your question field
        And User input text in type your question field
        And User set other day
        And User tap set time button
        And User tap switch to input time mode
        And User Input valid hour
        And User Input valid minute
        And User tap pm button
        And User tap ok button to enter time
        And User tap save changes button
          Then User success to update new checkin

  @Positive-Edit_Checkin-04
  Scenario: User edits checkin by unselect all member companies to be notified
    Given Navigate user to checkin page
      When User tap one of question detail
        And User tap three dot button
        And User tap edit button
        And User tap add member button
        And User tap 2 times in select all checkbox to deselect
        And User tap done button
        Then User can view that notified member not appears
        And User tap save changes button
          Then User success to update new checkin

  @Positive-Edit_Checkin-05
  Scenario: User edits checkin by changing to private only
    Given Navigate user to checkin page
      When User tap one of question detail
        And User tap three dot button
        And User tap edit button
        And User tap switch button to private
        And User tap save changes button
          Then User success to update new checkin

  @Positive-Edit_Checkin-06
  Scenario: User cancel to edits checkin
    Given Navigate user to checkin page
      When User tap one of question detail
        And User tap three dot button
        And User tap edit button
        And User tap type your question field
        And User input text in type your question field
        And User set other day
        And User tap set time button
        And User tap switch to input time mode
        And User Input valid hour
        And User Input valid minute
        And User tap pm button
        And User tap ok button to enter time
        And User tap cancel button to edit checkin
      Then User success to cancel edit checkin

