package Programs.OOP;


class ChromeDriverImpl implements WebDriverActions {

    @Override
    public void openBrowser() {
        System.out.println("Chrome browser opened");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Chrome browser closed");
    }
}

public class InterfaceExample {

    public static void main(String[] args) {

        WebDriverActions driver = new ChromeDriverImpl();
        driver.openBrowser();
        driver.closeBrowser();
    }
}