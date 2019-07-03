package selenium_workplace;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.marionette","/usr/local/bin");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		
		Thread.sleep(2000L);
		driver.findElement(By.cssSelector("div.bgGradient div.widgetSection.appendBottom40 div.fsw div.fsw_inner:nth-child(1) div.fsw_inputBox.searchCity.inactiveWidget:nth-child(1) > label:nth-child(1)")).click();
		Thread.sleep(2000L);
		WebElement s = driver.findElement(By.xpath("//input[contains(@placeholder,'From')]"));
		//s.sendKeys("mumb");
		s.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000L);
		s.sendKeys(Keys.ENTER);
		Thread.sleep(2000L);
		
		WebElement d = driver.findElement(By.xpath("//input[@placeholder='To']"));
		d.sendKeys("bangkok");
		Thread.sleep(4000L);
		d.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000L);
		d.sendKeys(Keys.ENTER);
		Thread.sleep(4000L);
		
		
		/*
		String data = driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']//p[@class='font14 appendBottom5 blackText'][contains(text(),'Bangkok, Thailand')]")).getText();
		String expectativaData = "Bangkok, Thailand";
		
		
		if(data.equals(expectativaData)){
			
			System.out.println("Parche!");
			
		}
		else {
			System.out.println("No cuadra");
		}
		*/

		WebElement f = driver.findElement(By.cssSelector("div.bgGradient div.widgetSection.appendBottom40 div.fsw.widgetOpen div.fsw_inner:nth-child(1) div.fsw_inputBox.dates.inactiveWidget:nth-child(4) div.datePickerContainer:nth-child(2) div.flightCalOverlay div.dayPickerFlightWrap div.RangeExample div.DayPicker.Selectable.Range div.DayPicker-wrapper div.DayPicker-NavBar > span.DayPicker-NavButton.DayPicker-NavButton--next:nth-child(2)"));
		Thread.sleep(2000L);
		f.click();
		
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//div[@class='DayPicker-Months']//div[2]//div[3]//div[4]//div[2]//div[1]")).click();
		Thread.sleep(2000L);
		
		WebElement a = driver.findElement(By.xpath("//span[contains(text(),'RETURN')]"));
		Thread.sleep(2000L);
		a.click();
		Thread.sleep(2000L);
		/*
		for(int i=1; i<5; i++) {
			
			driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			Thread.sleep(500L);
		}
		
		driver.findElement(By.xpath("//div[@class='DayPicker-Months']//div[2]//div[3]//div[4]//div[6]//div[1]//p[1]")).click();
		*/
	}
}

