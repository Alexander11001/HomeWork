package Homework1;

import Homework2.PhoneNumberLenghtException;
import Homework2.PhoneNumbersException;
import Homework2.phone;
import junit.framework.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class phoneTest {
    phone phone1 = new phone();

    @Test
    @DisplayName("Тестирование метода createPhoneNumber")
    public void TestsPhone () throws PhoneNumberLenghtException, PhoneNumbersException {
        assertEquals (phone1.createPhoneNumber(new int[] {1,0,3,0,2,5,6,7,7,8}), "(030) 256-7781.");
        try

        {assertEquals (phone1.createPhoneNumber(new int[] {2,9,8,1,64,7,7,7,7,8}), " ");}
        catch (PhoneNumbersException e)
        {
            assertNotEquals("", e.getMessage());
        }
        try {assertEquals (phone1.createPhoneNumber(new int[] {2,10,8,1,4,7,7,7,8}), " ");}
        catch (PhoneNumberLenghtException e){
            assertNotEquals("", e.getMessage());
        }
        assertEquals (phone1.createPhoneNumber(new int[] {1,0,3,0,2,5,6,7,7,7}), "(030) 256-7771.");
    }
}