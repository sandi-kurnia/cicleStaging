@Positive-Main_Page_Checkin-Feature
Feature: Functional main page checkin

  Background:1.Cicle-staging app already installed on phone
             2.User must already sign in into app
             3.User must be entered into Sekolah QA Headquarter Page
             4.User must be entered into Div Cilsy Teams Page

  @Positive-Main_Page_Checkin-01
  Scenario: Verify create checkin button on main page
    Given Navigate user to checkin page
      When User tap create checkin button
        Then Direct user to create checkin page

  @Positive-Main_Page_Checkin-02
  Scenario: Verify scroll down on main page
    Given Navigate user to checkin page
      When User scroll down in checkin page
        Then User able to scroll down in checkin page

  @Positive-Main_Page_Checkin-03
  Scenario: Verify scroll up on main page
    Given Navigate user to checkin page
      When User scroll up in checkin page
        Then User able to scroll up in checkin page

  @Positive-Main_Page_Checkin-04
  Scenario: Verify swipe left on main page
    Given Navigate user to checkin page
      When User swipe left in checkin page
        Then User able to check swipe left in main page

  @Positive-Main_Page_Checkin-05
  Scenario: Verify Back Button on main page
    Given Navigate user to checkin page
      When User tap button on the upper left side
        Then Success direct user to overview page

  @Positive-Main_Page_Checkin-06
  Scenario: Verify dropdown menu in upper right side on main page
    Given Navigate user to checkin page
      When User click dropdown option menu on the upper right side
        And User scroll down to checkin menu
        And User tap checkin button
          Then Success direct user to checkin checkin page
