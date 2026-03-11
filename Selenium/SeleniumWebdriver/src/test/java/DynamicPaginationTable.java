import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicPaginationTable {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://uat.mkwms.dev/");
		driver.manage().window().maximize();
		Thread.sleep(1500);

		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.clear();
		email.sendKeys("saurabh.k@medkart.in");
		Thread.sleep(1500);

		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.clear();
		password.sendKeys("12345678");
		Thread.sleep(1500);

		WebElement submit = driver.findElement(By.xpath("//button[@class='btn btn-primary w-100 mt-4']"));
		submit.click();
		Thread.sleep(1500);

		WebElement masters = driver.findElement(By.xpath("//span[text()='Masters']"));
		Actions action = new Actions(driver);
		action.moveToElement(masters).perform();

		WebElement product_master = driver.findElement(By.xpath("//a[@href = '/product-master']"));
		product_master.click();

		WebElement unpublished_tab = driver.findElement(By.xpath("//button[@id='controlled-tab-example-tab-unpublished']"));
		unpublished_tab.click();
        Thread.sleep(1500);
        
        List<WebElement> headers = driver.findElements(By.xpath("//table//tr//th//p[@class='undefined header ']"));
        for (WebElement header : headers) {
            System.out.print(header.getText() +"\t");
        }
        System.out.println();
        
		while (true) {
			List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));

			for (WebElement row : rows) {
                List<WebElement> columns = row.findElements(By.tagName("td"));

                for (WebElement col : columns) {
                    System.out.print(col.getText() + "  "); 
                }
                System.out.println(); 
            }
			WebElement next = driver.findElement(By.xpath("//a[@id='page-next']"));
			if (!next.isEnabled()) {
				break;
			} 
				next.click();
				Thread.sleep(1500);
			
		}
		}
	}

