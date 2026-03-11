package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleCheckboxPractice {
	WebDriver driver;
	public void handleCheckbox() {
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://uat.mkwms.dev/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(1000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement email =wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name= 'email']"))));
		email.clear();
		email.sendKeys("saurabhtest@gmail.com");
		
		
		WebElement password =  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name= 'password']"))));
		email.clear();
		password.sendKeys("test@12345");
		
		
		WebElement login = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@class ='btn btn-primary w-100 mt-4']"))));
		login.click();
		
		WebElement inwardMenu = driver.findElement(By.xpath("//span[normalize-space()='Inward']"));
		Actions act = new Actions(driver);
		act.moveToElement(inwardMenu).perform();
		
		WebElement dropshipping = driver.findElement(By.xpath("//span[normalize-space()=\"DropShipping\"]"));
		dropshipping.click();
		
		WebElement filter = driver.findElement(By.xpath("//button[@class='btn btn-success px-4 ' and text()='Filter']"));
		filter.click();
		
		WebElement statusFilter = driver.findElement(By.xpath("//span[normalize-space()=\"Status\"]"));
		statusFilter.click();
		
		//select specific checkbox
	//	WebElement selectCheckbox = driver.findElement(By.xpath("//input[@id=\"PO Pending\"]"));
	//		selectCheckbox.click();
			
		//seelct all checkboxes
			List <WebElement> checkboxes =driver.findElements(By.className("radioButton"));
//			
//			for(WebElement checkbox : checkboxes) {
//				checkbox.click();
//				statusFilter.click();
//			}
			
		//deselect some checkboxes
			for (int j=0; j<checkboxes.size();j++) {
				checkboxes.get(j).click();
				statusFilter.click();
			}
			for(int i=0; i<3; i++) {
				checkboxes.get(i).click();
				statusFilter.click();
			}
		}
	}


