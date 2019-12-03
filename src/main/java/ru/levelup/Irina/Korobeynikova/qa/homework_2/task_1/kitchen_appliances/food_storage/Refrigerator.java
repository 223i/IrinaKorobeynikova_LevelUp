/*
 * Ирина Коробейникова
 *
 *Copyright (c) 2019 LevelUP, Inc. All Rights Reserved
 *
 */

package ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.kitchen_appliances.food_storage;
import ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.DomesticAppliance;
import ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.PlugIntoOutlet;
import ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.Screenable;

/**
 * Класс Refrigerator наследуется от абстрактного класса
 * бытовой техники и содержит поля и методы,
 * которые являются общими для всех холодильников.
 *
 * @version 1.0 29.11.2019
 * @author Ирина Коробейникова
 */
public class Refrigerator extends DomesticAppliance implements Screenable, PlugIntoOutlet {

    /** height - высота холодильника*/
    final private double height;
    /** refrigerationLevel - степень охлаждения*/
    private int refrigerationLevel;

    public Refrigerator(String model, String brand, double power,
                        int amountOfButtons, double weight, boolean workingStatus,
                        double height, int refrigerationLevel) {
        super(model, brand, power, amountOfButtons, weight, workingStatus);
        this.height = height;
        this.refrigerationLevel = refrigerationLevel;
    }

    public double getHeight() {
        return height;
    }

    public int getRefrigerationLevel() {
        return refrigerationLevel;
    }

    public void setRefrigerationLevel(int refrigerationLevel) {
        this.refrigerationLevel = refrigerationLevel;
    }

    /**
     * Метод switchOn позволяет включить холодильник. Если холодильник выключен,
     * то он включается.Если холодильник уже включен, то в консоль
     * выводится сообщение о том, что холодильник уже работает.
     */
    @Override
    public void switchOn() {
        if(!workingStatus){
            workingStatus = !workingStatus;
        } else{
            System.out.println("Refrigerator is already switched on");
        }
    }

    /**
     * Метод switchOff позволяет выключить холодильник. Если холодильник включен,
     * то он выключается. Если холодильник уже выключен, то в консоль
     * выводится сообщение о том, что холодильник не работает.
     */
    @Override
    public void switchOff() {
        if(workingStatus){
            workingStatus = !workingStatus;
        } else{
            System.out.println("Refrigerator is already switched off");
        }
    }

    /**
     * Метод hasScreen позволяет определить
     * имеет ли холодильник экран. Во всех холодильниках экран отсутствует.
     */
    @Override
    public boolean hasScreen() {
        return false;
    }

    /**
     * Метод plugIntoOutlet позволяет включить холодильник в
     * розетку.
     */
    @Override
    public void plugIntoOutlet() {
        System.out.println("Refrigerator is pluged into outlet");
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "height=" + height +
                ", refrigerationLevel=" + refrigerationLevel +
                ", workingStatus=" + workingStatus +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", power=" + power +
                ", amountOfButtons=" + amountOfButtons +
                ", weight=" + weight +
                '}';
    }
}
