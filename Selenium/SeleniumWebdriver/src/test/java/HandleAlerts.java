import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlerts {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//Normal alert with single button
		
		WebElement normal_alert = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']"));
		normal_alert.click();
		Thread.sleep(3000);
		Alert alert =driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
	/*	//Confirmation alert
		
		WebElement confirmation_popup = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		confirmation_popup.click();
		Thread.sleep(3000);
		Alert confirm = driver.switchTo().alert();
		confirm.accept();
		
		confirmation_popup.click();
		Thread.sleep(3000);
		Alert reject = driver.switchTo().alert();
		confirm.dismiss();
		
		//Prompt message
		WebElement prompt =driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		prompt.click();
		Thread.sleep(2000);
		Alert prompt_alert=driver.switchTo().alert();
		prompt_alert.sendKeys("Testing the prompt");
		
		Thread.sleep(2000);
		prompt_alert.accept();
	
	*/
		//Handle alert using explicit wait
		
		WebElement popup = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		popup.click();
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		Alert myalert= wait.until(ExpectedConditions.alertIsPresent());
		myalert.accept();
		
		
		//driver.navigate().to("https://the-internet.herokuapp.com/basic_auth");
		
		driver.navigate().to("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
		

	}

}
