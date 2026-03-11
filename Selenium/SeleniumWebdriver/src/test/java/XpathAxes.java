import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.medkart.in/");
		
		driver.manage().window().maximize();
		
		//self - select the current node
//		driver.findElement(By.xpath("//input[@id='headerSearchFormInput']/self::input")).sendKeys("Dolo 650 Mg");
		
		//Parent - select the parent of the current node
		driver.findElement(By.xpath("//input[@id='headerSearchFormInput']/parent::div"));
		
		//Child -select the child from the parent
	//	driver.findElement(By.xpath("//div[@id='landingPageSearchDesktop']/child::input")).sendKeys("paracip 650");
		
		
		//Ancestor- select the ancestor of the current node
	driver.findElement(By.xpath("//input[@id= 'headerSearchFormInput']/ancestor::form"));
	
	//descendant - select the descendant of the current node
//	driver.findElement(By.xpath("//div[@id='landingPageSearchDesktop']/descendant::input")).sendKeys("Atorbest tab");
	
	//following - select the following nodes from the current node
	driver.findElement(By.xpath("//div[@id='landingPageSearchDesktop']/following::div"));
	
	//preceding -select the following nodes from the current node
	driver.findElement(By.xpath("//div[@id='landingPageSearchDesktop']/preceding::div"));
	
	//following - sibling : get the following sibling node
	driver.findElement(By.xpath("//div[@id='landingPageSearchDesktop']/following-sibling::p"));
	
	//preceding-sibling	 : get the preceding sibling
	String text=driver.findElement(By.xpath("//div[@id='landingPageSearchDesktop']/preceding-sibling::p")).getText();
	System.out.println(text);
	
	
	Thread.sleep(5000);
	
	driver.close();

	}

}
