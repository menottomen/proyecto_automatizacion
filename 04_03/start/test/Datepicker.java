import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import static java.lang.Thread.*;

public class Datepicker {
    public static void main(String[] args) throws InterruptedException{

        //System.setProperty("webdriver.chrome.driver", "/Users/meaghanlewis/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement dateField = driver.findElement(By.id("datepicker"));
        dateField.sendKeys("03/04/2022");
        sleep(2000);
        dateField.sendKeys(Keys.RETURN);
        sleep(2000);


        driver.quit();
    }
}