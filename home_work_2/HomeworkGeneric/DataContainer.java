package Homework4;

import java.util.Arrays;

public class DataContainer <T> {

    int a;



    T[] data;
    public DataContainer (T [] data) {
        this.data=data;
    }


    int add(T item)
    {

        for (int i = 0; i < data.length; i++)
        {
            if(item==null)
            {
                return -1;

            }
            else if (data[i]==null)
            {
                data[i] = item;
                a=i;
                return i;
            }
        }
        T[] data1= Arrays.copyOf(data, (data.length+1));
        data=data1;
        data[data.length-1] = item;
        a=data.length-1;
        return data.length-1;
    }


    T get(int index)
    {
    if (index==a)
    {return data[a];
            }
    else
    return null;
    }

//5. В данном классе должен быть метод T get(int index).
// Данный метод получает из DataContainer'а, из поля data, предварительно сохранённый
// объект который мы передали на предыдущем шаге через метод add.
//	5.1 Пример: data = []. Вызвали add(9999). Получили data = [9999].
//	Метод add вернул число 0. Вызываем get(0). Метод get возвращает 9999
//	5.2 Пример: data = [9999]. Вызываем get(1). Метод get возвращает null




}
