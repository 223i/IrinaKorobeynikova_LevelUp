/*
 * Ирина Коробейникова
 *
 *Copyright (c) 2019 LevelUP, Inc. All Rights Reserved
 *
 */

package ru.levelup.Irina.Korobeynikova.qa.homework_1.task_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Класс Fibonacci содержит реализацию вычисления числа Фибоначчи.
 *
 * @version 1.0 17.11.2019
 * @author Ирина Коробейникова
 */
public class Fibonacci {

    private static List<Integer> results = new ArrayList<>(Arrays.asList(0, 1));

    /**
     * Метод doFibonacci принимает на вход число типа double,
     * приводит его к типу int и вызывает метод countFibonacci, который
     * работает рекурсивно. Результат отработки метода countFibonacci
     *  выводится на экран
     * @param firstNumber число, тип double
     */
    protected static void doFibonacci(double firstNumber){

        int firstNumberCasted = (int)firstNumber;
        System.out.println((double)countFibonacci(firstNumberCasted));

    }

    /**
     * Метод countFibonacci принимает на вход число типа int
     * вычисляет для него число Фибоначчи.
     * Результат вычисления выводится возвращается пользователю.
     * @param firstN первое число, тип int
     */
    private static double countFibonacci(int firstN){
        if (firstN == 0) {
            return firstN;
        }
        if (firstN == 1) {
            return firstN;

        } else {
            results.add((int) (countFibonacci(firstN - 2) +
                    countFibonacci(firstN - 1)));
        }
            return results.get(results.size() - 1);
    }
}
