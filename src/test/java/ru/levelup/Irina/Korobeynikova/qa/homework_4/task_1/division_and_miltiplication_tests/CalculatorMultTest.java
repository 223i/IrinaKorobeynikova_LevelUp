/*
 * Ирина Коробейникова
 *
 *Copyright (c) 2019 LevelUP, Inc. All Rights Reserved
 *
 */
package ru.levelup.Irina.Korobeynikova.qa.homework_4.task_1.division_and_miltiplication_tests;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.levelup.Irina.Korobeynikova.qa.homework_4.task_1.AbstractBaseTest;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

/**
 * Класс CalculatorMultTest содержит
 * юниттесты для проверки операции умножения.
 *
 * @version 1.0 08.12.2019
 * @author Ирина Коробейникова
 */
public class CalculatorMultTest extends AbstractBaseTest {

    @DataProvider(name = "Positive Multiply Test Data")
    public Object[][] multiplyPositiveTestDataProvider() {
        return new Object[][]{
                {2, 2, 4.0},
                {4, 5, 20.0},
                {5, 0, 0.0}
        };
    }

    @DataProvider(name = "Negative Multiply Test Data")
    public Object[][] multiplyNegativeTestDataProvider() {
        return new Object[][]{
                {2, 2, 5.0},
                {4, 5, 10.0},
                {5, 0, 2.0}
        };
    }

    @DataProvider(name = "Positive Multiply Test Data with Long types")
    public Object[][] multiplyPositiveTestDataProviderL() {
        return new Object[][]{
                {2L, 2L, 4L},
                {4L, 5L, 20L},
                {5L, 0, 0}
        };
    }

    @DataProvider(name = "Negative Multiply Test Data with Long types")
    public Object[][] multiplyNegativeTestDataProviderL() {
        return new Object[][]{
                {2L, 2L, 5L},
                {4L, 5L, 10L},
                {5L, 0, 2L}
        };
    }

    @Test(dataProvider = "Positive Multiply Test Data")
    public void positiveMultDoubleTest(double a, double b, double expected){
        double actualResult = calculator.mult(a, b);
        assertEquals(actualResult, expected);
    }

    @Test(dataProvider = "Negative Multiply Test Data")
    public void negativeMultDoubleTest(double a, double b, double expected){
        double actualResult = calculator.mult(a, b);
        assertNotEquals(actualResult, expected);
    }

    @Test(dataProvider = "Positive Multiply Test Data with Long types")
    public void positiveMultLongTest(long a, long b, long expected){
        long actualResult = calculator.mult(a, b);
        assertEquals(actualResult, expected);
    }

    @Test(dataProvider = "Negative Multiply Test Data with Long types")
    public void negativeMultLongTest(long a, long b, long expected){
        long actualResult = calculator.mult(a, b);
        assertNotEquals(actualResult,expected);
    }
}
