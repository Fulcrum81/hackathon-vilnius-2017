package lt.hackathon.pageobjects.login;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class SignInPage {

    /**
     * Loadable Component
     */
    public SignInPage(){
        submitBtn.shouldBe(visible);
    }
    SelenideElement email=$("#ap_email"),
                password=$("#ap_password"),
                submitBtn=$("#signInSubmit");

    public void login(String userEmail, String userPassword){
        email.setValue(userEmail);
        password.setValue(userPassword);
        submitBtn.click();
    }

}
