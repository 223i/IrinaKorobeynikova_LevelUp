/*
 * Ирина Коробейникова
 *
 *Copyright (c) 2019 LevelUP, Inc. All Rights Reserved
 *
 */
package homework_6.task_2;
import homework_6.AbstractBaseClassSelenium;
import homework_6.Pages.HomePage;
import org.junit.jupiter.api.Test;
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

        driver.get(WEBSITE_URL);
        assertEquals(driver.getTitle(), "Users");

        HomePage homePage = new HomePage(driver);
        homePage.loginButtonClick()
                .login(USER_MAIL, USER_PASSWORD)
                .addUserClick()
                .addNewUser()
                .checkNewUser()
                .logout();

    }
}


