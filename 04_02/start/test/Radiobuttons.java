import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import static java.lang.Thread.*;

public class Radiobuttons {
    public static void main(String[] args) throws InterruptedException{

        //System.setProperty("webdriver.chrome.driver", "/Users/meaghanlewis/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement radiobutton1 = driver.findElement(By.id("radio-button-1"));
        radiobutton1.click();
        sleep(2000);

        WebElement radiobutton2 = driver.findElement(By.cssSelector("input[value='option2']"));
        radiobutton2.click();
        sleep(2000);

        WebElement radiobutton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        radiobutton3.click();
        sleep(2000);

        driver.quit();

        WebDriver driver2 = new ChromeDriver();
        driver2.get("https://formy-project.herokuapp.com/checkbox");

        WebElement checkbox1 = driver2.findElement(By.id("checkbox-1"));
        checkbox1.click();
        sleep(2000);

        WebElement checkbox2 = driver2.findElement(By.cssSelector("input[value='checkbox-2']"));
        checkbox2.click();
        sleep(2000);

        WebElement checkbox3 = driver2.findElement(By.xpath("//*[@id=\"checkbox-3\"]"));
        checkbox3.click();
        sleep(2000);

        checkbox1.click();
        sleep(1000);
        checkbox2.click();
        sleep(1000);
        checkbox3.click();
        sleep(1000);


        driver2.quit();

    }
}
