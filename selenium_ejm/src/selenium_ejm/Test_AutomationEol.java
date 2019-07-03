package selenium_ejm;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.ExecuteScript;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Test_AutomationEol {
	
	WebDriver driver =new ChromeDriver();
	@Test
	public void test_example() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.marionette","/usr/local/bin");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //driver.manage().window().setSize(new Dimension(500,800));
        
		driver.get("http://automationpractice.com/index.php");
		
		
		WebElement search = driver.findElement(By.xpath("//*[@id=\"search_query_top\"]"));
		
		wait.until(ExpectedConditions.elementToBeClickable(search)).click();
		
		driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys("Hola Gobernador");
		Thread.sleep(1000);
        
		driver.findElement(By.xpath("//button[@name='submit_search']")).click();
		Thread.sleep(1000);
		
		/* RESPONSIVE
		WebElement categories_plus = driver.findElement(By.xpath("//div[@class='cat-title']"));
		wait.until(ExpectedConditions.elementToBeClickable(categories_plus)).click();
		
		WebElement categories_min = driver.findElement(By.xpath("//div[@class='cat-title active']"));
		wait.until(ExpectedConditions.elementToBeClickable(categories_min)).click();

		
		for(int i=1; i<4; i++){
			
			
			driver.findElement(By.xpath("//div[@class='cat-title']")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[@class='cat-title active']")).click();
			Thread.sleep(1000);
			
		}
		*/
		
		driver.findElement(By.xpath("//img[@class='logo img-responsive']")).click();
		Thread.sleep(1000);
		
		
		Actions women_hyplink = new Actions(driver);
		women_hyplink.moveToElement(driver.findElement(By.xpath("//a[@class='sf-with-ul'][contains(text(),'Women')]"))).perform();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//ul[@class='submenu-container clearfix first-in-line-xs']//ul//li//a[contains(text(),'Casual Dresses')]")).click();
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
	}
	
	@AfterTest
	private void qwerty() {
		// TODO Auto-generated method stub
		
		driver.quit();
	}

}
