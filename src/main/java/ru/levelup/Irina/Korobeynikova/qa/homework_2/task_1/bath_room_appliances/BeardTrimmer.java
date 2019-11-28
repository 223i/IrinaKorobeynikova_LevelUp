/*
 * Ирина Коробейникова
 *
 *Copyright (c) 2019 LevelUP, Inc. All Rights Reserved
 *
 */
package ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.bath_room_appliances;
import ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.DomesticAppliance;
import ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.Screenable;

/**
 * Класс BeardTrimmer наследуется от абстрактного класса
 * бытовой техники и содержит поля и методы,
 * которые являются общими для всех триммеров.
 *
 * @version 1.0 29.11.2019
 * @author Ирина Коробейникова
 */
public class BeardTrimmer extends DomesticAppliance implements Screenable {

    /** amountOfNozzles - количество насадок для тримеров*/
    private final int amountOfNozzles;

    public BeardTrimmer(String model, String brand, double power,
                        int amountOfButtons, double weight,boolean workingStatus,
                        int amountOfNozzles) {
        super(model, brand, power, amountOfButtons, weight, workingStatus);
        this.amountOfNozzles = amountOfNozzles;
    }

    public int getAmountOfNozzles() {
        return amountOfNozzles;
    }

    /**
     * Метод switchOn позволяет включить триммер. Если триммер выключен,
     * то он включается.Если триммер уже включен, то в консоль
     * выводится сообщение о том, что триммер уже работает.
     */
    @Override
    public void switchOn() {
        if(workingStatus = false){
            workingStatus = !workingStatus;
        } else{
            System.out.println("BeardTrimmer is already switched on");
        }
    }

    /**
     * Метод switchOff позволяет выключить триммер. Если триммер включен,
     * то он выключается. Если триммер уже выключен, то в консоль
     * выводится сообщение о том, что триммер не работает.
     */
    @Override
    public void switchOff() {
        if(workingStatus = true){
            workingStatus = !workingStatus;
        } else{
            System.out.println("BeardTrimmer is already switched off");
        }
    }

    /**
     * Метод hasScreen позволяет определить имеет ли триммер экран.
     * У триммера экран всегда отсутствует.
     */
    @Override
    public boolean hasScreen() {
        return false;
    }

    @Override
    public String toString() {
        return "BeardTrimmer{" +
                "amountOfNozzles=" + amountOfNozzles +
                ", workingStatus=" + workingStatus +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", power=" + power +
                ", amountOfButtons=" + amountOfButtons +
                ", weight=" + weight +
                '}';
    }
}
