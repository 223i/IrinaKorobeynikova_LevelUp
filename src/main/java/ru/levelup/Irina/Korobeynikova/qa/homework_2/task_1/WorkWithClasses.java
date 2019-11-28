/*
 * Ирина Коробейникова
 *
 *Copyright (c) 2019 LevelUP, Inc. All Rights Reserved
 *
 */
package ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1;
import ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.bath_room_appliances.BeardTrimmer;
import ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.bath_room_appliances.Hairdryer;
import ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.bath_room_appliances.WashingMachine;
import ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.kitchen_appliances.cooking.Cookstove;
import ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.kitchen_appliances.cooking.SlowCooker;
import ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.kitchen_appliances.drinks_preparation.CoffeMaker;
import ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.kitchen_appliances.drinks_preparation.Teapot;
import ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.kitchen_appliances.food_storage.Refrigerator;
import ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.kitchen_appliances.servicing.Dishwasher;
import ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.kitchen_appliances.servicing.StoveHood;
import ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.living_room_appliances.AlarmClock;
import ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.living_room_appliances.Landline;
import ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.living_room_appliances.PC;
import ru.levelup.Irina.Korobeynikova.qa.homework_2.task_1.living_room_appliances.TV;
import java.util.ArrayList;
import java.util.Random;

/**
 * Класс WorkWithClasses позволяет работать с экземплярами
 * классов различных бытовых приборов. Данный класс включает в себя
 * сбор данных, посчитать потребляемую мощность, провести сортировку
 * приборов в квартире на основе одного из параметров, найти прибор
 * в квартире, соответствующий заданному диапазону параметров, а также
 * включить некоторые приборы в розетку.
 *
 * @version 1.0 29.11.2019
 * @author Ирина Коробейникова
 */
public class WorkWithClasses {

    /**
     * Метод main отвечает за создание списка объектов и вызов
     * основных методов, работающих с данными объектами.
     */
    public static void main(String[] args) {

        ArrayList<DomesticAppliance> allDevices = createListOfDevicesWithRandomData();
        System.out.println("===========All devices =============");
        for(DomesticAppliance device : allDevices){
            System.out.println(device.toString());
        }

        System.out.println("===========Sorted devices based on brand =============");
        ArrayList<DomesticAppliance> sortedDevices = sortForDeviceBasedOnBrand(allDevices, "Bosh");
        for(DomesticAppliance device : sortedDevices){
            System.out.println(device.toString());
        }

        System.out.println("===========Summarised power of all devices=============");
        System.out.println(countPower(allDevices));

        findDeviceBasedOfParameters(allDevices,75.3, true, 250);

        System.out.println("===========All CoffeMaker,Dishwasher, TV plug into outlet=============");
        plugDeviceIntoOutlet(allDevices);
    }

    /**
     * Метод plugDeviceIntoOutlet позволяет включить в розетку
     * кофеварки, посудомойки и телевизоры
     * на основе нескольких параметров
     * @param allDevices список всех объектов(приборов)
     */
    public static final void plugDeviceIntoOutlet(
            ArrayList<DomesticAppliance> allDevices){
        for(DomesticAppliance device : allDevices) {
            if (device instanceof Dishwasher || device instanceof
                    CoffeMaker || device instanceof TV)
                   ((PlugIntoOutlet) device).plugIntoOutlet();
            }
        }

    /**
     * Метод findDeviceBasedOfParameters позволяет найти прибор
     * на основе нескольких параметров
     * @param allDevices список объектов (приборов)
     * @param weight, тип double, вес искомого объекта
     * @param workingStatus, тип boolean, статус
     *                      объекта - работает или нет
     * @param power, тип double, мощность прибора
     */
    public static final void findDeviceBasedOfParameters(
            ArrayList<DomesticAppliance> allDevices, double weight, boolean
            workingStatus, double power ){
        for(DomesticAppliance device : allDevices) {
            if (device.weight == weight && device.workingStatus == workingStatus
                    && device.power == power) {
                System.out.println(device.toString());
            }
        }
    }

    /**
     * Метод countPower позволяет посчитать общую потребляемую
     * мощность всех приборов
     * @param allDevices список объектов
     */
    public static final double countPower( ArrayList<DomesticAppliance> allDevices){
        double sumOfPower = 0;

        for(DomesticAppliance device : allDevices){
            sumOfPower += device.power;
        }
        return sumOfPower;
    }

    /**
     * Метод sortForDeviceBasedOnBrand позволяет отсортировать приборы
     * на основе изготовителя-производителя прибора.
     * @param allDevices список объектов, приборов
     * @param brand бренд-производитель прибора
     */
    public static final ArrayList<DomesticAppliance> sortForDeviceBasedOnBrand(
            ArrayList<DomesticAppliance> allDevices, String brand){
        ArrayList<DomesticAppliance> collectedDevices = new ArrayList<>();

        for(DomesticAppliance device : allDevices){
            if(device.brand.equals(brand)){
                collectedDevices.add(device);
            }
        }
        return collectedDevices;
    }

