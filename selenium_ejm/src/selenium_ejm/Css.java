package selenium_ejm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.marionette","/usr/local/bin");
		
		System.setProperty("webdriver.chrome.marionette","/usr/local/bin");
		WebDriver driver =new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("asdfmovie");
		
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("iddqd");
		//driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.cssSelector("#Login")).click();	
		
	}

}