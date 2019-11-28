/*
 * Ирина Коробейникова
 *
 *Copyright (c) 2019 LevelUP, Inc. All Rights Reserved
 *
 */
package ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.kitchen_appliances.drinks_preparation;
import ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.DomesticAppliance;
import ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.PlugIntoOutlet;
import ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.Screenable;
import ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.WiFiable;

/**
 * Класс CoffeMaker наследуется от абстрактного класса
 * бытовой техники и содержит поля и методы,
 * которые являются общими для всех кофеварок.
 *
 * @version 1.0 29.11.2019
 * @author Ирина Коробейникова
 */
public class CoffeMaker extends DomesticAppliance implements Screenable, WiFiable, PlugIntoOutlet {

    /** needCapsules - капсульная кофеварка или нет*/
    private final boolean needCapsules;
    /** amountOfRegimes - количество режимов приготовления кофе*/
    private final int amountOfRegimes;

    public CoffeMaker(String model, String brand, double power, int amountOfButtons,
                      double weight, boolean workingStatus, boolean needCapsules,
                      int amountOfRegimes) {
        super(model, brand, power, amountOfButtons, weight, workingStatus);
        this.needCapsules = needCapsules;
        this.amountOfRegimes = amountOfRegimes;
    }

    public boolean isNeedCapsules() {
        return needCapsules;
    }

    public int getAmountOfRegimes() {
        return amountOfRegimes;
    }

    /**
     * Метод switchOn позволяет включить кофеварку. Если кофеварка выключена,
     * то она включается.Если кофеварка уже включена, то в консоль
     * выводится сообщение о том, что кофеварка уже работает.
     */
    @Override
    public void switchOn() {
        if(workingStatus = false){
            workingStatus = !workingStatus;
        } else{
            System.out.println("CoffeMaker is already switched on");
        }
    }

    /**
     * Метод switchOff позволяет выключить кофеварку. Если кофеварка включена,
     * то она выключается. Если кофеварка уже выключена, то в консоль
     * выводится сообщение о том, что кофеварка не работает.
     */
    @Override
    public void switchOff() {
        if(workingStatus = true){
            workingStatus = !workingStatus;
        } else{
            System.out.println("CoffeMaker is already switched off");
        }
    }

    /**
     * Метод hasScreen позволяет определить
     * имеет ли кофеварка экран. Если в кофеварке больше одного режима,
     * то у нее присутствует экран.В противном случае экран отсутствует.
     */
    @Override
    public boolean hasScreen() {
        if(amountOfRegimes > 1){
            return true;
        } else{
            return false;
        }
    }

    /**
     * Метод plugIntoOutlet позволяет включить кофеварку в
     * розетку.
     */
    @Override
    public void plugIntoOutlet() {
        System.out.println("CoffeMaker is pluged into outlet");
    }

    @Override
    public String toString() {
        return "CoffeMaker{" +
                "needCapsules=" + needCapsules +
                ", amountOfRegimes=" + amountOfRegimes +
                ", workingStatus=" + workingStatus +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", power=" + power +
                ", amountOfButtons=" + amountOfButtons +
                ", weight=" + weight +
                '}';
    }
}
