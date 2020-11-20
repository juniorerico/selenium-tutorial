package theinternet.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import theinternet.pages.HomePage;
import theinternet.pages.LoginPage;

public class LoginSuccess {
	private WebDriver driver;
	
	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/");
	}
	
	@Test
	public void loginSuccess() {
		HomePage homePage = new HomePage(driver);
		homePage.clickFormAuthentication();
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("tomsmith", "SuperSecretPassword!");
		
		Assert.assertTrue(loginPage.getResultMessage().contains("You logged into a secure area!"));
	}
}
