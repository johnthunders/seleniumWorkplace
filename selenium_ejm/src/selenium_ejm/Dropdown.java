package selenium_ejm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.marionette","/usr/local/bin");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		
		s.selectByValue("USD");
		Thread.sleep(1000L);
		s.selectByIndex(2);
		Thread.sleep(1000L);
		s.selectByVisibleText("INR");
		Thread.sleep(1000L);
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000L);
		//System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		/*
		int i=1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
			Thread.sleep(1000);
		}
		*/
		
		//System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		for(int i=1; i<5; i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			Thread.sleep(1000L);
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		}
		//System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		

		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(1000L);
		driver.findElement(By.xpath("//a[contains(text(),'Chennai (MAA)')]")).click();
		Thread.sleep(1000L);
		//driver.findElement(By.xpath("(//a[contains(text(),'Pune (PNQ)')])[2]")).click();
		//Thread.sleep(1000L);
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[contains(text(),'Pune (PNQ)')]")).click();
		Thread.sleep(1000L);
		
		driver.findElement(By.cssSelector("body:nth-child(2) div.ui-datepicker.ui-widget.ui-widget-content.ui-helper-clearfix.ui-corner-all.ui-datepicker-multi.ui-datepicker-multi-2:nth-child(8) div.ui-datepicker-group.ui-datepicker-group-last:nth-child(2) div.ui-datepicker-header.ui-widget-header.ui-helper-clearfix.ui-corner-right > a.ui-datepicker-next.ui-corner-all")).click();
		Thread.sleep(1000L);
		
		driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//a[@class='ui-state-default'][contains(text(),'23')]")).click();
		Thread.sleep(1000L);
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();
		Thread.sleep(1000L);
		
		
		}

}