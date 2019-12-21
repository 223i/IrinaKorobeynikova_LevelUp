/*
 * Ирина Коробейникова
 *
 *Copyright (c) 2019 LevelUP, Inc. All Rights Reserved
 *
 */
package homework_5;
import homework_5.task_1.LoginLogoutTest;
import homework_5.task_2.AdditionOfNewUserTest;

/**
 * Класс TestSuite предоставляет тест сьют,
 * в кооторый входят тесты из классов LoginLogoutTest,
 * AdditionOfNewUserTest.
 *
 * @version 1.0 14.12.2019
 * @author Ирина Коробейникова
 */

@RunWith(JUnitPlatform.class)
@SelectClasses({LoginLogoutTest.class, AdditionOfNewUserTest.class})
public class RunTest {

}
