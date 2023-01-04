package stepDefs.checkinStepDef;

import com.sandikurnia.base.testBase;
import com.sandikurnia.page.checkinPage;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import javax.print.DocFlavor;
import java.awt.*;
import java.io.IOException;

public class checkinStepDef extends testBase {

    checkinPage checkin;

    @Given("Navigate user to checkin page")
    public void navigateUserToCheckinPage() throws Exception {
        setUp();
        checkin = new checkinPage();
        Thread.sleep(3000);

    }


    @When("User tap create checkin button")
    public void userClickCreateCheckinButton() throws Exception {
        Thread.sleep(3000);
        checkin.TapAddButtonOnTheBottomRightCorner();

    }

    @And("User tap type your question field")
    public void userClickTypeYourQuestionField()throws Exception {
        Thread.sleep(3000);
        checkin.tapTypeQuestionHereField();

    }

    @And("User input text in type your question field")
    public void userInputTextInTypeYourQuestionField() throws Exception{
        Thread.sleep(3000);
        checkin.inputTextInTypeQuestionHereField();
    }

    @And("User input empty text using spaces button as empty character in type your question field")
    public void userInputEmptyTextUsingSpacesButtonAsEmptyCharacterInTypeYourQuestionField() {
        checkin.inputEmptyTextUsingSpaceButtonAsCharacterInTypeQuestionHereField();
    }

    @And("User tap start collecting answers button")
    public void userTapStartCollectingAnswersButton() {
        checkin.tapStartToCollectingAnswerBtn();
    }

    @Then("User success to add new checkin")
    public void userSuccessToAddNewCheckin() throws Exception {
        Thread.sleep(3000);
        checkin.popUpCreateQuestionSuccessul();
    }

    @And("User select the day")
    public void userSelectHowOftenTheQuestionIsAskedToBeFilled() {
        checkin.TapMondayBtn();
    }

    @And("User set the time")
    public void userSetTheTime() {
        checkin.tapSetTimeBtn();
    }

    @And("User tap switch button to private")
    public void userTapSwitchButtonToPrivate() throws Exception{
        Thread.sleep(3000);
        checkin.tapPrivateBtn();
    }

    @Then("User get pop up alert question must be filled")
    public void userGetPopUpAlertQuestionMustBeFilled() {
        checkin.popUpQuestionMustBeFilled();
    }

    @Then("User get pop up alert how often the question is asked to be filled in")
    public void userGetPopUpAlertHowOftenTheQuestionIsAskedToBeFilledIn() {
        checkin.popUpHowOftenTheQuestionIsAskedToBeFilledIn();
    }

    @Then("User get pop up alert time must be filled")
    public void userGetPopUpAlertTimeMustBeFilled() {
        checkin.popUpAlertTimeMustBeFilled();

    }

    @And("User select all days")
    public void userSelectAllDays() throws Exception{
        Thread.sleep(3000);
        checkin.TapAllDays();
    }

    @And("User tap add member button")
    public void userTapAddMemberButton() throws Exception {
        Thread.sleep(3000);
        checkin.tapAddMemberBTN();
    }

    @And("User tap {int} times in select all checkbox to deselect")
    public void userTapTimesInSelectAllCheckboxToDeselect(int arg0) {
        checkin.tap2TimesToDeselectMember();
    }

    @Then("User can view that notified member not appears")
    public void userCanViewThatNotifiedMemberNotAppears() {
        checkin.memberDoesntAppear();
    }

    @And("User tap done button")
    public void userTapDoneButton() {
        checkin.tapDoneButton();
    }

    @And("User tap set time button")
    public void userTapSetTimeButton() {
        checkin.tapSetTimeBtn2();
    }

    @And("User tap switch to input time mode")
    public void userTapSwitchToInputTimeMode() {
        checkin.tapSwitchToInputTimeMode();
    }

    @And("User Input valid hour")
    public void userInputValidHour() {
        checkin.inputHour();
    }

    @And("User Input valid minute")
    public void userInputValidMinute() {
        checkin.inputMinute();
    }

    @And("User tap pm button")
    public void userTapPmButton() {
        checkin.tapPMButton();
    }

    @And("User select member already notified")
    public void userSelectMemberAlreadyNotified() {
        checkin.tapMemberAlreadyNotified();
    }

