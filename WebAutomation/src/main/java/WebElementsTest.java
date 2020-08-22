import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class WebElementsTest extends WebElements {
    static WebDriver driver;
    static BrowserImp browserImp;
    static String url = "http://demo.automationtesting.in/Register.html";

    public static void main(String[] args) {
        browserImp = new BrowserImp();
        WebElementsTest test = new WebElementsTest();
        driver = browserImp.openBrowser(url);
        test.RegisterPage();
    }

    public void RegisterPage() {
        textBox(driver, "xpath", "//input[@placeholder='First Name']").sendKeys("Vaibhav");
        textBox(driver, "xpath", "//input[@placeholder='Last Name']").sendKeys("Singh");
        textBox(driver, "tagName", "textarea").sendKeys("This is for register new user");
        textBox(driver, "xpath", "//input[@type='email']").sendKeys("test@testmail.com");
        textBox(driver, "xpath", "//input[@type='tel']").sendKeys("9876543210");
        checkbox(driver, "xpath", "//input[@value='Cricket']").click();
        checkbox(driver, "xpath", "//input[@value='Hockey']").click();
        // radio button
        radioBtn("male");

        // to select multiple languages
        getElement(driver, "id", "msdd").click();
        getElement(driver, "xpath", "//li/a[contains(text(),'Hindi')]").click();
        getElement(driver, "xpath", "//li/a[contains(text(),'English')]").click();
        getElement(driver, "xpath", "//li/a[contains(text(),'French')]").click();

        dropDown("id","Skills","Adobe InDesign");
        dropDown("id","countries","India");
        textBox(driver, "id", "firstpassword").sendKeys("password");
        textBox(driver, "id", "secondpassword").sendKeys("password");
        button(driver, "id", "submitbtn").submit();


    }

    public void radioBtn(String text) {
        List<WebElement> radioBtn = driver.findElements(By.name("radiooptions"));
        for (WebElement element : radioBtn) {
            String value = element.getAttribute("value");
            System.out.println(value);
            if (value.equalsIgnoreCase("male"))
                element.click();
        }

    }

    public void dropDown(String type,String locator,String value) {

        Select dd =new Select(dropdown(driver, type, locator));
        List<WebElement> options=dd.getOptions();
        System.out.println(options.size());
        for(WebElement option:options){
            System.out.println(option.getAttribute("value"));
            if (option.getAttribute("value").equalsIgnoreCase("India")){
                System.out.println("*************Hey I am Indian**************");
                break;
            }
            dd.selectByValue(value);

        }


    }
}
