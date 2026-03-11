import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShadowDOM {

	public static void main(String[] args) throws Exception{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
/*		
		driver.get("https://books-pwakit.appspot.com/");
		
		driver.manage().window().maximize();
		
		//This Element is inside single shadow DOM.
		SearchContext shadow = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
		Thread.sleep(1000);
		shadow.findElement(By.cssSelector("#input")).sendKeys("Mrityunjay");
*/	
		driver.get("https://practice.expandtesting.com/shadowdom");
		driver.manage().window().maximize();
		
		SearchContext shadow = driver.findElement(By.cssSelector("#shadow-host")).getShadowRoot();
		Thread.sleep(2000);
		WebElement button =shadow.findElement(By.cssSelector("#my-btn"));
		
		Actions act = new Actions (driver);
		act.moveToElement(button).build().perform();
		System.out.println(button.getText());
				

	}

}
