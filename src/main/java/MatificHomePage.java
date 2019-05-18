import PageObjects.MatificHomePageObjects;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MatificHomePage {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.matific.com");
        MatificHomePageObjects login = new MatificHomePageObjects(driver);

        //WebDriverWait wait = new WebDriverWait(driver,60);
        login.ClickMainLoginButton();
        login.TypeUserName("afteacher");
        login.NextButtonClick();
        login.TypePassword("123");
        login.NextButtonClick();

        //driver.quit();





    }
}

