import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavascriptExecutorDemo {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://uat.mkwms.dev/");
		driver.manage().window().maximize();
		Thread.sleep(1500);

		// Use JsE instead of sendKeys and click

		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		// email.clear();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].setAttribute('value','saurabh.k@medkart.in')", email);
	    email.sendKeys("saurabh.k@medkart.in");
		Thread.sleep(1500);

		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		// password.clear();
		//js.executeScript("arguments[0].setAttribute('value','12345678')", password);
		password.sendKeys("12345678");
		Thread.sleep(1500);

		WebElement submit = driver.findElement(By.xpath("//button[@class='btn btn-primary w-100 mt-4']"));
		js.executeScript("arguments[0].click()", submit);
		// submit.click();
		Thread.sleep(1500);
		Actions act = new Actions(driver);
		
		/*		//move down by pixel number
		//Scroll using JsE
		WebElement inward = driver.findElement(By.xpath("//span[normalize-space()='Inward']"));
		 
		act.moveToElement(inward).perform();
		
		WebElement GatePass = driver.findElement(By.xpath("//span[normalize-space()='Gate Pass' and @class ='ms-0 d-flex']"));
		GatePass.click();
		
		
		Thread.sleep(2000); 
		js.executeScript("window.scrollBy(0,100)", "");
		Thread.sleep(1000);
		System.out.println(js.executeScript("return window.pageYOffset;"));
        
		//move to element
		
		Thread.sleep(1000);
		WebElement next_btn = driver.findElement(By.xpath("//a[@id='page-next']"));
		js.executeScript("arguments[0].scrollIntoView(true)", next_btn);
		Thread.sleep(1000);
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//move to end
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)" );
		Thread.sleep(1000);
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		 */		
		//For Horizontal Scroll bar
		WebElement inventory = driver.findElement(By.xpath("//span[normalize-space()='Inventory']"));
		act.moveToElement(inventory).perform();	
		
		WebElement stock_rearrange = driver.findElement(By.xpath("//span[@class='ms-0 d-flex'][normalize-space()='Stock Rearrange']"));
		stock_rearrange.click();
		
		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(100,0)");
//		Thread.sleep(1000);
//		System.out.println(js.executeScript("return window.pageXOffset;"));
		
		WebElement status =driver.findElement(By.xpath("//p[@class='undefined header ' and normalize-space()= 'Status']"));
		js.executeScript("arguments[0].scrollIntoView(true)", status);
//		
//		WebElement scrollableElement = driver.findElement(By.xpath("//div[@class = 'overflow-auto']"));
//
//		// Scroll it horizontally by 100 pixels
//		js.executeScript("arguments[0].scrollLeft += 100;", scrollableElement);
//
//		// Print the current horizontal scroll position
//		Long scrollLeft = (Long) js.executeScript("return arguments[0].scrollLeft;", scrollableElement);
//		System.out.println("Current Horizontal Scroll Position: " + scrollLeft);


		//Zoom in and out page
		
		Thread.sleep(3000);
		js.executeScript("document.body.style.zoom ='50%'");
		
		js.executeScript("document.body.style.zoom='150%'");
		
		}
	}


