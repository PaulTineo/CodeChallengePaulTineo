package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Register")
    private WebElement registerLink;

    @FindBy(css="#rightPanel p")
    private WebElement successMessage;


    public void clickRegister() {
        registerLink.click();
    }

    public boolean SuccessFullRegister() {
        return successMessage.getText().equals("Your account was created successfully. You are now logged in.");
    }
}
