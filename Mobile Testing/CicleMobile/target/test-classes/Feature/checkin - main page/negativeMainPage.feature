@Negative-Main_Page_Checkin-Feature
Feature: Functional main page checkin

  Background:1.Cicle-staging app already installed on phone
             2.User must already sign in into app
             3.User must be entered into Sekolah QA Headquarter Page
             4.User must be entered into Div Cilsy Teams Page

  @Negative-Main_Page_Checkin-01
  Scenario: Verify swipe right on main page
    Given Navigate user to checkin page
      When User swipe right in checkin page
        Then User can't swipe right in main page