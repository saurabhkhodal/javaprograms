import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CaptureSceenshot {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		
		driver.get("https://uat.mkwms.dev/");
		driver.manage().window().maximize();
		Thread.sleep(1500);

		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
	    email.sendKeys("saurabh.k@medkart.in");
		Thread.sleep(1500);

		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("12345678");
		Thread.sleep(1500);

		WebElement submit = driver.findElement(By.xpath("//button[@class='btn btn-primary w-100 mt-4']"));
		submit.click();
		Thread.sleep(1500);
		
		Actions act = new Actions(driver);
	 
	//Capture full page screenshot
		
/*		//here we capture the screenshot as a file type
		TakesScreenshot ts = (TakesScreenshot)driver;
		
        File sourcefile = ts.getScreenshotAs(OutputType.FILE);
        
        //we are storing the path in 1 variable. we can also directly provide path in the file parameters
        String path = "\\Screenshots\\fullpage1.png";
        
        //here this method get the dynamic path for the project and then the path will redirect to the specific folder
        File targetFile = new File(System.getProperty("user.dir")+ path);
        
        //copy source file to target file
        sourcefile.renameTo(targetFile);
        Thread.sleep(2000);
 */      
  /*   //Capture screenshot of the Specific section
        WebElement Masters = driver.findElement(By.xpath("//span[normalize-space()='Masters']"));
        act.moveToElement(Masters).perform();
        Thread.sleep(2000);
        
        WebElement molecule_master = driver.findElement(By.xpath("//span[@class='ms-0 d-flex'][normalize-space()='Molecule Master']"));
        molecule_master.click();
        
        //table[@class='table']
        Thread.sleep(5000);
        WebElement table = driver.findElement(By.xpath("//table[@class='table']"));
       File source = table.getScreenshotAs(OutputType.FILE);                //here we are calling getScreenshotAs method from the WebElement interface
       File target = new File(System.getProperty("user.dir")+ "\\Screenshots\\tablePhoto.png");
       source.renameTo(target);
  
  */   
		//Capture screenshot of the web element
		
       WebElement Logo = driver.findElement(By.xpath("//img[@alt='makrt-logo']"));
       
       File source = Logo.getScreenshotAs(OutputType.FILE);
       File target = new File(System.getProperty("user.dir")+ "\\Screenshots\\Logo.png");
       source.renameTo(target);
       
	}

}
