package selenium_workplace;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.ExecuteScript;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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
		Thread.sleep(1000);
		
		JavascriptExecutor jsScrollDownCassualDresses = (JavascriptExecutor) driver;
		jsScrollDownCassualDresses.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		
		Actions print_dress = new Actions(driver);
		print_dress.moveToElement(driver.findElement(By.xpath("//a[@class='product_img_link']//img[@class='replace-2x img-responsive']"))).perform();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@id='color_13']")).click();
		Thread.sleep(1000);
		
		JavascriptExecutor printed_dress = (JavascriptExecutor) driver;
		printed_dress.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		
		Actions printed_dress_photo_2 = new Actions(driver);
		printed_dress_photo_2.moveToElement(driver.findElement(By.xpath("//img[@id='thumb_9']"))).perform();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[@class='span_link no-print']")).click();
		Thread.sleep(1000);
		
		Actions printed_dress_photo_zoom = new Actions(driver);
		printed_dress_photo_zoom.moveToElement(driver.findElement(By.xpath("//a[@class='fancybox-nav fancybox-next']"))).perform();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//a[@class='fancybox-nav fancybox-next']//span")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@class='fancybox-item fancybox-close']")).click();
		Thread.sleep(1000);
		
		printed_dress.executeScript("window.scrollBy(0,-300)");
		Thread.sleep(1000);
		
		for(int i=1; i<4; i++){
			driver.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']//span")).click();
			Thread.sleep(1000);
		}
		
		
		Select talla = new Select(driver.findElement(By.xpath("//select[@id='group_1']")));
		
		talla.selectByVisibleText("S");
		Thread.sleep(1000L);
		talla.selectByVisibleText("M");
		Thread.sleep(1000L);
		talla.selectByVisibleText("L");
		Thread.sleep(1000L);
		talla.selectByVisibleText("M");
		Thread.sleep(1000L);
		
		driver.findElement(By.xpath("//a[@id='wishlist_button']")).click();
		Thread.sleep(1000L);
		
		driver.findElement(By.xpath("//div[@class='fancybox-overlay fancybox-overlay-fixed']")).click();
		Thread.sleep(1000L);
		
		printed_dress.executeScript("window.scrollBy(0,-300)");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@class='login']")).click();
		Thread.sleep(1000);
		
		WebElement login = driver.findElement(By.xpath("//input[@id='email_create']"));
		wait.until(ExpectedConditions.elementToBeClickable(login)).click();
		
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("hola01@mail.com");
		Thread.sleep(1000);
		
	}
	
	@AfterTest
	private void qwerty() {
		// TODO Auto-generated method stub
		
		driver.quit();
	}

}
