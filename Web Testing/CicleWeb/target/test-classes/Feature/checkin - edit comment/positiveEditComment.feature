@Positive-Edit_Comment-Feature
Feature: Functional edit comment
  Background:1.User already open chrome browser
             2.User access "https://staging.cicle.app"
             3.User must already sign in into app
             4.User must be entered into Sekolah QA Cilsy Headquarter Page
             5.User must be entered into Div Cilsy Teams Page

  @Positive-Edit_Comment-01
  Scenario:User edit comment by input text in tell your story field
    Given Navigate user to checkin page
      When User click one of question detail
        And User click three dot button in the comment details
        And User click edit comment button
        And User click tell your story field
        And User delete previous text in tell your story field
        And User input text in tell your story field
        And User click post button
          Then User success to edits comment

  @Positive-Edit_Comment-02
  Scenario:Verify text in bold format using bold buttons
    Given Navigate user to checkin page
      When User click one of question detail
        And User click three dot button in the comment details
        And User click edit comment button
        And User click tell your story field
        And User delete previous text in tell your story field
          Then Users can view that showing several menus in the tell your story field
      When User click bold button
        And User input text in tell your story field
          Then Users can view the text changes to bold format
      When User click post button
          Then User success to edits comment

  @Positive-Edit_Comment-03
  Scenario:Verify text in italic format using italic buttons
    Given Navigate user to checkin page
      When User click one of question detail
        And User click three dot button in the comment details
        And User click edit comment button
        And User click tell your story field
        And User delete previous text in tell your story field
          Then Users can view that showing several menus in the tell your story field
      When User click italic button
        And User input text in tell your story field
          Then Users can view the text changes to italic format
      When User click post button
          Then User success to edits comment

  @Positive-Edit_Comment-04
  Scenario:Verify text in strikethrough format using strikethrought buttons
    Given Navigate user to checkin page
      When User click one of question detail
      And User click three dot button in the comment details
      And User click edit comment button
      And User click tell your story field
      And User delete previous text in tell your story field
        Then Users can view that showing several menus in the tell your story field
    When User click strikethrough button
      And User input text in tell your story field
        Then Users can view the text changes to strikethrough format
    When User click post button
        Then User success to edits comment

  @Positive-Edit_Comment-05
  Scenario:Verify text with background color using background color buttons
    Given Navigate user to checkin page
      When User click one of question detail
        And User click three dot button in the comment details
        And User click edit comment button
        And User click tell your story field
        And User delete previous text in tell your story field
          Then Users can view that showing several menus in the tell your story field
      When User click background color button
        And User click a background color
        And User input text in tell your story field
          Then Users can view that there is a background color in the text
      When User click post button
          Then User success to edits comment

  @Positive-Edit_Comment-06
  Scenario:Verify text font size format using font size buttons
    Given Navigate user to checkin page
      When User click one of question detail
        And User click three dot button in the comment details
        And User click edit comment button
        And User click tell your story field
        And User delete previous text in tell your story field
          Then Users can view that showing several menus in the tell your story field
      When User click font size button
        And User clicks a font size
        And User input text in tell your story field
          Then Users can view that there is a font size changed
      When User click post button
          Then User success to edits comment

  @Positive-Edit_Comment-07
  Scenario:Verify the ordered list format function by input text in tell your story field
    Given Navigate user to checkin page
      When User click one of question detail
        And User click three dot button in the comment details
        And User click edit comment button
        And User click tell your story field
        And User delete previous text in tell your story field
          Then Users can view that showing several menus in the tell your story field
      When User click tell your story field
        And User input text in tell your story field
        And User click ordered list button
          Then Users can view that an ordered list can start with the number 1
      When User click post button
          Then User success to edits comment

  @Positive-Edit_Comment-08
  Scenario:Verify the drop-down unordered list function by input text in the tell your story field
    Given Navigate user to checkin page
      When User click one of question detail
        And User click three dot button in the comment details
        And User click edit comment button
        And User click tell your story field
        And User delete previous text in tell your story field
          Then Users can view that showing several menus in the tell your story field
      When User click tell your story field
        And User input text in tell your story field
        And User click unordered list option button
        And Users clicks on one of the menus in the drop-down menu
          Then Users can view an unordered list format is shown
      When User click post button
          Then User success to edits comment

  @Positive-Edit_Comment-09
  Scenario:Verify insert files function by input supported in the tell your story field
    Given Navigate user to checkin page
      When User click one of question detail
        And User click three dot button in the comment details
        And User click edit comment button
        And User click tell your story field
        And User delete previous text in tell your story field
          Then Users can view that showing several menus in the tell your story field
      When User click insert files button
        And Users upload supported files
          Then Users can view that files successfully to upload
      When User click cheklist button
        And User click insert button to upload
          Then Users can view that file is shown in tell your story field
      When User click post button
          Then User success to edits comment

  @Positive-Edit_Comment-10
  Scenario:Verify insert files by valid url
    Given Navigate user to checkin page
      When User click one of question detail
        And User click three dot button in the comment details
        And User click edit comment button
        And User click tell your story field
        And User delete previous text in tell your story field
          Then Users can view that showing several menus in the tell your story field
      When User click insert files button
        And Users click by url button
        And User input valid link
        And User click add button below url field
          Then Users can view that files successfully to upload
      When User click cheklist button
        And User click insert button to upload
          Then Users can view that file is shown in tell your story field
      When User click post button
          Then User success to edits comment

  @Positive-Edit_Comment-11
  Scenario:Verify insert image by upload supported image
    Given Navigate user to checkin page
      When User click one of question detail
        And User click three dot button in the comment details
        And User click edit comment button
        And User click tell your story field
        And User delete previous text in tell your story field
          Then Users can view that showing several menus in the tell your story field
        And User click more rich button
        And User click insert image button
        And Users upload supported image
        And User click post button
          Then User success to edits comment

  @Positive-Edit_Comment-12
  Scenario:Verify insert image by input image using valid url
    Given Navigate user to checkin page
      When User click one of question detail
        And User click three dot button in the comment details
        And User click edit comment button
        And User click tell your story field
        And User delete previous text in tell your story field
          Then Users can view that showing several menus in the tell your story field
        And User click more rich button
        And User click insert image button
        And Users click image by url button
        And User input valid url to upload image
        And User click insert button below url field
        And User click post button
          Then User success to edits comment

  @Positive-Edit_Comment-13
  Scenario:Verify insert video by upload supported video
    Given Navigate user to checkin page
      When User click one of question detail
        And User click three dot button in the comment details
        And User click edit comment button
        And User click tell your story field
        And User delete previous text in tell your story field
          Then Users can view that showing several menus in the tell your story field
        And User click more rich button
        And User click insert video button
        And User click by upload video button
        And Users upload supported video
        And User click post button
          Then User success to edits comment

  @Positive-Edit_Comment-14
  Scenario:Verify insert video by valid video url
    Given Navigate user to checkin page
      When User click one of question detail
        And User click three dot button in the comment details
        And User click edit comment button
        And User click tell your story field
        And User delete previous text in tell your story field
          Then Users can view that showing several menus in the tell your story field
        And User click more rich button
        And User click insert video button
        And User input valid video url
        And User click insert video button below url field
        And User click post button
          Then User success to edits comment

  @Positive-Edit_Comment-15
  Scenario:User cancels to edit comment
    Given Navigate user to checkin page
      When User click one of question detail
        And User click three dot button in the comment details
        And User click edit comment button
        And User click tell your story field
        And User delete previous text in tell your story field
        And User input text in tell your story field
        And User clicks the cancel button
          Then User can view the dialog box to add a comment is closed