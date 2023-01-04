@Positive-Archive_Checkin-Feature
Feature: Functional Archive Checkin

  Background:1.Cicle-staging app already installed on phone
             2.User must already sign in into app
             3.User must be entered into Sekolah QA Headquarter Page
             4.User must be entered into Div Cilsy Teams Page

  @Positive-Archive_Checkin-01
  Scenario: User archive checkin by clicking yes button
    Given Navigate user to checkin page
      When User tap one of question detail
        And User tap three dot button
        And User tap archive button
        And User tap yes to archive question
          Then User success to archive checkin

  @Positive-Archive_Checkin-02
  Scenario: User cancel archive checkin by clicking cancel button
    Given Navigate user to checkin page
      When User tap one of question detail
        And User tap three dot button
        And User tap archive button
        And User tap cancel to archive
          Then User success to archive checkin
