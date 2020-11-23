package seleniumchallenges.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import seleniumchallenges.pages.IFramePage;
import seleniumchallenges.pages.SelectorPracticesPage;

public class HandlingIFrames {
	private WebDriver driver;
	
	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://juniorerico.github.io/aubay-selenium/iframe-practice.html");
	}
	
	@Test(priority=1)
	public void challengeOne() {
		IFramePage iFramePage = new IFramePage(driver);
		
		iFramePage.switchToIframe();
		iFramePage.solveChallengeOne();
		
		Assert.assertEquals(iFramePage.getResultOne(), "Muito bem!");
		
		iFramePage.switchToDefault();
	}
	
	@Test(priority=2)
	public void challengeFive() {
		IFramePage iFramePage = new IFramePage(driver);
		
		iFramePage.solveChallengeFive();
		
		Assert.assertEquals(iFramePage.getResultFive(), "Muito bem!");
	}
	
	
	@AfterClass
	public void tearDown() {
		//driver.quit();
	}
}
