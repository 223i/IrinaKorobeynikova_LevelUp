/*
 * Ирина Коробейникова
 *
 *Copyright (c) 2019 LevelUP, Inc. All Rights Reserved
 *
 */
package ru.levelup.Irina.Korobeynikova.qa.homework_4.task_1;
import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Класс AbstractBaseTest содержит
 * общие методы, вызываемые при запуске юниттестов.
 *
 * @version 1.0 08.12.2019
 * @author Ирина Коробейникова
 */
public class AbstractBaseTest {

    /** calculator - экземпляр приложения калькулятор*/
    protected Calculator calculator;

    @BeforeMethod
    public void setUpTest(){
        System.out.println("---Start new test---");
        calculator = new Calculator();
        System.out.println(this.getClass().getName());
    }

    @AfterMethod
    public void tearDownTest(){
        System.out.println("---End test---");
    }
}
