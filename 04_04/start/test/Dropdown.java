import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import static java.lang.Thread.*;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException{

        //System.setProperty("webdriver.chrome.driver", "/Users/meaghanlewis/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropDownMenu = driver.findElement(By.id("dropdownMenuButton"));
        dropDownMenu.click();
        sleep(2000);

        WebElement autocompleteItem= driver.findElement(By.id("autocomplete"));
        autocompleteItem.click();

        sleep(2000);

        driver.quit();
    }
}
