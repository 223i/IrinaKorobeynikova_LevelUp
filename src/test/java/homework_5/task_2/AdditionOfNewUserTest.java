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

        login(USER_MAIL, USER_PASSWORD);

        addNewUser();

        checkNewUser();

        logout();
    }

    /**
     * Метод addUser отвечает за тестирование
     * функциональности добавление нового пользователя
     * на сайт.
     */
    private void addNewUser(){
        driver.findElement(By.linkText("Пользователи")).click();
        driver.findElement(By.linkText("Добавить пользователя")).click();
        driver.findElement(By.cssSelector("table input[name='noibiz_name']")).sendKeys("NewName");
        driver.findElement(By.cssSelector("table input[name='noibiz_email']")).sendKeys("NewEmail@test.te");
        driver.findElement(By.cssSelector("table input[name='noibiz_password']")).sendKeys("newpassword");
        driver.findElement(By.cssSelector("table input[name='noibiz_birthday']")).sendKeys("31.12.2012");
        driver.findElement(By.cssSelector("table select[name='noibiz_gender']")).click();
        driver.findElement(By.cssSelector("select option[value='m']")).click();
        driver.findElement(By.cssSelector("table input[value='Добавить пользователя']"));
    }

    /**
     * Метод checkNewUser должен отвечать за проверку
     * появления нового пользователя в таблице пользователей, но
     * он там не появляется:(
     *
     */
    private void checkNewUser(){
        driver.findElement(By.linkText("Пользователи")).click();  //открыть страницу пользователи
        driver.findElement(By.cssSelector("table input[placeholder='Введите email или имя']")).sendKeys("NewEmail@test.te");
        driver.findElement(By.cssSelector("table button[type='submit']")).click();

    }
}
