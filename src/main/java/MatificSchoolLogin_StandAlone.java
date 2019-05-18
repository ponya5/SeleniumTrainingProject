import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MatificSchoolLogin_StandAlone {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 60);  //fluent wait
        driver.get("https://www.matific.com");                              // go to matific home

        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href*='/isr/he/login-page/")));
        loginButton.click();
        WebElement UsernameField = wait.until(ExpectedConditions.elementToBeClickable(By.id("username-input")));
        UsernameField.sendKeys("afteacher");
        WebElement NextButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-text")));
        NextButton.click();
        WebElement PasswordField = wait.until(ExpectedConditions.elementToBeClickable(By.id("password-input")));
        PasswordField.sendKeys("123");
        NextButton.click();                                               //same button for the button named login.
        driver.quit();                                                    // Close browser
    }
}

