package Lesson2;





public class Sleep4  {
    static boolean sleepIn (boolean weekday, boolean vacation ){
    if (weekday == false && vacation == false)
    {
     System.out.println("You can sleep");
     return true;

    }
    else if (weekday == true && vacation == false)
    {
        System.out.println("You should wake up");
        return false;
    }
    else if (weekday == false && vacation == true)
    {
        System.out.println("You can sleep");
        return true;
    }
    else  // это weekday == true && vacation == true, т.е. мы в отпуске, все равно какой день недели
        System.out.println("You can sleep");
        return true;
    }

    public static void main(String[] args) {
    sleepIn(true, false);



    }

    }



//sleepIn(false, false) → true
//sleepIn(true, false) → false
//sleepIn(false, true) → true

//4.* Создать СТАТИЧЕСКИЙ метод sleepIn рядом с методом main. (Взято с https://codingbat.com/prob/p187868).
//	4.1 Данный метод будет принимает два параметра
//	4.2 Будет отвечать на вопрос спать ли дальше (возвращать true либо false).
//	4.3 Первый параметр boolean weekday обозначает рабочий день
//	4.4 Второй параметр boolean vacation обозначает отпуск.
//	4.5 Если у нас отпуск или не рабочий день то мы можем спать дальше
//	4.6 На основании ответа от метода sleepIn вывести сообщение можем спать дальше или пора идти на работу