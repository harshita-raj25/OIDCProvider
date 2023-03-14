package AppTests;
import Steps.LoginPageSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginPageTest {
    @Steps
    LoginPageSteps loginPageSteps;

    @Managed(driver = "chrome")
    WebDriver browser;


    @Test
    public void TestCases() throws InterruptedException {
        browser.manage().window().maximize();
        loginPageSteps.isOnLoginPage();
        loginPageSteps.loginAsUser();
        loginPageSteps.AccountNavigation();

    }

}