    @Then("User can view that users who have been added cannot be added back")
    public void userCanViewThatUsersWhoHaveBeenAddedCannotBeAddedBack() {
        checkin.canViewThatUsersHaveBeenAddedCannotBeAddBack();
    }

    @And("User Input invalid hour")
    public void userInputInvalidHour() {
        checkin.inputInvalidHour();
    }

    @And("User Input invalid minute")
    public void userInputInvalidMinute() {
        checkin.inputInvalidMinute();
    }

    @Then("User get alert enter a valid time")
    public void userGetAlertEnterAValidTime() {
        checkin.alertEnterAValidTime();
    }


                            //--------------------- EDIT CHECKIN ---------------------\\
    @When("User tap one of question detail")
    public void userTapOneOfQuestionDetail() throws Exception{
        checkin.tapOneOfQuestionDetil();
        Thread.sleep(4000);
    }

    @And("User tap three dot button")
    public void userTapThreeDotButton() throws Exception{
        Thread.sleep(2000);
        checkin.tapThreeDotButton();
    }

    @And("User tap edit button")
    public void userTapEditButton() throws Exception {
        Thread.sleep(3000);
        checkin.tapEditButton();
    }

    @Then("User success to update new checkin")
    public void userSuccessToUpdateNewCheckin() throws Exception {
        Thread.sleep(3000);
        checkin.popUpUpdateQuestionSuccessul();
    }

    @And("User tap save changes button")
    public void userTapSaveChangesButton() throws Exception {
        Thread.sleep(3000);
        checkin.tapSaveChangesButton();
    }

    @And("User set other day")
    public void userSetOtherDay() throws Exception{
        Thread.sleep(3000);
        checkin.TapMondayBtn();
        checkin.TapSundayBtn();
    }

    @And("User input empty text in type your question field")
    public void userInputEmptyTextInTypeYourQuestionField() {
        checkin.inputEmptyTextInTypeQuestionHereField();
    }

    @And("User tap cancel button to edit checkin")
    public void userTapCancelButtonToEditCheckin() {
        checkin.tapCancelEditCheckIn();
    }

    @Then("User success to cancel edit checkin")
    public void userSuccessToCancelEditCheckin() {
    }

                        // -------------------------- ADD COMMENT -------------------------- \\
    @And("User tap add comment field")
    public void userTapAddCommentField() {
        checkin.tapAddCommentField();
    }

    @And("User tap tell your story field")
    public void userTapTellYourStoryField() {
        checkin.tapTellYourCommentField();
    }

    @And("User input text in tell your story field")
    public void userInputTextInTellYourStoryField() {
        checkin.inputTextTellYourCommentField1();
    }

    @And("User tap submit button")
    public void userTapSubmitButton() {
        checkin.tapSubmitAddCommentButton();
    }

    @Then("User success to add new comment")
    public void userSuccessToAddNewComment() {

    }

    @Then("User failed to add new comment")
    public void userFailedToAddNewComment() {
        checkin.popUpCommentCantBeEmpty();
    }

    @And("User tap mention button")
    public void userTapMentionButton() {
        checkin.tapMentionUserButton();
    }

    @And("Select the user to mention")
    public void selectTheUserToMention() {
        checkin.selectOneOfUserToMention();
    }

    @And("User tap bold button")
    public void userTapBoldButton() {
        checkin.tapBoldButton();
    }

    @And("User tap italic button")
    public void userTapItalicButton() {
        checkin.tapItalicButton();
    }

    @And("User tap strikethrought button")
    public void userTapStrikethroughtButton() {
        checkin.tapStrikethroughButton();
    }

    @And("User input text in tell your story fields")
    public void userInputTextInTellYourStoryFields() {
        checkin.inputTextTellYourCommentField2();
    }

    @And("User tap ordered list button")
    public void userTapOrderedListButton() {
        checkin.tapOrderedListButton();
    }

    @And("User tap unordered list option button")
    public void userTapUnorderedListOptionButton() {
        checkin.tapUnorderedListOptionButton();
    }

    @And("User tap one of the menus in the drop-down menu")
    public void userTapOneOfTheMenusInTheDropDownMenu() throws Exception {
        checkin.tapOneOfDropdownMenu();
    }

