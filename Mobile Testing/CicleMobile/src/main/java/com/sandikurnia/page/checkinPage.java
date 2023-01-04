package com.sandikurnia.page;

import com.sandikurnia.base.testBase;
import io.appium.java_client.MobileElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;
import static java.time.Duration.ofSeconds;


public class checkinPage extends testBase {

    public checkinPage() throws Exception{
        Thread.sleep(3000);
        MobileElement TapSekolaQA = driver.findElementByAccessibilityId("Div Cilsy\n" +
                "For Testing");
        TapSekolaQA.click();
        Thread.sleep(3000);
        MobileElement TapCheckins = driver.findElementByAccessibilityId("Check-Ins");
        TapCheckins.click();
    }


                            //-------------------------------METHOD-----------------------------------\\
 //ADD CHECKIN
    public void TapAddButtonOnTheBottomRightCorner() throws Exception{
       MobileElement AddButtonOnTheBottomRightCorner = driver.findElementByXPath("(//*[@class = 'android.widget.Button'])[3]");
        AddButtonOnTheBottomRightCorner.click();
    }

    public void tapTypeQuestionHereField(){

      MobileElement TypeQuestionHereField = driver.findElementByXPath("(//*[@class = 'android.widget.EditText'])");
        TypeQuestionHereField.click();
        TypeQuestionHereField.clear();
        driver.hideKeyboard();
    }

    public void inputTextInTypeQuestionHereField(){
      MobileElement TypeQuestionHereField = driver.findElementByXPath("(//*[@class = 'android.widget.EditText'])");
        TypeQuestionHereField.sendKeys("Test 1");
        driver.hideKeyboard();

    }
    public void inputEmptyTextUsingSpaceButtonAsCharacterInTypeQuestionHereField(){

     MobileElement TypeQuestionHereField = driver.findElementByXPath("(//*[@class = 'android.widget.EditText'])");

        TypeQuestionHereField.sendKeys(" ");
        driver.hideKeyboard();
    }


    public void inputEmptyTextInTypeQuestionHereField(){

        MobileElement TypeQuestionHereField = driver.findElementByXPath("(//*[@class = 'android.widget.EditText'])");

        TypeQuestionHereField.sendKeys("");
        driver.hideKeyboard();
    }
    public void TapMondayBtn(){

   MobileElement MondayButton = driver.findElementByXPath("//android.view.View[@content-desc=\"Mon\"]");
        MondayButton.click();
    }

    public void TapSundayBtn(){

        MobileElement SundayButton = driver.findElementByXPath("//android.view.View[@content-desc=\"Sun\"]");
        SundayButton.click();
    }

    public void TapAllDays() throws Exception{
        By allDays = By.xpath("//android.view.View[@resource-id='']");
       for (int i = 7; i < 17; i++)
        {
           driver.findElements(allDays).get(i).click();
       }
    }

    public void tapSetTimeBtn(){
        MobileElement SetTimeBtn = driver.findElementByXPath("(//*[@class = 'android.view.View'])[18]");
        SetTimeBtn.click();
        MobileElement TapOkBtn = driver.findElementByXPath("//android.widget.Button[@content-desc=\"OK\"]");
        TapOkBtn.click();
//        MobileElement SetHour = driver.findElementByXPath("//android.widget.SeekBar[@content-desc=\"Select hours 12\"]");
//        SetHour.click();
//
//        MobileElement SetMinute = driver.findElementByXPath("//android.widget.SeekBar[@content-desc=\"Select minutes 30\"]");
//        SetMinute.click();
//
//        MobileElement SetPM = driver.findElementByXPath("//android.widget.RadioButton[@content-desc=\"PM\"]");
//        SetPM.click();
    }
    public void tapSetTimeBtn2(){
        MobileElement SetTimeBtn2 = driver.findElementByXPath("(//*[@class = 'android.view.View'])[19]");
        SetTimeBtn2.click();

    }
    public void tapSwitchToInputTimeMode(){
        MobileElement switchtoInputTimeMode = driver.findElementByAccessibilityId("Switch to text input mode");
        switchtoInputTimeMode.click();
    }
    public void inputHour(){
        MobileElement switchtoInputTimeMode = driver.findElementByXPath("(//android.widget.EditText[text(),'9 Hour'][1])");
        switchtoInputTimeMode.click();
        switchtoInputTimeMode.sendKeys("07");
    }
    public void inputMinute(){
        MobileElement switchtoInputTimeMode = driver.findElementByXPath("(//android.widget.EditText[text(),'9 Hour'][2])");
        switchtoInputTimeMode.click();
        switchtoInputTimeMode.sendKeys("30");
    }

