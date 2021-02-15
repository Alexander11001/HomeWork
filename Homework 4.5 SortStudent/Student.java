package collections;




import java.util.Random;

public class Student   {
    int number;
    String name;
    int age;
    double rating;
    boolean oly;

    public Student(int number, String name, int age, double rating, boolean oly)
    {
        this.number=number;
        this.name=name;
        this.age = age;
        this.rating = rating;
        this.oly = oly;
    }

    public Student() {

    }

    public int RandomNumber(){
        Random random = new Random();
        int x = (random.nextInt(100)+1);
        return x;
    }

    public int RandomAge(){
        Random random = new Random();;
        int x = (random.nextInt(11)+7);
        return x;
    }

    public double RandomRating(){
        Random random = new Random();
        int x = (random.nextInt(101));
        double y= (double) x;
        double z = y/10;
        return z;
    }

    public  boolean RandomOly()
    {
        return new Random().nextBoolean();
    }

    public String RandomName() {
        char c;
        StringBuilder q = new StringBuilder();
        Random random = new Random();
        int x = (random.nextInt(8)+3);
        for (int i = 0; i <= x; i++) {
            c = (char) (random.nextInt(63)+1040);
            q.append(c);
        }
        return q.toString();
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getRating() {
        return rating;
    }

    public boolean isOly() {
        return oly;
    }


}


