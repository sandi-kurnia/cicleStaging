package com.sandikurnia.stepDef;

import com.sandikurnia.base.testBase;

import com.sandikurnia.pages.checkin.CheckinPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class CheckinStepDef extends testBase {

    CheckinPage checkin;

    @Given("Navigate user to checkin page")
    public void navigateUserToCheckInPage() throws Exception{
    initialization();
    checkin = new CheckinPage();
    Thread.sleep(3000);
    }

    @When("User click create checkin button")
    public void userClickCreateCheckinButton() {
       checkin.userClickCreateCheckInBtn();
    }

    @And("User click type your question field")
    public void userClickTypeYourQuestionField() {
     checkin.userClickTypeYourQuestionField();
    }

    @And("User input text in type your question field")
    public void userInputTextInTypeYourQuestionField() {
        checkin.userInputTextInTypeYourQuestionField();
    }

    @And("User input empty text in type your question field")
    public void userInputEmptyTextInTypeYourQuestionField() {
        checkin.userInputEmptyTextInTypeYourQuestionField();
    }
    @And("User input empty text using space button as empty character in type your question field")
    public void userInputEmptyTextUsingSpaceButtonAsEmptyCharacterInTypeYourQuestionField() {
        checkin.userInputEmptyTextUsingSpaceButtonAsCharacterInTypeYourQuestionField();
    }

    @And("User set a day")
    public void userSetADay() {
        checkin.userSetADay();

    }

    @And("User click time field")
    public void userClickTimeField() throws Exception{
        checkin.userClickWhatATimeField();
        Thread.sleep(3000);
    }

    @And("User input valid time")
    public void userInputValidTime() throws Exception{
        checkin.userInputTime();
    }

    @And("User input invalid time")
    public void userInputInvalidTime() {
        checkin.userInputInvalidTime();
    }

    @And("User click add button to wanna be notified")
    public void userClickAddButtonToWannaBeNotified() {
        checkin.userClicAddMemberToNotifiedBtn();
    }


    @And("User click private button")
    public void userClickPrivateButton() {
        checkin.clickPrivateBtn();
    }

    @And("User click Start collecting answers button")
    public void userClickStartCollectingAnswersButton() {
        checkin.userClickStartCollectingAnswerBtn();
    }

    @Then("User success to add new checkin")
    public void userSuccessToAddNewCheckin() throws Exception{
        checkin.userGetNotifCreateQuestionSuccessful();
        Thread.sleep(3000);
    }


    @Then("User failed to add new checkin")
    public boolean userFailedToAddNewCheckin() {
        try
        {
            if(driver.findElement(By.xpath("//*[contains(text(),'Create question successful')]")).isDisplayed())
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


    @Then("User get dialog box to add or remove subscriber")
    public void userGetDialogBoxToAddOrRemoveSubscriber() {
        checkin.userGetDialogBoxToAddOrRemoveSubs();
    }

    @When("User click checkbox button to add subscriber")
    public void userClickCheckboxButtonToAddSubscriber() {
        checkin.userClickPersonalSubs1();
    }

    @And("User click done button")
    public void userClickDoneButton() {
        checkin.userClickDoneBtn();
    }

    @Then("User can view that subscriber success to add")
    public void userCanViewThatSubscriberSuccessToAdd() {
        checkin.userCanViewThatSubsSuccesToAdd();
    }

    @And("User select all day")
    public void userSelectAllDay() {
        checkin.userSetAllDay();
    }


    @Then("User failed to add new checkin with input empty text using space button as character")
    public void userFailedToAddNewCheckinWithInputEmptyTextUsingSpaceButtonAsCharacter() {
        checkin.userGetNotifTypeYourQuestionCannotBeEmpty();
       driver.quit();
    }

    @When("User click select all user checkbox button")
    public void userClickSelectCheckboxButton() throws Exception {
        checkin.userSelectAllCheckboxBtn();
    }


//EDIT CHECKIN
    @When("User click one of question detail")
    public void userClickOneOfCheckin() throws Exception {
        Thread.sleep(4000);
        checkin.userClickOneOfCheckInDetails();
}
    @And("User click three dot button")
    public void userClickThreeDotButton() {
        checkin.userClickThreeDotBtn();
    }

    @Then("User get dialog box to edit or archive this question")
    public void userGetDialogBoxToEditOrArchiveThisQuestion() {
        checkin.userGetDialogBoxMenuThreeDot();
    }

    @When("User click checkbox button to add new subscriber")
    public void userClickCheckboxButtonToAddNewSubscriber(){
        checkin.userClickPersonalSubs2();
    }

    @When("User click edit button")
    public void userClickEditButton() {
        checkin.userClickEditBtn();
    }

    @And("User delete previous text in type your question field")
    public void userDeletePreviousTextInTypeYourQuestionField() {
        driver.findElement(By.xpath("//*[contains(@placeholder,'Type your question..')]")).sendKeys(Keys.chord(Keys.COMMAND,"a"));
        driver.findElement(By.xpath("//*[contains(@placeholder,'Type your question..')]")).sendKeys(Keys.DELETE);
    }

    @And("User input new text in type your question field")
    public void userInputNewTextInTypeYourQuestionField() {
        checkin.userInputTextInTypeYourQuestionField();
    }

    @And("User click save changes button")
    public void userClickSaveChangesButton() {
        checkin.userClickSaveChangeBtn();
    }
    @And("User click cancel changes button")
    public void userClickCancelButton() {
        checkin.userClickCancelBtn();
    }

    @Then("User succes to update checkin")
    public void userSuccesToUpdateCheckin() throws Exception{
        checkin.userGetNotifUpdateQuestionSuccess();
    }
    @Then("User failed to update checkin")
    public void userFailedToUpdateCheckin() {
        checkin.userGetNotifTypeYourQuestionCannotBeEmpty();
        driver.quit();
    }

    @Then("User can view that page edited is closed")
    public boolean userCanViewThatPageEditedIsClosed() {
        checkin.userCanViewsThatPageEditedIsClosed();
        return false;
    }

    @And("Users click by url button")
    public void usersClickByUrlButton() {
        checkin.clickByUrlButton();
    }

    @And("User input valid link")
    public void userInputValidLink() {
        checkin.inputFilesByValidUrl();
    }

    @And("User input valid url to upload image")
    public void userInputValidUrlToUploadImage() {
        checkin.inputImageByValidURL();
    }
    @And("User click insert button below url field")
    public void userClickInsertButtonBelowUrlField() {
        checkin.clickInsertImageButtonBelowUrl();
    }

    @And("User click add button below url field")
    public void userClickAddButtonBelowUrlField() {
        checkin.clickAddButtonBelowUrl();
    }

    @And("User input invalid link")
    public void userInputInvalidLink() {
        checkin.inputFilesByInvalidUrl();
    }
//ARCHIVE CHEKIN

    @When("User click archive question button")
    public void userClickArchiveQuestionButton() {
        checkin.userClickArchiveQuestionBtn();
    }

    @Then("User success to archive checkin")
    public void userSuccessToArchiveCheckin() {
        checkin.userGetNotifPopUpArchiveQuestionSuccessful();
        checkin.userGetThisQuestionIsArchivedNotif();
        driver.quit();
    }

    @Then("User can view that checkin is already archived")
    public void userFailedToArchiveCheckinWithAlreadyArchived() {
        checkin.userGetQuestionAlreadyArchivedInDialogBox();
    }

// ADD COMMENT
    @And("User click add new comment field")
    public void userClickAddNewCommentField() {
        checkin.userClickAddNewCommentField();
    }

    @And("User click tell your story field")
    public void userClickTellYourStoryField() {
        checkin.userClickTellYourStoryHereField();
    }

    @And("User input text in tell your story field")
    public void userInputTextInTellYourStoryField() {
        checkin.userInpuTextInTellYourStoryHereField();
    }

    @And("User input empty text in tell your story field")
    public void userInputEmptyTextInTellYourStoryField() {
        checkin.userInputEmptyTextInTellYourStoryHereField();
    }

    @And("User input empty text using space button as empty character in tell your story field")
    public void userInputEmptyTextUsingSpaceButtonAsEmptyCharacterInTellYourStoryField() {
        checkin.userInputEmptyTextUsingSpaceBtnAsCharacterInTellYourStoryHereField();
    }

    @And("User click post button")
    public void userClickPostButton() throws Exception {
        Thread.sleep(3000);
        checkin.userClickPostBtn();
    }

    @Then("User success to add new comment")
    public void userSuccessToAddNewComment() throws Exception {
        checkin.userGetNotifCreateCommentOnCheckInQuestionSuccessful();
    }

    @Then("User failed to add new comment")
    public boolean userFailedToAddNewComment() {
        checkin.userFailedToAddNewComments();
        return false;
    }


    @Then("User failed to add new comment using space button as empty character")
    public void userFailedToAddNewCommentUsingSpaceButtonAsEmptyCharacterInTellYourStoryField() {
        driver.findElement(By.className("fr-box fr-basic fr-top")).isDisplayed();
    }
    @Then("User failed to edit comment using space button as empty character")
    public void userFailedToEditCommentUsingSpaceButtonAsEmptyCharacter() {
        driver.findElement(By.className("fr-box fr-basic fr-top")).isDisplayed();
    }

    @Then("Users can view that showing several menus in the tell your story field")
    public void usersCanViewThatShowingSeveralMenusInTheTellYourStoryField() throws Exception{
        Thread.sleep(3000);
        checkin.ShowingSeveralMenusInTheTellYourStoryField();
    }

    @When("User click bold button")
    public void userClickBoldButton() {
        checkin.userClickBoldBtn();
    }

    @When("User click italic button")
    public void userClickItalicButton() {
        checkin.userClickItalicBtn();
    }

    @When("User click strikethrough button")
    public void userClickStrikethroughButton() {
        checkin.userClickStrikeThroughBtn();
    }

    @Then("Users can view the text changes to bold format")
    public void usersCanViewTheTextChangesToBoldFormat() {

        checkin.usersCanViewTheTextChangesToBoldFormatsInTellYourStoryField();
    }

    @Then("Users can view the text changes to italic format")
    public void usersCanViewTheTextChangesToItalicFormat() {
        checkin.usersCanViewTheTextChangesToItalicFormatsInTellYourStoryField();
    }

    @Then("Users can view the text changes to strikethrough format")
    public void usersCanViewTheTextChangesToStrikethroughFormat() {
        checkin.usersCanViewTheTextChangesToStrikeThroughFormatsInTellYourStoryField();
    }

    @Then("User success to add a new comment with format bold text")
    public void userSuccessToAddANewCommentWithFormatBoldText() throws Exception {
        checkin.userSuccessToAddANewCommentWithFormatBoldText();
    }

    @Then("User success to add a new comment with format italic text")
    public void userSuccessToAddANewCommentWithFormatItalicText() throws Exception {
        checkin.userSuccessToAddANewCommentWithFormatItalicText();
    }

    @Then("User success to add a new comment with format strikethrough text")
    public void userSuccessToAddANewCommentWithFormatStrikethroughText() throws Exception {
        checkin.userSuccessToAddANewCommentWithFormatStrikethroughText();
    }

    @When("User click background color button")
    public void userClickBackgroundColorButton() {
        checkin.userClickBackgroundColorBtn();
    }
    @And("User click a background color")
    public void userClickOneOfBackgroundColor() {
        checkin.userClickOneOfColorBtn();
    }

    @Then("Users can view that there is a background color in the text")
    public void usersCanViewThatThereIsABackgroundColorInTheText() {
        checkin.usersCanViewThatThereIsABackgroundColorInTheText();
    }

    @Then("User success to add a new comment with background color in the text")
    public void userSuccessToAddANewCommentWithBackgroundColorInTheText() throws Exception {
        checkin.userSuccessToAddANewCommentWithFormatBackgroundColorInTheText();
    }


    @When("User click font size button")
    public void userClickFontSizeButton() {
        checkin.userClickFontSizeBtn();
    }

    @And("User clicks a font size")
    public void userClicksAFontSize() throws Exception {
        checkin.userClickAFont();

    }

    @Then("Users can view that there is a font size changed")
    public void usersCanViewThatThereIsAFontSizeChanged() {
        checkin.usersCanViewFontSizeChangedInTellYourStoryField();
    }

    @Then("User success add a new comment with the selected text font size")
    public void userSuccessAddANewCommentWithTheSelectedTextFontSize() throws Exception {
        checkin.userSuccessAddANewCommentWithTheSelectedTextFontSize();
    }

    @When("User click ordered list button")
    public void userClickOrderedListButton() {
        checkin.userClickOrderedListBtn();
    }

    @Then("Users can view that an ordered list can start with the number {int}")
    public void usersCanViewThatAnOrderedListCanStartWithTheNumber(int arg0) {
        checkin.usersCanViewThatThereIsAnOrderedListInTheTellYourStoryField();
    }

    @Then("Users success add a new comment with ordered list")
    public void usersSuccessAddANewCommentWithOrderedListText() throws Exception {
        checkin.usersSuccessAddANewCommentWithOrderedListText();
    }

    @When("User click unordered list option button")
    public void userClickUnorderedListOptionButton() {
        checkin.userClickUnorderedListOptionBtn();
    }

    @And("Users clicks on one of the menus in the drop-down menu")
    public void usersClicksOnOneOfTheMenusInTheDropDownMenu() throws Exception{
        checkin.userClickOneOfUnorderedListOptionBtn();
        checkin.userClickUnorderedListOptionBtn();
    }

    @Then("Users can view an unordered list format is shown")
    public void usersCanViewAnUnorderedListFormatIsShown() {
        checkin.usersCanViewThatThereIsAnUnorderedListInTheTellYourStoryField();
    }

    @Then("Users success add a new comment with unordered list")
    public void usersSuccessAddANewCommentWithUnorderedList() throws Exception{
        checkin.usersSuccessAddANewCommentWithUnorderedListText();
    }

    @And("User click insert files button")
    public void userClickFilesButton() {
        checkin.userClickInsertBtn();
    }

    @And("User click more rich button")
    public void userClickMoreRichButton() {
        checkin.userClickMoreRichBtn();
    }

    @When("User click insert image button")
    public void userClickInsertImageButton() throws Exception{
        Thread.sleep(3000);
        checkin.userClickInsertImageBtn();
    }

    @And("Users click image by url button")
    public void usersClickImageByUrlButton() {
        checkin.clickImageByUrlButton();
    }

    @And("Users upload supported files")
    public void usersInputSupportedFiles() {
        checkin.userInputSupportedFiles();
    }
    @And("Users upload supported image")
    public void usersUploadSupportedImage() {
        checkin.userInputSupportedImage();
    }

    @And("Users upload unsupported image")
    public void usersUploadUnSupportedImage() {
        checkin.userInputUnSupportedImage();
    }

    @Then("Users can view that files successfully to upload")
    public void usersCanViewThatFilesSuccessfullyToUpload() throws Exception {
        checkin.usersCanViewThatFilesSuccessfullyToUpload();
        Thread.sleep(3000);
    }

    @When("User click cheklist button")
    public void userClickCheklistButton() {
        checkin.userClickChecklistBtn();
    }

    @And("User click insert button to upload")
    public void userClickInsertButtonToUpload() {
        checkin.userClickInsertFilesBtnToUpload();
    }

    @Then("Users can view that file is shown in tell your story field")
    public void usersCanViewThatFileIsShownInTellYourStoryField() throws Exception{
        checkin.usersCanViewThatFilesIsShownInTheTellYourStoryField();
        Thread.sleep(3000);
    }

    @Then("Users successfully add a new comment with supported files")
    public void usersSuccessfullyAddANewCommentWithSupportedFiles() throws Exception {
        checkin.usersSuccessfullyAddANewCommentWithSupportedFiles();
    }

    @Then("Users can view that files failed to upload")
    public void usersCanViewThatFilesFailedToUpload() throws Exception {
        checkin.usersCanViewThatFilesIsFailedToUploadInTheTellYourStoryField();
    }

    @Then("Users can view that url is invalid")
    public void usersCanViewThatUrlIsInvalid() throws Exception{
        checkin.usersCanViewThatIsInvalidURL();
    }

    @And("Users upload unsupported files")
    public void usersInputUnsupportedFiles() {
        checkin.userInputUnupportedFiles();
    }


//Reply Comment
    @And("User click reply comment button")
    public void userClickReplyCommentButton() {
        checkin.userClickReplyCommentBtn();
    }

    @Then("User success to reply comment")
    public void userSuccessToReplyComment() {
        checkin.userGetNotifCreateDisscussionOnCheckinCommentSuccessful();
    }


    @Then("Users successfully add a new comment with supported image")
    public void usersSuccessfullyAddANewCommentWithSupportedImage() {
        driver.findElement(By.xpath("/descendant::div[@class='fr-view'][1]")).isDisplayed();
        driver.quit();
    }


    @And("User click insert video button")
    public void userClickInsertVideoButton() {
        checkin.clickInsertVideoBtn();
    }

    @And("User click by upload video button")
    public void userClickUploadVideoButton() {
        checkin.clickUploadVideo();
    }


    @And("Users upload supported video")
    public void usersUploadSupportedVideo() {
        checkin.uploadVideo();
    }

    @And("User input valid video url")
    public void userInputValidVideoUrl() {
        checkin.InputVideoByUrl();
    }

    @And("Users click by url video button")
    public void usersClickByUrlVideoButton() {
        checkin.clickVideoByUrlBtn();
    }

    @And("User click insert video button below url field")
    public void userClickInsertVideoButtonBelowUrlField() {
        checkin.clickInsertVideoButtonBelowUrlField();
    }

    @Then("Users successfully add a new comment by input image using valid url")
    public void usersSuccessfullyAddANewCommentByInputImageUsingValidUrl() {
        driver.findElement(By.xpath("/descendant::div[@class='fr-view'][1]")).isDisplayed();
        driver.quit();
    }

    @Then("Users successfully add a new comment by upload supported video")
    public void usersSuccessfullyAddANewCommentByUploadSupportedVideo() {
        driver.findElement(By.xpath("/descendant::div[@class='fr-view'][1]")).isDisplayed();
        driver.quit();
    }

    @Then("Users successfully add a new comment with valid video url")
    public void usersSuccessfullyAddANewCommentWithValidVideoUrl() {
        driver.findElement(By.xpath("/descendant::div[@class='fr-view'][1]")).isDisplayed();
        driver.quit();
    }

    @Then("Users can view that image file type is invalid")
    public void usersCanViewThatImageFileTypeIsInvalid() {
        checkin.userCanViewThatImageTypeIsInvalid();
        driver.quit();
    }

    @Then("Users can view that Image cannot be loaded from the passed link")
    public void usersCanViewThatImageCannotBeLoadedFromThePassedLink() {
        checkin.userCanViewThatImageCannotBeLoadedFromThePassedLink();
        driver.quit();
    }

    @And("User input invalid url to upload image")
    public void userInputInvalidUrlToUploadImage() {
        checkin.inputImageByInValidURL();

    }

    @And("Users upload unsupported video")
    public void usersUploadUnsupportedVideo() {
        checkin.uploadUnsupportedVideo();
    }

    @Then("User get notif something went wrong please try again later")
    public void userGetNotifSomethingWentWrongPleaseTryAgainLater() {
        checkin.userCanViewSomethingWentWrongPleaseTryAgainLater();
        driver.quit();
    }

    @And("User input invalid video url")
    public void userInputInvalidVideoUrl() {
        checkin.inputInvalidVideoByUrl();
    }

    @And("User clicks the cancel button")
    public void userClicksTheCancelButton() {
        checkin.userClickCancelBtn();
    }

    @Then("User can view the dialog box to add a comment is closed")
    public void userCanViewTheDialogBoxToAddACommentIsClosed() {
        checkin.userCanViewsThatPageAddCommentIsClosed();
    }

// EDIT COMMENT \\
    @And("User click three dot button in the comment details")
    public void userClickThreeDotButtonInTheCommentDetails() throws Exception {
        Thread.sleep(4000);
        checkin.userClickThreeDotButtonOnCommentDetails();
    }

    @And("User click edit comment button")
    public void userClickEditCommentButton() throws Exception {
        Thread.sleep(3000);
        checkin.userClickEditCommentBtn();
    }

    @Then("User success to edits comment")
    public void userSuccessToEditsComment() {
        checkin.userGetNotifUpdateCommentSuccess();
        driver.quit();
    }

    @And("User delete previous text in tell your story field")
    public void userDeletePreviousTextInTellYourStoryField() {
        checkin.deletePreviousTextInTellYourStoryField();
    }

// DELETE COMMENT

    @And("User click delete button")
    public void userClickDeleteButton() {
        checkin.userClickDeleteBtn();
    }

    @Then("User get dialog box to delete comment")
    public void userGetDialogBoxToDeleteComment()throws Exception {
        Thread.sleep(3000);
        checkin.showingPopUpDeleteComment();
    }

    @When("User click delete button to delete comment")
    public void userClickDeleteButtonToDeleteComment() {
        checkin.userClickDeleteToDeleteCommentButton();
    }


    @Then("User success to delete comment")
    public void userSuccessToDeleteComment() {
        checkin.userGetNotifDeleteCommentOnCheckInQuestionSuccessful();
        driver.quit();
    }

    @When("User click cancel button to cancel delete comment")
    public void userClickCancelButtonToCancelDeleteComment() {
        checkin.userclickCancelToDeleteCommentButton();
    }

    @Then("User dialog box to delete comment is closed")
    public void dialogBoxtoDeleteCommentisClosed() {
        checkin.dialogBoxToDeleteCommentIsClosed();
        driver.quit();

    }

// CHEERS ON COMMENT
    @And("User click cheers button")
    public void userClickCheersButton() {
        checkin.userClickCheersOnCommentBtn();
    }

    @And("User click cheers field")
    public void userClickCheersField() {
        checkin.userClickCheersField();
    }

    @And("User input text in cheers field")
    public void userInputTextInCheersField() {
        checkin.inputTextInCheersField();
    }

    @And("User click checklist cheers button")
    public void userClickChecklistCheersButton() throws Exception {
        Thread.sleep(3000);
        checkin.userClickChecklistCheersBtn();
    }

    @Then("User success to give cheers")
    public void userSuccessToGiveCheers() {
        checkin.userGetNotifCreateCheersOnQuestionCommentSuccessful();
        driver.quit();
    }

    @And("User click cancel cheklist cheers button")
    public void userClickCancelCheklistCheersButton() {
        checkin.userClickCancelChecklistCheersBtn();
    }

    @Then("User can view that cheers field is closed")
    public void userCanViewThatCheersFieldIsClosed() {
        checkin.userCanViewThatCheersFieldIsClosed();
        driver.quit();
    }

    @And("User click emoticon on cheers button")
    public void userClickEmoticonOnCheersButton() throws Exception{
        Thread.sleep(3000);
        checkin.userClickEmoticonOnCheersBtn();
    }

    @And("User click people button on cheers button")
    public void userClickPeopleButtonOnCheersButton()throws Exception {
        Thread.sleep(4000);
        checkin.userClickSmilePeopleButton();
    }

    @And("User click emoticon")
    public void userClickEmoticon() throws Exception{
        Thread.sleep(4000);
        checkin.userClickEmoticon();
    }

    @And("User input empty text in cheers field")
    public void userInputEmptyTextInCheersField() {
        checkin.inputEmptyTextOnCheersField();
    }

    @Then("User failed to give cheers")
    public void userFailedToGiveCheers() {
        checkin.userGetNotifCheersCannotBeEmpty();
        driver.quit();
    }

    @And("User input empty text using spaces button as character in cheers field")
    public void userInputEmptyTextUsingSpacesButtonAsCharacterInCheersField() {
        checkin.inputEmptyTextUsingSpaceButtonAsCharacter();
    }

    @Then("User failed to reply comment using space button as empty character")
    public void userFailedToReplyCommentUsingSpaceButtonAsEmptyCharacterInTellYourStoryField() {
        driver.findElement(By.className("fr-box fr-basic fr-top")).isDisplayed();
    }
// CHEERS ON REPLY COMMENT
    @And("User click cheers button on reply comment")
    public void userClickCheersButtonOnReplyComment() {
        checkin.clickCheersOnReplyComment();
    }

    @Then("User success to give cheers on reply comment")
    public void userSuccessToGiveCheersOnReplyComment() {
        checkin.userGetNotifCheersOnQuestionDiscusstionIsSuccessful();
        driver.quit();
    }

// MAIN PAGE

    @Then("Direct user to create checkin page")
    public void directUserToCreateCheckinPage() {
        checkin.userCanViewCreateQuestionCheckInPage();
        driver.quit();
    }

    @When("User click dropdown menu on the upper left side")
    public void userClickDropdownMenuOnTheUpperLeftSide() {
        checkin.userClickDropDownButtonOnTheUpperLeftSide();

    }

    @Then("Showing several menu in dropdown option")
    public void showingSeveralMenuInDropdownOption() {
        checkin.userCanViewSeveralMenuInDropDownButton();

    }

    @When("User click checkin button in dropdown menu")
    public void userClickCheckinButtonInDropdownMenu() {
        checkin.userClickCheckinButtonInDropDownMenu();
    }

    @Then("Direct user to checkin page")
    public void directUserToCheckinPage() {
        checkin.userCanViewCheckInMainPage();
        driver.quit();
    }

    @Then("direct user to question detail")
    public void directUserToQuestionDetail() {
        checkin.userCanViewThatQuestionDetilPage();
        driver.quit();
    }


}