    public void inputInvalidHour(){
        MobileElement switchtoInputTimeMode = driver.findElementByXPath("(//android.widget.EditText[text(),'9 Hour'][1])");
        switchtoInputTimeMode.click();
        switchtoInputTimeMode.sendKeys("K6");
    }

    public void inputInvalidMinute(){
        MobileElement switchtoInputTimeMode = driver.findElementByXPath("(//android.widget.EditText[text(),'9 Hour'][2])");
        switchtoInputTimeMode.click();
        switchtoInputTimeMode.sendKeys("XX");
    }

    public void tapPMButton(){
        MobileElement tapPM = driver.findElementByAccessibilityId("PM");
        tapPM.click();
    }

    public void tapOkButtonToSwitchToInputTimeMode(){
        MobileElement okButton = driver.findElementByXPath("//android.widget.Button[@content-desc=\"OK\"]");
        okButton.click();
    }



    public void tapAddMemberBTN(){

        MobileElement AddMemberBtn = driver.findElementByXPath("(//*[@class = 'android.view.View'])[21]");
        AddMemberBtn.click();
    }

    public void tap2TimesToDeselectMember(){

        MobileElement selectAllMember = driver.findElementByXPath("(//*[@class = 'android.widget.CheckBox'])[1]");
        for (int i = 0; i < 2; i++) {
            selectAllMember.click();
        }
    }
    public void tapMemberAlreadyNotified(){

        MobileElement selectAllMember = driver.findElementByXPath("(//*[@class = 'android.widget.CheckBox'])[1]");
        for (int i = 0; i < 1; i++) {
            selectAllMember.click();
        }
    }

    public void tapDoneButton(){
        MobileElement doneBtn = driver.findElementByAccessibilityId("done");
        doneBtn.click();
    }
    public boolean memberDoesntAppear(){
        try
        {
            if(driver.findElement(By.xpath("//android.view.View[@index=15]/android.view.View/android.widget.ImageView[@index=2]")).isDisplayed())
            {
                return false;
            }
            return false;
        }
        catch(Exception e)
        {
            System.out.println("No element displayed");
            return true;
        }
    }

    public void canViewThatUsersHaveBeenAddedCannotBeAddBack(){

        MobileElement element = driver.findElementByXPath("//android.widget.ImageView[4]");
        Assert.assertFalse(element.isDisplayed());


//        if(driver.findElements(By.xpath("//android.view.View[@index=15]/android.view.View/android.widget.ImageView")).size() == 3){
//            System.out.println("User yang sama tidak berhasil di tambahkan");
//        }else{
//            System.out.println("User yang sama berhasil di tambahkan");
//        }

    }

    public void tapPrivateBtn(){

        MobileElement SwitchPrivateBtn = driver.findElementByClassName("android.widget.Switch");
        SwitchPrivateBtn.click();
    }

    public void tapStartToCollectingAnswerBtn(){

        MobileElement startCollectingAnswerBtn = driver.findElementByAccessibilityId("Start collecting answer!");
        startCollectingAnswerBtn.click();
    }

//Assertion
    public void popUpQuestionMustBeFilled(){
        MobileElement questionMustBeFilled = driver.findElementByXPath("//android.view.View[@content-desc=\"question must be filled\"]");
        questionMustBeFilled.isDisplayed();
    }
    public void popUpCreateQuestionSuccessul(){
        MobileElement questionMustBeFilled = driver.findElementByXPath("//android.view.View[@content-desc=\"Create question successful\"]");
        questionMustBeFilled.isDisplayed();
    }

