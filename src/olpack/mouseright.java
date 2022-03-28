package olpack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseright {

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.google.com");
		//driver.get("http://docs.seleniumhq.org/");
	/*	driver.manage().window().maximize();
		WebElement we=driver.findElement(By.xpath(".//*[@id='menu_download']/a"));
		Actions a=new Actions(driver);
		a.moveToElement(we).contextClick().build().perform();
		Thread.sleep(3000);
		a.sendKeys(Keys.DOWN,Keys.DOWN,Keys.ENTER).build().perform();*/

	}

}
