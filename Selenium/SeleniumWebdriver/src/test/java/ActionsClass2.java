import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass2 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        driver.manage().window().maximize();
       
        //handle minimum value slider
        WebElement min_slider = driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]"));
        System.out.println(min_slider.getLocation());      //(59,294)
        
        Actions act = new Actions(driver);
        act.dragAndDropBy(min_slider, 100, 0).perform();     //it will move x axis by 100 points
        System.out.println(min_slider.getLocation());       //(159,294)
        
        Thread.sleep(3000);
        //handle maximum value slider
        WebElement max_slider = driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]"));
        System.out.println(max_slider.getLocation());     //(766,294)
        
        act.dragAndDropBy(max_slider, -266, 0).perform(); //it will reduce x axis by 266 points
        
        System.out.println(max_slider.getLocation());
        
        
	}

}
