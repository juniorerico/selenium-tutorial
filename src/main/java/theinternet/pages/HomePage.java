package theinternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	private WebDriver driver;
	
	private By linkFormAuthentication = By.linkText("Form Authentication");
	private By linkHover = By.linkText("Hovers");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickFormAuthentication() {
		driver.findElement(linkFormAuthentication).click();
	}
	
	public void clickHovers() {
		driver.findElement(linkHover).click();
	}
}
