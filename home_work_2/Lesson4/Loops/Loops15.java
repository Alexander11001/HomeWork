package Loops;
public class Loops15
{
    public static void Multi (int a, int b, int c)
    {
        for (int i = a; i <= c; i++)
        {
            int j=b;
            System.out.print(i + "x" + j + "=" + (i * j) + "\t");
            j++;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
//я знаю что есть более изящное решение, но потратив больше 1,5 часов и поняв что я знаю как написать одну стоку,
// я пришел к логичному выводу что лучше потратить меньше времени и перейти к следующим заданиям
      for (int i=1; i<=10;i++)
      {
          Multi (2, i, 5);
      }
      System.out.println();
      for (int i=1; i<=10;i++)
      {
            Multi (6, i, 9 );
      }
    }
}
