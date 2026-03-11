import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();

		// get methods
		// get(url)
		driver.get("https://www.medkart.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// getTitle()
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);

		// getCurrentUrl()
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(2000);

		// getPageSource()
//	    String source=	driver.getPageSource();
//	    System.out.println(source);
//	    Thread.sleep(2000);

		// getWindowHandle()
		String windowId = driver.getWindowHandle();
		System.out.println(windowId);
		Thread.sleep(2000);

//	    WebElement element= driver.findElement(By.xpath("//a[normalize-space()='Stores Page']"));
//	    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);

//	    //getWindowHandles()
//	   Set<String> windowIds=driver.getWindowHandles();
//	   System.out.println(windowIds);
//		
		// conditional methods

		// isDisplayed()
		Boolean logoDisplayed = driver
				.findElement(By.xpath("//a[@class='Header_navBrand__TNc3B mt-2 navbar-brand']//img[@alt='Logo']"))
				.isDisplayed();
		System.out.println("Is logo displayed : " + logoDisplayed);

		Thread.sleep(3000);

		// isEnabled()
		Boolean inputEnabled = driver.findElement(By.xpath("//input[@id='headerSearchFormInput']")).isEnabled();
		System.out.println("Input box enabled : " + inputEnabled);
		Thread.sleep(2000);

		// isSelected
		driver.findElement(By.xpath("//button[@class='dropdown-toggle btn btn-primary']")).click();

		WebElement english = driver.findElement(By.xpath("//a[text() ='English']"));
		System.out.println(english.getText());

		if (english.getText().equalsIgnoreCase("English")) {
			System.out.println("Test case passed");
		} else {
			System.out.println("Test case failed");
		}

		// browser methods - close(), quit()

		WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Stores Page']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		// driver.close();
		// driver.quit();

		

	}

}
