/*
 * Ирина Коробейникова
 *
 *Copyright (c) 2019 LevelUP, Inc. All Rights Reserved
 *
 */
package homework_5.task_2;
import homework_5.AbstractBaseClassSelenium;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Класс AdditionOfNewUserTest наследуется от абстрактного класса
 * AbstractBaseClassSelenium и содержит методы,
 * с помощью которых тестируется функциональность заложения нового
 * пользователя.
 *
 * @version 1.0 14.12.2019
 * @author Ирина Коробейникова
 */
public class AdditionOfNewUserTest extends AbstractBaseClassSelenium {

    /**
     * Тест addUser отвечает за тестирование
     * функциональности заложения нового пользователя.
     */
    @Test
    public void addUser() {

        driver.get("http://users.bugred.ru/");
        assertEquals(driver.getTitle(), "Users");

        login(driver, USER_MAIL, USER_PASSWORD, USER_NAME);

        addUser(driver);

        checkNewUser(driver);

        logout(driver);
    }

    /**
     * Метод addUser отвечает за тестирование
     * функциональности добавление нового пользователя
     * на сайт.
     */
    private void addUser(WebDriver webDriver){
        webDriver.findElement(By.linkText("Пользователи")).click();
        webDriver.findElement(By.linkText("Добавить пользователя")).click();
        webDriver.findElement(By.cssSelector("table input[name='noibiz_name']")).sendKeys("NewName");
        webDriver.findElement(By.cssSelector("table input[name='noibiz_email']")).sendKeys("NewEmail@test.te");
        webDriver.findElement(By.cssSelector("table input[name='noibiz_password']")).sendKeys("newpassword");
        webDriver.findElement(By.cssSelector("table input[name='noibiz_birthday']")).sendKeys("31.12.2012");
        webDriver.findElement(By.cssSelector("table select[name='noibiz_gender']")).click();
        webDriver.findElement(By.cssSelector("select option[value='m']")).click();
        webDriver.findElement(By.cssSelector("table input[value='Добавить пользователя']"));
    }

    /**
     * Метод checkNewUser должен отвечать за проверку
     * появления нового пользователя в таблице пользователей, но
     * он там не появляется:(
     *
     */
    private void checkNewUser(WebDriver webDriver){
        webDriver.findElement(By.linkText("Пользователи")).click();  //открыть страницу пользователи
        webDriver.findElement(By.cssSelector("table input[placeholder='Введите email или имя']")).sendKeys("NewEmail@test.te");
        webDriver.findElement(By.cssSelector("table button[type='submit']")).click();

    }
}
