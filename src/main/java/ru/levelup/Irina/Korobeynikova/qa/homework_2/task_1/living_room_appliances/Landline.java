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

/**
 * Класс Landline наследуется от абстрактного класса
 * бытовой техники и содержит поля и методы,
 * которые являются общими для всех стационарных телефонов.
 *
 * @version 1.0 29.11.2019
 * @author Ирина Коробейникова
 */
public class Landline extends DomesticAppliance implements Screenable, PlugIntoOutlet {

    /** landlineTelephoneNumber - номер телефона*/
    private final String landlineTelephoneNumber;

    public Landline(String model, String brand, double power,
                    int amountOfButtons, double weight, boolean workingStatus,
                    String landlineTelephoneNumber) {
        super(model, brand, power, amountOfButtons, weight, workingStatus);
        this.landlineTelephoneNumber = landlineTelephoneNumber;
    }

    public String getLandlineTelephoneNumber() {
        return landlineTelephoneNumber;
    }

    /**
     * Метод switchOn позволяет включить телефон. Если телефон выключен,
     * то он включается. Если телефон уже включен, то в консоль
     * выводится сообщение о том, что телефон уже работает.
     */
    @Override
    public void switchOn() {
        if(workingStatus = false){
            workingStatus = !workingStatus;
        } else{
            System.out.println("Landline is already switched on");
        }
    }

    /**
     * Метод switchOff позволяет выключить телефон. Если телефон включен,
     * то он выключается. Если телефон уже выключен, то в консоль
     * выводится сообщение о том, что телефон не работает.
     */
    @Override
    public void switchOff() {
        if(workingStatus = true){
            workingStatus = !workingStatus;
        } else{
            System.out.println("Landline is already switched off");
        }
    }

    /**
     * Метод hasScreen позволяет определить имеет ли телефон экран.
     * Если  у телефона нет кнопок, то у него есть экран(сенсорный).
     * В противном случае экран отсутствует.
     */
    @Override
    public boolean hasScreen() {
        if(amountOfButtons == 0) {
            return true;
        } else{
            return false;
        }
    }

    /**
     * Метод plugIntoOutlet позволяет включить стационарный телефон в
     * розетку.
     */
    @Override
    public void plugIntoOutlet() {
        System.out.println("Landline is pluged into outlet");
    }

    @Override
    public String toString() {
        return "Landline{" +
                "landlineTelephoneNumber='" + landlineTelephoneNumber + '\'' +
                ", workingStatus=" + workingStatus +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", power=" + power +
                ", amountOfButtons=" + amountOfButtons +
                ", weight=" + weight +
                '}';
    }
}
