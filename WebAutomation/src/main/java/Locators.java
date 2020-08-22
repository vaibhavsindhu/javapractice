import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    static WebDriver driver;

    public static void main(String[] args) {

        //by id
        By userName = By.id("txtUsername");
        //name
        By pwd = By.name("txtPassword");
        //by xpath
        By uName = By.xpath("//input[@name='txtUsername']");
        //className
        By admin = By.className("panelTrigger");
        //LinkText
        By linkText = By.linkText("https://opensource-demo.orangehrmlive.com/index.php/leave/assignLeave");
        //CSS   .... use "#" for id and "." for class
        By css = By.cssSelector("#menu_leave_viewLeaveList");

        System.setProperty("webdriver.chrome.driver", "D:\\api\\services\\WebAutomation\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());


        driver.findElement(userName).sendKeys("admin");
        driver.findElement(pwd).sendKeys("admin123");
        driver.findElement(uName).clear();
        driver.findElement(uName).sendKeys("abc");
        driver.findElement(admin).click();
        driver.findElement(linkText).click();
        driver.findElement(css);
        //driver.quit();
    }

    public WebElement getElement(WebDriver driver,String type, String locator) {
        WebElement element = null;
        if (type.equalsIgnoreCase("xpath")) {
            element = driver.findElement(By.xpath(locator));
        } else if (type.equalsIgnoreCase("id")) {
            element = driver.findElement(By.id(locator));
        } else if (type.equalsIgnoreCase("class")) {
            element = driver.findElement(By.className(locator));
        } else if (type.equalsIgnoreCase("css")) {
            element = driver.findElement(By.cssSelector(locator));
        } else if (type.equalsIgnoreCase("partialLinkText")) {
            element = driver.findElement(By.partialLinkText(locator));
        } else if (type.equalsIgnoreCase("linkText")) {
            element = driver.findElement(By.linkText(locator));
        } else if (type.equalsIgnoreCase("name")) {
            element = driver.findElement(By.name(locator));
        } else if (type.equalsIgnoreCase("tagName")) {
            element = driver.findElement(By.tagName(locator));

        }
        return element;
    }



}
