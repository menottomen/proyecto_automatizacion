import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.*;

public class Form {
    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver", "/Users/meaghanlewis/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        driver.findElement(By.id("first-name")).sendKeys("Juan");

        driver.findElement(By.id("last-name")).sendKeys("De la Cosa");

        driver.findElement(By.id("job-title")).sendKeys("QA Engineer");

        driver.findElement(By.id("radio-button-2")).click();

        driver.findElement(By.id("checkbox-1")).click();

        driver.findElement(By.cssSelector("option[value='4']")).click();
        sleep(3500);

        driver.findElement(By.id("datepicker")).sendKeys("04/29/2022");
        sleep(1500);
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        driver.findElement(By.id("datepicker")).sendKeys("04/29/2022");
        sleep(1500);
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
        sleep(2000);
        driver.quit();
    }
}
