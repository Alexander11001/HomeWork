package Lesson2;

public class ToBinaryString {
    public static String toBinaryString(byte number) {
        String Binaries = null;
        if (number >= 0) {
            Binaries = String.format("%8s", Integer.toBinaryString(number)).replaceAll(" ", "0");
            return Binaries;
        } else {
            Binaries = Integer.toBinaryString(number).substring(24);
            return Binaries;
        }
    }
}

