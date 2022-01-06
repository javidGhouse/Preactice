package fileUtility;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.crm.vtiger.generic.utilities.javaUtility;
import com.crm.vtiger.generic.utilities.webDriverUtilities;
import com.vtiger.crm.pomRepository.Login_Pom;
import com.vtiger.crm.pomRepository.Logout_Pom;

public class BaseClass {

	public WebDriver dri;

	public static WebDriver driver;

	public propertiesFileUtility pf = new propertiesFileUtility();
	public javaUtility ju = new javaUtility();
	public JasonFileUtility jf = new JasonFileUtility();
	public dataBaseUtility dbf = new dataBaseUtility();
	public webDriverUtilities wdu = new webDriverUtilities();

	//@Parameters("browser")
	@BeforeClass(groups= {"smoketest"})
	public void launchBrowser() throws IOException {
	
		String browser = pf.readDataFromProperty("browser");
		if (browser.equalsIgnoreCase("Chrome")) {
			dri = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("FireFox")) {
			dri = new FirefoxDriver();
		} else {

		}
		driver = dri;
		dri.manage().window().maximize();
		String url = pf.readDataFromProperty("url");
		dri.get(url);
		wdu.waitUntilPageLoad(dri);

	}

	@BeforeMethod(groups= {"smoketest"})
	public void login() throws Exception {
		Login_Pom lp = new Login_Pom(dri);
		String user = pf.readDataFromProperty("username");
		String pass = pf.readDataFromProperty("password");
		lp.loginClick(user, pass);
	}

	/*
	 * @BeforeMethod public void pressLead() { lp.leadMethod(dri); }
	 */

	@AfterMethod(groups= {"smoketest"})
	public void logout() throws InterruptedException {
		// webDriverUtilities wdu = new webDriverUtilities();
		// wdu.waitUntilPageLoad(dri);
		Thread.sleep(5000);
		Logout_Pom lo = new Logout_Pom(dri);
		lo.signOut();
	}

	@AfterClass(groups= {"smoketest"})
	public void closeBrowser() {
		driver.close();
	}

}
