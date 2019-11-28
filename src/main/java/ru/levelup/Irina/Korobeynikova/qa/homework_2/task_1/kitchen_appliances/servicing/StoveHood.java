/*
 * Ирина Коробейникова
 *
 *Copyright (c) 2019 LevelUP, Inc. All Rights Reserved
 *
 */
package ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.kitchen_appliances.servicing;
import ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.DomesticAppliance;
import ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.Screenable;

/**
 * Класс StoveHood наследуется от абстрактного класса
 * бытовой техники и содержит поля и методы,
 * которые являются общими для всех вытяжек.
 *
 * @version 1.0 29.11.2019
 * @author Ирина Коробейникова
 */
public class StoveHood extends DomesticAppliance implements Screenable {

    /** lighting - подсветка в вытяжке*/
    private boolean lighting;

    public StoveHood(String model, String brand, double power, int amountOfButtons,
                     double weight,boolean workingStatus, boolean lighting) {
        super(model, brand, power, amountOfButtons, weight, workingStatus);
        this.lighting = lighting;
    }

    /**
     * Метод switchOn позволяет включить вытяжку. Если вытяжка выключена,
     * то она включается.Если вытяжка уже включена, то в консоль
     * выводится сообщение о том, что вытяжка уже работает.
     */
    @Override
    public void switchOn() {
        if(workingStatus = false){
            workingStatus = !workingStatus;
        } else{
            System.out.println("StoveHood is already switched on");
        }
    }

    /**
     * Метод switchOff позволяет выключить вытяжку. Если вытяжка включена,
     * то она выключается. Если вытяжка уже выключена, то в консоль
     * выводится сообщение о том, что вытяжка не работает.
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
     * Метод lightOn позволяет включить подсветку у вытяжки.
     * Если подсветка выключена, то она включается.Если подсветка
     * уже включена, то в консоль выводится сообщение о том,
     * что подсветка уже работает.
     */
    public void  lightOn(){
        if (lighting == false){
            System.out.println("Lighting is switched on");
            lighting = !lighting;
        }else{
            System.out.println("Lighting is already activated");
        }
    }

    /**
     * Метод lightOff позволяет выключить подсветку у вытяжки. Если
     * подсветка включена, то она выключается. Если подсветка уже выключена,
     * то в консоль выводится сообщение о том, что подсветка не работает.
     */
    public void  lightOff(){
        if (lighting == true){
            System.out.println("Lighting is switched off");
            lighting = !lighting;
        }else{
            System.out.println("Lighting is already deactivated");
        }
    }

    /**
     * Метод hasScreen позволяет определить
     * имеет ли вытяжка экран. Во всех вытяжках экран отсутствует.
     */
    @Override
    public boolean hasScreen() {
        return false;
    }

    @Override
    public String toString() {
        return "StoveHood{" +
                "lighting=" + lighting +
                ", workingStatus=" + workingStatus +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", power=" + power +
                ", amountOfButtons=" + amountOfButtons +
                ", weight=" + weight +
                '}';
    }
}
