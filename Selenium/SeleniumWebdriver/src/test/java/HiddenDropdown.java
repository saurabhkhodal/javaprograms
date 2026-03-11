import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropdown {

	public static void main(String[] args) {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
     driver.manage().window().maximize();
     
     driver.findElement(By.name("username")).sendKeys("Admin");
     driver.findElement(By.name("password")).sendKeys("admin123");
     driver.findElement(By.xpath("//button[@type='submit']")).click();
     
     driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
     
     //click on the dropdown arrow
     driver.findElement(By.xpath("//div[6]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();
     
    // driver.findElement(By.xpath("//span[normalize-space()='QA Engineer']")).click();
    
   List<WebElement> roles =  driver.findElements(By.xpath("//div[@role='option']//span"));
   System.out.println(roles.size());
   for(WebElement role: roles) {
	   System.out.println(role.getText());
	   if(role.getText().equals("Automaton Tester")) {
		   role.click();
		   break;
	   }
   }
     
	}

}
