import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElements extends Locators {
    static WebDriver driver;

    public static void main(String[] args) {
        BrowserImp browserImp = new BrowserImp();
        browserImp.IE();
    }


    public WebElement textBox(WebDriver driver, String type, String locator) {
        return getElement(driver, type, locator);
    }

    public WebElement label(WebDriver driver, String type, String locator) {
        return getElement(driver, type, locator);
    }

    public WebElement checkbox(WebDriver driver, String type, String locator) {
        return getElement(driver, type, locator);
    }

    public WebElement dropdown(WebDriver driver, String type, String locator) {
        return getElement(driver, type, locator);
    }

    public WebElement radioButton(WebDriver driver, String type, String locator) {
        return getElement(driver, type, locator);

    }
    public WebElement button(WebDriver driver, String type, String locator) {
        return getElement(driver, type, locator);

    }

}
