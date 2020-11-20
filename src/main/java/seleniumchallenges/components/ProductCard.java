package seleniumchallenges.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductCard {
	private WebDriver driver;
	private WebElement element;
	
	private By image = By.className("card-img-top");
	private By name = By.className("card-text");
	private By buttonBuy = By.className("btn-primary");
	
	public ProductCard(WebDriver driver, WebElement element) {
		this.driver = driver;
		this.element = element;
	}
	
	public void buy() {
		element.findElement(buttonBuy).click();
	}
	
	public String getName() {
		return element.findElement(name).getText();
	}
}
