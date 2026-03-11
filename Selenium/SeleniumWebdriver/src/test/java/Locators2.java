
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();	
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		             // CSS selectors //
		
		// tag id (tagname#id or #id)
		
	    // driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Tshirts");
	    // driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Tshirts");
		
		//tag class( tagname.classname or .classname)
		
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirts");
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-shirts");

		
		//tag attributes (tagname[attribute="value"])
		
	    //driver.findElement(By.cssSelector("input[name='q']")).sendKeys("casual shirts");
		
		//tag class attribute(tagname.classname[attribute="value"]
		
	    //driver.findElement(By.cssSelector("button.button-2[title='Add to compare list']")).click();
		
		// tag substring ( tagname[attribute$ = substring) -> ends with $
		driver.findElement(By.cssSelector("button[title$='list']")).click();
		
		// tag substring ( tagname[attribute^ = substring) -> starts with ^
		driver.findElement(By.cssSelector("button[title^='Add']")).click();
		
		// tag substring ( tagname[attribute* = substring) -> contains *
		driver.findElement(By.cssSelector("button[title*='compare']")).click();
		
	     Thread.sleep(5000);
	     
	   
	     driver.quit();
	        
	}

}
