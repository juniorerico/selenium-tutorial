package seleniumchallenges.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IFramePage {
	private WebDriver driver;
	
	private By iFrame = By.cssSelector("iFrame");
	private By yellowButtonChallengeOne = By.cssSelector("#group-1 .btn-warning");
	private By resultOne = By.id("result-1");
	
	private By redButtonChallengeFive = By.cssSelector("#group-5 .btn-danger");
	private By resultFive = By.id("result-5");
	
	public IFramePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void switchToIframe() {
		driver.switchTo().frame(driver.findElement(iFrame));
	}

	public void switchToDefault() {
		driver.switchTo().defaultContent();
	}
	
	public void solveChallengeOne() {
		driver.findElement(yellowButtonChallengeOne).click();
	}
	
	public String getResultOne() {
		return driver.findElement(resultOne).getText();
	}
	
	public void solveChallengeFive() {
		driver.findElement(redButtonChallengeFive).click();
	}
	
	public String getResultFive() {
		return driver.findElement(resultFive).getText();
	}
}
