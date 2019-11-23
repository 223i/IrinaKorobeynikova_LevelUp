/*
 * Ирина Коробейникова
 *
 *Copyright (c) 2019 LevelUP, Inc. All Rights Reserved
 *
 */
package ru.levelup.Irina.Korobeynikova.qa.homework_1.task_1;

/**
 * Класс interfaceOfApplication позволяет быстро сопоставлять
 * запрошенную пользователем операцию с ее реализацией и вызывать
 * исполнение соответствующей реализации.
 *
 * @version 1.0 17.11.2019
 * @author Ирина Коробейникова
 */
public class interfaceOfApplication {
    private static final String addition = "+";
    private static final String subtraction = "-";
    private static final String multiplication = "*";
    private static final String power = "^";
    private static final String fibonacci = "fib";
    private static final String factorial = "!";

    /**
     * Метод startMethod отвечает за вызов реализации запрошеной операции
     *
     */
    public static void startMethod(String methodName, double[] numbers) {

        switch (methodName) {
        case addition:
            Addition addition = new Addition();
            addition.doAddition(numbers[0], numbers[1]);
            break;
        case subtraction:
            Subtraction subtraction = new Subtraction();
            subtraction.doSubtraction(numbers[0], numbers[1]);
            break;
        case multiplication:
            Multiplication multiplication = new Multiplication();
            multiplication.doMultiplication(numbers[0], numbers[1]);
            break;
        case power:
            Power power = new Power();
            power.doPower(numbers[0], numbers[1]);
            break;
        case fibonacci:
            Fibonacci fibonacci = new Fibonacci();
            fibonacci.doFibonacci(numbers[0]);
            break;
        case factorial:
            Factorial factorial = new Factorial();
            factorial.doFactorial(numbers[0]);
            break;
        }
    }
}
