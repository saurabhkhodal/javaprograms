import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://uat.mkwms.dev/");
		driver.manage().window().maximize();
		Thread.sleep(1500);

		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.clear();
		email.sendKeys("saurabh.k@medkart.in");
		Thread.sleep(1500);

		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.clear();
		password.sendKeys("12345678");
		Thread.sleep(1500);

		WebElement submit = driver.findElement(By.xpath("//button[@class='btn btn-primary w-100 mt-4']"));
		submit.click();
		Thread.sleep(1500);
		
		//Mouse Hover
		
		WebElement oms = driver.findElement(By.xpath("//span[normalize-space()='OMS']"));
		WebElement sales_order = driver.findElement(By.xpath("//a[@href='/sales-order']"));
		Actions act = new Actions(driver);
		act.moveToElement(oms).moveToElement(sales_order).click().build().perform();
		
		driver.navigate().to("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement contextClickOnButton=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		//perform right click action
		
		Actions acts = new Actions (driver);
		acts.contextClick(contextClickOnButton).build().perform();
		
		//select the copy option
		driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
		Thread.sleep(2000);
		
		//close alert
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		//double click 
		
		driver.navigate().to("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		WebElement field1 = driver.findElement(By.xpath("//input[@id='field1']"));
		field1.clear();
		field1.sendKeys("Hello Saurabh!");
			
		WebElement copy_button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		Actions acting = new Actions (driver);
		acting.doubleClick(copy_button).build().perform();
		
		WebElement field2 = driver.findElement(By.xpath("//input[@id='field2']"));
		
		if(field2.getAttribute("value").equals("Hello Saurabh!")) {           //here get text will not be used. As the innertext is not present in the element
			System.out.println("The test case is passed");
		}
		
		//drag and drop
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions action = new Actions (driver);
		action.dragAndDrop(source, target).perform();
	//driver.quit();

	}

}
