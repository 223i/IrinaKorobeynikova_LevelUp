/*
 * Ирина Коробейникова
 *
 *Copyright (c) 2019 LevelUP, Inc. All Rights Reserved
 *
 */
package homework_5;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Aбстрактный класс AbstractBaseClassSelenium и содержит
 * константные значения - данные зарегистрированного пользователя,
 * а также общие методы, применяемые во всех тестовых классах.
 *
 * @version 1.0 14.12.2019
 * @author Ирина Коробейникова
 */
public class AbstractBaseClassSelenium {

    public static final String USER_NAME = "martin";
    public static final String USER_MAIL = "Martin@test.te";
    public static final String USER_PASSWORD = "password";

    @BeforeEach
    public void setUpTest(){
        WebDriverManager.chromedriver().setup();
    }

    @AfterEach
    public void tearDownTest(){
        WebDriverManager.chromedriver().clearCache();
    }

    /**
     * Метод login отвечает за тестирование
     * функциональности входа на сайт.
     */
    public void login(WebDriver webDriver, String userEmail, String userPassword, String userName){

        webDriver.findElement(By.linkText("Войти")).click();
        webDriver.findElement(By.name("login")).sendKeys(userEmail);
        webDriver.findElement(By.name("password")).sendKeys(userPassword);
        webDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/form/table/tbody/tr[3]/td[2]/input")).click();
        assertEquals(webDriver.findElement(By.className("dropdown-toggle")).getText(), userName);
    }

    /**
     * Метод logout отвечает за тестирование
     * функциональности выхода с сайта.
     */
    public void logout(WebDriver webDriver){
        webDriver.findElement(By.className("dropdown-toggle")).click();
        webDriver.findElement(By.cssSelector("#fat-menu > ul > li:nth-child(3) > a")).click();
    }
}
