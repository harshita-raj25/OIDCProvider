package UIPages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.apache.bcel.generic.Select;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

//for oidc provider application
@DefaultUrl("http://localhost:8080/login.html?profile=Responsive")

public class LoginPage extends PageObject {


    public void doLogin(){
        $("#usernameInput").sendKeys("MXadmin");
        $("#passwordInput").sendKeys("1");
        $("#loginButton").click();

    }


    public void creatingAccount()  throws InterruptedException{

        $("#mxui_widget_SidebarToggleButton_0").click();
        WebElement accountsButton = getDriver().findElement(By.className("mx-name-navigationTree3-1"));
        accountsButton.click();

        WebElement newButton = getDriver().findElement(By.id("mxui_widget_ControlBarButton_1"));
        newButton.click();

        WebElement label = getDriver().findElement(By.xpath("//label[@class='control-label'][text()='Full name']"));
        Actions actions = new Actions(getDriver());
        // Move cursor to the nearby element
        actions.moveToElement(label).build().perform();
        // Send keys to the active element (which should be the text field)
        actions.sendKeys("OIDCProviderDemo").build().perform();

        WebElement label1 = getDriver().findElement(By.xpath("//label[@class='control-label'][text()='Username']"));
        label1.click();
        actions.moveToElement(label1).build().perform();
        actions.sendKeys("DemoUser").build().perform();

        WebElement label2 = getDriver().findElement(By.xpath("//label[@class='control-label'][text()='Password']"));
        label2.click();
        actions.moveToElement(label2).build().perform();
        actions.sendKeys("Rajharshita@1").build().perform();

        WebElement label3 = getDriver().findElement(By.xpath("//label[@class='control-label'][text()='Confirm password']"));
        label3.click();
        actions.moveToElement(label3).build().perform();
        actions.sendKeys("Rajharshita@1").build().perform();

        WebElement savebutton = getDriver().findElement(By.cssSelector("button.btn-success"));
        savebutton.click();

        Thread.sleep(1000,5000);

        WebElement forwardButton = getDriver().findElement(By.cssSelector("button.btn.mx-button.mx-referencesetselector-select-button"));
        forwardButton.click();

        Thread.sleep(1000,5000);

        WebElement element = getDriver().findElement(By.cssSelector("td.mx-name-column1[title='User']"));
        element.click();

        Thread.sleep(1000,5000);

        WebElement selectButton = getDriver().findElement(By.cssSelector("button.btn.mx-button.mx-name-selectButton1.btn-default"));
        selectButton.click();

        Thread.sleep(1000,5000);

        WebElement saveButton = getDriver().findElement(By.cssSelector("button.btn.mx-button.mx-name-actionButton1.btn-primary"));
        saveButton.click();
        Thread.sleep(1000,5000);

    }
    public void creatingOpenIDConfiguration()  throws InterruptedException{

        WebElement OpenIDButton = getDriver().findElement(By.className("mx-name-navigationTree3-6"));
        OpenIDButton.click();
        Thread.sleep(1000,5000);

        WebElement serverKeyTab = getDriver().findElement(By.id("mxui_widget_TabContainer_0_tab-1"));
        serverKeyTab.click();

        Thread.sleep(1000,5000);

        WebElement newKey = getDriver().findElement(By.xpath("//button[contains(@class,'mx-name-actionButton3') and contains(@class,'fa-plus') and contains(@class,'btn-link') and contains(@class,'btn-default')]"));
        newKey.click();

        Thread.sleep(1000,5000);

        WebElement scopeTab = getDriver().findElement(By.id("mxui_widget_TabContainer_0_tab-3"));
        scopeTab.click();

        Thread.sleep(1000,5000);

        WebElement newScope = getDriver().findElement(By.className("mx-name-newButton2"));
        newScope.click();

        WebElement label5 = getDriver().findElement(By.xpath("//label[@class='control-label col-sm-4'][text()='Name']"));
        label5.click();

        Actions actions = new Actions(getDriver());
        actions.moveToElement(label5).build().perform();
        actions.sendKeys("DemoScope").build().perform();

        Thread.sleep(1000,5000);

        WebElement standardRadioButton = getDriver().findElement(By.xpath("//label[contains(text(), 'Standard')]"));
        standardRadioButton.click();

        WebElement save = getDriver().findElement(By.xpath("//button[text()='Save']"));
        save.click();

        Thread.sleep(1000,5000);

        WebElement clientTab = getDriver().findElement(By.id("mxui_widget_TabContainer_0_tab-0"));
        clientTab.click();

        Thread.sleep(1000,5000);




    }

