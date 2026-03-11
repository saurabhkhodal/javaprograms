import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		
	WebElement country_dropdown =	driver.findElement(By.xpath("//select[@id='country']"));
		Select dropdown = new Select (country_dropdown);
		
		//select options from the dropdown
//	dropdown.selectByVisibleText("France");	
	
//	Thread.sleep(2000);
	
//	dropdown.selectByValue("india");
	
//	dropdown.selectByIndex(2);
		 
		List<WebElement> options = dropdown.getOptions();    //getOptions returns all dropdown option
		System.out.println("Total number of options present in the dropdown: "+options.size());
		
	//	for(WebElement list : options) {
	//		System.out.println(list.getText());
			
	//					}
		
		for(int i=0; i<options.size();i++) {
			
			String drpValue = options.get(i).getText();
			System.out.println(drpValue);
		
		if(drpValue.equals("Japan")){
			dropdown.selectByVisibleText(drpValue);
		}
	
		}
	

	}

}
