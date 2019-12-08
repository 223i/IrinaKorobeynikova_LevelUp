/*
 * Ирина Коробейникова
 *
 *Copyright (c) 2019 LevelUP, Inc. All Rights Reserved
 *
 */

package ru.levelup.Irina.Korobeynikova.qa.homework_1.task_1;

/**
 * Класс Addition содержит реализацию операции сложения.
 *
 * @version 1.0 17.11.2019
 * @author Ирина Коробейникова
 */
public class Addition {

    /**
     * Метод doAddition принимает на вход два числа
     * типа double и осуществляет операцию сложения данных чисел.
     * Результат сложения выводится на экран
     * @param firstNumber первое число, тип double
     * @param secondNumber  второе число, тип double
     */
    protected void doAddition(Double firstNumber, Double secondNumber){

        System.out.println(firstNumber + secondNumber);
    }
}
