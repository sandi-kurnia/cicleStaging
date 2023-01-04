@Negative-Edit_Comment-Feature
Feature: Functional edit comment

  Background:1.Cicle-staging app already installed on phone
             2.User must already sign in into app
             3.User must be entered into Sekolah QA Headquarter Page
             4.User must be entered into Div Cilsy Teams Page

  @Negative-Edit_Comment-01
  Scenario: User edit comment with delete text in type your story field without input text
    Given Navigate user to checkin page
      When User tap one of question detail
        And User tap three dot button in comment details
        And User tap edit comment button
        And User tap tell your story field
        And User delete text in tell your story field
        And User tap submit button
          Then User failed to edit comment

  @Negative-Edit_Comment-02
  Scenario: User edit comment with input empty text using space button as character in tell your story field
    Given Navigate user to checkin page
      When User tap one of question detail
        And User tap three dot button in comment details
        And User tap edit comment button
        And User tap tell your story field
        And User delete text in tell your story field
        And User input empty text using spaces button as empty character in type your question field
        And User tap submit button
          Then User failed to edit comment

  @Negative-Edit_Comment-03
  Scenario: User edit comment with add image by invalid url
    Given Navigate user to checkin page
      When User tap one of question detail
        And User tap three dot button in comment details
        And User tap edit comment button
        And User tap tell your story field
        And User tap insert button
        And User tap add image button
        And User tap by url button
        And User tap Insert link here field
        And Usert input invalid url
        And User tap insert url button
          Then User failed add image by invalid url

  @Negative-Edit_Comment-04
  Scenario: User edit comment with add file by invalid url
    Given Navigate user to checkin page
      When User tap one of question detail
        And User tap three dot button in comment details
        And User tap edit comment button
        And User tap tell your story field
        And User tap insert button
        And User tap add file button
        And User tap by url button
        And User tap Insert link here field
        And Usert input invalid url
        And User tap insert url button
          Then User failed add file by invalid url

  @Negative-Edit_Comment-05
  Scenario: User edit comment with add video by invalid url
    Given Navigate user to checkin page
      When User tap one of question detail
        And User tap three dot button in comment details
        And User tap edit comment button
        And User tap tell your story field
        And User tap insert button
        And User tap add video button
        And User tap by url button
        And User tap Insert link here field
        And Usert input invalid url
        And User tap insert url button
          Then User failed add video by invalid url