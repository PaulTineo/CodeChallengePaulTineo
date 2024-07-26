package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;


public class RegisterAndLoginTest {
    private WebDriver driver;
    private HomePage homePage;
    private RegisterPage registerPage;
    private LoginPage loginPage;

    @BeforeMethod
    public void setUp() {
        //configuracion
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");

        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);
        loginPage = new LoginPage(driver);
    }

    //Ejecucion del Test
    @Test
    public void testRegisterAndLogin() {

        homePage.clickRegister();

        String randomUserString=Long.toString(System.currentTimeMillis());//Genera un numero aleatorio
        String firstName="Paul";
        String lastName="Tineo";
        String address="Calle Yungay 112";
        String city="Lima";
        String state="Peru";
        String zipCode="12345";
        String phone="978211558";
        String ssn="123-456-789";
        String username="user"+randomUserString;//concatena el numero aleatorio
        String password="Seguridad2024$";
        String confirmPassword="Seguridad2024$";

        registerPage.RegisterUserFrom(firstName,lastName,address,city,state,zipCode,phone,ssn,username,password,confirmPassword);
        registerPage.clickRegisterButton();

        //comparamos el valor booleano, si no mostrara el mensaje
        Assert.assertTrue(homePage.SuccessFullRegister(), "No se muestra el mensaje de registro exitoso");

        //borramos los cookies para que se elimine la sesión
        driver.manage().deleteAllCookies();

        //volvemos abrir la web
        driver.get("https://parabank.parasoft.com/parabank/index.htm");

        //ingresamos las credenciales registradas
        loginPage.login(username, password);
    }

    //Cerramos el navegador
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
