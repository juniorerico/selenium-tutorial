package theinternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;
	
	private By inputUsername = By.id("username");
	private By inputPassword = By.id("password");
	private By buttonLogin = By.className("radius");
	
	private By resultMessage = By.id("flash");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void login(String username, String password) {
		driver.findElement(inputUsername).sendKeys(username);
		driver.findElement(inputPassword).sendKeys(password);
		driver.findElement(buttonLogin).click();
	}
	
	public String getResultMessage() {
		return driver.findElement(resultMessage).getText();
	}
}
