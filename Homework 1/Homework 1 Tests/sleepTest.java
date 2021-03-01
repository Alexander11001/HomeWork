package Homework1;

import Homework2.sleep;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sleepTest {
    sleep sleepT =new sleep();

    @Test
    @DisplayName("Тестирование метода sleepIn")
    public void TestsSleep(){

        assertEquals(sleepT.sleepIn (false,false), true);
        assertEquals(sleepT.sleepIn (true,false), false);
        assertEquals(sleepT.sleepIn (false,true), true);
        assertEquals(sleepT.sleepIn (true,true), true);
    }


}


