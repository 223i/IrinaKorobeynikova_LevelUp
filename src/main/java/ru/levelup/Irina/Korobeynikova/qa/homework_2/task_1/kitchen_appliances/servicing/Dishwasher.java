/*
 * Ирина Коробейникова
 *
 *Copyright (c) 2019 LevelUP, Inc. All Rights Reserved
 *
 */
package ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.kitchen_appliances.servicing;
import ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.DomesticAppliance;
import ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.PlugIntoOutlet;
import ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.Screenable;
import java.util.Arrays;

/**
 * Класс Dishwasher наследуется от абстрактного класса
 * бытовой техники и содержит поля и методы,
 * которые являются общими для всех посудомоек.
 *
 * @version 1.0 29.11.2019
 * @author Ирина Коробейникова
 */
public class Dishwasher extends DomesticAppliance implements Screenable, PlugIntoOutlet {

    /** volumeOfDishwasher - максимальный допустимый объем
     *  загружаемой посуды*/
    private final double volumeOfDishwasher;
    /** modesOfDishwasher - режимы посудомойки*/
    private final String[] modesOfDishwasher;


    public Dishwasher(String model, String brand, double power,
                      int amountOfButtons, double weight,boolean workingStatus,
                      double volumeOfDishwasher, String[] modesOfDishwasher) {
        super(model, brand, power, amountOfButtons, weight, workingStatus);
        this.volumeOfDishwasher = volumeOfDishwasher;
        this.modesOfDishwasher = modesOfDishwasher;
    }

    public double getVolumeOfDishwasher() {
        return volumeOfDishwasher;
    }

    public String[] getModesOfDishwasher() {
        return modesOfDishwasher;
    }

    /**
     * Метод switchOn позволяет включить посудомойку. Если посудомойка выключена,
     * то она включается.Если посудомойка уже включена, то в консоль
     * выводится сообщение о том, что посудомойка уже работает.
     */
    @Override
    public void switchOn() {
        if(workingStatus = false){
            workingStatus = !workingStatus;
        } else{
            System.out.println("Dishwasher is already switched on");
        }
    }

    /**
     * Метод switchOff позволяет выключить посудомойку. Если посудомойка включена,
     * то она выключается. Если посудомойка уже выключена, то в консоль
     * выводится сообщение о том, что посудомойка не работает.
     */
    @Override
    public void switchOff() {
        if(workingStatus = true){
            workingStatus = !workingStatus;
        } else{
            System.out.println("Dishwasher is already switched off");
        }
    }

    /**
     * Метод hasScreen позволяет определить имеет ли посудомойка экран.
     * Если  объем посудомойки больше 30л,
     * то у нее присутствует экран.В противном случае экран отсутствует.
     */
    @Override
    public boolean hasScreen() {
        if(volumeOfDishwasher > 30){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Метод plugIntoOutlet позволяет включить посудомойку в
     * розетку.
     */
    @Override
    public void plugIntoOutlet() {
        System.out.println("Dishwasher is pluged into outlet");
    }

    @Override
    public String toString() {
        return "Dishwasher{" +
                "volumeOfDishwasher=" + volumeOfDishwasher +
                ", modesOfDishwasher=" + Arrays.toString(modesOfDishwasher) +
                ", workingStatus=" + workingStatus +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", power=" + power +
                ", amountOfButtons=" + amountOfButtons +
                ", weight=" + weight +
                '}';
    }
}
