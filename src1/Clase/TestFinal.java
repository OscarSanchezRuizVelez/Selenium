package Clase;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFinal {

	WebDriver driver;
	
	
	@Before
	
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}
	
	
	@After
	public void tearDown() throws Exception {
		driver.quit();	
	}

	@Test
	public void test() throws InterruptedException {
		
		ClaseIntermedia obj = new ClaseIntermedia(driver);
		obj.entrada();
		obj.Enviar();
		obj.RadioButton();
		obj.InputNombre();
		Thread.sleep(5000);
		}
		
	}