    @And("User tap insert button")
    public void userTapInsertButton() throws Exception {
        Thread.sleep(3000);
        checkin.tapInsertButton();
    }

    @And("User tap add image button")
    public void userTapAddImageButton() throws Exception  {
        Thread.sleep(3000);
        checkin.tapAddImageButton();
    }
    @And("User input supported image")
    public void userInputSupportedImage() throws IOException {
        checkin.inputSupportedImage();

    }
// ARCHIVE \\

    @And("User tap archive button")
    public void userTapArchiveButton() {
        checkin.tapArchiveButton();
    }

    @And("User tap yes to archive")
    public void userTapYesToArchive() {
        checkin.tapOkArchiveCommentButton();
    }

    @And("User tap yes to archive question")
    public void userTapYesToArchiveQuestion() {
        checkin.tapYesArchiveButton();
    }

    @Then("User success to archive checkin")
    public void userSuccessToArchiveCheckin() {
    }

    @And("User tap cancel to archive")
    public void userTapCancelToArchive() {
        checkin.tapCancelArchiveButton();
    }

    // REPLY COMMENT

    @And("User tap reply button")
    public void userTapReplyButton() throws Exception  {
        Thread.sleep(3000);
        checkin.tapReplyCommentButton();
    }

    @Then("User success reply comment")
    public void userSuccessReplyComment() throws Exception {
        checkin.canViewNewReplyComment();
    }

    @And("User tap by upload button")
    public void userTapByUploadButton() {
        checkin.tapByUploadButton();
    }

    @And("User select image from files")
    public void userSelectImageFromFiles() {
        checkin.inputImageByUpload();
    }

    @Then("User success to archive comment")
    public void userSuccessToArchiveComment() {
        checkin.popUpArchivedCommentSuccess();
    }

    @And("User tap three dot button in comment details")
    public void userTapThreeDotButtonInCommentDetails() throws Exception{
        Thread.sleep(3000);
        checkin.tapThreeDotButtonComment();
    }

    @And("User tap three dot button in reply comment details")
    public void userTapThreeDotButtonInReplyCommentDetails() throws Exception {
        Thread.sleep(5000);
        checkin.tapThreeDotButtonReplyComment();
    }

    @Then("User failed to reply new comment")
    public void userFailedToReplyNewComment() throws Exception{
        Thread.sleep(2000);
        checkin.popUpCommentCantBeEmpty();
    }

    @And("User tap by url button")
    public void userTapByUrlButton() {
        checkin.tapByURLButton();
    }

    @And("User tap Insert link here field")
    public void userTapInsertLinkHereField() {
        checkin.tapInsertLinkHereField();
    }

    @And("Usert input invalid url")
    public void usertInputInvalidUrl() {
        checkin.inputInvalidUrl();
    }

    @Then("User failed add image by invalid url")
    public void userFailedAddImageByInvalidUrl() {
        checkin.popUpNotValidUrl();
    }

    @And("User tap insert url button")
    public void userTapInsertUrlButton() {
        checkin.tapInserURLButton();
    }

    @And("User tap add file button")
    public void userTapAddFileButton() {
        checkin.tapAddFileButton();
    }

    @Then("User failed add file by invalid url")
    public void userFailedAddFileByInvalidUrl() {
        checkin.popUpNotValidUrl();
    }

    @And("User tap add video button")
    public void userTapAddVideoButton() {
        checkin.tapAddVideoButton();
    }

    @Then("User failed add video by invalid url")
    public void userFailedAddVideoByInvalidUrl() {
        checkin.popUpNotValidUrl();
    }

    @And("Usert input valid url")
    public void usertInputValidUrl() {
        checkin.inputValidUrl();
    }

    // MAIN PAGE
    @Then("Direct user to create checkin page")
    public void directUserToCreateCheckinPage() {
        checkin.checkinMainPageAssert();
    }

    @When("User scroll down in checkin page")
    public void userScrollDownInCheckinPage()throws Exception {
        Thread.sleep(5000);
        checkin.scrollDown();
    }

    @Then("User able to scroll down in checkin page")
    public void userAbleToScrollDownInCheckinPage() {
    }

    @When("User scroll up in checkin page")
    public void userScrollUpInCheckinPage() throws Exception {
        Thread.sleep(5000);
        checkin.scrollUp();
    }