    public void popUpHowOftenTheQuestionIsAskedToBeFilledIn(){
        MobileElement questionMustBeFilled = driver.findElementByXPath("//android.view.View[@content-desc=\"how often the question is asked to be filled in\"]");
        questionMustBeFilled.isDisplayed();
    }

    public void popUpAlertTimeMustBeFilled(){
        MobileElement questionMustBeFilled = driver.findElementByXPath("//android.view.View[@content-desc=\"time must be filled\"]");
        questionMustBeFilled.isDisplayed();
    }
    public void alertEnterAValidTime(){
        MobileElement alertEnterAValidTime = driver.findElementByXPath("//android.view.View[@content-desc=\"Enter a valid time\"]");
        alertEnterAValidTime.isDisplayed();
    }

                                       //----------------------EDIT CHECKIN----------------------\\

    public void tapOneOfQuestionDetil(){
        MobileElement oneOfQuestionDetil = driver.findElementByXPath("(//*[@class = 'android.view.View'])[9]");
        oneOfQuestionDetil.click();
    }

    public void tapThreeDotButton () {
        new TouchAction(driver)
                .longPress(point(1015,286))
                .waitAction(waitOptions(ofSeconds(3)))
                .release().perform();
    }

    public void tapEditButton(){
        MobileElement editButton = driver.findElementByAccessibilityId("Edit");
        editButton.click();
    }
    public void tapSaveChangesButton(){
        MobileElement editButton = driver.findElementByXPath("//android.widget.Button[@content-desc=\"Save changes\"]");
        editButton.click();
    }
    public void popUpUpdateQuestionSuccessul(){
        MobileElement alertEnterAValidTime = driver.findElementByXPath("//android.view.View[@content-desc=\"Update question successful\"]");
        alertEnterAValidTime.isDisplayed();
    }

    public void tapCancelEditCheckIn(){
        MobileElement cancelEditCheckin = driver.findElementByXPath("//android.widget.Button[@content-desc=\"Cancel\"]");
        cancelEditCheckin.click();
    }

                                    //----------------------ADD COMMENT----------------------\\

    public void tapAddCommentField(){
        MobileElement addCommentField = driver.findElementByXPath("//android.view.View[@content-desc=\"Add new comment...\"]");
        addCommentField.click();
//        MobileElement closeAddComment = driver.findElementByXPath("(//*[@class = 'android.view.View'])[6]");
    }

    public void tapTellYourCommentField(){
        MobileElement tellYourCommentField = driver.findElementByXPath("(//*[@class = 'android.widget.EditText'])");
        tellYourCommentField.click();
    }

    public void inputTextTellYourCommentField1(){
        MobileElement tellYourCommentField = driver.findElementByXPath("(//*[@class = 'android.widget.EditText'])");
        tellYourCommentField.sendKeys("Cicle Mobile App V1");
    }
    public void inputTextTellYourCommentField2(){
//        MobileElement tellYourCommentField = driver.findElementByXPath("//android.view.View/android.widget.EditText");
//        tellYourCommentField.sendKeys("Cicle Mobile App V1");
        AndroidTouchAction touch = new AndroidTouchAction(driver);

        MobileElement tellYourCommentField = driver.findElementByXPath("(//*[@class = 'android.widget.EditText'])");
        tellYourCommentField.sendKeys("CicleMobileCicleMobileCicleMobile");

        LongPressOptions longpressoption = new LongPressOptions();
        longpressoption.withDuration(Duration.ofSeconds(1)).withElement(ElementOption.element(tellYourCommentField));
        touch.longPress(longpressoption).release().perform();

//  .longPress(PointOption.point(415,645))
//        new TouchAction(driver)
//                .longPress(PointOption.point(652,750))
//                .waitAction(WaitOptions.waitOptions(ofSeconds(3)))
//                .release().perform();

//        MobileElement selectAllMember = driver.findElementByXPath("(//android.view.View/android.widget.EditText");
//        selectAllMember.sendKeys("oke");
//        for (int i = 0; i < 5; i++) {
//            selectAllMember.sendKeys("S");
//        }
//        MobileElement tellYourCommentField = driver.findElementByXPath("//android.view.View/android.widget.EditText");
//        AndroidTouchAction touch = new AndroidTouchAction(driver);
//        LongPressOptions longpressoption = new LongPressOptions();
//        longpressoption.withDuration(Duration.ofSeconds(3)).withElement(ElementOption.element(tellYourCommentField));
//        touch.longPress(longpressoption).release().perform();

    }

