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

/**
 * Класс WashingMachine наследуется от абстрактного класса
 * бытовой техники и содержит поля и методы,
 * которые являются общими для всех стиральных машин.
 *
 * @version 1.0 29.11.2019
 * @author Ирина Коробейникова
 */
public class WashingMachine extends DomesticAppliance implements Screenable, PlugIntoOutlet {

    /** modesOfDishwasher - максимальная вместимость в барабан*/
    private final double maximalVolume;
    /** type - тип загрузки в машину(вертикальная
     * или горизонтальная)*/
    private final String type;
    /** conditionOfWashingMashine - состояние машины
     * (used - б/у, new)*/
    private final String conditionOfWashingMashine;

    public WashingMachine(String model, String brand, double power,
                          int amountOfButtons, double weight,boolean workingStatus,
                          double maximalVolume, String type,
                          String conditionOfWashingMashine) {
        super(model, brand, power, amountOfButtons, weight, workingStatus);
        this.maximalVolume = maximalVolume;
        this.type = type;
        this.conditionOfWashingMashine = conditionOfWashingMashine;

    }

    public String getConditionOfWashingMashine() {
        return conditionOfWashingMashine;
    }

    public String getType() {
        return type;
    }

    public double getMaximalVolume() {
        return maximalVolume;
    }

    /**
     * Метод switchOn позволяет включить стиральную машину.
     * Если стиральная машина выключена, то она включается.
     * Если стиральная машина уже включена, то в консоль
     * выводится сообщение о том, что стиральная машина уже работает.
     */
    @Override
    public void switchOn() {
        if(workingStatus = false){
            workingStatus = !workingStatus;
        } else{
            System.out.println("Washing machine is already switched on");
        }
    }

    /**
     * Метод switchOff позволяет выключить стиральную машину.
     * Если стиральная машина включена, то она выключается.
     * Если стиральная машина уже выключена, то в консоль
     * выводится сообщение о том, что стиральная машина не работает.
     */
    @Override
    public void switchOff() {
        if(workingStatus = true){
            workingStatus = !workingStatus;
        } else{
            System.out.println("Washing machine is already switched off");
        }
    }

    /**
     * Метод hasScreen позволяет определить имеет ли стиральная
     * машина экран.По умолчанию экран всегда отсутствует.
     */
    @Override
    public boolean hasScreen() {
        return false;
    }

    /**
     * Метод plugIntoOutlet позволяет включить стиральную
     * машину в розетку.
     */
    @Override
    public void plugIntoOutlet() {
        System.out.println("Washing machine is pluged into outlet");
    }

    @Override
    public String toString() {
        return "WashingMachine{" +
                "maximalVolume=" + maximalVolume +
                ", type='" + type + '\'' +
                ", conditionOfWashingMashine='" + conditionOfWashingMashine + '\'' +
                ", workingStatus=" + workingStatus +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", power=" + power +
                ", amountOfButtons=" + amountOfButtons +
                ", weight=" + weight +
                '}';
    }
}
