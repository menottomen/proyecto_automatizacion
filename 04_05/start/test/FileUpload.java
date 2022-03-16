import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import static java.lang.Thread.*;

public class FileUpload {
    public static void main(String[] args) throws InterruptedException{

        //System.setProperty("webdriver.chrome.driver", "/Users/meaghanlewis/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");

        WebElement fileUploadField = driver.findElement(By.id("file-upload-field"));
        fileUploadField.sendKeys("C:\\Users\\Administrador\\Downloads\\2022-03-13.pdf");
        sleep(3000);

        driver.quit();
    }
}
