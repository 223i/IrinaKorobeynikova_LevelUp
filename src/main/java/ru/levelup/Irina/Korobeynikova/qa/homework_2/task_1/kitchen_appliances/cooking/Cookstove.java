/*
 * Ирина Коробейникова
 *
 *Copyright (c) 2019 LevelUP, Inc. All Rights Reserved
 *
 */

package ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.kitchen_appliances.cooking;
import ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.Screenable;
import java.util.Arrays;

/**
 * Класс Cookstove наследуется от класса ApplianceForCooking, позволяет
 * создавать экземпляры кухонных плит и содержит поля и методы,
 * которые являются общими для данных экземпляров.
 *
 * @version 1.0 29.11.2019
 * @author Ирина Коробейникова
 */
public class Cookstove extends ApplianceForCooking implements Screenable {

    /** amountOfStoves - число от комфорок на плите */
    private final int amountOfStoves;

    public Cookstove(String model, String brand, double power, int amountOfButtons,
                     double weight, boolean workingStatus, int heatingLevel,
                     String[] availableModes, boolean builtInStatus,
                     int amountOfStoves) {
        super(model, brand, power, amountOfButtons, weight, workingStatus,
                heatingLevel, availableModes, builtInStatus);
        this.amountOfStoves = amountOfStoves;
    }

    public int getAmountOfStoves() {
        return amountOfStoves;
    }

    /**
     * Метод heat hasScreen позволяет определить
     * имеет ли кухонная плита экран. Если плита встроена в кухонный гарнитур,
     * то у нее отсутствует экран.В противном случае экран присутствует.
     */
    @Override
    public boolean hasScreen() {
        if(!builtInStatus){
            return false;
        } else{
            return true;
        }
    }

    @Override
    public String toString() {
        return "Cookstove{" +
                "amountOfStoves=" + amountOfStoves +
                ", maxHeatingLevel=" + maxHeatingLevel +
                ", availableModes=" + Arrays.toString(availableModes) +
                ", builtInStatus=" + builtInStatus +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", power=" + power +
                ", amountOfButtons=" + amountOfButtons +
                ", weight=" + weight +
                '}';
    }
}
