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
import static org.testng.Assert.*;

/**
 * Rласс CalculatorDivTest содержит
 * юниттесты для проверки операции деления.
 *
 * @version 1.0 08.12.2019
 * @author Ирина Коробейникова
 */
public class CalculatorDivTest extends AbstractBaseTest {

    @DataProvider(name = "Positive Division Test Data")
    public Object[][] divPositiveTestDataProvider() {
        return new Object[][]{
                {4.0, 2.0, 2.0},
                {20.0, 5.0, 4.0},
                {-25.0, 5.0, -5.0}
        };
    }

    @DataProvider(name = "Negative Division Test Data")
    public Object[][] divNegativeTestDataProvider() {
        return new Object[][]{
                {2, 2, 5.0},
                {4, 5, 10.0},
                {5, 0, 2.0}
        };
    }

    @DataProvider(name = "Positive Division Test Data with Long types")
    public Object[][] divPositiveTestDataProviderL() {
        return new Object[][]{
                {4L, 2L, 2L},
                {20L, 5L, 4L},
                {-25L, 5L, -5L}
        };
    }

    @DataProvider(name = "Negative Division Test Data with Long types")
    public Object[][] divNegativeTestDataProviderL() {
        return new Object[][]{
                {2L, 2L, 5L},
                {4L, 5L, 10L},
                {5L, 0, 2L}
        };
    }

    @Test(dataProvider = "Positive Division Test Data")
    public void positiveDivDoubleTest(double a, double b, double expected){
        double actualResult = calculator.div(a, b);
        assertEquals(actualResult, expected);
    }

    @Test(dataProvider = "Negative Division Test Data")
    public void negativeDivDoubleTest(double a, double b, double expected){
        double actualResult = calculator.div(a,b);
        assertNotEquals(actualResult, expected);
    }

    @Test(dataProvider = "Positive Division Test Data with Long types")
    public void positiveDivLongTest(long a, long b, long expected){
        long actualResult = calculator.div(a, b);
        assertEquals(actualResult, expected);
    }

    @Test(dataProvider = "Negative Division Test Data with Long types")
    public void negativeDivLongTest(long a, long b, long expected){
        long actualResult = calculator.div(a,b);
        assertNotEquals(actualResult, expected);
    }

    @Test(expectedExceptions = {NumberFormatException.class, ArithmeticException.class})
    public void zeroDivTest(){
        long i = calculator.div(2L,0L);
    }
}
