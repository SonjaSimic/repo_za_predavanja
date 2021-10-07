package p_27_09_2021;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {

	public static void main(String[] args) throws InterruptedException {
//		Napisati program koji ucitava stranicu youtube.com i kuca tekst za pretragu 
//		a zatim klikce na dugme pretrazi preko javascript executora. 
//		Skripta koja je za izvrsenje je arguments[0].click(); a kao parametar se prosledjuje dugme.
		
		
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.get("https://www.youtube.com/");
		
		driver.findElement(By.className("gstl_50 sbib_a")).sendKeys("crtani film");
		
		
		WebElement btn = driver.findElement(By.id("search-icon-legacy"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", btn );
		
		
	}

	
	
	
	
	

}