    /**
     * Метод createListOfDevicesWithRandomData позволяет создать
     * экземпляры различных классов приборов с опорой
     * на рандомные и сложить их в список.
     */
    public static final ArrayList<DomesticAppliance> createListOfDevicesWithRandomData(){

        boolean[] workingStatus = new boolean[]{ true, false};
        String[] model = new String[] { "TA4554P", "458C", "85R90", "Q25t", "WE12R", "P854l3" };
        String[] brand = new String[] { "Bosh", "Simens", "LG", "Electrolux", "Samsung", "Mozer", "Xiaomi" };
        double[] power = new double[] { 230.3 , 500.5, 250, 356.5, 124, 24.73, 90.09, 642.3};
        int[] amountOfButtons = new int[] { 3, 14, 2, 10, 7, 0,5 };
        double[] weight = new double[] { 25.4, 63.7, 75.3, 600.8, 462.9, 65.9, 730.1 };
        int[] amountOfNozzles = new int[] { 1, 3, 8, 2, 4,9,7};
        String[] airModes = new String[] { "Hot", "Cold", "Warm"};
        double[] maximalVolume = new double[] { 302, 420, 1000, 587, 789};
        String[] type = new String[] {"Vertical", "Horizontal"};
        String[] conditionOfWashingMashine = new String[] {"Used", "New"};
        int[] maxHeatingLevel = new int[] {9,8,7,6,5,4,3,2,1};
        String[] availableModes = new String[] {"steaming", "boiling", "frying", "grill", "backing"};
        boolean[] builtInStatus = new boolean[] { true, false};
        int[] amountOfStoves = new int[] {5,4,3,2,1};
        String[] packaging = new String[] {"spoon","bowl", "sieve"};
        boolean[] needCapsules = new boolean[] { true, false};
        int[] amountOfRegimes = new int[] {6,5,4,3,2,1};
        double[] timeOfBoiling = new double[] { 10, 7, 3, 2, 1};
        double[] height = new double[] { 2.7, 2.4, 2.0, 2.1};
        int[] refrigerationLevel = new int[] {6,5,4,3,2,1};
        double[] volumeOfDishwasher = new double[] { 27, 30, 22, 18};
        String[] modesOfDishwasher = new String[] {"rinse","wash"};
        boolean[] lighting = new boolean[] { true, false};
        boolean[] connectionWithSmartphone = new boolean[] { true, false};
        String[] typeOfAlarmClock = new String[] {"electronic", "mechanical"};
        String[] landlineTelephoneNumber = new String[] {"12545613", "7851535163", "1353850", "7953213"};
        String[] complectation = new String[] {"Monitor", "System block", "Keyboard", "Mouse", "Dynamics"};
        String[] instrumehtsOfRemoteContron = new String[] {"clicker", "smartphone"};
        int[] amountOfChannels = new int[] {30,50,40,33,20,15};

        Random random = new Random();
        ArrayList<DomesticAppliance> allDomesticAppliance = new ArrayList<>();

        for(int i = 0; i < 5 ; i++ ){
            AlarmClock newAlarmClock = new AlarmClock(model[random.nextInt(model.length)],
                    brand[random.nextInt(brand.length)], power[random.nextInt(power.length)],
                    amountOfButtons[random.nextInt(amountOfButtons.length)],
                    weight[random.nextInt(weight.length)], workingStatus[random.nextInt(workingStatus.length)],
                    typeOfAlarmClock[random.nextInt(typeOfAlarmClock.length)],
                    connectionWithSmartphone[random.nextInt(connectionWithSmartphone.length)]);

            allDomesticAppliance.add(newAlarmClock);

            Landline newLandline = new Landline(model[random.nextInt(model.length)],
                    brand[random.nextInt(brand.length)], power[random.nextInt(power.length)],
                    amountOfButtons[random.nextInt(amountOfButtons.length)],
                    weight[random.nextInt(weight.length)], workingStatus[random.nextInt(workingStatus.length)],
                    landlineTelephoneNumber[random.nextInt(landlineTelephoneNumber.length)]);

            allDomesticAppliance.add(newLandline);

            PC newPC = new PC(model[random.nextInt(model.length)],
                    brand[random.nextInt(brand.length)], power[random.nextInt(power.length)],
                    amountOfButtons[random.nextInt(amountOfButtons.length)],
                    weight[random.nextInt(weight.length)], workingStatus[random.nextInt(workingStatus.length)],
                    complectation);

            allDomesticAppliance.add(newPC);

            TV newTV = new TV(model[random.nextInt(model.length)],
                    brand[random.nextInt(brand.length)], power[random.nextInt(power.length)],
                    amountOfButtons[random.nextInt(amountOfButtons.length)],
                    weight[random.nextInt(weight.length)], workingStatus[random.nextInt(workingStatus.length)],
                    instrumehtsOfRemoteContron, amountOfChannels[random.nextInt(amountOfChannels.length)]);

            allDomesticAppliance.add(newTV);

            Cookstove cookstove = new Cookstove(model[random.nextInt(model.length)],
                    brand[random.nextInt(brand.length)],
                    power[random.nextInt(power.length)],
                    amountOfButtons[random.nextInt(amountOfButtons.length)],
                    weight[random.nextInt(weight.length)],
                    workingStatus[random.nextInt(workingStatus.length)],
                    maxHeatingLevel[random.nextInt(maxHeatingLevel.length)], availableModes,
                    builtInStatus[random.nextInt(builtInStatus.length)],
                    amountOfStoves[random.nextInt(amountOfStoves.length)]);

            allDomesticAppliance.add(cookstove);

            SlowCooker slowCooker = new SlowCooker(model[random.nextInt(model.length)],
                    brand[random.nextInt(brand.length)],
                    power[random.nextInt(power.length)],
                    amountOfButtons[random.nextInt(amountOfButtons.length)],
                    weight[random.nextInt(weight.length)],
                    workingStatus[random.nextInt(workingStatus.length)],
                    maxHeatingLevel[random.nextInt(maxHeatingLevel.length)], availableModes,
                    builtInStatus[random.nextInt(builtInStatus.length)],
                    packaging);

            allDomesticAppliance.add(slowCooker);

            CoffeMaker coffeMaker = new CoffeMaker(model[random.nextInt(model.length)],
                    brand[random.nextInt(brand.length)],
                    power[random.nextInt(power.length)],
                    amountOfButtons[random.nextInt(amountOfButtons.length)],
                    weight[random.nextInt(weight.length)],
                    workingStatus[random.nextInt(workingStatus.length)],
                    needCapsules[random.nextInt(needCapsules.length)],
                    amountOfRegimes[random.nextInt(amountOfRegimes.length)]);

            allDomesticAppliance.add(coffeMaker);

            Teapot teapot = new Teapot(model[random.nextInt(model.length)],
                    brand[random.nextInt(brand.length)],
                    power[random.nextInt(power.length)],
                    amountOfButtons[random.nextInt(amountOfButtons.length)],
                    weight[random.nextInt(weight.length)],
                    workingStatus[random.nextInt(workingStatus.length)],
                    timeOfBoiling[random.nextInt(timeOfBoiling.length)]);

            allDomesticAppliance.add(teapot);

            Refrigerator refrigerator = new Refrigerator(model[random.nextInt(model.length)],
                    brand[random.nextInt(brand.length)],
                    power[random.nextInt(power.length)],
                    amountOfButtons[random.nextInt(amountOfButtons.length)],
                    weight[random.nextInt(weight.length)],
                    workingStatus[random.nextInt(workingStatus.length)],
                    height[random.nextInt(height.length)],
                    refrigerationLevel[random.nextInt(refrigerationLevel.length)]);

            allDomesticAppliance.add(refrigerator);

            Dishwasher dishwasher = new Dishwasher(model[random.nextInt(model.length)],
                    brand[random.nextInt(brand.length)],
                    power[random.nextInt(power.length)],
                    amountOfButtons[random.nextInt(amountOfButtons.length)],
                    weight[random.nextInt(weight.length)],
                    workingStatus[random.nextInt(workingStatus.length)],
                    volumeOfDishwasher[random.nextInt(volumeOfDishwasher.length)],
                    modesOfDishwasher);

            allDomesticAppliance.add(dishwasher);

            StoveHood stoveHood = new StoveHood(model[random.nextInt(model.length)],
                    brand[random.nextInt(brand.length)],
                    power[random.nextInt(power.length)],
                    amountOfButtons[random.nextInt(amountOfButtons.length)],
                    weight[random.nextInt(weight.length)],
                    workingStatus[random.nextInt(workingStatus.length)],
                    lighting[random.nextInt(lighting.length)]);

            allDomesticAppliance.add(stoveHood);

            BeardTrimmer beardTrimmer = new BeardTrimmer(model[random.nextInt(model.length)],
                    brand[random.nextInt(brand.length)],
                    power[random.nextInt(power.length)],
                    amountOfButtons[random.nextInt(amountOfButtons.length)],
                    weight[random.nextInt(weight.length)],
                    workingStatus[random.nextInt(workingStatus.length)],
                    amountOfNozzles[random.nextInt(amountOfNozzles.length)]);

            allDomesticAppliance.add(beardTrimmer);

            Hairdryer hairdryer = new Hairdryer(model[random.nextInt(model.length)],
                    brand[random.nextInt(brand.length)],
                    power[random.nextInt(power.length)],
                    amountOfButtons[random.nextInt(amountOfButtons.length)],
                    weight[random.nextInt(weight.length)],
                    workingStatus[random.nextInt(workingStatus.length)],airModes);

            allDomesticAppliance.add(hairdryer);

            WashingMachine washingMachine = new WashingMachine(model[random.nextInt(model.length)],
                    brand[random.nextInt(brand.length)],
                    power[random.nextInt(power.length)],
                    amountOfButtons[random.nextInt(amountOfButtons.length)],
                    weight[random.nextInt(weight.length)],
                    workingStatus[random.nextInt(workingStatus.length)],
                    maximalVolume[random.nextInt(maximalVolume.length)],
                    type[random.nextInt(type.length)],
                    conditionOfWashingMashine[random.nextInt(conditionOfWashingMashine.length)]);

            allDomesticAppliance.add(washingMachine);
        }
        return allDomesticAppliance;
    }
}

