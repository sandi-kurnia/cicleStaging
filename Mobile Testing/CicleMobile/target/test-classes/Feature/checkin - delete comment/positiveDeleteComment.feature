@Positive-Delete_Comment-Feature
Feature: Functional delete comment
  Background:1.Cicle-staging app already installed on phone
             2.User must already sign in into app
             3.User must be entered into Sekolah QA Headquarter Page
             4.User must be entered into Div Cilsy Teams Page

  @Positive-Delete_Comment-01
  Scenario:User delete comment
    Given Navigate user to checkin page
      When User tap one of question detail
        And User tap three dot button in comment details
        And User tap archive button
        And User tap yes to archive
          Then User success to archive comment

  @Positive-Delete_Comment-02
  Scenario: User cancel delete comment by clicking cancel button
    Given Navigate user to checkin page
      When User tap one of question detail
        And User tap three dot button in comment details
        And User tap archive button
        And User tap cancel to archive
          Then User success to cancel archive