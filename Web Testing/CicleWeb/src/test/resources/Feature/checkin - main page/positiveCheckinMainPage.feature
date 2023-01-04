@Positive-Main_Page_Checkin-Feature
Feature: Functional main page checkin

  Background:1.User already open chrome browser
             2.User access "https://staging.cicle.app"
             3.User must already sign in into app
             4.User must be entered into Sekolah QA Cilsy Headquarter Page
             5.User must be entered into Div Cilsy Teams Page

  @Positive-Main_Page_Checkin-01
  Scenario: User verify create checkin button
    Given Navigate user to checkin page
      When User click create checkin button
        Then Direct user to create checkin page

  @Positive-Main_Page_Checkin-02
  Scenario: User verify dropdown menu button on the upper left side
    Given Navigate user to checkin page
      When User click dropdown menu on the upper left side
        Then Showing several menu in dropdown option
      When User click checkin button in dropdown menu
        Then Direct user to checkin page

  @Positive-Main_Page_Checkin-03
  Scenario: User verify its questions can be open
    Given Navigate user to checkin page
      When User click one of question detail
        Then direct user to question detail


