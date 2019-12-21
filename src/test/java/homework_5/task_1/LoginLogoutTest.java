/*
 * Ирина Коробейникова
 *
 *Copyright (c) 2019 LevelUP, Inc. All Rights Reserved
 *
 */
package homework_5.task_1;
import homework_5.AbstractBaseClassSelenium;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Класс LoginLogout наследуется от абстрактного класса
 * AbstractBaseClassSelenium и содержит метод,
 * с помощью которого тестируется функциональность входа на страницу/
 * выхода.
 *
 * @version 1.0 14.12.2019
 * @author Ирина Коробейникова
 */
public class LoginLogoutTest extends AbstractBaseClassSelenium {

    /**
     * Тест loginLogout отвечает за создание тестирование
     * функциональности входа на сайт и выхода.
     */
    @Test
    public void loginLogout() {

        driver.get("http://users.bugred.ru/");
        assertEquals(driver.getTitle(), "Users");

        login(driver, USER_MAIL, USER_PASSWORD, USER_NAME);

        logout(driver);
    }
}
