package Steps;
import UIPages.LoginPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

//this class will define the steps to run
public class LoginPageSteps {

    private LoginPage loginPage;


    @Step
    public void isOnLoginPage(){
        loginPage.open();
    }

    @Step
    public void loginAsUser(){
        loginPage.doLogin();
    }

    @Step
    public void AccountNavigation()  throws InterruptedException{
        loginPage.creatingAccount();
        loginPage.creatingOpenIDConfiguration();
        loginPage.clientRegistration();
    }
}
