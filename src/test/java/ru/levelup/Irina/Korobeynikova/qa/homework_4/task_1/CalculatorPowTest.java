/*
 * Ирина Коробейникова
 *
 *Copyright (c) 2019 LevelUP, Inc. All Rights Reserved
 *
 */
package ru.levelup.Irina.Korobeynikova.qa.homework_4.task_1;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

/**
 * Класс CalculatorPowTest содержит
 * юниттесты для проверки операции возведения в степень.
 *
 * @version 1.0 08.12.2019
 * @author Ирина Коробейникова
 */
public class CalculatorPowTest extends AbstractBaseTest {

    @DataProvider(name = "Positive Pow Test Data")
    public Object[][] powPositiveTestDataProvider() {
        return new Object[][]{
                {2, 2, 4.0},
                {3, 1, 3.0},
                {4, 2, 16.0}
        };
    }

    @DataProvider(name = "Negative Pow Test Data")
    public Object[][] powNegativeTestDataProvider() {
        return new Object[][]{
                {2, 2, 5.0},
                {4, 5, 10.0},
                {5, 0, 2.0}
        };
    }

    @Test(dataProvider = "Positive Pow Test Data")
    public void positivePowDoubleTest(double a, double b, double expected){
        double actualResult = calculator.pow(a, b);
        assertEquals(actualResult, expected);
    }

    @Test(dataProvider = "Negative Pow Test Data")
    public void negativePowDoubleTest(double a, double b, double expected){
        double actualResult = calculator.pow(a, b);
        assertNotEquals(actualResult, expected);
    }
}
