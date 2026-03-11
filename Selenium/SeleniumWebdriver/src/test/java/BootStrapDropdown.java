import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropdown {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
	
	//capture all the elements from the dropdown
	
	List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
	System.out.println("Number of options present in the dropdown :" +options.size());
	
	for(WebElement list :options ) {
		String option =list.getText();
		System.out.println(option);
		if(option.equals("Java")|| option.equals("Python")||option.equals("MySQL")) {
			list.click();
		}
	}
	
	
	

	}

}
