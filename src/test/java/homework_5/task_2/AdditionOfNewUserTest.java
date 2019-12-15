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

        WebDriver webDriver = new ChromeDriver();

        webDriver.get("http://users.bugred.ru/");
        assertEquals(webDriver.getTitle(), "Users");

        login(webDriver, USER_MAIL, USER_PASSWORD, USER_NAME);

        addUser(webDriver);

        checkNewUser(webDriver);

        logout(webDriver);

        webDriver.close();
    }

    /**
     * Метод addUser отвечает за тестирование
     * функциональности добавление нового пользователя
     * на сайт.
     */
    private void addUser(WebDriver webDriver){
        webDriver.findElement(By.cssSelector("#main-menu > ul > li:nth-child(1) > a > span")).click();
        webDriver.findElement(By.cssSelector("body > div.content > p:nth-child(2) > a")).click();
        webDriver.findElement(By.cssSelector("body > div.content > form > table > tbody > tr:nth-child(1) > td.field_need.field_name > input")).sendKeys("NewName");
        webDriver.findElement(By.cssSelector("body > div.content > form > table > tbody > tr:nth-child(2) > td.field_need.field_email > input")).sendKeys("NewEmail@test.te");
        webDriver.findElement(By.cssSelector("body > div.content > form > table > tbody > tr:nth-child(3) > td.field_need.field_password > input")).sendKeys("newpassword");
        webDriver.findElement(By.cssSelector("body > div.content > form > table > tbody > tr:nth-child(5) > td.field_need.field_birthday > input")).sendKeys("31.12.2012");
        webDriver.findElement(By.cssSelector("body > div.content > form > table > tbody > tr:nth-child(6) > td.field_need.field_gender > select")).click();
        webDriver.findElement(By.cssSelector("body > div.content > form > table > tbody > tr:nth-child(6) > td.field_need.field_gender > select > option:nth-child(3)")).click();
        webDriver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[21]/td[2]/input"));

    }

    /**
     * Метод checkNewUser должен отвечать за проверку
     * появления нового пользователя в таблице пользователей, но
     * он там не появляется:(
     *
     */
    private void checkNewUser(WebDriver webDriver){
        webDriver.findElement(By.cssSelector("#main-menu > ul > li:nth-child(1) > a > span")).click();  //открыть страницу пользователи
        webDriver.findElement(By.cssSelector("body > div.content > form > table > tbody > tr:nth-child(4) > td > input")).sendKeys("NewEmail@test.te");
        webDriver.findElement(By.cssSelector("body > div.content > form > table > tbody > tr:nth-child(5) > td:nth-child(1) > button")).click();

    }
}
