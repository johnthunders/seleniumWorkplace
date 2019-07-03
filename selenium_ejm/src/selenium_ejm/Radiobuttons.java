package selenium_ejm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Radiobuttons {

	public static void main(String[] args) throws InterruptedException {
		
		
	        WebDriver driver = new ChromeDriver();
	        WebDriverWait wait = new WebDriverWait(driver, 10);

	        driver.get("http://www.echoecho.com/htmlforms10.htm");

	        WebElement cheese = driver.findElement(By.xpath("//input[@value='Cheese']"));

	        wait.until(ExpectedConditions.elementToBeClickable(cheese)).click();

	        Thread.sleep(3000);
	        driver.quit();
	        
	}
	
}
