/*
 * Ирина Коробейникова
 *
 *Copyright (c) 2019 LevelUP, Inc. All Rights Reserved
 *
 */
package ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1;

/**
 * Интерфейс WiFiable реализует функциональность
 * подключения к беспроводной сети.
 *
 * @version 1.0 29.11.2019
 * @author Ирина Коробейникова
 */
public interface WiFiable {

    /** buttonForSwitchingOnWifi - кнопка, позволяющая
     *  включить WiFi*/
    String BUTTON_FOR_SWITCHING_ON_WIFI = "Switch on WiFi connection";

    /**
     * Метод connectWiFi позволяет включить WiFi на устройстве.
     * Реализация метода - дефолтная, общая для всех классов,
     * реализующих данный интерфейс
     */
    default void connectWiFi(){
        System.out.println(BUTTON_FOR_SWITCHING_ON_WIFI + "is pressed." + "WiFi is connected");
    }
}
