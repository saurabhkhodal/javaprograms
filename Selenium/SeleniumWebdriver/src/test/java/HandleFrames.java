import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//find the webelement of frame and switch the focus of the browser to the frame 
		
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src = 'frame_1.html']"));
		driver.switchTo().frame(frame1);
		
	    WebElement txt_box1 = driver.findElement(By.xpath("//input[@name = 'mytext1']"));
		txt_box1.sendKeys("Hello!!");
		
		driver.switchTo().defaultContent();
		
		//Frame2
		WebElement frame2=driver.findElement(By.xpath("//frame[@src ='frame_2.html']"));
		driver.switchTo().frame(frame2);
		
		WebElement txt_box2 = driver.findElement(By.xpath("//input[@name='mytext2']"));
		txt_box2.sendKeys("Welcome");
		
		driver.switchTo().defaultContent();
		
		//Frame3
		WebElement frame3=driver.findElement(By.xpath("//frame[@src ='frame_3.html']"));
		driver.switchTo().frame(frame3);
		
		WebElement txt_box3 = driver.findElement(By.xpath("//input[@name='mytext3']"));
		txt_box3.sendKeys("to Selenium");
		
	    driver.switchTo().frame(0);  //switching to frame using index. As there is only one iframe, we can pass 0 index 
	    driver.findElement(By.xpath("//span[normalize-space()='Hi, I am the UI.Vision IDE']")).click();
		
		driver.switchTo().defaultContent();
		
		
	    }

}
