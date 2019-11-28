/*
 * Ирина Коробейникова
 *
 *Copyright (c) 2019 LevelUP, Inc. All Rights Reserved
 *
 */

package ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.kitchen_appliances.cooking;
import ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.DomesticAppliance;

/**
 * Класс ApplianceForCooking наследуется от абстрактного класса
 * бытовой техники и содержит поля и методы,
 * которые являются общими для всех приборов, связанных с готовкой еды.
 *
 * @version 1.0 29.11.2019
 * @author Ирина Коробейникова
 */
public class ApplianceForCooking extends DomesticAppliance {

    /** maxHeatingLevel - число от 1 до 9, отображающее степень
     нагрева прибора */
    protected final int maxHeatingLevel;
    /**  availableModes - доступные режимы готовки (grill,
     steaming, boiling, frying and so on) */
    protected final String[] availableModes;
    /**builtInStatus - поле, содержащее в себе информацию о том, является
    ли прибор встроенным в кухонный гарнитур на данный момент */
    protected boolean builtInStatus;

    public ApplianceForCooking(String model, String brand, double power,
                               int amountOfButtons, double weight,
                               boolean workingStatus, int heatingLevel,
                               String [] availableModes,
                               boolean builtInStatus) {
        super(model, brand, power, amountOfButtons, weight, workingStatus);
        this.maxHeatingLevel = heatingLevel;
        this.availableModes = availableModes;
        this.builtInStatus = builtInStatus;
    }

    /**
     * Метод switchOn позволяет включить устройство. Если устройство
     * выключено, то оно включается.Если устройство уже включено,
     * то в консоль выводится сообщение о том, что устройство
     * уже работает.
     */
    @Override
    public void switchOn() {
        if(workingStatus = false){
            workingStatus = !workingStatus;
        } else{
            System.out.println("Device is already switched on");
        }
    }

    /**
     * Метод switchOff позволяет выключить устройство. Если устройство включено,
     * то оно выключается. Если устройство уже выключено, то в консоль
     * выводится сообщение о том, что устройство не работает.
     */
    @Override
    public void switchOff() {
        if(workingStatus = true){
            workingStatus = !workingStatus;
        } else{
            System.out.println("Device is already switched off");
        }
    }


    /**
     * Метод heat принимает на вход два числа
     * типа int и позволяет регулировать степень нагрева прибора.
     * Результат отработанного метода - желаемая температура -
     * выводится на экран
     * @param currentHeatingLevel первое число, тип int - текущая степень
     *        нагрева
     * @param prefferableHeatingLevel  второе число, тип int - желаемя
     *                                степень нагрева
     */
    public int heat(int currentHeatingLevel, int prefferableHeatingLevel){
        if (currentHeatingLevel <= prefferableHeatingLevel) {
            do {
                currentHeatingLevel += 1;
            } while (currentHeatingLevel < prefferableHeatingLevel);

            return currentHeatingLevel;
        }else {
            do {
                currentHeatingLevel -= 1;
            } while (currentHeatingLevel > prefferableHeatingLevel);

            return currentHeatingLevel;
        }
    }
}
