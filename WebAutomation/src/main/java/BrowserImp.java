import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserImp {
   static WebDriver driver;

    public static void main(String[] args) {
        BrowserImp browserImp = new BrowserImp();
        // browserImp.chrome();
        //browserImp.fireFox();
        browserImp.IE();

    }

    public void fireFox() {
        System.setProperty("webdriver.gecko.driver", "D:\\api\\services\\WebAutomation\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.flipkart.com/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

    }

    public void chrome() {
        System.setProperty("webdriver.chrome.driver", "D:\\api\\services\\WebAutomation\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.quit();
    }

    /**
     * download ie from seleniumhq.com
     * Set path for ie driver
     * open ie and set protected mode off
     */

    public void IE() {
        System.setProperty("webdriver.ie.driver", "D:\\api\\services\\WebAutomation\\drivers\\IEDriverServer.exe");
        driver = new InternetExplorerDriver();
        driver.get("https://www.flipkart.com/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Tv");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        // driver.quit();
    }

    public WebDriver openBrowser(String url) {
        System.setProperty("webdriver.chrome.driver", "D:\\api\\services\\WebAutomation\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get(url);
        return driver;
    }
}
