/*
 * Ирина Коробейникова
 *
 *Copyright (c) 2019 LevelUP, Inc. All Rights Reserved
 *
 */
package ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.living_room_appliances;
import ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.DomesticAppliance;
import ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.Screenable;

/**
 * Класс AlarmClock позволяет создавать экземпляры будильников с различными
 * конфигурациями, а также предоставляет методы для включения/выключения
 * электронных будильников, получения информации о конкретных характеристиках
 * данных будильников.
 *
 * @version 1.0 29.11.2019
 * @author Ирина Коробейникова
 */
public class AlarmClock extends DomesticAppliance implements Screenable {

    /** typeOfAlarmClock - тип будильника(electronic or mechanical)*/
    private final String typeOfAlarmClock;
    /** connectionWithSmartphone - может ли будильник
     *  соединяться со смартфоном*/
    private final boolean connectionWithSmartphone;

    public AlarmClock(String model, String brand, double power,
                      int amountOfButtons, double weight,
                      boolean workingStatus, String typeOfAlarmClock,
                      boolean connectionWithSmartphone) {
        super(model, brand, power, amountOfButtons, weight, workingStatus) ;
        this.typeOfAlarmClock = typeOfAlarmClock;
        this.connectionWithSmartphone = connectionWithSmartphone;
    }

    public String getTypeOfAlarmClock() {
        return typeOfAlarmClock;
    }

    public boolean isConnectionWithSmartphone() {
        return connectionWithSmartphone;
    }

    /**
     * Метод switchOn позволяет включить электрический будильник.
     * Если электрический будильник выключен,
     * то он включается.Если электрический будильник уже включена,
     * то в консоль выводится сообщение о том, что будильник
     * уже работает.
     */
    @Override
    public void switchOn() {
        if (typeOfAlarmClock.equals("electronic")) {
            if (workingStatus = false ){
                workingStatus = !workingStatus;
            }
        } else{
            System.out.println("Alarm Clock is switched on");
        }
    }

    /**
     * Метод switchOff позволяет выключить электрический будильник.
     * Если электрический будильник включен,
     * то он выключается. Если электрический будильник уже выключен,
     * то в консоль выводится сообщение о том, что будильник
     * не работает.
     */
    @Override
    public void switchOff() {
        if (typeOfAlarmClock.equals("electronic")) {
            if (workingStatus = true){
                workingStatus = !workingStatus;
            }
        } else{
            System.out.println("Alarm Clock is switched off");
        }
    }

    /**
     * Метод hasScreen позволяет определить имеет ли будильник экран.
     * Если будильник электрический, то у него присутствует экран.
     * В противном случае экран отсутствует.
     */
    @Override
    public boolean hasScreen() {
        if(typeOfAlarmClock.equals("electronic")) {
            return true;
        } else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "AlarmClock{" +
                "typeOfAlarmClock='" + typeOfAlarmClock + '\'' +
                ", connectionWithSmartphone=" + connectionWithSmartphone +
                ", workingStatus=" + workingStatus +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", power=" + power +
                ", amountOfButtons=" + amountOfButtons +
                ", weight=" + weight +
                '}';
    }
}
