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
 * Класс TV наследуется от абстрактного класса
 * бытовой техники и содержит поля и методы,
 * которые являются общими для всех телевизоров.
 *
 * @version 1.0 29.11.2019
 * @author Ирина Коробейникова
 */
public class TV extends DomesticAppliance implements Screenable, WiFiable, PlugIntoOutlet {

    /** instrumehtsOfRemoteContron - набор девайсов для
     * управления ТВ(mobile phone, clicker)*/
    private final String[] instrumehtsOfRemoteContron;
    /** amountOfChannels - количество каналов*/
    private final int amountOfChannels;

    public TV(String model, String brand, double power, int amountOfButtons,
              double weight, boolean workingStatus,
              String[] instrumehtsOfRemoteContron, int amountOfChannels) {
        super(model, brand, power, amountOfButtons, weight, workingStatus);
        this.instrumehtsOfRemoteContron = instrumehtsOfRemoteContron;
        this.amountOfChannels = amountOfChannels;
    }

    public String[] getInstrumehtsOfRemoteContron() {
        return instrumehtsOfRemoteContron;
    }

    public int getAmountOfChannels() {
        return amountOfChannels;
    }

    /**
     * Метод switchOn позволяет включить телевизор. Если тв выключен,
     * то он включается.Если ТВ уже включен, то в консоль
     * выводится сообщение о том, что ТВ уже работает.
     */
    @Override
    public void switchOn() {
        if(!workingStatus){
            workingStatus = !workingStatus;
        } else{
            System.out.println("TV is already switched on");
        }

    }

    /**
     * Метод switchOff позволяет выключить телевизор. Если ТВ включен,
     * то он выключается. Если телевизор уже выключен, то в консоль
     * выводится сообщение о том, что телевизор не работает.
     */
    @Override
    public void switchOff() {
        if(workingStatus){
            workingStatus = !workingStatus;
        } else{
            System.out.println("TV is already switched off");
        }
    }

    /**
     * Метод hasScreen позволяет определить имеет ли ТВ экран.
     * Логично, что у ТВ всегда присутствует экран.
     */
    @Override
    public boolean hasScreen() {
        return true;
    }

    /**
     * Метод plugIntoOutlet позволяет включить тв в
     * розетку.
     */
    @Override
    public void plugIntoOutlet() {
        System.out.println("TV is pluged into outlet");

    }

    @Override
    public String toString() {
        return "TV{" +
                "instrumehtsOfRemoteContron=" + Arrays.toString(instrumehtsOfRemoteContron) +
                ", amountOfChannels=" + amountOfChannels +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", power=" + power +
                ", amountOfButtons=" + amountOfButtons +
                ", weight=" + weight +
                '}';
    }
}
