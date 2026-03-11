import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.medkart.in/");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Stores Page']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		
        Set<String> IDs = driver.getWindowHandles();
        System.out.println(IDs);
        
        //Approach 1 --> convert set into list and then fetch the individual Ids
        
//        List<String> windowList = new ArrayList(IDs);
//        
//        String parentID = windowList.get(0);
//        String childID = windowList.get(1);
//        
//        System.out.println(driver.getTitle());  //the focus remains on the parent window
//        
//        //switch to child window
//        driver.switchTo().window(childID);
//        System.out.println(driver.getTitle());  //now the focus comes to the child window
//        
//        driver.switchTo().window(parentID);
//        System.out.println(driver.getTitle());
        
        //Approach 2--> if we have more number of windows then this can be used
        
  /*      for(String WindowIDS:IDs) {
        	String title= driver.switchTo().window(WindowIDS).getTitle();
        	
        	if(title.equals("Generic Medicines Online | Generic Medicine Store | Medkart")) {
        		System.out.println(driver.getCurrentUrl());
        	}
        }
    */    
        //Close the specific window
        for(String WindowIDS:IDs) {
        	String title= driver.switchTo().window(WindowIDS).getTitle();
        	System.out.println(title);
        	
        	if(title.equals("Medkart Pharmacy Store Locator: Find Nearest Medical store, Timings, Directions & Ratings")) {
        		driver.close();
        		break;
        	}

        	}
        
        
        }

}
