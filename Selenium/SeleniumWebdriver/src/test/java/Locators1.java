import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators1 {

	public static void main(String[] args) throws InterruptedException{
		//Launch a browser(chrome)
		WebDriver driver = new ChromeDriver();
		
		//open a url
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		
		// find element by name
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		
		//find element by id
		 driver.findElement(By.id("password")).sendKeys("secret_sauce");
		 
		 //find element by className
		 driver.findElement (By.className("submit-button")).click();
		
		 //validate the title 
		 	String actual_title= driver.getTitle();
		 	System.out.println(actual_title);
		
		 	//ClassName: Used to find the group of web elements of same type
			
			List<WebElement> classtag=driver.findElements(By.className("inventory_item_name"));
			System.out.println("Number of classname presents: " +classtag.size());
			System.out.println(classtag);
			
			Thread.sleep(5000);
			
		//find element by linkText and partialLinkText
		driver.findElement(By.linkText("Sauce Labs Backpack")).click();              //here we have to pass the full text of the link  
		
		//<a href="#tab-review" data-bs-toggle="tab" class="nav-link" aria-selected="false" tabindex="-1" role="tab">Reviews (0)</a>  
		//here Reviews is the link text
		
		Thread.sleep(5000);
		driver.navigate().back();
		
		driver.findElement(By.partialLinkText("Bike Light")).click();       //here no need to pass the full text we can pass the partial text also "Specification"
		
		//TagName : Used to find the group of web elements
		List<WebElement>links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links present: "+links.size());
		
		for(WebElement linkText: links) {
		System.out.print(linkText.getText()+", ");
		
		}
		System.out.println();
		//Capture all the images from the webpage
		List<WebElement>images=driver.findElements(By.tagName("img"));
		System.out.println("Number of images present: "+images.size());
		System.out.println(images);
		
		
	//	Thread.sleep(2000);
		
		if(actual_title.equals("Swag Labs")) {
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Test case is failed");
		}
	
	 Thread.sleep(5000);
	driver.close();		

	}

}
