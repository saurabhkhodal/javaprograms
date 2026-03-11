import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.medkart.in/");
        driver.manage().window().maximize();

        // 1) Find all link elements
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total number of links present: " + links.size());

        // 2) Extract all hrefs as Strings immediately
        List<String> hrefs = new ArrayList<>();

        for (WebElement link : links) {
            try {
            	
                String hrefAttribute = link.getAttribute("href");

                if (hrefAttribute == null || hrefAttribute.isEmpty()) {
                    System.out.println("href attribute value is null or empty. So not possible to check");
                    continue;
                }

                hrefs.add(hrefAttribute);

            } catch (StaleElementReferenceException e) {
                // Element got detached while trying to read it – just skip this one
                System.out.println("Stale element encountered while reading href. Skipping this link.");
            }
        }

        int noOfBrokenLinks = 0;

        // 3) Now check each URL using HttpURLConnection (no WebElements involved)
        for (String hrefAttribute : hrefs) {
            try {
                URL linkurl = new URL(hrefAttribute); // convert href value from string to URL format
                HttpURLConnection connectLinkURL = (HttpURLConnection) linkurl.openConnection();

                connectLinkURL.setRequestMethod("HEAD");  // optional but faster than GET for just status
                connectLinkURL.setConnectTimeout(5000);
                connectLinkURL.connect();

                int responseCode = connectLinkURL.getResponseCode();

                if (responseCode >= 400) {
                    System.out.println(hrefAttribute + " => Broken Link (Response code: " + responseCode + ")");
                    noOfBrokenLinks++;
                } else {
                    System.out.println(hrefAttribute + " => Not a broken link (Response code: " + responseCode + ")");
                }

            } catch (Exception e) {
                System.out.println("Error checking link: " + hrefAttribute + " | " + e.getMessage());
            }
        }

        System.out.println("The number of broken links are : " + noOfBrokenLinks);

        driver.quit();
    }
}
