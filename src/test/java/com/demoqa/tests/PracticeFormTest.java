package com.demoqa.tests;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.PracticeFormPage;
import com.demoqa.pages.SidePanel;
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
        new PracticeFormPage(driver)
                .enterPersonalData("John","Hemmilton","jo@hem.com","098765432");
    }

}
