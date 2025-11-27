package com.demowebshop.test;

import com.demowebshop.core.TestBase;
import com.demowebshop.models.User;
import com.demowebshop.utils.MyDataPrivider;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class RegistrationCsvTest extends TestBase {

    @Test(dataProvider = "addNewContactFromCsv", dataProviderClass = MyDataPrivider.class)
    public void createNewUserFroCsvFileTest(User user){

        app.getUser().clickOnRegisterLink();
        app.getUser().fillRegistrationFormFromCsv(user);
        app.getUser().clickOnRegistrationButton();
        Assert.assertTrue(app.getUser().isSuccessRegistrationMassagePresent());
        app.getUser().clickOnLogoutButton();
    }

}
