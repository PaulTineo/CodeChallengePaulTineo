package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(name = "username")
    private WebElement usernameText;

    @FindBy(name = "password")
    private WebElement passwordText;

    @FindBy(css = "input[value='Log In']")
    private WebElement loginButton;

    public void login(String username, String password) {
        this.usernameText.sendKeys(username);
        this.passwordText.sendKeys(password);
        this.loginButton.click();
    }
}
