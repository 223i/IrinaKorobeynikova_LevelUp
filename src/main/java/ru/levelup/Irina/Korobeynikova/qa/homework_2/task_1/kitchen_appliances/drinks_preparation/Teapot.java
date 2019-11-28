/*
 * Ирина Коробейникова
 *
 *Copyright (c) 2019 LevelUP, Inc. All Rights Reserved
 *
 */
package ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.kitchen_appliances.drinks_preparation;
import ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.DomesticAppliance;
import ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.WiFiable;

/**
 * Класс Teapot наследуется от абстрактного класса
 * бытовой техники и содержит поля и методы,
 * которые являются общими для всех чайников.
 *
 * @version 1.0 29.11.2019
 * @author Ирина Коробейникова
 */
public class Teapot extends DomesticAppliance implements WiFiable {

    /** timeOfBoiling - время закипания*/
    private final double timeOfBoiling;

    public Teapot(String model, String brand, double power, int amountOfButtons,
                  double weight, boolean workingStatus, double timeOfBoiling) {
        super(model, brand, power, amountOfButtons, weight, workingStatus);
        this.timeOfBoiling = timeOfBoiling;
    }

    public double getTimeOfBoiling() {
        return timeOfBoiling;
    }

    /**
     * Метод switchOn позволяет включить чайник. Если чайник выключен,
     * то он включается.Если чайник уже включен, то в консоль
     * выводится сообщение о том, что чайник уже работает.
     */
    @Override
    public void switchOn() {
        if(workingStatus = false){
            workingStatus = !workingStatus;
        } else{
            System.out.println("Teapot is already switched on");
        }
    }

    /**
     * Метод switchOff позволяет выключить чайник. Если чайник включен,
     * то он выключается. Если чайник уже выключен, то в консоль
     * выводится сообщение о том, что чайник не работает.
     */
    @Override
    public void switchOff() {
        if(workingStatus = true){
            workingStatus = !workingStatus;
        } else{
            System.out.println("Teapot is already switched off");
        }

    }

    @Override
    public String toString() {
        return "Teapot{" +
                "timeOfBoiling=" + timeOfBoiling +
                ", workingStatus=" + workingStatus +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", power=" + power +
                ", amountOfButtons=" + amountOfButtons +
                ", weight=" + weight +
                '}';
    }
}
