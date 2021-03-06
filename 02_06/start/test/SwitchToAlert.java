import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.*;

public class SwitchToAlert {
    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver", "C:/DATOS/AUTOMATIZACION/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");
        WebElement alertButton = driver.findElement(By.id("alert-button"));
        alertButton.click();
        sleep(2000);

        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.quit();
    }
}
