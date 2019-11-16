/*
 * Ирина Коробейникова
 *
 *Copyright (c) 2019 LevelUP, Inc. All Rights Reserved
 *
 */

package ru.levelup.Irina.Korobeynikova.qa.homework_1.task_1;

/**
 * Класс Power содержит реализацию возведения числа в степень.
 *
 * @version 1.0 17.11.2019
 * @author Ирина Коробейникова
 */
public class Power {

    /**
     * Метод doPower принимает на вход два числа типа double,
     * приводит первое к типу int и возводит второе число в
     * степень.
     * Результат вычисления выводится на экран
     * @param firstNumber первое число, тип double(степень)
     * @param secondNumber второе число, тип double
     */
    protected static void doPower(double firstNumber, double secondNumber){

        int firstN = (int)firstNumber;
        double resultOfPower = 1;

        for (int i = 1; i <= firstN; i++){
            resultOfPower = secondNumber*resultOfPower;
        }
        System.out.println(resultOfPower);
    }
}
