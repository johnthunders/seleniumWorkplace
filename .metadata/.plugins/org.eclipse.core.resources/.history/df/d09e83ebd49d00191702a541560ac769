package selenium_ejm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_WebdriverClass {
public static void main(String[] args) {
	/*
	WebElement element = driver.findElement(By.name("q"));
	element.sendKeys("Volver a automatizar");
	element.submit();
	*/
	System.setProperty("webdriver.chrome.marionette","/usr/local/bin");
	WebDriver driver = new ChromeDriver();
	System.out.println(driver.getTitle());

	driver.get("http://www.facebook.com"); 
	
	//CSS
	/*
	driver.findElement(By.cssSelector("#email")).sendKeys("correo electrónico");
	driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("1234567890");
	driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
	*/
	
	//tagName[v='value'] -CSS
	driver.findElement(By.cssSelector("input[name='email']")).sendKeys("myowncss");
	driver.findElement(By.cssSelector("[value='Log In']")).click();


	
	
	//System.out.println(driver.getCurrentUrl());
	//System.out.println(driver.getPageSource());
	
	//driver.get("http://www.yahoo.com");
	//driver.navigate().back();
	//driver.navigate().forward();
	//driver.close();
	//driver.quit();
	/*
	driver.findElement(By.id("email")).sendKeys("Primer código");
	driver.findElement(By.name("pass")).sendKeys("123456");
	driver.findElement(By.linkText("Forgot account?")).click();
	*/
}
}