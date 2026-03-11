import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://uat.mkwms.dev/");
		driver.manage().window().maximize();
		Thread.sleep(1500);

		// Use JsE instead of sendKeys and click

		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
	    email.sendKeys("saurabh.k@medkart.in");
		Thread.sleep(1500);

		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("12345678");
		Thread.sleep(1500);

		WebElement submit = driver.findElement(By.xpath("//button[@class='btn btn-primary w-100 mt-4']"));
	    submit.click();
		Thread.sleep(1500);
		
		Actions act = new Actions(driver);
		WebElement Masters = driver.findElement(By.xpath("//span[normalize-space()='Masters']"));
		act.moveToElement(Masters).perform();
		
		WebElement storeMaster = driver.findElement(By.xpath("//span[normalize-space()='Store Master']"));
		storeMaster.click();
		
		WebElement search = driver.findElement(By.xpath("//input[@id='navbarFormList']"));
		search.sendKeys("Vapi");
		
		List<WebElement> stores = driver.findElements(By.xpath("//div[@class='text-truncate text-number ']"));
		WebElement edit = driver.findElement(By.xpath("(//img[@alt='Edit-button-icon'])[1]"));
		
		for(WebElement store: stores) {
			if(store.getText().equals("MANISH BHAVSAR HUF (VAPI)")) {
				edit.click();
			}
		}
		Thread.sleep(2000);
		WebElement documents = driver.findElement(By.xpath("//button[@id='controlled-tab-example-tab-documents']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", documents);
		Thread.sleep(2000);
		documents.click();
		
		Thread.sleep(2000);
		WebElement document_1 = driver.findElement(By.xpath("//input[@id='file_upload_Other Document 1']"));
	   document_1.sendKeys("C:\\Users\\Tech\\Downloads\\Saurabh Khodal.jpg");
		
		WebElement image_validation = driver.findElement(By.xpath("//a[normalize-space() ='Saurabh Khodal.jpg']"));
		if(image_validation.getText().equals("Saurabh Khodal.jpg")) {
			System.out.println("Test case passed");
		}

		   //Upload multiple files
//		String file1 = "C:\\Users\\Tech\\Downloads\\Saurabh Khodal.jpg";
//		String file2 = "C:\\Users\\Tech\\Downloads\\PHOTO-2025-01-02-16-19-42.jpg";
//		
//		driver.findElement(By.xpath("//input[@id='file_upload_Other Document 1']")).sendKeys(file1+"\n"+file2);
	}

}
