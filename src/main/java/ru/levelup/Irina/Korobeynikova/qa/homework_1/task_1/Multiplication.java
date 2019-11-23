/*
 * Ирина Коробейникова
 *
 *Copyright (c) 2019 LevelUP, Inc. All Rights Reserved
 *
 */

package ru.levelup.Irina.Korobeynikova.qa.homework_1.task_1;

/**
 * Класс Multiplication содержит реализацию операции умножения.
 *
 * @version 1.0 17.11.2019
 * @author Ирина Коробейникова
 */
public class Multiplication {

    /**
     * Метод doMultiplication принимает на вход два числа
     * типа double и осуществляет
     * операцию умножения для данных чисел.
     * Результат умножения выводится на экран
     * @param firstNumber первое число, тип double
     * @param secondNumber  второе число, тип double
     */
    protected void doMultiplication(double firstNumber,
                                           double secondNumber){
        System.out.println(secondNumber * firstNumber);
    }
}
