/*
 * Ирина Коробейникова
 *
 *Copyright (c) 2019 LevelUP, Inc. All Rights Reserved
 *
 */
package homework_6.task_1;

import homework_6.AbstractBaseClassSelenium;
import homework_6.Pages.HomePage;
import org.junit.jupiter.api.Test;

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

        driver.get(WEBSITE_URL);
        assertEquals(driver.getTitle(), "Users");

        HomePage homePage = new HomePage(driver);
        homePage.loginButtonClick()
                .login(USER_MAIL, USER_PASSWORD)
                .logout();
    }
}
