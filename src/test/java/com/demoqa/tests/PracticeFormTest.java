package com.demoqa.tests;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.PracticeFormPage;
import com.demoqa.pages.SidePanel;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeFormTest extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).conformCookies().getForm();
        new SidePanel(driver).selectPracticeForm();
    }
    @Test
    public void enterPracticeFormTest(){
        new PracticeFormPage(driver).hideAd();
        new PracticeFormPage(driver)
                .enterPersonalData("John","Hemmilton","jo@hem.com","1234567890")
                .selectGender("Male")
                .enterDate("5 August 1995")
                .addSubject(new String[]{"Math","English"})
                .selectHobby(new String[]{"Sports","Reading","Music"})
                .uploadPicture("/Users/ap/Tools/1.jpg")
                .enterState("NCR")
                .enterCity("Delhi")
                .submit()
                .verifyStudentAccount("Thanks for submitting the form");
    }

}
