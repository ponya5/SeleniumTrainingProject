package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MatificHomePageObjects {
    WebDriver driver = null;

    //Object Mapping

    //By LoginButton = By.cssSelector("a[href*='/isr/he/login-page/");
    By LoginButton = By.cssSelector("a[href*='/isr/he/login-page/");
    By Username = By.id("username-input");
    By Password = By.id("password-input");
    By NextButton = By.id("login-text");


    public MatificHomePageObjects(WebDriver driver) {
        this.driver = driver;
    }

    //Basic Functions
    public void ClickMainLoginButton() {
        driver.findElement(LoginButton).click();
    }

    public void NextButtonClick() {
        driver.findElement(NextButton).click();
    }

    public void TypeUserName(String value) {
        driver.findElement(Username).sendKeys(value);
    }

    public void TypePassword(String value) {
        driver.findElement(Password).sendKeys(value);
    }


}
