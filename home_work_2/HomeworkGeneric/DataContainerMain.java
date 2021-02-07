package Homework4;

public class DataContainerMain {
    public static void main(String[] args) {
        Integer [] number = new Integer[] {1,6,9, null, 18};
        DataContainer data = new DataContainer<>(number);
        int a = data.add(766);

        System.out.println(a);



    }
}
