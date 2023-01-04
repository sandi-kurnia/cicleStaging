@Positive-Give_Cheers_On_Comment-Feature
Feature: Functional give cheers on comment

  Background:1.User already open chrome browser
             2.User access "https://staging.cicle.app"
             3.User must already sign in into app
             4.User must be entered into Sekolah QA Cilsy Headquarter Page
             5.User must be entered into Div Cilsy Teams Page

@Positive-Give_Cheers_On_Comment-01
  Scenario:User give cheers on comment by input text in tell your story field
    Given Navigate user to checkin page
      When User click one of question detail
        And User click cheers button
        And User click cheers field
        And User input text in cheers field
        And User click checklist cheers button
          Then User success to give cheers

  @Positive-Give_Cheers_On_Comment-02
  Scenario:User give cheers on comment by input emoticon
    Given Navigate user to checkin page
      When User click one of question detail
        And User click cheers button
        And User click cheers field
        And User click emoticon on cheers button
        And User click people button on cheers button
        And User click emoticon
        And User click checklist cheers button
          Then User success to give cheers

  @Positive-Give_Cheers_On_Comment-03
  Scenario:User cancel give cheers on comment
    Given Navigate user to checkin page
    When User click one of question detail
    And User click cheers button
    And User click cheers field
    And User input text in cheers field
    And User click cancel cheklist cheers button
    Then User can view that cheers field is closed