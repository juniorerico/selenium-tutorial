package seleniumchallenges.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import theinternet.pages.HomePage;
import theinternet.pages.HoversPage;

public class HandlingHovers {
	private WebDriver driver;

	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/");
	}
	
	@Test
	public void hoverFigures() {
		HomePage homePage = new HomePage(driver);
		homePage.clickHovers();
		
		HoversPage hoversPage = new HoversPage(driver);
		hoversPage.hoverFigures();
	}
	
	@AfterClass
	public void tearDown() {
		//driver.quit();
	}
}
