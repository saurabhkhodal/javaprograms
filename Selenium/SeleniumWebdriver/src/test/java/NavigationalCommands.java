import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {
public static void main(String[] args) throws Exception {
	
	WebDriver driver = new ChromeDriver();
	
	// navigate to
	
	//driver.navigate().to("https://www.medkart.in/");
	URL myurl = new URL("https://www.medkart.in/");
	driver.navigate().to(myurl);
	
	driver.manage().window().maximize();
	
	driver.navigate().to("https://uat.mkwms.dev/login/");
	
	//navigate back
	driver.navigate().back();
	System.out.println(driver.getCurrentUrl());
	
	//navigate forward
	driver.navigate().forward();
	System.out.println(driver.getCurrentUrl());
	
	//navigate refresh
	driver.navigate().refresh();
	System.out.println(driver.getCurrentUrl());
}
}
