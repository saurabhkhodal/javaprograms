import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AddExtensionsToBrowser {

	public static void main(String[] args) {
		//"C:\Users\Tech\Downloads\SelectorsHub-XPath-Helper-Chrome-Web-Store.crx"
		
		ChromeOptions options = new ChromeOptions();
		File file = new File("C:\\Users\\Tech\\Downloads\\SelectorsHub-XPath-Helper-Chrome-Web-Store.crx");
		
		options.addExtensions(file);
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://uat.mkwms.dev/");
		

	}

}
