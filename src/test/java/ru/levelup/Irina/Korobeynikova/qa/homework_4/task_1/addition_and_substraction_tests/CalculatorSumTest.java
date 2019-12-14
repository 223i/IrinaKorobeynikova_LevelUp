/*
 * Ирина Коробейникова
 *
 *Copyright (c) 2019 LevelUP, Inc. All Rights Reserved
 *
 */
package ru.levelup.Irina.Korobeynikova.qa.homework_4.task_1.addition_and_substraction_tests;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.levelup.Irina.Korobeynikova.qa.homework_4.task_1.AbstractBaseTest;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

/**
 * Rласс CalculatorSumTest содержит
 * юниттесты для проверки операции сложения.
 *
 * @version 1.0 08.12.2019
 * @author Ирина Коробейникова
 */
public class CalculatorSumTest extends AbstractBaseTest {

    @DataProvider(name = "Positive Addition Test Data")
    public Object[][] sumPositiveTestDataProvider() {
        return new Object[][]{
                {4.0, 2.0, 6.0},
                {20.0, 5.0, 25.0},
                {-25.0, 5.0, -20.0}
        };
    }

    @DataProvider(name = "Negative Addition Test Data")
    public Object[][] sumNegativeTestDataProvider() {
        return new Object[][]{
                {2, 2, 5.0},
                {4, 5, 10.0},
                {5, 0, 2.0}
        };
    }

    @DataProvider(name = "Positive Addition Test Data with Long types")
    public Object[][] sumPositiveTestDataProviderL() {
        return new Object[][]{
                {4L, 2L, 6L},
                {20L, 5L, 25L},
                {-25L, 5L, -20L}
        };
    }

    @DataProvider(name = "Negative Addition Test Data with Long types")
    public Object[][] sumNegativeTestDataProviderL() {
        return new Object[][]{
                {2L, 2L, 5L},
                {4L, 5L, 10L},
                {5L, 0, 2L}
        };
    }

    @Test(dataProvider = "Positive Addition Test Data")
    public void positiveSumDoubleTest(double a, double b, double expected){
        double actualResult = calculator.sum(a, b);
        assertEquals(actualResult, expected);
    }

    @Test(dataProvider = "Negative Addition Test Data")
    public void negativeSumDoubleTest(double a, double b, double expected){
        double actualResult = calculator.sum(a, b);
        assertNotEquals(actualResult, expected);
    }

    @Test(dataProvider = "Positive Addition Test Data with Long types")
    public void positiveSumLongTest(long a, long b, long expected){
        double actualResult = calculator.sum(a, b);
        assertEquals(actualResult, expected);
    }

    @Test(dataProvider = "Negative Addition Test Data with Long types")
    public void negativeSumLongTest(long a, long b, long expected){
        double actualResult = calculator.sum(a, b);
        assertNotEquals(actualResult, expected);
    }
}
