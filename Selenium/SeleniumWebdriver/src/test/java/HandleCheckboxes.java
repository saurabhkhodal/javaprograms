import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HandleCheckboxes {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		try {
			driver.get("https://uat.mkwms.dev/");
			driver.manage().window().maximize();

			// Login Process
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='ps-1 form-control']")))
					.sendKeys("saurabh.k@medkart.in");

			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Password']")))
					.sendKeys("12345678");

			wait.until(
					ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-primary w-100 mt-4']")))
					.click();

			// Hover on Outwards Menu
			WebElement outwards_menu = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@alt='menu-icon'])[9]")));
			Actions action = new Actions(driver);
			action.moveToElement(outwards_menu).perform();

			// Click Pick Note
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Pick Note']")))
					.click();

			// Open Filter and Select Date
			wait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("//div[contains(@class,'ListingFilter_dropdown')]//button")))
					.click();

			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//label[@for='date-picker'])[2]"))).click();

			wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath("//div[@aria-label='Choose Saturday February 01 of 2025']//span[contains(@class,'sd')]")))
					.click();
			wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath("//div[@aria-label='Choose Tuesday March 04 of 2025']//span[contains(@class,'sd')]")))
					.click();

			// Click Store Group Dropdown
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button'])[10]"))).click();

			// Select and Deselect Checkboxes
			List<WebElement> checkboxes = wait.until(ExpectedConditions
					.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='form-check']//input[@type='checkbox']")));

			System.out.println("Total Checkboxes: " + checkboxes.size());

			// Select checkboxes at index 0 & 9
			for (int i = 0; i < checkboxes.size(); i++) {
				if (i == 0 || i == 9) {
					checkboxes.get(i).click();
				}
			}

			// Deselect checkboxes if selected
			for (WebElement checkbox : checkboxes) {
				if (checkbox.isSelected()) {
					checkbox.click();
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.quit(); // Ensure the driver quits after execution
		}
	}
}