package Homework4;

import java.util.Comparator;

public class DataContainerMain {
    public static void main(String[] args) {

        Integer [] number = new Integer[] {6, 9, 18, 12,89, null};
        DataContainer data = new DataContainer<>(number);
        int a = data.add(766);




        //System.out.println(a);
        System.out.println(data.toString());

       // System.out.println(data.get(2));

     //   System.out.println(data.getItems());
   //     boolean c= data.delete(5);
   //     System.out.println(c);
        Integer number2 = 6;

        boolean q= data.delete(number2);
        System.out.println(q);
        System.out.println(data.toString());

        data.sort(Comparator.naturalOrder());
        System.out.println(data.toString());








    }



}

