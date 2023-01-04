@Positive-Edit_Comment-Feature
Feature: Functional edit comment

  Background:1.Cicle-staging app already installed on phone
             2.User must already sign in into app
             3.User must be entered into Sekolah QA Headquarter Page
             4.User must be entered into Div Cilsy Teams Page

  @Positive-Edit_Comment-01
  Scenario: User edit comment with input text in tell your comment field
    Given Navigate user to checkin page
      When User tap one of question detail
        And User tap three dot button in comment details
        And User tap edit comment button
        And User tap tell your story field
        And User input text in tell your story field
        And User tap submit button
          Then User success to edit comment

  @Positive-Edit_Comment-02
  Scenario:User edit comment with mention user by selecting the user manually
    Given Navigate user to checkin page
      When User tap one of question detail
        And User tap three dot button in comment details
        And User tap edit comment button
        And User tap tell your story field
        And User tap mention button
        And Select the user to mention
        And User tap submit button
          Then User success to edit comment

  @Positive-Edit_Comment-03
  Scenario:Verify text in bold format using bold buttons
    Given Navigate user to checkin page
      When User tap one of question detail
        And User tap three dot button in comment details
        And User tap edit comment button
        And User tap tell your story field
        And User input text in tell your story fields
        And User tap bold button
        And User tap submit button
          Then User success to edit comment

  @Positive-Edit_Comment-04
  Scenario:Verify text in italic format using italic buttons
    Given Navigate user to checkin page
      When User tap one of question detail
        And User tap three dot button in comment details
        And User tap edit comment button
        And User tap tell your story field
        And User input text in tell your story fields
        And User tap italic button
        And User tap submit button
          Then User success to edit comment

  @Positive-Edit_Comment-05
  Scenario:Verify text in strikethrough format using strikethrought buttons
    Given Navigate user to checkin page
      When User tap one of question detail
        And User tap three dot button in comment details
        And User tap edit comment button
        And User tap tell your story field
        And User input text in tell your story fields
        And User tap strikethrought button
        And User tap submit button
          Then User success to edit comment

  @Positive-Edit_Comment-06
  Scenario:Verify the ordered list format function by input text in tell your story field
    Given Navigate user to checkin page
      When User tap one of question detail
        And User tap three dot button in comment details
        And User tap edit comment button
        And User tap tell your story field
        And User input text in tell your story field
        And  User tap ordered list button
        And User tap submit button
          Then User success to edit comment

  @Positive-Edit_Comment-07
  Scenario:Verify the unordered list format function by input text in tell your story field
    Given Navigate user to checkin page
      When User tap one of question detail
        And User tap three dot button in comment details
        And User tap edit comment button
        And User tap tell your story field
        And User input text in tell your story field
        And User tap unordered list option button
        And User tap one of the menus in the drop-down menu
        And User tap submit button
          Then User success to edit comment

  @Positive-Edit_Comment-08
  Scenario:Verify insert files with add image function by uploading a supported image
    Given Navigate user to checkin page
      When User tap one of question detail
        And User tap three dot button in comment details
        And User tap edit comment button
        And User tap tell your story field
        And User input text in tell your story field
        And User tap insert button
        And User tap add image button
        And User tap by upload button
        And User select image from files
        And User tap submit button
          Then User success to edit comment

  @Positive-Edit_Comment-09
  Scenario: User edit comments with insert files with add image function by valid url
    Given Navigate user to checkin page
      When User tap one of question detail
        And User tap three dot button in comment details
        And User tap edit comment button
        And User tap insert button
        And User tap add image button
        And User tap by url button
        And User tap Insert link here field
        And Usert input valid url
        And User tap insert url button
        And User tap submit button
          Then User success to edit comment