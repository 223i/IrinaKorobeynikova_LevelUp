/*
 * Ирина Коробейникова
 *
 *Copyright (c) 2019 LevelUP, Inc. All Rights Reserved
 *
 */
package homework_6.Pages;
import homework_6.AbstractBaseClassSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Класс HomePage наследуется от абстрактного класса
 * AbstractBaseClassSelenium и содержит поля и методы,
 * с помощью которых тесты взаимодействуют с домашней страницей.
 *
 * @version 1.0 21.12.2019
 * @author Ирина Коробейникова
 */
public class HomePage extends AbstractBaseClassSelenium {

    /**
     * Кнопка "Пользователи"
     */
    @FindBy(linkText = "Пользователи")
    private static WebElement usersButton;

    /**
     * Кнопка "Войти"
     */
    @FindBy(linkText = "Войти")
    private static WebElement loginButton;

    /**
     * Поисковая строка
     */
    @FindBy(css = "table input[placeholder='Введите email или имя'")
    private static WebElement searchBar;

    /**
     * Кнопка "Найти"
     */
    @FindBy(css = "table button[type='submit']")
    private static WebElement searchButton;

    /**
     * Выпадающий лист
     */
    @FindBy(className = "dropdown-toggle")
    private static WebElement dropdownList;

    /**
     * Кнопка "Выход"
     */
    @FindBy(linkText = "Выход")
    private static WebElement logoutButton;

    /**
     * Кнопка "Добавить пользователя"
     */
    @FindBy(linkText = "Добавить пользователя")
    private static WebElement addUserButton;


    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /**
     * Метод loginButtonClick отвечает за переход
     * с домашней страницы на страницу регистрации/
     * входа.
     */
    public LoginRegistrationPage loginButtonClick(){
        loginButton.click();
        return new LoginRegistrationPage(driver);
    }


    /**
     * Метод logout отвечает за тестирование
     * функциональности выхода с сайта.
     */
    public void logout(){
        dropdownList.click();
        logoutButton.click();
    }

    /**
     * Метод addUserClick отвечает за переход
     * с домашней страницы на страницу создания нового
     * пользователя.
     */
    public AdditionOfNewUserPage addUserClick(){
        addUserButton.click();
        return new AdditionOfNewUserPage(driver);
    }

    /**
     * Метод checkNewUser должен отвечать за проверку
     * появления нового пользователя в таблице пользователей, но
     * он там не появляется:(
     */
    public HomePage checkNewUser(){
        usersButton.click();
        searchBar.sendKeys("NewEmail@test.te");
        searchButton.click();
        return new HomePage(driver);
    }
}

