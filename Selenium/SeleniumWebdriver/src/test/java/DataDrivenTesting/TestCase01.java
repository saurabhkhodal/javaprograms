package DataDrivenTesting;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase01 {

	public static void main(String[] args) throws IOException, Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();

		String filePath = System.getProperty("user.dir") + "\\TestData\\CalData.xlsx";
		int rows = ExcelUtility.getRowCount(filePath, "Sheet1");

		for (int i = 1; i <= rows; i++) {
			// Read data from Excel
			String principle_amount = ExcelUtility.getCellData(filePath, "Sheet1", i, 0);
			String ROI = ExcelUtility.getCellData(filePath, "Sheet1", i, 1);
			String period1 = ExcelUtility.getCellData(filePath, "Sheet1", i, 2);
			String period2 = ExcelUtility.getCellData(filePath, "Sheet1", i, 3).trim();  // Trim spaces
			String frequency = ExcelUtility.getCellData(filePath, "Sheet1", i, 4);
			String maturity_value = ExcelUtility.getCellData(filePath, "Sheet1", i, 5);

			// Fill form fields
			driver.findElement(By.id("principal")).sendKeys(principle_amount);
			driver.findElement(By.id("interest")).sendKeys(ROI);
			driver.findElement(By.id("tenure")).sendKeys(period1);

			// Wait for dropdown to load
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='tenurePeriod']")));

			// Select tenure period
			WebElement periodDropdown = driver.findElement(By.xpath("//select[@name='tenurePeriod']"));
			Select select = new Select(periodDropdown);

			// Print all dropdown options
			boolean optionFound = false;
			for (WebElement option : select.getOptions()) {
				String optionText = option.getText().trim();
				System.out.println("Dropdown option: " + optionText);
				if (optionText.equalsIgnoreCase(period2)) {
					select.selectByVisibleText(optionText);
					optionFound = true;
					break;
				}
			}

			if (!optionFound) {
				System.out.println("Error: Could not find matching dropdown option for '" + period2 + "'");
				continue; // Skip this iteration if option is not found
			}

			// Select frequency
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='frequency']")));
			WebElement freqDropdown = driver.findElement(By.xpath("//select[@name='frequency']"));
			Select frequencySelect = new Select(freqDropdown);
			frequencySelect.selectByVisibleText(frequency);

			// Click on calculate button;

			// Check and close the popup if it appears
			try {
			    WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='No thanks']")));
			    
			    if (popup.isDisplayed()) {
			        System.out.println("Notification popup detected. Closing it...");
			        popup.click();
			        Thread.sleep(2000);  // Give time for popup to close
			    }
			} catch (Exception e) {
			    System.out.println("No notification popup found. Proceeding...");
			}
			
			
			
			WebElement cal_btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif']")));
			cal_btn.click();

			// Wait for the maturity value result
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='resp_matval']//strong")));
			String act_value = driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();

			// Validation
			if (Double.parseDouble(maturity_value) == Double.parseDouble(act_value)) {
				System.out.println("Test Passed");
				ExcelUtility.setCellData(filePath, "Sheet1", i, 7, "Passed");
				ExcelUtility.fillGreenColor(filePath, "Sheet1", i, 7);
			} else {
				System.out.println("Test Failed");
				ExcelUtility.setCellData(filePath, "Sheet1", i, 7, "Failed");
				ExcelUtility.fillRedColor(filePath, "Sheet1", i, 7);
			}

			// Click on the clear button
			WebElement clearButton = driver.findElement(By.xpath("//img[contains(@class, 'PL5')]"));
			clearButton.click();
			
			

			// Pause before next iteration
			Thread.sleep(2000);
		}

		// Close browser after execution
		driver.quit();
	}
}
