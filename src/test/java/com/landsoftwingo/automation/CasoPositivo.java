package com.landsoftwingo.automation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import com.landsoftwingo.objects.*;

public class CasoPositivo {
	
	String url = "https://www.wingo.com/";
		
	@Test
	public void buscarPaquete() {
		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		objectsHome obj = new objectsHome();
		
		driver.manage().window().maximize();
		driver.get(url);
		
		obj.time(wait);
		obj.webDriver(driver);
		
		obj.flightSelection("Bogotá", "Cartagena");
		obj.dateSelection();
		obj.sleep(2000);
		driver.quit();

	}
	
}
