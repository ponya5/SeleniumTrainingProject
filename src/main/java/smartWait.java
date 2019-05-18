import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class smartWait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(); // Open Chrome
        WebDriverWait wait = new WebDriverWait(driver,60);  //fluent wait
        driver.manage().window().maximize();
        driver.get("https://practis.co.il/automation/whysync.html");
        WebElement button2 = wait.until(ExpectedConditions.elementToBeClickable(By.id("btn1")));
        button2.click();

        //WebElement button = driver.findElement(By.id("btn1"));    //this is the original implementation .

        button.click();
    }
}
