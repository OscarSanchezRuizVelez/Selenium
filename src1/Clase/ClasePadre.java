package Clase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClasePadre {

	WebDriver driver;
	
public ClasePadre(WebDriver driver) {
		
		this.driver = driver;
		
	}
public void drivers() {
	System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
}

public void window() {
	driver.manage().window().maximize();
}

public void insertText (By locator, String inputText) {
	
	driver.findElement(locator).sendKeys(inputText);
	
	
	}
public void Enter (By locator) {
	
	
	WebElement Enter = driver.findElement(locator);
	Enter.submit();
		
	}
	
	public void Link (String url) {
		
		driver.get(url);
			
		
	}
	
	
		
	public void click (WebElement element) {
		
		element.click();
	}
	
	public void click (By locator) {
		
		driver.findElement(locator).click();
	}
}
