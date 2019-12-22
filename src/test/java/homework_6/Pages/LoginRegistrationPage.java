
package homework_6.Pages;
import homework_6.AbstractBaseClassSelenium;
import homework_6.Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Класс LoginRegistrationPage наследуется от абстрактного класса
 * AbstractBaseClassSelenium и содержит поля и методы,
 * с помощью которых тесты взаимодействуют со страницей входа/регистрации.
 *
 * @version 1.0 21.12.2019
 * @author Ирина Коробейникова
 */
public class LoginRegistrationPage extends AbstractBaseClassSelenium {

    /**
     * Поле "Email"
     */
    @FindBy(name = "login")
    private static WebElement loginField;

    /**
     * Поле "Пароль"
     */
    @FindBy(name = "password")
    private static WebElement passwordField;

    /**
     * Кнопка "Авторизоваться"
     */
    @FindBy(xpath = "//input[@value='Авторизоваться']")
    private static WebElement loginOnWebsiteButton;

    public LoginRegistrationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /**
     * Метод login отвечает за тестирование
     * функциональности входа на сайт.
     */
    public HomePage login(String userEmail, String userPassword){

        loginField.sendKeys(userEmail);
        passwordField.sendKeys(userPassword);
        loginOnWebsiteButton.click();
        return new HomePage(driver);
    }
}
