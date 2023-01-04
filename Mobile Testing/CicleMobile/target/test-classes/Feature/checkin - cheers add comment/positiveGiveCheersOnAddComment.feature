@Positive-Give_Cheers_On_Comment-Feature
Feature: Functional Add Comment

  Background:1.Cicle-staging app already installed on phone
  2.User must already sign in into app
  3.User must be entered into Sekolah QA Headquarter Page
  4.User must be entered into Div Cilsy Teams Page

  @Positive-Give_Cheers_On_Comment-01
  Scenario: User give cheers on comment with input text in cheers field
    Given Navigate user to checkin page
    When User tap one of question detail
      And User tap cheers button
      And User tap cheers field
      And User input text in cheers field
      And User tap checklist cheers button
        Then User success to give cheers on comment

  @Positive-Give_Cheers_On_Comment-02
  Scenario: User cancel give cheers on comment
    Given Navigate user to checkin page
      When User tap one of question detail
        And User tap cheers button
        And User tap cheers field
        And User input text in cheers field
        And User tap cancel cheers button
          Then User can view that dialog cheers box is closed