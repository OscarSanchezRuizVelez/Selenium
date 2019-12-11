package Clase;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClaseIntermedia extends ClasePadre{

	
	public ClaseIntermedia(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	By input = By.xpath("//input[@id='email_create']");
	By boton = By.xpath("//form[@id='create-account_form']//span[1]");
	By radio = By.xpath("//input[@id='id_gender1']");
	By nombre = By.xpath("//input[@id='customer_firstname']");
	public void before() {
		drivers();
		window();
		Link("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}
	
	public void entrada(){
		
		insertText(input, "Hola@mola.com");
	}
	
	public void Enviar () {
		
		click(boton);
	}
	public void RadioButton () {
		
		click(radio);
	}
	public void InputNombre () {
		
		insertText(nombre, "Oscar");
	}
}
	

