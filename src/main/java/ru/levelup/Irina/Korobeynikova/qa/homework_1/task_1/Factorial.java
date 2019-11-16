/*
 * Ирина Коробейникова
 *
 *Copyright (c) 2019 LevelUP, Inc. All Rights Reserved
 *
 */

package ru.levelup.Irina.Korobeynikova.qa.homework_1.task_1;

/**
 * Класс Factorial содержит реализацию операции вычисления факториала.
 *
 * @version 1.0 17.11.2019
 * @author Ирина Коробейникова
 */
public class Factorial {

    /**
     * Метод doAddition принимает на вход одно число
     * типа double, приводит его к типу int и вычисляет
     * факториал данного числа.
     * Результат вычисления выводится на экран
     * @param firstNumber первое число, тип double
     */
    protected static void doFactorial(double firstNumber){

        int firstN = (int)firstNumber;
        double resultOfFactorial = 1;

        for (int i = 1; i <= firstN; i++){
            resultOfFactorial = resultOfFactorial*i;
        }
        System.out.println(resultOfFactorial);
    }
}
