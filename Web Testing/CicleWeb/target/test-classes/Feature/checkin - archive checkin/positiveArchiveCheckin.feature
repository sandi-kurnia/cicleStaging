@Positive-Archive_Checkin-Feature
Feature: Functional archive checkin

  Background:1.User already open chrome browser
             2.User access "https://staging.cicle.app"
             3.User must already sign in into app
             4.User must be entered into Sekolah QA Cilsy Headquarter Page
             5.User must be entered into Div Cilsy Teams Page

  @Positive-Archive_Checkin-01
  Scenario:User archive checkin
    Given Navigate user to checkin page
      When User click one of question detail
        And User click three dot button
          Then User get dialog box to edit or archive this question
      When User click archive question button
        Then User success to archive checkin
