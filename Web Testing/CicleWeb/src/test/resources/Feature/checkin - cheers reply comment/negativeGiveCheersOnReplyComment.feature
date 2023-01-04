@Negative-Give_Cheers_On_Reply_Comment-Feature
Feature: Functional give cheers on reply comment

  Background:1.User already open chrome browser
             2.User access "https://staging.cicle.app"
             3.User must already sign in into app
             4.User must be entered into Sekolah QA Cilsy Headquarter Page
             5.User must be entered into Div Cilsy Teams Page

  @Negative-Give_Cheers_On_Reply_Comment-01
  Scenario:User give cheers on reply comment by input empty text in cheers field
    Given Navigate user to checkin page
      When User click one of question detail
        And User click reply comment button
        And User click cheers button on reply comment
        And User click cheers field
        And User input empty text in cheers field
        And User click checklist cheers button
          Then User failed to give cheers

  @Negative-Give_Cheers_On_Reply_Comment-02
  Scenario:User give cheers on reply comment by input empty text using spaces button as character in cheers field
    Given Navigate user to checkin page
      When User click one of question detail
        And User click reply comment button
        And User click cheers button on reply comment
        And User click cheers field
        And User input empty text using spaces button as character in cheers field
        And User click checklist cheers button
          Then User failed to give cheers