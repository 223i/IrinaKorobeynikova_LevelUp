/*
 * Ирина Коробейникова
 *
 *Copyright (c) 2019 LevelUP, Inc. All Rights Reserved
 *
 */
package ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1;

/**
 * Абстрактный класс DomesticAppliance
 * бытовой техники и содержит поля и методы,
 * которые являются общими для приборов всех типов.
 *
 * @version 1.0 29.11.2019
 * @author Ирина Коробейникова
 */
public abstract class DomesticAppliance {

    /** workingStatus - статус устройства(работает или нет)*/
    protected boolean workingStatus;
    /** model - модель устройства*/
    protected final String model;
    /** brand - марка устройства*/
    protected final String brand;
    /** power - мощность устройства*/
    protected final double power;
    /** amountOfButtons - количество кнопок у устройства*/
    protected final int amountOfButtons ;
    /** weight - вес устройства*/
    protected final double weight;

    public DomesticAppliance(String model, String brand, double power,
                             int amountOfButtons, double weight,
                             boolean workingStatus) {
        this.model = model;
        this.brand = brand;
        this.power = power;
        this.amountOfButtons = amountOfButtons;
        this.weight = weight;
        this.workingStatus = workingStatus;
    }

    public boolean isWorkingStatus() {
        return workingStatus;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public double getPower() {
        return power;
    }

    public int getAmountOfButtons() {
        return amountOfButtons;
    }

    public double getWeight() {
        return weight;
    }

    /**
     * Абстрактный метод switchOn позволяет включить устройство.
     */
    public abstract void switchOn();
    /**
     * Абстрактный метод switchOff позволяет выключить устройство.
     */
    public abstract void switchOff();

}