    @Then("User able to scroll up in checkin page")
    public void userAbleToScrollUpInCheckinPage() {
    }

    @When("User swipe left in checkin page")
    public void userSwipeLeftInCheckinPage() throws Exception {
        Thread.sleep(5000);
        checkin.swipeLeft();
    }

    @Then("User able to check swipe left in main page")
    public void userAbleToCheckSwipeLeftInMainPage() {
        checkin.settingMenuInMainPage();
    }

    @When("User click dropdown option menu on the upper right side")
    public void userClickDropdownOptionMenuOnTheUpperRightSide() {
        checkin.checkInDropdownMenu();
    }

    @And("User scroll down to checkin menu")
    public void userScrollDownToCheckinMenu() {
        checkin.scrollUpInDropDownMennu();
    }

    @And("User tap checkin button")
    public void userTapCheckinButton() {
        checkin.checkinButtonOnDropDownMenu();
    }

    @Then("Success direct user to checkin checkin page")
    public void successDirectUserToCheckinCheckinPage() {
        checkin.checkInMainPage();
    }

    @When("User swipe right in checkin page")
    public void userSwipeRightInCheckinPage() throws Exception{
        Thread.sleep(4000);
        checkin.swipeRight();
    }

    @Then("User can't swipe right in main page")
    public void userCanTSwipeRightInMainPage() {
        checkin.settingMenuNotShowingInMainPage();
    }

    @When("User tap button on the upper left side")
    public void userTapButtonOnTheUpperLeftSide() {
        checkin.tapbackButtonOnUpperRightSide();
    }

    @Then("Success direct user to overview page")
    public void successDirectUserToOverviewPage() {
        checkin.overviewPages();
    }

//EDIT COMMENT
    @And("User tap edit comment button")
    public void userTapEditCommentButton() throws Exception {
        Thread.sleep(3000);
        checkin.tapEditCommentButton();
    }

    @Then("User success to edit comment")
    public void userSuccessToEditComment() throws Exception {
        Thread.sleep(2000);
        checkin.popUpYourCommentHasBeenEdited();
    }

    @Then("User success to cancel archive")
    public void userSuccessToCancelArchive() {
        checkin.archiveButton();
    }

    @And("User delete text in tell your story field")
    public void userDeleteTextInTellYourStoryField() {
        checkin.deleteText();
    }

    @Then("User failed to edit comment")
    public void userFailedToEditComment() {
        checkin.popUpCommentCantBeEmpty();
    }

    @And("User tap ok button to enter time")
    public void userTapOkButtonToEnterTime() {
        checkin.tapOkButtonToSwitchToInputTimeMode();
    }

// CHEERS ON COMMENT
    @And("User tap cheers button")
    public void userTapCheersButton() throws Exception{
        checkin.tapThreeDotButtonComment();
        checkin.tapArchiveButton();
        checkin.tapOkArchiveCommentButton();
        Thread.sleep(5000);
        checkin.tapCheersButtonOnComment();
    }

    @And("User tap cheers field")
    public void userTapChiersField()throws Exception {
        Thread.sleep(5000);
        checkin.tapCheersField();
    }

    @And("User input text in cheers field")
    public void userInputTextInCheersField()throws Exception {
        Thread.sleep(5000);
        checkin.inputTextInCheersField();
    }

    @And("User tap checklist cheers button")
    public void userTapChecklistCheersButton()throws Exception {
        Thread.sleep(4000);
        checkin.tapChecklistCheersButton();
    }

    @Then("User success to give cheers on comment")
    public void userSuccessToGiveCheersOnComment() {
    }

    @And("User tap cancel cheers button")
    public void userTapCancelCheersButton()throws Exception {
        Thread.sleep(4000);
        checkin.tapCancelCheersCheersButton();
    }

    @Then("User can view that dialog cheers box is closed")
    public void userCanViewThatDialogCheersBoxIsClosed() {
    }



    @Then("User failed to give cheers")
    public void userFailedToGiveCheers() {

    }

    @And("User input empty text using spaces button as character on cheers field")
    public void userInputEmptyTextUsingSpacesButtonAsCharacterOnCheersField() {
        checkin.inputTextUsingSpacesButtonAsCharacterInCheersField();
    }
}
