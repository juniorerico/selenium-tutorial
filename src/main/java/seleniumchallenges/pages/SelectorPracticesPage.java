package seleniumchallenges.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumchallenges.components.ProductCard;

public class SelectorPracticesPage {
	private WebDriver driver;
	
	private By productCard = By.className("card");
	private By result = By.id("result-4");
	
	public SelectorPracticesPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void buy(String name) {
		List<WebElement> products = driver.findElements(productCard);
		
		for(WebElement product : products) {
			ProductCard card = new ProductCard(driver, product);
			
			if(card.getName().equals(name)) {
				card.buy();
			}
		}
	}
	
	public String getResult() {
		return driver.findElement(result).getText();
	}
}