    public void selectAllText(){
        MobileElement tellYourCommentField = driver.findElementByXPath("//android.view.View/android.widget.EditText");
        AndroidTouchAction touch = new AndroidTouchAction(driver);
        LongPressOptions longpressoption = new LongPressOptions();
        longpressoption.withDuration(Duration.ofSeconds(3)).withElement(ElementOption.element(tellYourCommentField));
        touch.longPress(longpressoption).release().perform();

        new TouchAction(driver)
                .longPress(point(415,645))
                .waitAction(waitOptions(ofSeconds(3)))
                .release().perform();
    }

    public void inputTextUsingSpaceButtonAsCharacterInTellYourCommentField(){
        MobileElement tellYourCommentField = driver.findElementByXPath("(//*[@class = 'android.widget.EditText'])");
        tellYourCommentField.sendKeys(" ");
    }

    public void tapSubmitAddCommentButton(){
        MobileElement submitAddCommentButton = driver.findElementByXPath("//android.widget.Button[@content-desc=\"submit\"]");
        submitAddCommentButton.click();
    }


    public void popUpNewAnswerOnQuestion(){
        MobileElement popUpGetQuestion = driver.findElementById("android:id/statusBarBackground");
        popUpGetQuestion.isDisplayed();
    }

    public void popUpCommentCantBeEmpty(){
        MobileElement popUpCommentCantBeEmpty = driver.findElementByXPath("//android.view.View[@content-desc=\"comments can't be empty\"]");
        popUpCommentCantBeEmpty.isDisplayed();
    }

    public void tapMentionUserButton(){
        MobileElement mentionUserBtn = driver.findElementByXPath("(//*[@class = 'android.widget.Button'])[1]");
        mentionUserBtn.click();
    }

    public void selectOneOfUserToMention(){
        MobileElement oneOfUserToMention = driver.findElementByXPath("(//*[@class = 'android.widget.ImageView'])[1]");
        oneOfUserToMention.click();
    }

    public void tapBoldButton(){
//        MobileElement boldButton = driver.findElementByXPath("(//*[@class = 'android.widget.ToggleButton'])[1]");
//        TouchAction action = new TouchAction(driver);
//        action.tap(new TapOptions().withElement(new ElementOption().withElement(boldButton))).perform();
        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(new PointOption().withCoordinates(216, 614)).perform();
//        new TouchAction(driver)
//                .tap(PointOption.point(211,657))
//                .waitAction(WaitOptions.waitOptions(ofSeconds(3)))
//                .release().perform();
    }

    public void tapItalicButton(){
        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(new PointOption().withCoordinates(337, 614)).perform();
//        MobileElement italicButton = driver.findElementByXPath("(//*[@class = 'android.widget.ToggleButton'])[2]");
//        italicButton.click();
    }

    public void tapStrikethroughButton(){
        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(new PointOption().withCoordinates(451, 614)).perform();
//        MobileElement strikethroughButton = driver.findElementByXPath("(//*[@class = 'android.widget.ToggleButton'])[3]");
//        strikethroughButton.click();
    }

    public void tapOrderedListButton(){
        MobileElement orderedListButton = driver.findElementByXPath("(//*[@class = 'android.widget.Button'])[3]");
        orderedListButton.click();
    }

