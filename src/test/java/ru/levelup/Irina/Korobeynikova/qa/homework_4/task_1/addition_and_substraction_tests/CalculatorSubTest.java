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
 * Класс CalculatorSubTest содержит
 * юниттесты для проверки операции вычитания.
 *
 * @version 1.0 08.12.2019
 * @author Ирина Коробейникова
 */
public class CalculatorSubTest extends AbstractBaseTest {

    @DataProvider(name = "Positive Subtraction Test Data")
    public Object[][] subPositiveTestDataProvider() {
        return new Object[][]{
                {4.0, 2.0, 2.0},
                {20.0, 5.0, 15.0},
                {-25.0, 5.0, -30.0}
        };
    }

    @DataProvider(name = "Negative Subtraction Test Data")
    public Object[][] subNegativeTestDataProvider() {
        return new Object[][]{
                {2, 2, 5.0},
                {4, 5, 10.0},
                {5, 0, 2.0}
        };
    }

    @DataProvider(name = "Positive Subtraction Test Data with Long types")
    public Object[][] subPositiveTestDataProviderL() {
        return new Object[][]{
                {4L, 2L, 2L},
                {20L, 5L, 15L},
                {-25L, 5L, -30L}
        };
    }

    @DataProvider(name = "Negative Subtraction Test Data with Long types")
    public Object[][] subNegativeTestDataProviderL() {
        return new Object[][]{
                {2L, 2L, 5L},
                {4L, 5L, 10L},
                {5L, 0, 2L}
        };
    }

    @Test(dataProvider = "Positive Subtraction Test Data")
    public void positiveSubDoubleTest(double a, double b, double expected){
        double actualResult = calculator.sub(a, b);
        assertEquals(actualResult, expected);
    }

    @Test(dataProvider = "Negative Subtraction Test Data")
    public void negativeSubDoubleTest(double a, double b, double expected){
        double actualResult = calculator.sum(a,b);
        assertNotEquals(actualResult, expected);
    }

    @Test(dataProvider = "Positive Subtraction Test Data with Long types")
    public void positiveSubLongTest(long a, long b, long expected){
        long actualResult = calculator.sub(a, b);
        assertEquals(actualResult, expected);
    }

    @Test(dataProvider = "Negative Subtraction Test Data with Long types")
    public void negativeSumLongTest(long a, long b, long expected){
        long actualResult = calculator.sub(a, b);
        assertNotEquals(actualResult, expected);
    }
}
