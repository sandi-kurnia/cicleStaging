@Positive-Give_Cheers_On_Comment-Feature
Feature: Functional give cheers on comment

  Background:1.Cicle-staging app already installed on phone
             2.User must already sign in into app
             3.User must be entered into Sekolah QA Headquarter Page
             4.User must be entered into Div Cilsy Teams Page

  @Positive-Give_Cheers_On_Comment-01
  Scenario: User give cheers on comment without input text in cheers field
    Given Navigate user to checkin page
    When User tap one of question detail
    And User tap cheers button
    And User tap cheers field
    And User tap checklist cheers button
    Then User failed to give cheers

  Scenario: User give cheers on comment with input empty text using spaces button as character in cheers field
    Given Navigate user to checkin page
    When User tap one of question detail
    And User tap cheers button
    And User tap cheers field
    And User input empty text using spaces button as character on cheers field
    And User tap checklist cheers button
    Then User failed to give cheers