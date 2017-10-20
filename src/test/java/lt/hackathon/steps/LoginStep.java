package lt.hackathon.steps;

import lt.hackathon.pageobjects.SignInLinkArea;
import lt.hackathon.pageobjects.SignInPage;

import static com.codeborne.selenide.Selenide.open;

public class LoginStep {

    public static void login() {
        open("/");
        SignInLinkArea signInLinkArea = new SignInLinkArea();
        signInLinkArea.openSignInPage();
        String userEmail = System.getProperty("amazon.username"),
                userPassword = System.getProperty("amazon.password");
        new SignInPage().login(userEmail, userPassword);
    }
}
