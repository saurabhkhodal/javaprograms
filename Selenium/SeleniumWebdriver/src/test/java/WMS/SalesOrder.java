package WMS;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SalesOrder {

    public static void main(String[] args) throws Exception {

        // ---------------------------
        // LOAD CONFIG FILE
        // ---------------------------
        Properties property = new Properties();
        FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\TestData\\config.properties");
        property.load(file);

        String url = property.getProperty("appurl");
        String email = property.getProperty("email");
        String password = property.getProperty("password");
        String store = property.getProperty("storeName");

        // ---------------------------
        // DRIVER SETUP
        // ---------------------------
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-save-password-bubble");

        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));

        driver.manage().window().maximize();
        driver.get(url);

        // ---------------------------
        // LOGIN
        // ---------------------------
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']")))
                .sendKeys(email);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")))
                .sendKeys(password);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-primary w-100 mt-4']")))
                .click();

        // ---------------------------
        // HANDLE GOOGLE POPUP IF EXISTS
        // ---------------------------
        try {
            WebElement ok = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='OK']")));
            ok.click();
        } catch (Exception e) {
            // popup not present
        }

        // ---------------------------
        // OPEN OMS → SALES ORDER
        // ---------------------------
        WebElement oms = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//span[normalize-space()='OMS']")));

        Actions act = new Actions(driver);
        act.moveToElement(oms).perform(); // hover OMS

        WebElement sales_order = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[@id=\"main-menu\"]/div/ul/li[4]/div/ul/li[1]/div/a")));   
 
        act.moveToElement(sales_order).click().perform();

        // ---------------------------
        // ADD SALES ORDER
        // ---------------------------
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[contains(@class,'header-add-button')]"))).click();

        // ---------------------------
        // SELECT BILL-TO STORE
        // ---------------------------
        WebElement billTo = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//input[@id='custom-input-demoundefined']")));

        billTo.sendKeys(store);

        // select first dropdown option
        WebElement firstStoreOption = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//ul[@role='listbox']//li")));

        firstStoreOption.click();

        // ---------------------------
        // ROW MANAGEMENT
        // ---------------------------
        String filePath = System.getProperty("user.dir") + "\\TestData\\CreateSalesOrder.xlsx";

        int expectedRows = Utility.getRowCount(filePath, "Sheet1");

        // Ensure table has required rows
        while (true) {
            List<WebElement> tableRows = driver.findElements(
                    By.xpath("//tbody//tr[@style='border: initial; border-collapse: collapse;']"));

            if (tableRows.size() >= expectedRows)
                break;

            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[contains(@class,'btn-main')]"))).click();
        }

        // ---------------------------
        // ENTER PRODUCT & QTY FOR EACH ROW
        // ---------------------------
        int rowCount = Utility.getRowCount(filePath, "Sheet1");

        for (int r = 1; r <= rowCount; r++) {

            String product = Utility.getCellData(filePath, "Sheet1", r, 0);
            String qty = Utility.getCellData(filePath, "Sheet1", r, 1);

            // PRODUCT FIELD
            WebElement productField = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("(//input[contains(@placeholder,'Search product')])[" + r + "]")));

            productField.click();
            productField.sendKeys(product);

            WebElement firstProduct = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//ul[@class='MuiAutocomplete-listbox css-ue1yok']//li")));

            firstProduct.click();

            // QTY FIELD
            WebElement qtyField = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("(//input[@class='p-0 px-3 w-100 border-0 outline-0 form-control tabable m-0'])[" + r + "]")));

            // bring into view
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", qtyField);

            qtyField.clear();
            qtyField.sendKeys(qty);
        }

        System.out.println("Sales Order filled successfully!");
    }
}
