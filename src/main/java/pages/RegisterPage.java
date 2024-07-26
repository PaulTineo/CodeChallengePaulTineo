package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "customer.firstName")
    private WebElement firstName;

    @FindBy(id = "customer.lastName")
    private WebElement lastName;

    @FindBy(id = "customer.address.street" )
    private WebElement address;

    @FindBy(id= "customer.address.city")
    private WebElement city;

    @FindBy(id= "customer.address.state")
    private WebElement state;

    @FindBy(id= "customer.address.zipCode")
    private WebElement zipCode;

    @FindBy(id = "customer.phoneNumber")
    private WebElement phoneNumber;

    @FindBy(id = "customer.ssn")
    private WebElement ssn;

    @FindBy(id = "customer.username")
    private WebElement username;

    @FindBy(id = "customer.password")
    private WebElement password;

    @FindBy(id = "repeatedPassword")
    private WebElement confirmPassword;

    @FindBy(css = "input[value='Register']")
    private WebElement registerButton;

    public void RegisterUserFrom(String firstName, String lastName, String address, String city, String state, String zipCode, String phone, String ssn, String username, String password, String confirmPassword){

        this.firstName.sendKeys(firstName);
        this.lastName.sendKeys(lastName);
        this.address.sendKeys(address);
        this.city.sendKeys(city);
        this.state.sendKeys(state);
        this.zipCode.sendKeys(zipCode);
        this.phoneNumber.sendKeys(phone);
        this.ssn.sendKeys(ssn);
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        this.confirmPassword.sendKeys(confirmPassword);


    }

    public void clickRegisterButton(){
        registerButton.click();
    }



}
