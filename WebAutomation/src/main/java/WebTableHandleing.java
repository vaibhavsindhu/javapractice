import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebTableHandleing {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\api\\services\\WebAutomation\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // readTable();
        //readTableByTagName();
        // getValueFromTable();
        //readDataUsingXpath();

        //static table handle
        staticTable();
        driver.quit();

    }

    public static void readTable() {
        driver.get("http://demo.automationtesting.in/WebTable.html");
        List<WebElement> row = driver.findElements(By.xpath("//div[@class='ui-grid-row ng-scope']"));
        System.out.println(row.size());
        for (int i = 0; i < row.size(); i++)
            System.out.println(row.get(i).getText() + "  ");
    }

    public static void readTableByTagName() {
        driver.get("http://demo.guru99.com/test/web-table-element.php");

        //get table element
        WebElement table = driver.findElement(By.tagName("table"));

        //get all the row of that table
        List<WebElement> rows = table.findElements(By.xpath("//table//tbody//tr"));
        //get all the headers
        List<WebElement> header = table.findElements(By.tagName("th"));
        System.out.print("Header : ");
        for (int j = 0; j < header.size(); j++) {
            System.out.print(header.get(j).getText() + "    ");
        }
        System.out.println();

        // print table row by row
        for (WebElement row : rows) {
            List<WebElement> cols = row.findElements(By.tagName("td"));
            System.out.print("Row : ");
            for (WebElement col : cols) {
                System.out.print(col.getText() + "    ");
            }
            System.out.println();
        }
    }

    // read data using loops
    public static void getValueFromTable() {
        driver.get("http://demo.guru99.com/test/web-table-element.php");

        //get table element
        WebElement table = driver.findElement(By.tagName("table"));

        //get all the row of that table
        List<WebElement> rows = table.findElements(By.xpath("//table//tbody//tr"));
        //get all the headers
        List<WebElement> header = table.findElements(By.tagName("th"));
        System.out.print("Header : ");
        for (int j = 0; j < header.size(); j++) {
            System.out.print(header.get(j).getText() + "    ");
        }
        System.out.println();

        // print table row by row
        for (WebElement row : rows) {
            List<WebElement> cols = row.findElements(By.tagName("td"));

            // table is dynamic so this may not come every time
            for (WebElement col : cols) {
                if (col.getText().equalsIgnoreCase("ICICI Pru Life")) {
                    List<WebElement> column = row.findElements(By.tagName("td"));
                    for (int i = 0; i < column.size(); i++) {
                        System.out.print(column.get(i).getText());
                    }
                }
            }

        }


    }

    // filter data using xpath
    public static void readDataUsingXpath() {
        driver.get("http://demo.guru99.com/test/web-table-element.php");
        List<WebElement> cols = driver.findElements(By.xpath("//table//td//a[contains(text(),'Bharat Electroni')]/../../td"));
        for (WebElement col : cols) {
            System.out.println(col.getText());
        }
    }
    //static table handling
    public static void staticTable(){
       // driver.get("http://demo.guru99.com/test/table.html");
        driver.get("file:///D:/website/index.html");
        List<WebElement> rows=driver.findElements(By.xpath("//table//tr"));
        for(WebElement row: rows){
            System.out.println(row.getText());
        }
    }

}
