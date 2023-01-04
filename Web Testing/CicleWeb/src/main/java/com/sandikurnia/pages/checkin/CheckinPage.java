package com.sandikurnia.pages.checkin;

import com.sandikurnia.base.testBase;
import com.sun.org.apache.bcel.internal.generic.DREM;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class CheckinPage extends testBase {


    public CheckinPage(){
        driver.navigate().to("https://staging.cicle.app/companies/61eba2c85080f47b25ddc8f8/teams/638db4454a7205eb1b2ca415/check-ins/638db4464a7205eb1b2ca494");
    }

//_______________________________________________________________________________________________________________________________//
//                                                  MAIN PAGE                                                                  //
//_______________________________________________________________________________________________________________________________//

    By titlePageCreateACheckIn = By.xpath("//*[contains(text(),'Create a Check-in')]");

    By titleMainPageCheckin = By.xpath("//*[contains(text(),'Check-ins')]");
    By dropDownButtonOnTheUpperLeftSide = By.xpath("//*[contains(@data-testid,'KeyboardArrowDownIcon')]");

    By checkInButtonInDropDownMenu = By.xpath("/descendant::p[text()='Check In'][2]");

    By dialogBoxDropDownButton = By.xpath("/descendant::div[@class='OverlayButton_container__3kxDV']");

    By titleOfQuestionDetailPage = By.xpath("/descendant::div[@class='GeneralSubNavBar_title__1h5lc']/child::node()/h1");
//_______________________________________________________________________________________________________________________________//
//                                                  ADD CHECKIN                                                                  //
//_______________________________________________________________________________________________________________________________//

//Button
        By createCheckInBtn = By.xpath("//*[contains(@data-testid,'AddIcon')]");
    //--How often do you want to ask?
        By selectAllDay = By.xpath("//*[contains(@class,'DayBox_container__2GPGE')]");
        By mondayBtn = By.xpath("//*[contains(text(),'Mon')]");
        By tuesdayBtn = By.xpath("//*[contains(text(),'Tue')]");
        By wednesdayBtn = By.xpath("//*[contains(text(),'Wed')]");
        By thursdayBtn = By.xpath("//*[contains(text(),'Thu')]");
        By fridayBtn = By.xpath("//*[contains(text(),'Fri')]");
        By saturdayBtn = By.xpath("//*[contains(text(),'Sat')]");
        By sundayBtn = By.xpath("//*[contains(text(),'Sun')]");

    //--What time?
        By clockBtn = By.xpath("//*[contains(@data-testid,'ClockIcon')]");
        By AMBtn = By.xpath("//*[contains(text(),'AM')]");
        By PMBtn = By.xpath("//*[contains(text(),'PM')]");

    //--Who do you wanna be notified?
        By addWhoDoYouWannaBeNotifiedBtn = By.xpath("//*[contains(@data-testid,'AddIcon')]");
        By doneAddRemoveSubscribersBtn = By.xpath("//*[contains(text(),'Done')]");
        By personalMember1 = By.xpath("//*[contains(@class,'ManageSubscribersContainer_ManageSubscribersContainer__body__3lbqx')]/div[1]");

        By personalMember2 = By.xpath("//*[contains(@class,'ManageSubscribersContainer_ManageSubscribersContainer__body__3lbqx')]/div[2]/child::node()[2]");
        By selectAllButton = By.xpath("//*[contains(@class,'ManageSubscribersContainer_ManageSubscribersContainer__SelectAll__1eO7d')]/div");

    //Is the question for private only?
        By privateBtn = By.xpath("//*[contains(@name,'switchItem')]");

    //Start collecting answers or Cancel
        By startCollectingAnswerBtn = By.xpath("//*[contains(text(),'Start collecting answers')]");
        By cancelCollectingAnswerBtn = By.xpath("//*[contains(text(),'Cancel')]");

//Field
    //--What question do you want to ask?
        By typeYourQuestionField = By.xpath("//*[contains(@placeholder,'Type your question..')]");

    //--What time?
        By whatTimeField = By.xpath("//*[contains(@placeholder,'hh:mm (a|p)m')]");

//Assertion
        By dialogBoxAddRemoveSubs = By.xpath("//*[contains(text(),'Add/Remove Subscribers')]");
        By subsSuccesToAdd = By.xpath("//*[contains(@class,'MuiAvatar-root MuiAvatar-circular css-1q3klxg')]/img");

        By getNotifTypeYourQuestionField = By.xpath("//*[contains(text(),'Type your question cannot be empty')]");
        By getNotifCreateQuestionSuccessful = By.xpath("//*[contains(text(),'Create question successful')]");


//_______________________________________________________________________________________________________________________________//
//                                                  EDIT CHECKIN                                                                 //
//_______________________________________________________________________________________________________________________________//
    //OneOfCheckInDetails
    By personalCheckin = By.xpath("//*[contains(@class,'infinite-scroll-component ')]/a[1]/div/div");

    //Button
    By threeDotBtn = By.xpath("//*[contains(@data-testid,'MoreHorizIcon')]");

    By editBtn = By.xpath("//*[contains(@data-testid,'EditIcon')]");


    By saveChangesBtn = By.xpath("//*[contains(text(),'Save Changes')]");
    By cancelChangesBtn = By.xpath("//*[contains(text(),'Cancel')]");

//Field

    //Assertion
    By dialogBoxMenuThreeDot = By.xpath("//*[contains(@class,'BoxPopOver_BoxPopOver__1vCj0')]");
    By notifUpdateQuestionSuccess = By.xpath("//*[contains(text(),'Update question successful')]");


//_______________________________________________________________________________________________________________________________//
//                                                  Archive Checkin                                                              //
//_______________________________________________________________________________________________________________________________//

    //Button
    By ArchiveThisQuestionBtn = By.xpath("//*[contains(@class,'QuestionMenu_menu__3nDO6')][2]/child::node()");


    //Assert
    By notifArchiveQuestionSuccessful = By.xpath("//*[contains(text(),'Archive Question successful')]");
    By thisQuestionIsArchivedNotif = By.xpath("//*[contains(text(),'This question is archived')]");

    By thisQuestionAlreadyArchiveInDialogBox =  By.xpath("//*[contains(text(),'This question is already archived')]");


//_______________________________________________________________________________________________________________________________//
//                                                     ADD COMMENT                                                               //
//_______________________________________________________________________________________________________________________________//

//Button
    By postBtn = By.xpath("//*[contains(text(),'Post')]");
    By cancelBtnComment = By.xpath("//*[contains(text(),'Cancel')]");

    //Several Menu In tell your story field

    By boldBtn = By.xpath("//*[contains(@data-cmd,'bold')]");
    By italicBtn = By.xpath("//*[contains(@data-cmd,'italic')]");
    By strikeThroughBtn = By.xpath("//*[contains(@data-cmd,'strikeThrough')]");
    By backgroundColorBtn = By.xpath("//*[contains(@data-cmd,'backgroundColor')]");

        //color
            By yellowCollor = By.xpath("//*[contains(@data-param1,'#FAC51C')]");

    By fontSizeBtn = By.xpath("//*[contains(@data-cmd,'fontSize')]");
    By moreTextBtn = By.xpath("//*[contains(@data-cmd,'moreText')]");
    By orderedListBtn = By.xpath("//*[contains(@data-cmd,'formatOLSimple')]");
    By unorderedListBtn = By.xpath("//*[contains(@class,'fr-btn-wrap')]");
    By getUnorderedListDropDownBtn = By.xpath("//*[contains(@data-cmd,'formatULOptions')]");
    By moreParagraphBtn = By.xpath("//*[contains(@data-cmd,'moreParagraph')]");
    By emoticonsBtn = By.xpath("//*[contains(@data-cmd,'emoticons')]");
    By insertFilesBtn = By.xpath("//*[contains(@data-cmd,'insertFiles')]");
    By insertLinkBtn = By.xpath("//*[contains(@data-cmd,'insertLink')]");
    By moreRichBtn = By.xpath("//*[contains(@data-cmd,'moreRich')]");
        By insertImageBtn = By.xpath("//*[contains(@data-cmd,'insertImage')]");
        By insertVideoBtn = By.xpath("//*[contains(@data-cmd,'insertVideo')]");
            By uploadVideo = By.xpath("//*[contains(@data-cmd,'videoUpload')]");


            By videoByUrlBtn = By.xpath("//*[contains(@data-cmd,'videoByURL')]");
            By uploadvideUrlField = By.xpath("/descendant::input[@type='text']");

            By insertVideoButtonBelowUrlField = By.xpath("//*[contains(@data-cmd,'videoInsertByURL')]");

        By uploadFileBtn = By.xpath("//*[contains(@data-cmd,'insertFile')]");

    By checklistFilesBtn = By.xpath("/descendant::div[@class='fr-file-item-insert-checkbox fr-files-checkbox-line'][1]");

    By insertFilesBtnToUpload = By.xpath("/descendant::button[@data-cmd='imageInsertByUpload'][1]");



    //By insertImageBtnToUpload = By.xpath("/descendant::input[@type='file'][2]");

    By byUrlBtn = By.xpath("//*[contains(@data-cmd,'filesByURL')]");

    By imageByURL = By.xpath("//*[contains(@data-cmd,'imageByURL')]");

    By addButtonBelowUrl = By.xpath("//*[contains(@data-cmd,'filesInsertByURL')]");

    By insertImageButtonBelowUrl = By.xpath("//*[contains(@data-cmd,'imageInsertByURL')]");



//Field
    By addNewCommentField = By.xpath("//*[contains(@placeholder,'Add new comment...')]");

    By tellYourStoryHereField = By.xpath("//*[contains(@class,'fr-element fr-view')]");

    By tellYourStoryHereField2 = By.xpath("//*[contains(@class,'fr-element fr-view')]");

    By inputFiles = By.xpath("//*[contains(@type,'file')]");

    By inputFileByUrlField = By.xpath("//*[contains(@class,'fr-input-line fr-by-url-padding')]/child::node()[1]");
    By inputImageByUrlField = By.xpath("//*[contains(@class,'fr-input-line')]/child::node()[1]");






//Assertion

    By createCommentOnCheckInQuestionSuccessful = By.xpath("//*[contains(text(),'Create comment on checkIn question successful')]");

    By textChangesToBoldFormatInTellYourStoryField = By.xpath(" //*[contains(@class,'fr-wrapper')]/child::node()[1]/p/strong");

    By textChangesToItalicFormatInTellYourStoryField = By.xpath(" //*[contains(@class,'fr-wrapper')]/child::node()[1]/p/em");

    By textChangesToStrikethroughFormatInTellYourStoryField = By.xpath("//*[contains(@class,'fr-view')]/p/s");

    By textHaveBackgroundColorInTellYourStoryField = By.xpath("//*[contains(@style,'background-color: rgb(250, 197, 28);')]");

    By textFontSizeChangeInTellYourStoryField = By.xpath("//*[contains(@style,'font-size: 96px;')]/parent::node()[1]/node()[2]");
    By orderedListIsShownInTellYourStoryField = By.xpath("//*[contains(@class,'fr-view')]/ol/li");
    By unOrderedListIsShownInTellYourStoryField = By.xpath("//*[contains(@class,'fr-view')]/ul/li");

    By inputFilesInTellYourStoryField = By.xpath("//*[contains(@class,'fr-element fr-view')]/p/img");

        By uploadedFiles = By.xpath("/descendant::div[@class='fr-file-item-description'][1]");

        By failedToUpload = By.xpath("//*[contains(text(),'Error during file upload.')]");

        By invalidUrl = By.xpath("//*[contains(text(),'Url entered is invalid. Please try again.')]");

    By textsuccessShowingBoldFormatinAddComment = By.xpath("//*[contains(@class,'fr-view')]/p/strong");

    By textsuccessShowingItalicFormatinAddComment = By.xpath("//*[contains(@class,'fr-view')]/p/em");

    By textsuccessShowingStrikeThroughFormatinAddComment = By.xpath("//*[contains(@class,'fr-view')]/p/s");

    By textsuccessShowingFormatSizeInAddComment = By.xpath("/descendant::div[@class='CommentItem_commentTextContainer__8Gd1V'][1]/child::node()/p/span");

    By textsuccessShowingOrderedListInAddComment = By.xpath("/descendant::div[@class='fr-view'][1]/ol/li");

    By textsuccessShowingUnorderedListInAddComment = By.xpath("/descendant::ul[@style='list-style-type: square;'][1]");

    By textsuccessShowingWithInsertFilesInAddAComment = By.xpath("/descendant::div[@class='fr-view'][1]/p/img");

    By imageFileTypeIsInvalid = By.xpath("//*[contains(text(),'Image file type is invalid.')]");

    By imageCannotBeLoadedFromthePassedLink = By.xpath("//*[contains(text(),'Image cannot be loaded from the passed link.')]");

    By somethingWentWrongPleaseTryAgainLater = By.xpath("//*[contains(text(),'Something went wrong. Please try again.')]");


//_______________________________________________________________________________________________________________________________//
//                                                     REPLY COMMENT                                                               //
//_______________________________________________________________________________________________________________________________//

//BUTTON
    By replyCommentBtn = By.xpath("/descendant::a[@class='LinkNoDecor_Link__3DEkL'][1]");

//Assertion
    By getNotifCreateDiscussionOnCheckInCommentSuccessful = By.xpath("//*[contains(text(),'Create discussion on checkIn comment successful')]");



// EDIT COMMENT

    By threeDotBtnOnCommentDetails = By.xpath("//descendant::div[@class='More_container__2VGML'][1]");

    By editCommentBtn = By.xpath("//*[contains(@data-testid,'ModeEditOutlineOutlinedIcon')]");

    By getNotifUpdateCommentSuccess = By.xpath("//*[contains(text(),'Update comment on checkIn question successful')]");

//CHEERS ON COMMENT
    By cheersCommentBtn = By.xpath("//*[contains(@class,'CheersButton_container__3mdsQ')]/child::node()");

        By cheersField = By.xpath("//*[contains(@class,'CheersButton_content__1mYd4')]/child::node()/input");

        By emoticonCheersBtn = By.xpath("//*[contains(@data-testid,'InsertEmoticonIcon')]");

        By smilePeopleBtn = By.xpath("/descendant::button[@class='icn-smileys_people active']");

        By emoticon = By.xpath("/descendant::img[@src='https://cdn.jsdelivr.net/npm/emoji-datasource-apple@6.0.1/img/apple/64/1f600.png'][2]");

    By checklistCheersBtn = By.xpath("//*[contains(@data-testid,'CheckCircleOutlineIcon')]");
    By cancellistCheersBtn = By.xpath("//*[contains(@data-testid,'HighlightOffIcon')]");

    By getNotifCreateCheersOnQuestionCommentSuccessful = By.xpath("//*[contains(text(),'Create cheers on question comment successful')]");

    By getNotifCheersCannotBeEmpty = By.xpath("//*[contains(text(),'Cheer cannot be empty')]");

    By getNotifCreateCheersOnQuestionDiscussionSuccessful = By.xpath("//*[contains(text(),'Create cheers on question discussion successful')]");


    //DELETE COMMENT
    By deleteCommentBtn = By.xpath("//*[contains(@data-testid,'DeleteOutlineOutlinedIcon')]");

    By deletePopUpCommentBtn = By.xpath("/descendant::button[@class='Main_container__3r1Cm'][2]");
    By cancelDeletePopUpCommentBtn = By.xpath("/descendant::button[@class='Main_container__3r1Cm'][1]");

    By getNotifDeleteCommentOnCheckInQuestionSuccessful = By.xpath("//*[contains(text(),'Delete comment on checkIn question successful')]");

//CHEERS ON REPLY COMMENT
    By cheersOnReplyCommentButton = By.xpath("/descendant::div[@class='CheersButton_buttonCheers__2mJix'][2]");


//_______________________________________________________________________________________________________________________________//
//                                                  ADD CHECKIN ACTION                                                           //
//_______________________________________________________________________________________________________________________________//
    public void userClickCreateCheckInBtn(){
        driver.findElement(createCheckInBtn).click();
    }

    public void userClickTypeYourQuestionField(){
        driver.findElement(typeYourQuestionField).click();
    }

    public void userInputTextInTypeYourQuestionField(){
        driver.findElement(typeYourQuestionField).sendKeys("Cilsy Fiolution Test V1");
    }

    public void userInputEmptyTextInTypeYourQuestionField(){
        driver.findElement(typeYourQuestionField).sendKeys("");
    }

    public void userInputEmptyTextUsingSpaceButtonAsCharacterInTypeYourQuestionField(){
        driver.findElement(typeYourQuestionField).sendKeys(" ");
    }

    public void userSetADay(){
        driver.findElement(mondayBtn).click();
        driver.findElement(mondayBtn).click();
    }

    public void userSetAllDay(){

        for (int i = 1; i < driver.findElements(selectAllDay).toArray().length; i++)
        {
            driver.findElements(selectAllDay).get(i).click();
        }
    }

    public void userClickWhatATimeField(){
        driver.findElement(whatTimeField).click();
        driver.findElement(whatTimeField).sendKeys(Keys.chord(Keys.COMMAND,"a"));
        driver.findElement(whatTimeField).sendKeys(Keys.DELETE);
    }
    public void userInputTime(){
        driver.findElement(whatTimeField).sendKeys("10:00 PM");
    }

    public void userInputInvalidTime(){
        driver.findElement(whatTimeField).sendKeys("10000s");
    }

    public void userClicAddMemberToNotifiedBtn(){
        driver.findElement(addWhoDoYouWannaBeNotifiedBtn).click();
    }

    public void clickPrivateBtn(){
        driver.findElement(privateBtn).click();
    }

    public void userClickStartCollectingAnswerBtn(){
        driver.findElement(startCollectingAnswerBtn).click();
    }

    public void userGetNotifCreateQuestionSuccessful(){
        driver.findElement(getNotifCreateQuestionSuccessful).isDisplayed();
        driver.close();

    }

    public void userGetDialogBoxToAddOrRemoveSubs(){
        driver.findElement(dialogBoxAddRemoveSubs).isDisplayed();
    }

    public void userClickPersonalSubs1(){
        driver.findElement(personalMember1).click();
    }
    public void userClickPersonalSubs2(){
        driver.findElement(personalMember2).click();
    }

    public void userClickDoneBtn(){
        driver.findElement(doneAddRemoveSubscribersBtn).click();
    }

    public void userCanViewThatSubsSuccesToAdd(){
        driver.findElement(subsSuccesToAdd).isDisplayed();
    }

    public void userSelectAllCheckboxBtn()throws Exception{
        Thread.sleep(3000);
        driver.findElement(selectAllButton).click();
    }

    public void userGetNotifTypeYourQuestionCannotBeEmpty(){
        driver.findElement(getNotifTypeYourQuestionField).isDisplayed();

    }

//_______________________________________________________________________________________________________________________________//
//                                                  EDIT CHECKIN  ACTION                                                         //
//_______________________________________________________________________________________________________________________________//

    public void userClickOneOfCheckInDetails(){
        driver.findElement(personalCheckin).click();
    }
    public void userClickThreeDotBtn(){
        driver.findElement(threeDotBtn).click();
    }
    public void userGetDialogBoxMenuThreeDot(){
        driver.findElement(dialogBoxMenuThreeDot).isDisplayed();
    }

    public void userClickEditBtn(){
        driver.findElement(editBtn).click();
    }

    public void userClickSaveChangeBtn(){
        driver.findElement(saveChangesBtn).click();
    }
    public void userClickCancelBtn(){
        driver.findElement(cancelChangesBtn).click();
    }

    public void userGetNotifUpdateQuestionSuccess()throws Exception{
        driver.findElement(notifUpdateQuestionSuccess).isDisplayed();
        Thread.sleep(3000);
        driver.quit();
    }

    public boolean userCanViewsThatPageEditedIsClosed(){
        try
        {
            if(driver.findElement(By.xpath("//*[contains(text(),'[EDITED]')]")).isDisplayed())
            {
                return false;
            }
            return false;
        }
        catch(Exception e)
        {
            driver.quit();
            System.out.println("No element displayed");
            return true;
        }
    }


//_______________________________________________________________________________________________________________________________//
//                                                  ARCHIVE CHECKIN ACTION                                                             //
//_______________________________________________________________________________________________________________________________//

    public void userClickArchiveQuestionBtn(){
        driver.findElement(ArchiveThisQuestionBtn).click();
    }

    public void userGetNotifPopUpArchiveQuestionSuccessful(){
        driver.findElement(notifArchiveQuestionSuccessful).isDisplayed();
    }

    public void userGetThisQuestionIsArchivedNotif(){
        driver.findElement(thisQuestionIsArchivedNotif).isDisplayed();
    }

    public void userGetQuestionAlreadyArchivedInDialogBox(){
        driver.findElement(thisQuestionAlreadyArchiveInDialogBox).isDisplayed();
        driver.quit();
    }

//_______________________________________________________________________________________________________________________________//
//                                                  ADD COMMENT ACTION                                                             //
//_______________________________________________________________________________________________________________________________//

    public void userClickAddNewCommentField(){
        driver.findElement(addNewCommentField).click();
    }
    public void userClickTellYourStoryHereField(){
        driver.findElement(tellYourStoryHereField).click();
    }
    public void userInpuTextInTellYourStoryHereField(){
        driver.findElement(tellYourStoryHereField).sendKeys("Hello !! V1");
    }

    public void userInputEmptyTextInTellYourStoryHereField(){
        driver.findElement(tellYourStoryHereField).sendKeys("");
    }

    public void userInputEmptyTextUsingSpaceBtnAsCharacterInTellYourStoryHereField(){
        driver.findElement(tellYourStoryHereField).sendKeys(" ");
    }

    public void userClickPostBtn(){
        driver.findElement(postBtn).click();
    }

    public void userGetNotifCreateCommentOnCheckInQuestionSuccessful()throws Exception{
        driver.findElement(createCommentOnCheckInQuestionSuccessful).isDisplayed();
        Thread.sleep(3000);
        driver.quit();
    }

    public boolean userFailedToAddNewComments(){
        try
        {
            if(driver.findElement(By.xpath("//*[contains(text(),'Create comment on checkIn question successful')]")).isDisplayed())
            {
                return false;
            }
            return false;
        }
        catch(Exception e)
        {
            driver.quit();
            System.out.println("No element displayed");
            return true;
        }
    }

    public void ShowingSeveralMenusInTheTellYourStoryField(){
        driver.findElement(boldBtn).isDisplayed();
        driver.findElement(italicBtn).isDisplayed();
        driver.findElement(strikeThroughBtn).isDisplayed();
        driver.findElement(backgroundColorBtn).isDisplayed();
        driver.findElement(fontSizeBtn).isDisplayed();
        driver.findElement(moreTextBtn).isDisplayed();
        driver.findElement(orderedListBtn).isDisplayed();
        driver.findElement(unorderedListBtn).isDisplayed();
        driver.findElement(moreParagraphBtn).isDisplayed();
        driver.findElement(emoticonsBtn).isDisplayed();
        driver.findElement(insertFilesBtn).isDisplayed();
        driver.findElement(insertLinkBtn).isDisplayed();
        driver.findElement(moreRichBtn).isDisplayed();
    }

    public void userClickBoldBtn(){
        driver.findElement(boldBtn).click();
    }

    public void userClickItalicBtn(){
        driver.findElement(italicBtn).click();
    }

    public void userClickStrikeThroughBtn(){
        driver.findElement(strikeThroughBtn).click();
    }

    public void userClickBackgroundColorBtn(){
        driver.findElement(backgroundColorBtn).click();
    }

        public void userClickOneOfColorBtn(){
        driver.findElement(yellowCollor).click();
    }

    public void userClickFontSizeBtn(){
        driver.findElement(fontSizeBtn).click();
    }

    public void userClickAFont()throws Exception{
        for (int i = 1; i < driver.findElements(fontSizeBtn).toArray().length; i++)
        {
            driver.findElements(fontSizeBtn).get(i).click();
            Thread.sleep(4000);
            driver.findElement(fontSizeBtn).click();
            Thread.sleep(3000);
        }
    }

    public void userClickOrderedListBtn(){
        driver.findElement(orderedListBtn).click();
    }

    public void userClickUnorderedListOptionBtn(){
        driver.findElement(getUnorderedListDropDownBtn).click();
    }
    public void userClickOneOfUnorderedListOptionBtn() throws Exception{
        for (int i = 1; i < driver.findElements(By.xpath("/descendant::a[@data-cmd='formatUL']")).toArray().length; i++)
        {
            driver.findElements(By.xpath("/descendant::a[@data-cmd='formatUL']")).get(i).click();
            Thread.sleep(4000);
            driver.findElement(getUnorderedListDropDownBtn).click();
            Thread.sleep(3000);
        }

    }

    public void userClickInsertBtn(){
        driver.findElement(insertFilesBtn).click();

    }
    public void userClickInsertImageBtn(){
        driver.findElement(insertImageBtn).click();
    }
    public void userClickMoreRichBtn(){
        driver.findElement(moreRichBtn).click();
    }

    public void userInputSupportedFiles(){
        driver.findElement(inputFiles).sendKeys("/Users/sandikurnia/SekolahQA/Intern - Cilsy Fiolution/Web Testing/CicleWeb/src/filetest/AndroidStudio.png");
    }

    public void userInputSupportedImage(){
        driver.findElement(inputFiles).sendKeys("/Users/sandikurnia/SekolahQA/Intern - Cilsy Fiolution/Web Testing/CicleWeb/src/filetest/AndroidStudio.png");
    }

    public void userInputUnSupportedImage(){
        driver.findElement(inputFiles).sendKeys("/Users/sandikurnia/SekolahQA/Intern - Cilsy Fiolution/Web Testing/CicleWeb/src/filetest/testvideomp4.mp4");
    }

    public void userInputUnupportedFiles(){
        driver.findElement(inputFiles).sendKeys("/Users/sandikurnia/SekolahQA/Intern - Cilsy Fiolution/Web Testing/CicleWeb/src/filetest/videoTest.mov");
    }

    public void clickByUrlButton(){
        driver.findElement(byUrlBtn).click();
    }

    public void clickImageByUrlButton(){
        driver.findElement(imageByURL).click();
    }

    public void inputFilesByValidUrl(){
        driver.findElement(inputFileByUrlField).sendKeys("https://www.garmin.co.id/minisite/instinct/instinct-onepiece/images/onepiece-kv-luffy.png");
    }

    public void inputFilesByInvalidUrl(){
        driver.findElement(inputFileByUrlField).sendKeys("Ini bukan URL");
    }

    public void inputImageByValidURL(){
        driver.findElement(inputImageByUrlField).sendKeys("https://www.garmin.co.id/minisite/instinct/instinct-onepiece/images/onepiece-kv-luffy.png");
    }
    public void inputImageByInValidURL(){
        driver.findElement(inputImageByUrlField).sendKeys("Ini Bukan Url");
    }
    public void clickAddButtonBelowUrl(){
        driver.findElement(addButtonBelowUrl).click();
    }

    public void clickInsertImageButtonBelowUrl(){
        driver.findElement(insertImageButtonBelowUrl).click();
    }

        public void usersCanViewThatFilesSuccessfullyToUpload(){
            driver.findElement(uploadedFiles).isDisplayed();
        }

    public void userClickChecklistBtn(){
        driver.findElement(checklistFilesBtn).click();
    }

    public void userClickInsertFilesBtnToUpload(){
        driver.findElement(insertFilesBtnToUpload).click();
    }

    public void usersCanViewTheTextChangesToBoldFormatsInTellYourStoryField(){
        driver.findElement(textChangesToBoldFormatInTellYourStoryField).isDisplayed();
    }

    public void usersCanViewTheTextChangesToItalicFormatsInTellYourStoryField(){
        driver.findElement(textChangesToItalicFormatInTellYourStoryField).isDisplayed();
    }

    public void usersCanViewTheTextChangesToStrikeThroughFormatsInTellYourStoryField(){
        driver.findElement(textChangesToStrikethroughFormatInTellYourStoryField).isDisplayed();
    }

    public void usersCanViewFontSizeChangedInTellYourStoryField(){
        driver.findElement(textFontSizeChangeInTellYourStoryField).isDisplayed();
    }

    public void usersCanViewThatThereIsABackgroundColorInTheText(){
        driver.findElement(textHaveBackgroundColorInTellYourStoryField).isDisplayed();
    }

    public void usersCanViewThatThereIsAnOrderedListInTheTellYourStoryField(){
        driver.findElement(orderedListIsShownInTellYourStoryField).isDisplayed();
    }

    public void usersCanViewThatThereIsAnUnorderedListInTheTellYourStoryField(){
        driver.findElement(unOrderedListIsShownInTellYourStoryField).isDisplayed();
    }

    public void usersCanViewThatFilesIsShownInTheTellYourStoryField(){
        driver.findElement(inputFilesInTellYourStoryField).isDisplayed();
    }

    public void usersCanViewThatFilesIsFailedToUploadInTheTellYourStoryField()throws Exception{
        driver.findElement(failedToUpload).isDisplayed();
        Thread.sleep(3000);
        driver.quit();
    }

    public void usersCanViewThatIsInvalidURL()throws Exception{
        driver.findElement(invalidUrl).isDisplayed();
        Thread.sleep(3000);
        driver.quit();
    }


    public void userSuccessToAddANewCommentWithFormatBoldText()throws Exception{
        driver.findElement(createCommentOnCheckInQuestionSuccessful).isDisplayed();
        driver.findElement(textsuccessShowingBoldFormatinAddComment);
        Thread.sleep(3000);
        driver.quit();
    }

    public void userSuccessToAddANewCommentWithFormatItalicText()throws Exception{
        driver.findElement(createCommentOnCheckInQuestionSuccessful).isDisplayed();
        driver.findElement(textsuccessShowingItalicFormatinAddComment);
        Thread.sleep(3000);
        driver.quit();
    }

    public void userSuccessToAddANewCommentWithFormatStrikethroughText()throws Exception{
        driver.findElement(createCommentOnCheckInQuestionSuccessful).isDisplayed();
        driver.findElement(textsuccessShowingStrikeThroughFormatinAddComment);
        Thread.sleep(3000);
        driver.quit();
    }

    public void userSuccessToAddANewCommentWithFormatBackgroundColorInTheText()throws Exception{
        driver.findElement(createCommentOnCheckInQuestionSuccessful).isDisplayed();
        driver.findElement(textHaveBackgroundColorInTellYourStoryField);
        Thread.sleep(3000);
        driver.quit();
    }

    public void userSuccessAddANewCommentWithTheSelectedTextFontSize()throws Exception{
        driver.findElement(createCommentOnCheckInQuestionSuccessful).isDisplayed();
        driver.findElement(textsuccessShowingFormatSizeInAddComment);
        Thread.sleep(3000);
        driver.quit();
    }

    public void usersSuccessAddANewCommentWithOrderedListText()throws Exception{
        driver.findElement(createCommentOnCheckInQuestionSuccessful).isDisplayed();
        driver.findElement(textsuccessShowingOrderedListInAddComment);
        Thread.sleep(3000);
        driver.quit();
    }

    public void usersSuccessAddANewCommentWithUnorderedListText()throws Exception {
        driver.findElement(createCommentOnCheckInQuestionSuccessful).isDisplayed();
        driver.findElement(textsuccessShowingUnorderedListInAddComment);
        Thread.sleep(3000);
        driver.quit();
    }

    public void usersSuccessfullyAddANewCommentWithSupportedFiles()throws Exception {
        driver.findElement(createCommentOnCheckInQuestionSuccessful).isDisplayed();
        Thread.sleep(3000);
        driver.findElement(textsuccessShowingWithInsertFilesInAddAComment);
        driver.quit();
    }

//_______________________________________________________________________________________________________________________________//
//                                                  ADD COMMENT ACTION                                                             //
//_______________________________________________________________________________________________________________________________//

    public void userClickReplyCommentBtn(){
        driver.findElement(replyCommentBtn).click();
    }

    public void userGetNotifCreateDisscussionOnCheckinCommentSuccessful(){
        driver.findElement(getNotifCreateDiscussionOnCheckInCommentSuccessful).isDisplayed();
        driver.quit();
    }

    public void clickInsertVideoBtn(){
        driver.findElement(insertVideoBtn).click();
    }

    public void clickUploadVideo(){
        driver.findElement(uploadVideo).click();
    }
    public void uploadVideo(){
        driver.findElement(inputFiles).sendKeys("/Users/sandikurnia/SekolahQA/Intern - Cilsy Fiolution/Web Testing/CicleWeb/src/filetest/testvideomp4.mp4");
    }
    public void uploadUnsupportedVideo(){
        driver.findElement(inputFiles).sendKeys("/Users/sandikurnia/SekolahQA/Intern - Cilsy Fiolution/Web Testing/CicleWeb/src/filetest/videoTest.mov");
    }

    public void clickVideoByUrlBtn(){
        driver.findElement(videoByUrlBtn).click();
    }

    public void InputVideoByUrl(){
        driver.findElement(uploadvideUrlField).click();
        driver.findElement(uploadvideUrlField).sendKeys("https://www.youtube.com/watch?v=EngW7tLk6R8");
    }

    public void inputInvalidVideoByUrl(){
        driver.findElement(uploadvideUrlField).click();
        driver.findElement(uploadvideUrlField).sendKeys("cicle");
    }
    public void clickInsertVideoButtonBelowUrlField(){
        driver.findElement(insertVideoButtonBelowUrlField).click();
    }

    public void userCanViewThatImageTypeIsInvalid(){
        driver.findElement(imageFileTypeIsInvalid).isDisplayed();
    }

    public void userCanViewThatImageCannotBeLoadedFromThePassedLink (){
        driver.findElement(imageCannotBeLoadedFromthePassedLink).isDisplayed();
    }

    public void userCanViewSomethingWentWrongPleaseTryAgainLater (){
        driver.findElement(somethingWentWrongPleaseTryAgainLater).isDisplayed();
    }

    public boolean userCanViewsThatPageAddCommentIsClosed(){
        try
        {
            if(driver.findElement(By.xpath("//*[contains(@class,'fr-element fr-view')]/p")).isDisplayed())
            {
                return false;
            }
            return false;
        }
        catch(Exception e)
        {
            driver.quit();
            System.out.println("No element displayed");
            return true;
        }
    }

    // EDIT COMMENT

    public void userClickThreeDotButtonOnCommentDetails(){
        driver.findElement(threeDotBtnOnCommentDetails).click();
    }

    public void userClickEditCommentBtn(){
        driver.findElement(editCommentBtn).click();
    }

    public void userGetNotifUpdateCommentSuccess(){
        driver.findElement(getNotifUpdateCommentSuccess).isDisplayed();
    }

    public void deletePreviousTextInTellYourStoryField(){
        driver.findElement(tellYourStoryHereField).sendKeys(Keys.chord(Keys.COMMAND,"a"));
        driver.findElement(tellYourStoryHereField).sendKeys(Keys.DELETE);
    }

    //CHEERS ON COMMENT

    public void userClickCheersOnCommentBtn(){
        driver.findElement(cheersCommentBtn).click();
    }

    public void userClickCheersField(){
        driver.findElement(cheersField).click();
    }

    public void inputTextInCheersField(){
        driver.findElement(cheersField).sendKeys("Mantap");
    }
        public void inputEmptyTextUsingSpaceButtonAsCharacter(){
            driver.findElement(cheersField).sendKeys(" ");
        }
        public void inputEmptyTextOnCheersField(){
            driver.findElement(cheersField).sendKeys("");
        }
    public void userClickChecklistCheersBtn(){
        driver.findElement(checklistCheersBtn).click();
    }

    public void userClickCancelChecklistCheersBtn(){
        driver.findElement(cancellistCheersBtn).click();
    }

    public boolean userCanViewThatCheersFieldIsClosed(){
        try {
            if (driver.findElement(getNotifCreateCheersOnQuestionCommentSuccessful).isDisplayed()) {
                return false;
            }
            return false;
        } catch (Exception e) {
            driver.quit();
            System.out.println("No element displayed");
            return true;
        }
    }

    public void userClickEmoticonOnCheersBtn(){
        driver.findElement(emoticonCheersBtn).click();
    }

    public void userClickSmilePeopleButton(){
        driver.findElement(smilePeopleBtn).click();
    }
    public void userClickEmoticon(){
        driver.findElement(emoticon).click();
    }

    public void userGetNotifCreateCheersOnQuestionCommentSuccessful(){
        driver.findElement(getNotifCreateCheersOnQuestionCommentSuccessful).isDisplayed();
    }


    //DELETE COMMENT

    public void userClickDeleteBtn(){
        driver.findElement(deleteCommentBtn).click();
    }

    public void showingPopUpDeleteComment(){
        driver.findElement(deletePopUpCommentBtn).isDisplayed();
        driver.findElement(cancelDeletePopUpCommentBtn).isDisplayed();

    }

    public void userClickDeleteToDeleteCommentButton(){
        driver.findElement(deletePopUpCommentBtn).click();
    }

    public void userclickCancelToDeleteCommentButton(){
        driver.findElement(cancelDeletePopUpCommentBtn).click();
    }

    public void userGetNotifDeleteCommentOnCheckInQuestionSuccessful(){
        driver.findElement(getNotifDeleteCommentOnCheckInQuestionSuccessful).isDisplayed();
    }

    public boolean dialogBoxToDeleteCommentIsClosed() {
        try {
            if (driver.findElement(By.xpath("//*[contains(@id,'alert-dialog-title')]")).isDisplayed()) {
                return false;
            }
            return false;
        } catch (Exception e) {
            driver.quit();
            System.out.println("No element displayed");
            return true;
        }
    }

    public void userGetNotifCheersCannotBeEmpty(){
        driver.findElement(getNotifCheersCannotBeEmpty).isDisplayed();
    }

// CHEERS ON REPLY COMMENT

    public void clickCheersOnReplyComment(){
        driver.findElement(cheersOnReplyCommentButton).click();
    }

    public void userGetNotifCheersOnQuestionDiscusstionIsSuccessful(){
        driver.findElement(getNotifCreateCheersOnQuestionDiscussionSuccessful).isDisplayed();
    }

// MAIN PAGE

    public void userCanViewCreateQuestionCheckInPage(){
        driver.findElement(titlePageCreateACheckIn).isDisplayed();
    }

    public void userCanViewCheckInMainPage(){
            driver.findElement(titleMainPageCheckin).isDisplayed();
    }
    public void userClickDropDownButtonOnTheUpperLeftSide(){
            driver.findElement(dropDownButtonOnTheUpperLeftSide).click();
    }

    public void userClickCheckinButtonInDropDownMenu(){
            driver.findElement(checkInButtonInDropDownMenu).click();
    }

    public void userCanViewSeveralMenuInDropDownButton(){
            driver.findElement(dialogBoxDropDownButton).isDisplayed();
    }

    public void userCanViewThatQuestionDetilPage(){
        driver.findElement(titleOfQuestionDetailPage).isDisplayed();
    }


}
