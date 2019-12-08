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
 * Класс SlowCooker наследуется от класса ApplianceForCooking, позволяет
 * создавать экземпляры мультиварок и содержит поля и методы,
 * которые являются общими для данных экземпляров.
 *
 * @version 1.0 29.11.2019
 * @author Ирина Коробейникова
 */
public class SlowCooker extends ApplianceForCooking implements Screenable {

    /** packaging - перечень приборов, входящих в дополнительную
     *  комплектацию*/
    private String[] packaging;

    public SlowCooker(String model, String brand, double power, int amountOfButtons,
                      double weight, boolean  workingStatus, int heatingLevel,
                      String[] availableModes, boolean builtInStatus, String[] packaging) {
        super(model, brand, power, amountOfButtons, weight, workingStatus, heatingLevel,
                availableModes, builtInStatus);
        this.packaging = packaging;
    }

    public String[] getPackaging() {
        return packaging;
    }

    public void setPackaging(String[] packaging) {
        this.packaging = packaging;
    }

    /**
     * Метод heat hasScreen позволяет определить
     * имеет ли мультиварка экран. Мультиварка всегда снабжена
     * экраном.
     */
    @Override
    public boolean hasScreen() {
        return true;
    }

    @Override
    public String toString() {
        return "SlowCooker{" +
                "packaging=" + Arrays.toString(packaging) +
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
