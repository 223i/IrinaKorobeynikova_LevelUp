/*
 * Ирина Коробейникова
 *
 *Copyright (c) 2019 LevelUP, Inc. All Rights Reserved
 *
 */

package ru.levelup.Irina.Korobeynikova.qa.homework_1.task_1;

/**
 * Класс Subtraction содержит реализацию операции вычитания.
 *
 * @version 1.0 17.11.2019
 * @author Ирина Коробейникова
 */
public class Subtraction {

    /**
     * Метод doSubtraction принимает на вход два числа
     * типа double, приводит их к типу int и осуществляет
     * операцию сложения данных чисел.
     * Результат сложения выводится на экран
     * @param firstNumber первое число, тип double
     * @param secondNumber  второе число, тип double
     */
    protected static void doSubtraction(double firstNumber, double secondNumber){
        System.out.println((int) firstNumber - (int) secondNumber);
    }
}
