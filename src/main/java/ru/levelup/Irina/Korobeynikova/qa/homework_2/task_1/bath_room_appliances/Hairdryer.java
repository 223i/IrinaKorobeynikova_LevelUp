/*
 * Ирина Коробейникова
 *
 *Copyright (c) 2019 LevelUP, Inc. All Rights Reserved
 *
 */
package ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.bath_room_appliances;
import ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.DomesticAppliance;
import ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.PlugIntoOutlet;
import ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.Screenable;
import java.util.Arrays;

/**
 * Класс Hairdryer наследуется от абстрактного класса
 * бытовой техники и содержит поля и методы,
 * которые являются общими для всех фенов.
 *
 * @version 1.0 29.11.2019
 * @author Ирина Коробейникова
 */
public class Hairdryer extends DomesticAppliance implements Screenable, PlugIntoOutlet {

    /** airModes - режимы воздуха(cold/warm/hot)*/
    private final String[] airModes;

    public Hairdryer(String model, String brand, double power,
                     int amountOfButtons, double weight,boolean workingStatus,
                     String[] airModes) {
        super(model, brand, power, amountOfButtons, weight, workingStatus);
        this.airModes = airModes;
    }

    public String[] getAirModes() {
        return airModes;
    }

    /**
     * Метод switchOn позволяет включить фен. Если фен выключен,
     * то он включается.Если фен уже включен, то в консоль
     * выводится сообщение о том, что фен уже работает.
     */
    @Override
    public void switchOn() {
        if(!workingStatus){
            workingStatus = !workingStatus;
        } else{
            System.out.println("Hairdryer is already switched on");
        }
    }

    /**
     * Метод switchOff позволяет выключить фен. Если фен включен,
     * то он выключается. Если фен уже выключен, то в консоль
     * выводится сообщение о том, что фен не работает.
     */
    @Override
    public void switchOff() {
        if(workingStatus){
            workingStatus = !workingStatus;
        } else{
            System.out.println("Hairdryer is already switched off");
        }
    }

    /**
     * Метод hasScreen позволяет определить имеет ли фен экран.
     * По умолчанию у фена экран отсутствует.
     */
    @Override
    public boolean hasScreen() {
        return false;
    }

    /**
     * Метод plugIntoOutlet позволяет включить фен в
     * розетку.
     */
    @Override
    public void plugIntoOutlet() {
        System.out.println("Hairdryer is pluged into outlet");
    }

    @Override
    public String toString() {
        return "Hairdryer{" +
                "airModes=" + Arrays.toString(airModes) +
                ", workingStatus=" + workingStatus +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", power=" + power +
                ", amountOfButtons=" + amountOfButtons +
                ", weight=" + weight +
                '}';
    }
}
