import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebElement PIM = driver.findElement(By.xpath("//span[text()='PIM']"));
		PIM.click();
		
		List<WebElement> headers = driver.findElements(By.xpath("//div[@role='columnheader']"));
		for(WebElement header : headers) {
			System.out.print(header.getText()+" \t");
		}
		System.out.println();
		
		while(true) {
	List<WebElement> rows = driver.findElements(By.xpath("//div[@role ='row']"));
	//System.out.println("The number of rows table contains: "+rows.size());
		for(WebElement row: rows) {
			System.out.println(row.getText());
		}
		System.out.println();
	List<WebElement> next_button = driver.findElements(By.xpath("//i[@class ='oxd-icon bi-chevron-right']"));
		 if (next_button.isEmpty() || !next_button.get(0).isDisplayed() || !next_button.get(0).isEnabled()) {
             System.out.println("Reached the last page. Exiting.");
             break;
         }

         // Click "Next" and wait for new data to load
		 next_button.get(0).click();
     }
		driver.close();		
		}
		

	}

