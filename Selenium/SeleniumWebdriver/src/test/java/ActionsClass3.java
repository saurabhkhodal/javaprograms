import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		WebElement textArea1=driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		textArea1.sendKeys("Hello");
		Actions act = new Actions (driver);
		
		//Input the text in textArea1 and then copy all text and paste it into textArea2
		//Ctrl + A
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).build().perform();
		
		//Ctrl + C
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).build().perform();
		
		//TAB
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		//Ctrl +V
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();
		
		//Open a link in the new tab
		WebElement feedback = driver.findElement(By.xpath("//a[normalize-space()='Feedback']"));
      //feedback.click();
	
	    act.keyDown(Keys.CONTROL).click(feedback).keyUp(Keys.CONTROL).perform();
	    
	    //Switching to registration page
	    List<String> ids = new ArrayList(driver.getWindowHandles());
	    driver.switchTo().window(ids.get(1));
	    
	    driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("Welcome!");
	    
	    //to switch to the new window tab of the same browser
	    driver.switchTo().newWindow(WindowType.TAB);
	    driver.get("https://uat.mkwms.dev/");
	    
	    //to switch to the new browser
	    driver.switchTo().newWindow(WindowType.WINDOW);
	    driver.get("https://mk-ecomweb-v2.vercel.app/");
	
	}

}
