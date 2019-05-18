import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateGoogle {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(); // Open Chrome
        driver.manage().window().maximize();
        driver.get("http://www.google.co.il"); // go to Google
        WebElement searchField = driver.findElement(By.name("q"));
        searchField.sendKeys("practis.co.il");
        searchField.sendKeys(Keys.ENTER);

        WebElement firstResult = driver.findElement(By.className("r"));
        WebElement URLResult = firstResult.findElement(By.tagName("a"));
        System.out.println(URLResult.getAttribute("href"));


        //driver.quit(); // Close browser
    }
}
