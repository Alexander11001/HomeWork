package Homework2;
public class phone
{
    public static String createPhoneNumber(int phone[]) throws PhoneNumberLenghtException, PhoneNumbersException {
        String PhoneNumber = null;
        if (phone.length!=10)
        {
            throw new PhoneNumberLenghtException ("Длинна массива превышает длинну номера телефона", phone.length);

        }

        for (int i = 0; i < 10; i++) {
            if (phone[i]<0 | phone[i]>9)
            {
                throw new PhoneNumbersException ("Введенный формат цифр не может быть частью телефонного номера");
            }
        }

        PhoneNumber = "(" + phone[1] + phone[2] + phone[3] + ") " + phone[4] + phone[5] + phone[6] + "-" +
                +phone[7] + phone[8] + phone[9] + phone[0] + ".";
        return PhoneNumber;
    }
}
//    public static void main(String[] args) throws PhoneNumberLenghtException, PhoneNumbersException {
//        int [] mobile = new int[] {1,0,3,0,2,5,6,7,1,8,};
//        System.out.println(createPhoneNumber(mobile));
//    }
//}


//6.* Создать СТАТИЧЕСКИЙ метод createPhoneNumber рядом с методом main,
// данный метод будет принимает один параметр и будет возвращать строку
// в отформатированном виде. В метод будет передаваться массив из 10 цифр (от 0 до 9).
// Данные цифры должны быть помещены в строку формата:
// (XXX) XXX-XXXX. Например передан массив: {1,2,3,4,5,6,7,8,9,0},
// возвращаемый результат: (123) 456-7890.
// (Взято с https://www.codewars.com/kata/525f50e3b73515a6db000b83/train/java).
// В задании нельзя использовать колекции, стрима.