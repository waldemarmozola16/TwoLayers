package login;

import base.BaseTests;
import pages.LoginPage;

public class LoginTests extends BaseTests {

    public void testSuccessfulLogin() {
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        loginPage.clickLoginButton();
    }

}
