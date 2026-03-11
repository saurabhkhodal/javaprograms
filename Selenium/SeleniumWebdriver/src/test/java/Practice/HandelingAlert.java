package Practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandelingAlert {

	public static void main(String[] args) throws Exception {

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
		
		WebElement purchaseOrder =driver.findElement(By.xpath("//span[normalize-space()='Purchase Order']"));
		purchaseOrder.click();
		
		WebElement addPO = driver.findElement(By.className("header-add-button"));
		addPO.click();
		
		WebElement vendorSelect = driver.findElement(By.xpath("//input[@id=\"custom-input-demoundefined\"]"));
		vendorSelect.sendKeys("D K PHARMA");
		
		WebElement cancel = driver.findElement(By.xpath("//button[@class=\"btn px-2 py-2 .text-dark\"]"));
		cancel.click();
		
		Thread.sleep(2000);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".modal")));
		driver.findElement(By.xpath("//button[text()='Yes']")).click();
		
	    driver.close();

	}

}
