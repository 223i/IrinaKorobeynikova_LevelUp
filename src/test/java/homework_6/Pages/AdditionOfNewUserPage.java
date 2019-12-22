/*
 * Ирина Коробейникова
 *
 *Copyright (c) 2019 LevelUP, Inc. All Rights Reserved
 *
 */
package homework_6.Pages;
import homework_6.AbstractBaseClassSelenium;
import homework_6.Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Класс AdditionOfNewUserPage наследуется от абстрактного класса
 * AbstractBaseClassSelenium и содержит поля и методы,
 * с помощью которых тесты взаимодействуют со страницей
 * создания нового пользователя.
 *
 * @version 1.0 21.12.2019
 * @author Ирина Коробейникова
 */
public class AdditionOfNewUserPage extends AbstractBaseClassSelenium {
    /**
     * Поле "Имя пользователя"
     */
    @FindBy(css = "table input[name='noibiz_name']")
    private static WebElement userNameField;

    /**
     * Поле "Email пользователя"
     */
    @FindBy(css = "table input[name='noibiz_email']")
    private static WebElement userEmailField;

    /**
     * Поле "Пароль пользователя"
     */
    @FindBy(css = "table input[name='noibiz_password']")
    private static WebElement userPasswordField;

    /**
     * Поле "ДР пользователя"
     */
    @FindBy(css = "table input[name='noibiz_birthday']")
    private static WebElement userBirthdayField;

    /**
     * Выпадающее поле "Пол пользователя"
     */
    @FindBy(css = "table select[name='noibiz_gender']")
    private static WebElement userGenderDropdownList;

    /**
     * Значение поля  "Пол пользователя" = мужской
     */
    @FindBy(css = "select option[value='m']")
    private static WebElement userGenderMale;

    /**
     * Значение поля  "Пол пользователя" = женский
     */
    @FindBy(css = "select option[value='f']")
    private static WebElement userGenderFemale;

    /**
     * Кнопка  "Добавить пользователя"
     */
    @FindBy(css = "table input[value='Добавить пользователя']")
    private static WebElement addUserButton;


    public AdditionOfNewUserPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /**
     * Метод addUser отвечает за тестирование
     * функциональности добавление нового пользователя
     * на сайт.
     */
    public HomePage addNewUser(){
        userNameField.sendKeys(NEW_USER_NAME);
        userEmailField.sendKeys(NEW_USER_MAIL);
        userPasswordField.sendKeys(NEW_USER_PASSWORD);
        userBirthdayField.sendKeys(NEW_USER_BIRTHDAY);
        userGenderDropdownList.click();
        if(NEW_USER_GENDER.equals("m")){
            userGenderMale.click();
        }else{
            userGenderFemale.click();
        }
        addUserButton.click();
        return new HomePage(driver);
    }
}
