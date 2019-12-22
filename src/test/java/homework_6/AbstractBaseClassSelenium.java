/*
 * Ирина Коробейникова
 *
 *Copyright (c) 2019 LevelUP, Inc. All Rights Reserved
 *
 */
package homework_6;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

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
    public static final String WEBSITE_URL = "http://users.bugred.ru/";
    public static final String USER_NAME = "martin";
    public static final String USER_MAIL = "Martin@test.te";
    public static final String USER_PASSWORD = "password";

    public static final String NEW_USER_NAME = "Dwait";
    public static final String NEW_USER_MAIL = "Schrute@test.te";
    public static final String NEW_USER_PASSWORD = "password";
    public static final String NEW_USER_BIRTHDAY = "21.12.2020";
    public static final String NEW_USER_GENDER = "m";

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
}
