/*
 * Ирина Коробейникова
 *
 *Copyright (c) 2019 LevelUP, Inc. All Rights Reserved
 *
 */
package ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.living_room_appliances;
import ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.DomesticAppliance;
import ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.PlugIntoOutlet;
import ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.Screenable;
import ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.WiFiable;
import java.util.Arrays;

/**
 * Класс Dishwasher наследуется от абстрактного класса
 * бытовой техники и содержит поля и методы,
 * которые являются общими для всех посудомоек.
 *
 * @version 1.0 29.11.2019
 * @author Ирина Коробейникова
 */
public class PC extends DomesticAppliance implements Screenable, WiFiable, PlugIntoOutlet {

    /** complectation - комплектация компьютера(системный блок,
     *  монитор, клавиатура и т.п.)*/
    private String[] complectation;

    public PC(String model, String brand, double power,
              int amountOfButtons, double weight, boolean workingStatus,
              String[] complectation) {
        super(model, brand, power, amountOfButtons, weight, workingStatus);
        this.complectation = complectation;
    }

    public String[] getComplectation() {
        return complectation;
    }

    public void setComplectation(String[] complectation) {
        this.complectation = complectation;
    }

    /**
     * Метод switchOn позволяет включить ПК. Если ПК выключен,
     * то он включается.Если ПК уже включен, то в консоль
     * выводится сообщение о том, что ПК уже работает.
     */
    @Override
    public void switchOn() {
        if(workingStatus = false){
            workingStatus = !workingStatus;
        } else{
            System.out.println("PC is already switched on");
        }
    }

    /**
     * Метод switchOff позволяет выключить ПК. Если ПК включен,
     * то он выключается. Если ПК уже выключен, то в консоль
     * выводится сообщение о том, что ПК не работает.
     */
    @Override
    public void switchOff() {
        if(workingStatus = true){
            workingStatus = !workingStatus;
        } else{
            System.out.println("PC is already switched off");
        }
    }

    /**
     * Метод hasScreen всегда возвращает true для компьютеров.
     */
    @Override
    public boolean hasScreen() {
        return true;
    }

    /**
     * Метод plugIntoOutlet позволяет включить ПК в
     * розетку.
     */
    @Override
    public void plugIntoOutlet() {
        System.out.println("PC is pluged into outlet");
    }

    @Override
    public String toString() {
        return "PC{" +
                "complectation=" + Arrays.toString(complectation) +
                ", workingStatus=" + workingStatus +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", power=" + power +
                ", amountOfButtons=" + amountOfButtons +
                ", weight=" + weight +
                '}';
    }
}
