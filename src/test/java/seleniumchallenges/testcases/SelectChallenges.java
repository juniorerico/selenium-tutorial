package seleniumchallenges.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectChallenges {
	private WebDriver driver;
	
	// A Annotation @BeforeClass é executada antes do testes iniciarem
	// Geralmente utilizamos esse método para realizar as configurações iniciais do teste,
	// como: configurar o WebDriver, abrir o browser, acessar a página, etc...
	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://juniorerico.github.io/aubay-selenium/selectors-practice.html");
	}
	
	// A Annotation @Test identifica um teste
	// Ela é executada após o @BeforeClass. Podem existir múltiplos @Test em uma classe
	// Caso o atributo 'priority' não seja especificado, os testes serão executados 
	// na ordem que aparecem na classe
	@Test(priority=1)
	public void challengeOne() {
		WebElement button = driver.findElement(By.cssSelector("#group-1 .btn-warning"));
		button.click();
		
		WebElement result = driver.findElement(By.id("result-1"));
		
		Assert.assertEquals(result.getText(), "Muito bem!");
	}
	
	@Test(priority=2)
	public void challengeThree() {
		WebElement button = driver.findElement(By.xpath("//div[@id='group-3']//button[text()='Botão 3']"));
		button.click();
		
		WebElement result = driver.findElement(By.id("result-3"));
		
		Assert.assertEquals(result.getText(), "Muito bem!");
	}
	
	@AfterClass
	public void tearDown() {
		//driver.quit();
	}
}