    public void tapUnorderedListOptionButton(){
        MobileElement unorderedListButton = driver.findElementByXPath("//android.view.View[@text=\"Unordered List\"]");
        unorderedListButton.click();

    }

    public void tapOneOfDropdownMenu()throws Exception{
        Thread.sleep(3000);
        MobileElement unorderedListButton = driver.findElementByXPath("//android.view.View[@text=\"Unordered List\"]");

        for (int i = 0; i < driver.findElements(By.xpath("//android.widget.ListView[@text=\"Unordered List, 4 items\"]/child::node()")).toArray().length; i++)
        {
            driver.findElements(By.xpath("//android.widget.ListView[@text=\"Unordered List, 4 items\"]/child::node()")).get(i).click();
            Thread.sleep(3000);
            unorderedListButton.click();
        }
    }

    public void tapInsertButton(){
        MobileElement insertButton = driver.findElementByXPath("(//*[@class = 'android.widget.Button'])[2]");
        insertButton.click();
    }


    public void tapAddImageButton(){
        MobileElement addImageButton = driver.findElementByXPath("//android.widget.Button[1]");
        addImageButton.click();
    }

    public void tapAddFileButton(){
        MobileElement addFileButton = driver.findElementByXPath("//android.widget.Button[2]");
        addFileButton.click();
    }
    public void tapAddVideoButton(){
        MobileElement addVideoButton = driver.findElementByXPath("//android.widget.Button[3]");
        addVideoButton.click();
    }

    public void inputSupportedImage() throws IOException {
        AndroidDriver driver1 = (AndroidDriver) driver;
//        MobileElement byUpload = driver.findElementByXPath("//android.view.View[@content-desc=\"by upload\"]");
//
//        String imagePath = this.getClass().getResource("/Users/sandikurnia/SekolahQA/Intern - Cilsy Fiolution/Mobile Testing/CicleMobile/src/main/java/com/sandikurnia/filetest/AndroidStudio.png").getPath();
//        driver1.pushFile("/Downloads/AndroidStudio.png", new File(imagePath));
//      byUpload.sendKeys("/Users/sandikurnia/SekolahQA/Intern - Cilsy Fiolution/Mobile Testing/CicleMobile/src/main/java/com/sandikurnia/filetest/AndroidStudio.png");
        driver1.pushFile("/Users/sandikurnia/SekolahQA/Intern - Cilsy Fiolution/Mobile Testing/CicleMobile/src/main/java/com/sandikurnia/filetest/AndroidStudio.png", new File("/Users/sandikurnia/SekolahQA/Intern - Cilsy Fiolution/Mobile Testing/CicleMobile/src/main/java/com/sandikurnia/filetest/AndroidStudio.png"));
    }


    // ARCHIVE \\
    public void tapArchiveButton(){
        MobileElement ArchiveButton = driver.findElementByXPath("//android.view.View[@content-desc=\"Archive\"]");
        ArchiveButton.click();
    }

    public void tapYesArchiveButton(){
        MobileElement YesArchive = driver.findElementByXPath("//android.widget.Button[@content-desc=\"Yes\"]");
        YesArchive.click();
    }

    public void tapOkArchiveCommentButton(){
        MobileElement OkArchive = driver.findElementByXPath("//android.widget.Button[@content-desc=\"Ok\"]");
        OkArchive.click();
    }

    public void tapCancelArchiveButton(){
        MobileElement CancelArchive = driver.findElementByXPath("//android.widget.Button[@content-desc=\"Cancel\"]");
        CancelArchive.click();
    }

    // REPLY COMMENT \\

    public void tapReplyCommentButton() throws Exception{
        Thread.sleep(3000);
//        MobileElement replyButton = driver.findElementByXPath("(//*[@class = 'android.view.View'])[11]");
//       //MobileElement replyButton = driver.findElementByXPath("//android.view.View[@content-desc=\"Reply\"]");
//        replyButton.click();
//
        new TouchAction(driver)
                .tap(point(965,1246))
                .waitAction(waitOptions(ofMillis(250))).perform();

    }

