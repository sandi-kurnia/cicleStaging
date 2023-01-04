@Positive-Edit_Checkin-Feature
Feature: Functional edit checkin

  Background:1.User already open chrome browser
             2.User access "https://staging.cicle.app"
             3.User must already sign in into app
             4.User must be entered into Sekolah QA Cilsy Headquarter Page
             5.User must be entered into Div Cilsy Teams Page

  @Positive-Edit_Checkin-01
  Scenario:User edit checkin by input new text in type your question field
    Given Navigate user to checkin page
      When User click one of question detail
        And User click three dot button
          Then User get dialog box to edit or archive this question
      When User click edit button
        And User click type your question field
        And User delete previous text in type your question field
        And User input new text in type your question field
        And User click save changes button
          Then User succes to update checkin

  @Positive-Edit_Checkin-02
  Scenario:User edit checkin by adding all day
    Given Navigate user to checkin page
      When User click one of question detail
        And User click three dot button
          Then User get dialog box to edit or archive this question
      When User click edit button
        And User select all day
        And User click save changes button
          Then User succes to update checkin

  @Positive-Edit_Checkin-03
  Scenario:User edit checkin by adding new subscriber
    Given Navigate user to checkin page
      When User click one of question detail
        And User click three dot button
          Then User get dialog box to edit or archive this question
      When User click edit button
        And User click add button to wanna be notified
          Then User get dialog box to add or remove subscriber
      When User click checkbox button to add new subscriber
        And User click done button
          Then User can view that subscriber success to add
      When User click save changes button
          Then User succes to update checkin

  @Positive-Edit_Checkin-04
  Scenario:User edit checkin by adding all subscriber
    Given Navigate user to checkin page
      When User click one of question detail
        And User click three dot button
          Then User get dialog box to edit or archive this question
      When User click edit button
        And User click add button to wanna be notified
          Then User get dialog box to add or remove subscriber
      When User click select all user checkbox button
        And User click done button
          Then User can view that subscriber success to add
      When User click save changes button
          Then User succes to update checkin

  @Positive-Edit_Checkin-05
  Scenario:User edit checkin by set check in as private
    Given Navigate user to checkin page
      When User click one of question detail
        And User click three dot button
          Then User get dialog box to edit or archive this question
      When User click edit button
        And User click private button
        And User click save changes button
          Then User succes to update checkin

  @Positive-Edit_Checkin-06
  Scenario:User cancels to edit checkin
    Given Navigate user to checkin page
      When User click one of question detail
        And User click three dot button
          Then User get dialog box to edit or archive this question
       When User click edit button
        And User click type your question field
        And User delete previous text in type your question field
        And User input new text in type your question field
        And User click cancel changes button
          Then User can view that page edited is closed