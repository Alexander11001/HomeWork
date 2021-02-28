package Homework1;

import Lesson2.ToBinaryString;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToBinaryStringTest {
    ToBinaryString TBS = new ToBinaryString();


    @Test
    @DisplayName("Тестирование метода toBinaryString")
    public void TestsBinaryString(){
        assertEquals (TBS.toBinaryString((byte) 42), "00101010");
        assertEquals (TBS.toBinaryString((byte) 15), "00001111");
        assertEquals (TBS.toBinaryString((byte) -42), "11010110");
        assertEquals (TBS.toBinaryString((byte) -15), "11110001");
    }

}
