@Negative-Edit_Comment-Feature
Feature: Functional edit comment

  Background:1.User already open chrome browser
             2.User access "https://staging.cicle.app"
             3.User must already sign in into app
             4.User must be entered into Sekolah QA Cilsy Headquarter Page
             5.User must be entered into Div Cilsy Teams Page

  @Negative-Edit_Comment-01
  Scenario:User edit comment with input empty text in tell your story field
    Given Navigate user to checkin page
      When User click one of question detail
        And User click three dot button in the comment details
        And User click edit comment button
        And User click tell your story field
        And User delete previous text in tell your story field
        And User input empty text in tell your story field
        And User click post button
          Then User failed to add new comment

  @Negative-Edit_Comment-02
  Scenario:User edit comment with input empty text using space button as empty character in tell your story field
    Given Navigate user to checkin page
      When User click one of question detail
        And User click three dot button in the comment details
        And User click edit comment button
        And User click tell your story field
        And User delete previous text in tell your story field
        And User click tell your story field
        And User input empty text using space button as empty character in tell your story field
        And User click post button
          Then User failed to edit comment using space button as empty character

  @Negative-Edit_Comment-03
  Scenario:Verify insert files function by input unsupported in the tell your story field
    Given Navigate user to checkin page
      When User click one of question detail
        And User click three dot button in the comment details
        And User click edit comment button
        And User click tell your story field
          Then Users can view that showing several menus in the tell your story field
      When User click insert files button
        And Users upload unsupported files
          Then Users can view that files failed to upload

  @Negative-Edit_Comment-04
  Scenario:Verify insert files by input invalid url
    Given Navigate user to checkin page
      When User click one of question detail
        And User click three dot button in the comment details
        And User click edit comment button
        And User click tell your story field
          Then Users can view that showing several menus in the tell your story field
      When User click insert files button
        And Users click by url button
        And User input invalid link
        And User click add button below url field
          Then Users can view that url is invalid

  @Negative-Edit_Comment-05
  Scenario:Verify insert image by upload unsupported image
    Given Navigate user to checkin page
      When User click one of question detail
        And User click three dot button in the comment details
        And User click edit comment button
        And User click tell your story field
          Then Users can view that showing several menus in the tell your story field
        And User click more rich button
        And User click insert image button
        And Users upload unsupported image
          Then Users can view that image file type is invalid

  @Negative-Edit_Comment-06
  Scenario:Verify insert image by input invalid url
    Given Navigate user to checkin page
      When User click one of question detail
        And User click three dot button in the comment details
        And User click edit comment button
        And User click tell your story field
          Then Users can view that showing several menus in the tell your story field
        And User click more rich button
        And User click insert image button
        And Users click image by url button
        And User input invalid url to upload image
        And User click insert button below url field
          Then Users can view that Image cannot be loaded from the passed link

  @Negative-Edit_Comment-07
  Scenario:Verify insert video by upload unsupported video
    Given Navigate user to checkin page
      When User click one of question detail
        And User click three dot button in the comment details
        And User click edit comment button
        And User click tell your story field
          Then Users can view that showing several menus in the tell your story field
        And User click more rich button
        And User click insert video button
        And User click by upload video button
        And Users upload unsupported video
          Then User get notif something went wrong please try again later

  @Negative-Edit_Comment-08
  Scenario:Verify insert video by input invalid video url
    Given Navigate user to checkin page
      When User click one of question detail
        And User click three dot button in the comment details
        And User click edit comment button
        And User click tell your story field
          Then Users can view that showing several menus in the tell your story field
        And User click more rich button
        And User click insert video button
        And User input invalid video url
        And User click insert video button below url field
          Then User get notif something went wrong please try again later