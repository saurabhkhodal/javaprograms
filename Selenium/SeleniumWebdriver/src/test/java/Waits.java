import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();

		// Explicit wait
		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10)); // declaration
		driver.get("https://www.medkart.in/");
		driver.manage().window().maximize();
		// Thread.sleep(2000);

		/*
		 * //Implicit wait
		 * 
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //OR //
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		 * //selenium 4 above version not support this type
		 * driver.findElement(By.xpath("//input[@id='headerSearchFormInput']"));
		 * driver.close();
		 */

//		WebElement searchBar = myWait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='headerSearchFormInput']")));
//		searchBar.sendKeys("Dolo 650");
//		
		//Fluent wait
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		
		WebElement search = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//input[@id='headerSearchFormInput']"));
			}
		});
		

	}

}
