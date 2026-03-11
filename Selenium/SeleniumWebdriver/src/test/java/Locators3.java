import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com");
		
		driver.manage().window().maximize();
		
		// X Path //
		
		// Xpath with single attribute
		driver.findElement(By.xpath("//input [name ='q']")).sendKeys("Kurta");
		
		//Xpath with multiple attributes
     	 driver.findElement(By.xpath("//input[@name ='search'][@class='form-control form-control-lg']")).sendKeys("shirts");
		
		//Xpath with AND operator
		driver.findElement(By.xpath("//input[@name ='search' and @class='form-control form-control-lg']")).sendKeys("Tshirts");
		
		//Xpath with OR operator
		driver.findElement(By.xpath("//input[@name ='search' or @class='form-control']")).sendKeys("pants");
		
		//Xpath using inner text - text()
		driver.findElement(By.xpath("//a[text()='MacBook']")).click();
	
		//Xpath using contains - //*[contains(@attribute,'value']
		driver.findElement(By.xpath("//a[contains(text(),'App')]")).click();
		
		//Xpath with starts-with()
		driver.findElement(By.xpath("//img[starts-with(@title,'Apple')]")).click();
		
		//Xpath using chained xpath
		boolean logoDisplay = driver.findElement(By.xpath("//*[@id='logo']/a/img")).isDisplayed();
		
		
	}

}
