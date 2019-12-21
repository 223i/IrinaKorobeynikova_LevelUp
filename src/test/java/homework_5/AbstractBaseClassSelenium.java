/*
 * Ирина Коробейникова
 *
 *Copyright (c) 2019 LevelUP, Inc. All Rights Reserved
 *
 */
package homework_5;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

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

    protected WebDriver driver;

    public static final String USER_NAME = "martin";
    public static final String USER_MAIL = "Martin@test.te";
    public static final String USER_PASSWORD = "password";

    @BeforeAll
    public static void setUpSuite(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setUpTest(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
    }

    @AfterEach
    public void tearDownTest(){
        WebDriverManager.chromedriver().clearCache();
        driver.quit();
    }


    /**
     * Метод login отвечает за тестирование
     * функциональности входа на сайт.
     */
    public void login(WebDriver webDriver, String userEmail, String userPassword, String userName){

        webDriver.findElement(By.linkText("Войти")).click();
        webDriver.findElement(By.name("login")).sendKeys(userEmail);
        webDriver.findElement(By.name("password")).sendKeys(userPassword);
        webDriver.findElement(By.xpath("//input[@value='Авторизоваться']")).click();
    }

    /**
     * Метод logout отвечает за тестирование
     * функциональности выхода с сайта.
     */
    public void logout(WebDriver webDriver){
        webDriver.findElement(By.className("dropdown-toggle")).click();
        webDriver.findElement(By.linkText("Выход")).click();
    }
}