    public void clientRegistration()  throws InterruptedException{

        WebElement newClientRegistration = getDriver().findElement(By.xpath("//button[@title='New Client Registration']"));
        newClientRegistration.click();

        Thread.sleep(1000,5000);

        Actions actions = new Actions(getDriver());

        WebElement element = getDriver().findElement(By.xpath("//h4[contains(text(),'Client Registration')]"));
        element.click();
        actions.moveToElement(element).doubleClick().build().perform();


        WebElement manualRegistration = getDriver().findElement(By.linkText("Manual Registration"));
        manualRegistration.click();

        Thread.sleep(1000,5000);

        WebElement clientName = getDriver().findElement(By.xpath("//label[@class='control-label col-sm-3'][text()='Client name']"));
        clientName.click();
        actions.moveToElement(clientName).build().perform();
        actions.sendKeys("demoClient").build().perform();

        Thread.sleep(1000,5000);

        WebElement alias = getDriver().findElement(By.xpath("//label[@class='control-label col-sm-3'][text()='Alias']"));
        alias.click();
        actions.moveToElement(alias).build().perform();
        actions.sendKeys("OIDC Provider").build().perform();

        Thread.sleep(1000,5000);

        WebElement clientSecret = getDriver().findElement(By.xpath("//label[@class='control-label col-sm-3'][text()='Client Secret']"));
        clientSecret.click();
        actions.moveToElement(clientSecret).build().perform();
        actions.sendKeys("abc12345678").build().perform();

        Thread.sleep(1000,5000);

        WebElement postUrlRedirect = getDriver().findElement(By.xpath("//label[@class='control-label col-sm-3'][text()='Post Logout redirect URI']"));
        postUrlRedirect.click();
        actions.moveToElement(postUrlRedirect).build().perform();
        actions.sendKeys("http://localhost:8081/logout").build().perform();

        Thread.sleep(1000,5000);

        WebElement redirectURL = getDriver().findElement(By.xpath("//label[@class='control-label col-sm-3'][text()='Redirect URI']"));
        redirectURL.click();
        actions.moveToElement(redirectURL).build().perform();
        actions.sendKeys("http://localhost:8081/oauth/v2/callback").build().perform();

        Thread.sleep(1000,5000);

        WebElement clientID = getDriver().findElement(By.xpath("//label[@class='control-label col-sm-3'][text()='Client ID']"));
        clientID.click();
        actions.moveToElement(clientID).build().perform();
        actions.sendKeys("DemoClient").build().perform();


        Thread.sleep(1000,5000);

        WebElement elementToScrollTo = getDriver().findElement(By.xpath("//label[text()='Requires PKCE']"));
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", elementToScrollTo);

        Thread.sleep(1000,5000);

        WebElement requiresPKCE = getDriver().findElement(By.xpath("//label[text()='Requires PKCE']"));
        requiresPKCE.click();

        Thread.sleep(1000,5000);


//        WebElement forward = getDriver().findElement(By.cssSelector("button.mx-referencesetselector-select-button"));
//        forward.click();
//        Thread.sleep(10000,5000);



        WebElement saveButton = getDriver().findElement(By.xpath("//button[text()='Save']"));
        saveButton.click();

        Thread.sleep(1000,5000);



    }





}
