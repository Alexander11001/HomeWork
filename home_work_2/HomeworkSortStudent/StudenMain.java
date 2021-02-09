package collections;

import java.util.*;

public class StudenMain  {
    public static void main(String[] args) {
        Student stud=new Student();
        ArrayList<Student> StList = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            Student Bob = new Student(stud.RandomNumber(), stud.RandomName(), stud.RandomAge(), stud.RandomRating(),
                    stud.RandomOly());
            StList.add(Bob);
        }



        ArrayList<Student> FilterStList = new ArrayList<>();

        for (int i = 0; i < StList.size(); i++) {
            if (StList.get(i).age>=12 && StList.get(i).getRating()>=8.0)
            {
                FilterStList.add(StList.get(i));
            }
        }

        System.out.println(FilterStList.size());
        System.out.println(FilterStList.get(1).age);
        System.out.println(FilterStList.get(1).getRating());



        Comparator<Student> comparator = Comparator.comparing(obj -> obj.getName());
        Collections.sort( FilterStList, comparator);

        for (int i = 0; i < 10; i++) {
            System.out.println(FilterStList.get(i).name);
        }

        Comparator<Student> comparator2 = Comparator.comparing(obj -> obj.getRating());
        Collections.sort( FilterStList, comparator2.reversed());

        for (int i = 0; i < 10; i++) {
            System.out.println(FilterStList.get(i).rating);
        }





 // Создать 10_000 объектов класс Student и поместить в коллекцию.



  //      System.out.println(StList.toString());










    }
}
