package com.mytests;
import java.lang.Math;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;
import com.mytests.WinDiver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;





public class MendixTest {
	
	public static WindowsDriver driver = null;
	Random random = new Random();
	String variable= "AppOIDCProvider";
	String avariable= "App 'AppOIDCProvider";
	Integer value =  10+random.nextInt(90);
	

@BeforeTest
public  void setUp() throws IOException, InterruptedException {
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability("app", "Root");
	cap.setCapability("platformName", "Windows");
	cap.setCapability("deviceName", "WindowsPC");
	WinDiver.start();
	try {
		driver = new WindowsDriver (new URL("http://127.0.0.1:4723"), cap);
	} catch (MalformedURLException e) {
	e.printStackTrace();
	}
	Thread.sleep(10000);	 
driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
}
	
	
	
@Test(priority=1)
public void launchingMendixStudioPro() throws InterruptedException {
	WinDiver.launch();
	driver.findElementByName("Create New App").click();
	Thread.sleep(2000);	 		 
	}
	
@Test(priority=2)
public void creatingApp() throws InterruptedException {
	driver.findElementByName("Blank Web App").click();
	driver.findElementByName("Use this starting point >").click();
	driver.findElementByAccessibilityId("Appname").sendKeys("AppOIDCProvider"+value);
	driver.findElementByName("Create app").click();
	}
	
	

@Test(priority=3)
public void importingModule() throws InterruptedException{
//	WebDriverWait wait = new WebDriverWait(driver, 240000);
//	wait.until(ExpectedConditions.titleContains("variable+value.toString()+(Main line) - 9.12.10"));
	Thread.sleep(240000);
	String newWindowTitle = "variable+value.toString()+(Main line) - 9.12.10";
	   
    for (String handle : driver.getWindowHandles()) {
	    driver.switchTo().window(handle);
	    if (driver.getTitle().equals(newWindowTitle)) {
	    break;
	  }
   } 
}
	    
@Test(priority=4)    
public void clickingOnImportButton() throws InterruptedException{	
		
	Thread.sleep(60000);
	WebElement clickOnApp = driver.findElementByName(avariable+value.toString()+"'");
	Actions actions = new Actions(driver);
	Thread.sleep(30000);
	actions.contextClick(clickOnApp).perform();
	System.out.println(avariable+value.toString()+"'");
	Thread.sleep(2000);
	driver.findElementByName("Import module package…").click();
	WebElement openWindowPopupFileNameTextbox = driver.findElementByXPath("//Edit[@Name='File name:']");
	openWindowPopupFileNameTextbox.sendKeys("MxModelReflection");
		
	driver.findElementByName("Open").click();
	Thread.sleep(2000);
	driver.findElementByName("Import").click();
	Thread.sleep(2000);
		
	actions.contextClick(clickOnApp).perform();
	Thread.sleep(2000);
	driver.findElementByName("Import module package…").click();
		
	WebElement openWindowPopupFileName = driver.findElementByXPath("//Edit[@Name='File name:']");
	openWindowPopupFileName.sendKeys("CommunityCommons");
		
	driver.findElementByName("Open").click();
	Thread.sleep(2000);
	driver.findElementByName("Import").click();
	Thread.sleep(2000);
		
	actions.contextClick(clickOnApp).perform();
	Thread.sleep(2000);
	driver.findElementByName("Import module package…").click();
	WebElement openWindowFileNameTextbox = driver.findElementByXPath("//Edit[@Name='File name:']");
	openWindowFileNameTextbox.sendKeys("OIDCProvider-Mx9-1.0.0");
	driver.findElementByName("Open").click();		
	driver.findElementByName("Import").click();
	driver.findElementByName("OK").click();
		
		
	}
	    
@Test(priority=5)
public void changingTheSetting() throws InterruptedException{	
	WebElement app = driver.findElementByName(avariable+value.toString()+"'");
    Actions actions = new Actions(driver);
	actions.doubleClick(app).build().perform();
	
	driver.findElementByAccessibilityId("viewPort").click();
		
	WebElement Marketplace = driver.findElementByName("Marketplace modules");
	actions.doubleClick(Marketplace).build().perform();
		

	WebElement admin = driver.findElementByName("Administration");
	actions.doubleClick(admin).build().perform();
		
	WebElement domain = driver.findElementByName("Domain model");
	actions.doubleClick(domain).build().perform();
		
	driver.findElementByName("Update security").click();
	actions.doubleClick(admin).build().perform();
	actions.doubleClick(Marketplace).build().perform();

	WebElement security = driver.findElementByName("Security");
	actions.contextClick(security).perform();
		
	driver.findElementByName("Open").click();
	WebElement windowTitleBar = driver.findElement(By.xpath("//Window[@Name='App Security']/TitleBar"));
	actions.dragAndDropBy(windowTitleBar, 0, -400).perform();

	driver.findElementByName("Production").click();
	
	driver.findElementByName("User roles").click();
	WebElement button = driver.findElement(By.name("System.Administrator, Administration.Administrator, MyFirstModule.User"));
	actions.doubleClick(button).perform();
	
	WebElement ModuleRoleButton = driver.findElementByName("Name Row 0, Sorted ascending.");
	actions.doubleClick(ModuleRoleButton).perform();
		
	WebElement cursor = driver.findElementByName("MxModelReflection");
	cursor.click();
	Thread.sleep(2000);
	actions.moveByOffset(-90, 0).click().perform();

	Thread.sleep(2000);
		
	driver.findElementByName("Admin").click();
	Thread.sleep(2000);
	actions.moveByOffset(-50, 0).click().perform();
		
	driver.findElementByAccessibilityId("btnOK").click();
	Thread.sleep(1000);	
	driver.findElementByAccessibilityId("btnOk").click();
	Thread.sleep(1000);
	driver.findElementByAccessibilityId("OK").click();
}
	
@Test(priority=6)
public void configureAppModules() throws InterruptedException{
		
	driver.findElementByName("Domain Model [Administration]").click();		
	Actions actions = new Actions(driver);
	actions.moveByOffset(0, 250);
	actions.doubleClick();
	actions.perform();
		
	driver.findElementByName("Access rules").click();
	WebElement administartor  = driver.findElement(By.name("Administrator"));
	actions.doubleClick(administartor).perform();
		
	driver.findElementByName("OpenIDConnectProvider.AccountDetail_Account (OpenIDConnectProvider.AccountDetail)").click();
	actions.moveByOffset(350, 0).click().perform();

	List<WebElement> elements = driver.findElements(By.className("ListBoxItem"));
	WebElement read = elements.get(1);
	read.click();
		
	List<WindowsElement> okBtn = driver.findElementsByName("OK");
		
	if (okBtn.size() > 0) {
		 WindowsElement buttons = okBtn.get(1); // access the first button in the list
		 buttons.click(); // click the button
	}	
	driver.findElementByName("OK").click();
		
		
	WebElement settings = driver.findElementByName("Settings");
	Thread.sleep(30000);
	actions.contextClick(settings).perform();
		
	driver.findElementByName("Open").click();
	driver.findElementByName("Runtime").click();
		
		
	List<WindowsElement> select = driver.findElementsByName("Select…");
		
	if (select.size() > 0) {
		   WindowsElement button = select.get(0); // access the first button in the list
		   button.click(); // click the button
		}
	List<WindowsElement> expand0 = driver.findElementsByAccessibilityId("ExpandPath");
		
	WindowsElement expandsearch0 = expand0.get(3); 
	expandsearch0.click();
	driver.findElementByName("ASU_Start_All").click();
	driver.findElementByName("Select").click();
	driver.findElementByName("OK").click();
		
	
		
	WebElement navigation = driver.findElementByName("Navigation");
	actions.contextClick(navigation).perform();
	driver.findElementByName("Open").click();		
	driver.findElementByName("New item").click();		
	WebElement caption= driver.findElementByAccessibilityId("Caption");
	caption.clear();
	caption.sendKeys("Accounts");		
	driver.findElementByName("Select...").click();	
	driver.findElementByName("plus").click();
	driver.findElementByName("Select").click();
	driver.findElementByAccessibilityId("Onclick").click();
	driver.findElementByName("Show a page").click();
	List<WindowsElement> expand = driver.findElementsByAccessibilityId("ExpandPath");
	WindowsElement expandsearch = expand.get(3); 
	expandsearch.click();
	Thread.sleep(2000);
	WebElement accounts = driver.findElementByName("Accounts");
	actions.doubleClick(accounts).perform();
	driver.findElementByName("AccountDetail_Overview").click();
	driver.findElementByName("Select").click();
	driver.findElementByName("OK").click();
			
	}

@Test(priority=7)

public void selecting () throws InterruptedException{
	
//	//selecting new item 1111
	Actions actions = new Actions(driver);
	driver.findElementByName("New item").click();
	WebElement caption2= driver.findElementByAccessibilityId("Caption");
	caption2.clear();
	caption2.sendKeys("Active Sessions");
	driver.findElementByName("Select...").click();
	driver.findElementByName("euro").click();
	driver.findElementByName("Select").click();
	driver.findElementByAccessibilityId("Onclick").click();
	driver.findElementByName("Show a page").click();
	List<WindowsElement> expand = driver.findElementsByAccessibilityId("ExpandPath");
	Thread.sleep(2000);
	WindowsElement expandAdmin = expand.get(0); 
	expandAdmin.click();	 
	WebElement admin = driver.findElementByName("Administration");
	actions.doubleClick(admin).perform();
	WebElement systemAdministrator = driver.findElementByName("System Administration");
	actions.doubleClick(systemAdministrator).perform();	
	driver.findElementByName("ActiveSessions").click();
	driver.findElementByName("Select").click();
	driver.findElementByName("OK").click();
	Thread.sleep(2000);
	
	driver.findElementByName("New item").click();
	WebElement caption3= driver.findElementByAccessibilityId("Caption");
	caption3.click();
	caption3.clear();
	caption3.sendKeys("Scheduled Events");
	driver.findElementByName("Select...").click();
	driver.findElementByName("cloud").click();
	driver.findElementByName("Select").click();	
	driver.findElementByAccessibilityId("Onclick").click();
	driver.findElementByName("Show a page").click();
	Thread.sleep(1000);
	List<WindowsElement> expand1 = driver.findElementsByAccessibilityId("ExpandPath");
	WindowsElement expandAdmin1 = expand1.get(0); 
	expandAdmin1.click();
	WebElement admin1 = driver.findElementByName("Administration");
	actions.doubleClick(admin1).perform();
	WebElement systemAdministrator1 = driver.findElementByName("System Administration");
	actions.doubleClick(systemAdministrator1).perform();
	driver.findElementByName("ScheduledEvents").click();
	driver.findElementByName("Select").click();
	driver.findElementByName("OK").click();
	
	driver.findElementByName("New item").click();
	WebElement caption4= driver.findElementByAccessibilityId("Caption");
	caption4.click();
	caption4.clear();
	caption4.sendKeys("Runtime Instances");
	driver.findElementByName("Select...").click();
	driver.findElementByName("envelope").click();
	driver.findElementByName("Select").click();	
	driver.findElementByAccessibilityId("Onclick").click();
	driver.findElementByName("Show a page").click();
	Thread.sleep(1000);
	List<WindowsElement> expand2 = driver.findElementsByAccessibilityId("ExpandPath");
	WindowsElement expandAdmin2 = expand2.get(0); 
	expandAdmin2.click();
	WebElement admin2 = driver.findElementByName("Administration");
	actions.doubleClick(admin2).perform();
	WebElement systemAdministrator2 = driver.findElementByName("System Administration");
	actions.doubleClick(systemAdministrator2).perform();
	driver.findElementByName("RuntimeInstances").click();
	driver.findElementByName("Select").click();
	driver.findElementByName("OK").click();
	
	driver.findElementByName("New item").click();	
	WebElement caption5= driver.findElementByAccessibilityId("Caption");
	caption5.clear();
	caption5.sendKeys("My Account");
	driver.findElementByName("Select...").click();
	driver.findElementByName("star").click();
	driver.findElementByName("Select").click();
	driver.findElementByAccessibilityId("Onclick").click();
	driver.findElementByName("Call a microflow").click();	 
	Thread.sleep(2000);
	List<WindowsElement> expand3 = driver.findElementsByAccessibilityId("ExpandPath");
	WindowsElement expandAdmin4 = expand3.get(0); 
	expandAdmin4.click();
	WebElement admin3 = driver.findElementByName("Administration");	 
	actions.doubleClick(admin3).perform();
	WebElement userManagement = driver.findElementByName("User Management");
	actions.doubleClick(userManagement).perform();	
	WebElement user = driver.findElementByName("User");
	actions.doubleClick(user).perform();
	driver.findElementByName("ManageMyAccount").click();
	driver.findElementByName("Select").click();
	driver.findElementByName("OK").click();

	driver.findElementByName("New item").click();	
	WebElement caption6= driver.findElementByAccessibilityId("Caption");
	caption6.clear();
	caption6.sendKeys("OpenID Connect");
	driver.findElementByName("Select...").click();
	driver.findElementByName("minus").click();
	driver.findElementByName("Select").click();
	driver.findElementByAccessibilityId("Onclick").click();
	driver.findElementByName("Show a page").click();
	List<WindowsElement> expand4 = driver.findElementsByAccessibilityId("ExpandPath");
	 WindowsElement expandOIDC = expand4.get(3); 
	expandOIDC.click();
	WebElement USE = driver.findElementByName("_USE_ME");	 
	actions.doubleClick(USE).perform();
	driver.findElementByName("OpenIDConnect_Dashboard").click();
	driver.findElementByName("Select").click();
	driver.findElementByName("OK").click();

}

@Test(priority=8)	
public void  commitTheChanges() throws InterruptedException{
	
	driver.findElementByName("Changes").click();
	driver.findElementByName("Commit").click();
	driver.findElementByName("Save and continue").click();
	Thread.sleep(3000);
	WebElement message = driver.findElementByAccessibilityId("Message");
	message.click();
	message.sendKeys("commit is done");
	driver.findElementByName("OK").click();
	Thread.sleep(60000);
	
}
@Test(priority=9)
public void  publishTheApp() throws InterruptedException{
	Thread.sleep(120000);
	driver.findElementByName("_Run").click();
	driver.findElementByName("Run Locally").click();
	Thread.sleep(30000);
	driver.findElementByName("Domain Model [Administration]").click();
	driver.findElementByName("Errors").click();
	driver.findElementByName("View App").click();
	Thread.sleep(30000);
}


@AfterTest
public void stop()
  {
//	WinDiver.cmd();
//	WebElement cmd = driver.findElementByName("Text Area");
//	cmd.sendKeys("cd C:\\Users\\harshitar\\IdeaProjects\\OIDCProviderBDDSerenity");
//	cmd.sendKeys(Keys.RETURN);
//	cmd.sendKeys("gradle test");
//	cmd.sendKeys(Keys.RETURN);
	
	if(driver!=null) 
	{
	driver.quit();
	}
	WinDiver.stop();
	
  }

}