    public void canViewNewReplyComment()throws Exception{
        Thread.sleep(3000);
        MobileElement newReply = driver.findElementByXPath("(//*[@class = 'android.view.View'])[13]");
        newReply.isDisplayed();
    }

    public void tapByUploadButton(){
        MobileElement byUploadButton = driver.findElementByXPath("//android.view.View[@content-desc=\"by upload\"]");
        byUploadButton.click();
    }

    public void inputImageByUpload(){
        MobileElement imageByUpload = driver.findElementByXPath("(//*[@class = 'android.widget.FrameLayout'])[8]");
        imageByUpload.click();
    }

    public void tapByURLButton(){
        MobileElement byUrlButton = driver.findElementByXPath("//android.view.View[@content-desc=\"by url\"]");
        byUrlButton.click();
    }

    public void tapInsertLinkHereField(){
        MobileElement insertLinkHereField = driver.findElementByXPath("(//*[@class = 'android.widget.EditText'])");
        insertLinkHereField.click();
    }

    public void inputInvalidUrl(){
        MobileElement insertLinkHereField = driver.findElementByXPath("(//*[@class = 'android.widget.EditText'])");
        insertLinkHereField.sendKeys("ga valid");
    }

    public void inputValidUrl(){
        MobileElement insertLinkHereField = driver.findElementByXPath("(//*[@class = 'android.widget.EditText'])");
        insertLinkHereField.sendKeys("https://www.garmin.co.id/minisite/instinct/instinct-onepiece/images/onepiece-kv-luffy.png");
    }

    public void popUpNotValidUrl(){
        MobileElement notValidUrl = driver.findElementByAccessibilityId("not valid url");
        notValidUrl.isDisplayed();
    }


    public void tapThreeDotButtonComment(){
        new TouchAction(driver)
                .tap(point(973,939))
                .waitAction(waitOptions(ofMillis(250))).perform();

    }

    public void popUpArchivedCommentSuccess(){
        MobileElement archivedCommentPopup = driver.findElementByAccessibilityId("your comment has been archived");
        archivedCommentPopup.isDisplayed();
    }

    public void tapThreeDotButtonReplyComment(){
        new TouchAction(driver)
                .tap(point(973,813))
                .waitAction(waitOptions(ofMillis(250))).perform();
    }
    public void tapInserURLButton(){
        MobileElement insertButton = driver.findElementByXPath("//android.widget.Button[@content-desc=\"Insert\"]");
        insertButton.click();
    }

                        // ------------------------ MAIN PAGE ------------------------ \\

    public void checkinMainPageAssert(){
        MobileElement checkinPage = driver.findElementByAccessibilityId("Create Question\n" +
                "[Check-in] - Div Cilsy");
        checkinPage.isDisplayed();
    }

