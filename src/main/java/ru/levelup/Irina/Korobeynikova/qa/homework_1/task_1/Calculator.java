/*
* Ирина Коробейникова
*
*Copyright (c) 2019 LevelUP, Inc. All Rights Reserved
*
 */
package ru.levelup.Irina.Korobeynikova.qa.homework_1.task_1;

import java.util.Scanner;

/**
 * Класс Calculator позволяет вызывать консольное приложение
 * и проводить минимальный набор вычислений.
 *
 * @version 1.0 17.11.2019
 * @author Ирина Коробейникова
 */
public class Calculator {
    /**
     * Метод main отвечает за создание экземпляра класса Calculator
     * и запуск консольного приложения
     */
    public static void main(String[] args) {

        Calculator myCalculator = new Calculator();
        myCalculator.runCalculatorApp();
    }

    /**
     * Метод runCalculatorApp симулирует общение с пользователем,
     * позволяя считывать с консоли операции и входные данные,
     * передаваемые пользователем. После считывания данных,
     * метод runCalculatorApp обращается к классу
     * interfaceOfApplication, передавая ему тип запрашиваемых
     * операций и числовые данные.
     *
     */
    public void runCalculatorApp() {

        Scanner reader = new Scanner(System.in);

        System.out.println("========Калькулятор поддерживает следующие"
                            + " операции: =========="
                            + "\r\n Cложение: + " + "\r\n Вычитание: -"
                            + "\r\n Умножение: *" + "\r\n Возведение в степень: ^"
                            + "\r\n Вычисление факториала"+ " числа: !"
                            + "\r\n Вычисление значения заданного числа"
                            + " Фиабонначи: fib");
        System.out.println("Для вызова операции необходимо ввести код операции."
                            + "\r\nНапример,чтобы выполнить сложение введите +");
        System.out.println("============Выберите и введите символьный код"
                            + " операции=========");

        String operation = reader.next();

        if (!(operation.equals("!")||operation.equals("fib"))){
            System.out.println("====Поочередно введите 2 числа (Поддерживаемый"
                                + " тип чисел - double, разделитель - запятая)===="
                                + "\r\n Введите первое число:");

            double[] numbers = new double[2];
            numbers[0] = reader.nextDouble();

            System.out.println("\r\n Введите второе число:");

            numbers[1] = reader.nextDouble();
            interfaceOfApplication.startMethod(operation,numbers);

        } else {
            System.out.println("Введите число (Поддерживаемый тип - double,"
                                + " разделитель - запятая)");

            double[] numbers = new double[1];
            numbers[0] = reader.nextDouble();
            interfaceOfApplication.startMethod(operation,numbers);

        }

        System.out.println("Калькулятор закончил вычисления. Хотите продолжить?"
                           + "\r\n да/нет");

        if (reader.next().equals("да")){
            runCalculatorApp();
        }
    }
}
