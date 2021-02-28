package Homework1;

import Lesson2.CommunicationPrinter.welcomIf;
import Lesson2.CommunicationPrinter.welcomIfElse;
import Lesson2.CommunicationPrinter.welcomSwitch;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IfElseSwitchTests {
    String name1 = "Вася";
    String name2 = "Анастасия";
    String name3 = "Фродо";

    @Test
    @DisplayName("Тестирования блока If")
    public void TestsIF()
    {
        welcomIf if1 = new welcomIf();
        assertEquals(if1.welcom(name1), "Привет!" + "\n" + "Я тебя так долго ждал");
        assertEquals(if1.welcom(name2), "Я тебя так долго ждал");
        assertEquals(if1.welcom(name3), "Добрый день, а вы кто?");
    }

    @Test
    @DisplayName("Тестирования блока If, Else")
    public void TestsIFElse()
    {
        welcomIfElse ifElse = new welcomIfElse();
        assertEquals(ifElse.welcom(name1), "Привет!" + "\n" + "Я тебя так долго ждал");
        assertEquals(ifElse.welcom(name2), "Я тебя так долго ждал");
        assertEquals(ifElse.welcom(name3), "Добрый день, а вы кто?");
    }

    @Test
    @DisplayName("Тестирования блока Switch")
    public void TestsSwitch()
    {
        welcomSwitch switch1 = new welcomSwitch();
        assertEquals(switch1.welcom(name1), "Привет!" + "\n" + "Я тебя так долго ждал");
        assertEquals(switch1.welcom(name2), "Я тебя так долго ждал");
        assertEquals(switch1.welcom(name3), "Добрый день, а вы кто?");
    }
}
