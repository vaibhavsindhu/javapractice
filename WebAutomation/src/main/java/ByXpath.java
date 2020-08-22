import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * https://www.lambdatest.com/blog/complete-guide-for-using-xpath-in-selenium-with-examples/#testid1
 */
public class ByXpath {
    static WebDriver driver;

    public static void main(String[] args) {
        BrowserImp browserImp = new BrowserImp();
        driver = browserImp.openBrowser("http://demo.automationtesting.in/Register.html");
        driver.getCurrentUrl();

        //relative xpath
        // driver.findElement(By.xpath(/html/body/..../..../)).sendKeys("abc");

        //absolute xpath
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("abc");

        //few complex xpaths

        //1: using contains
        String className = driver.findElement(By.xpath("//label[contains(text(),'Full Name*')]")).getAttribute("class");
        System.out.println(className);

        //2:using *
        className = driver.findElement(By.xpath("//*[contains(text(),'Full Name*')]")).getAttribute("class");
        System.out.println(className);

        //OR
        By fName = By.xpath("//input[@ng-model='FirstName' or@placeholder='First Name']");
        driver.findElement(fName).clear();
        driver.findElement(fName).sendKeys("vaibhav");


        //AND
        fName = By.xpath("//input[@ng-model='FirstName' and @placeholder='First Name']");
        driver.findElement(fName).clear();
        driver.findElement(fName).sendKeys("singh");

        //Finding the element 'Start testing' having text as same, here we will locate element using contains through xpath
        String email = driver.findElement(By.xpath("//label[starts-with(text(), 'Email')]")).getAttribute("class");
        System.out.println(email);

        //using index ...chaining is also there //select.....//option
        System.out.println(
                driver.findElement(By.xpath("//select[1]//option[contains(text(),'Adobe Photoshop')]")).getAttribute("value"));

        //XPath axes
        //1: using following
        // this will give all the matching elements below the given node
        List followings = driver.findElements(By.xpath("//select[1]//option[contains(text(),'Adobe Photoshop')]//following::option"));
        System.out.println(followings.size()); // 483 matches

        //2: following sibling
        //this gives all the matching elements who have same parent as the given Node (all following sibling)
        List following_siblings = driver.findElements(By.xpath("//select[1]//option[contains(text(),'Adobe Photoshop')]//following-sibling::option[1]"));
        System.out.println(following_siblings.size()); // 75 matches

        //3: Preceding
        List preceding = driver.findElements(By.xpath("//label[contains(text(),'Cricket')]/preceding::input"));
        System.out.println(preceding.size()); // 7 matches

        //4: Preceding sibling
        List preceding_siblings = driver.findElements(By.xpath("//label[contains(text(),'Cricket')]/preceding-sibling::input"));
        System.out.println(preceding_siblings.size()); // 1 matches

        // 5: Child
        String value = driver.findElement(By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4']/child::div/input[@value='Cricket']")).getAttribute("value");
        System.out.println(value);

        // 6: Parent
        String parentValue = driver.findElement(By.xpath("//input[@value='Cricket']/parent::div/parent::div")).getAttribute("class");
        System.out.println(parentValue);

        // 7: descendant
        List<WebElement> descendant = driver.findElements(By.xpath("//select[@id='Skills']//descendant::option"));
        System.out.println(descendant.size());

        // 8: ancestor
        List<WebElement> ancestors = driver.findElements(By.xpath("//select[@id='Skills']//ancestor::div"));
        System.out.println(ancestors.size());

    }


}