    public void scrollDown(){
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(530, 330)).waitAction(WaitOptions.waitOptions(ofSeconds(1)))
                .moveTo(PointOption.point(530, 915)).release().perform();
    }

    public void scrollUp(){
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(500, 1250)).waitAction(WaitOptions.waitOptions(ofSeconds(1)))
                .moveTo(PointOption.point(500, 230)).release().perform();
    }

    public void swipeLeft(){
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(1062, 1032)).waitAction(WaitOptions.waitOptions(ofSeconds(1)))
                .moveTo(PointOption.point(265, 1032)).release().perform();
    }

    public void swipeRight(){
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(265, 1032)).waitAction(WaitOptions.waitOptions(ofSeconds(1)))
                .moveTo(PointOption.point(1062, 1032)).release().perform();
    }

    public void settingMenuInMainPage(){
        MobileElement checkinPage = driver.findElementByXPath("//android.view.View[@content-desc=\"Settings\"]");
        checkinPage.isDisplayed();
    }

    public void checkInDropdownMenu(){
        MobileElement checkinDrowpdownMenu = driver.findElementByXPath("//android.widget.Button[@content-desc=\"Check-Ins\"]");
        checkinDrowpdownMenu.click();
    }
    public void scrollUpInDropDownMennu(){
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(507, 1685)).waitAction(WaitOptions.waitOptions(ofSeconds(1)))
                .moveTo(PointOption.point(513, 1200)).release().perform();
    }
    public void checkinButtonOnDropDownMenu(){
        MobileElement checkinButtonMenu = driver.findElementByXPath("//android.view.View[@content-desc=\"Check-Ins\"]");
        checkinButtonMenu.click();
    }

    public void tapbackButtonOnUpperRightSide(){
        MobileElement backButtonOnUpperRightSide = driver.findElementByXPath("//android.widget.Button[@content-desc=\"Back\"]");
        backButtonOnUpperRightSide.click();
    }

    public void checkInMainPage(){
        MobileElement checkinDrowpdownMenu = driver.findElementByXPath("//android.widget.Button[@content-desc=\"Check-Ins\"]");
        checkinDrowpdownMenu.isDisplayed();
    }

    public boolean settingMenuNotShowingInMainPage() {

        try {
            if (driver.findElement(By.xpath("//android.view.View[@content-desc=\"Settings\"]")).isDisplayed()) {
                return false;
            }
            return false;
        } catch (Exception e) {
            System.out.println("No element displayed");
            return true;
        }
    }
     public void overviewPages(){
            MobileElement overViewPage = driver.findElementByXPath("//android.widget.Button[@content-desc=\"Overview\"]");
            overViewPage.isDisplayed();
        }

    // ------------------------ EDIT COMMENT ------------------------ \\

    public void tapEditCommentButton(){
        MobileElement editCommentButton = driver.findElementByAccessibilityId("Edit Comment");
        editCommentButton.click();
    }

    public void popUpYourCommentHasBeenEdited(){
        MobileElement yourCommentHasBeenEdited = driver.findElementByXPath("//android.view.View[@content-desc=\"your comment has been edited\"]");
        yourCommentHasBeenEdited.isDisplayed();
    }




    // Delete Comment \\

    public void archiveButton(){
        MobileElement ArchiveButton = driver.findElementByXPath("//android.view.View[@content-desc=\"Archive\"]");
        ArchiveButton.isDisplayed();
    }
    public void deleteText(){
        driver.findElementByXPath("(//*[@class = 'android.widget.EditText'])").clear();

        driver.hideKeyboard();
    }


// ------------------------ CHEERS ON COMMENT ------------------------ \\


    public void tapCheersButtonOnComment(){

        new TouchAction(driver)
                .tap(point(975,1037))
                .waitAction(waitOptions(ofMillis(250))).perform();


//        new TouchAction(driver)
//                .tap(point(710,1036))
//                .waitAction(waitOptions(ofMillis(250))).perform();
//
//
//        new TouchAction(driver)
//                .tap(point(565,1120))
//                .waitAction(waitOptions(ofMillis(250))).perform();

//        MobileElement cheersButtonOnComment = driver.findElementByXPath("(//*[@class = 'android.widget.ImageView'])[2]");
//        cheersButtonOnComment.click();
    }

    public void tapCheersField(){
        MobileElement cheersField = driver.findElementByXPath("//android.widget.EditText[@text(),\"Give’em cheers!\"]");
        cheersField.click();

    }

    public void inputTextInCheersField(){
        MobileElement cheersField = driver.findElementByXPath("//android.widget.EditText[@text(),\"Give’em cheers!\"]");
        cheersField.sendKeys("MANTAP");
    }
    public void inputTextUsingSpacesButtonAsCharacterInCheersField(){
        MobileElement cheersField = driver.findElementByXPath("//android.widget.EditText[@text(),\"Give’em cheers!\"]");
        cheersField.sendKeys(" ");
    }

    public void tapChecklistCheersButton(){

        new TouchAction(driver)
                .tap(point(711,1014))
                .waitAction(waitOptions(ofMillis(250))).perform();

    }
    public void tapCancelCheersCheersButton(){

        new TouchAction(driver)
                .tap(point(808,1023))
                .waitAction(waitOptions(ofMillis(250))).perform();
    }

}
