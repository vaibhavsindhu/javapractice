import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AlertBox {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\api\\services\\WebAutomation\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.automationtesting.in/Alerts.html");
        alertWithOk();
        alertWithOkAndCancel();
        alertWithText();
        driver.quit();
    }

    public static void alertWithOk() throws InterruptedException {
        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
        Alert alert = driver.switchTo().alert();
        //get text
        System.out.println(alert.getText());
        //click ok
        Thread.sleep(5000);
        alert.accept();
    }

    public static void alertWithOkAndCancel() throws InterruptedException {

        driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();

        //press ok at alert
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        Alert alert = driver.switchTo().alert();
        //get text
        System.out.println(alert.getText());
        //click ok
        Thread.sleep(5000);
        alert.accept();
        System.out.println(driver.findElement(By.id("demo")).getText());

        // Now cancel the alert

        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        alert = driver.switchTo().alert();
        //get text
        System.out.println(alert.getText());
        //click ok
        Thread.sleep(5000);
        alert.dismiss();
        System.out.println(driver.findElement(By.id("demo")).getText());
    }

    public static void alertWithText() throws InterruptedException {

        driver.findElement(By.xpath("//a[@href='#Textbox']")).click();

        //Enter text at alert
        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(5000);

        alert.sendKeys("Sending text to alert");

        //accept the alert
        alert.accept();

        //get text after ok
        System.out.println(driver.findElement(By.id("demo1")).getText());

    }
}
