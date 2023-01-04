@Negative-Edit_Checkin-Feature
Feature: Functional Edit Checkin

  Background:1.Cicle-staging app already installed on phone
             2.User must already sign in into app
             3.User must be entered into Sekolah QA Headquarter Page
             4.User must be entered into Div Cilsy Teams Page

  @Negative-Edit_Checkin-01
  Scenario: User edits checkin by changing the question type with input empty text
    Given Navigate user to checkin page
      When User tap one of question detail
        And User tap three dot button
        And User tap edit button
        And User tap type your question field
        And User input empty text in type your question field
        And User tap save changes button
          Then User get pop up alert question must be filled

  @Negative-Edit_Checkin-02
  Scenario: User edits checkin by changing the question type with input empty text using space button as character
    Given Navigate user to checkin page
      When User tap one of question detail
        And User tap three dot button
        And User tap edit button
        And User tap type your question field
        And User input empty text using spaces button as empty character in type your question field
        And User tap save changes button
          Then User get pop up alert question must be filled

  @Negative-Edit_Checkin-03
  Scenario: User edits checkin by adding already notified members
    Given Navigate user to checkin page
      When User tap one of question detail
        And User tap three dot button
        And User tap edit button
        And User tap add member button
        And User select member already notified
        And User tap done button
          Then User can view that users who have been added cannot be added back

