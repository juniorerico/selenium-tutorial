package seleniumchallenges.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import seleniumchallenges.pages.SelectorPracticesPage;

public class ChallengeFour {
	private WebDriver driver;
	
	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://juniorerico.github.io/aubay-selenium/selectors-practice.html");
	}
	
	@Test
	public void challengeFour() {
		SelectorPracticesPage selectorPracticesPage = new SelectorPracticesPage(driver);
		selectorPracticesPage.buy("Produto 3");

		Assert.assertTrue(selectorPracticesPage.getResult().equals("Tente novamente!"));
	}
	
	@AfterClass
	public void tearDown() {
		//driver.quit();
	}
}
