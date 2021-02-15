package Homework4;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer <T> {

    T[] data;
    public DataContainer (T [] data) {
        this.data=data;
    }


    public int add(T item)
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

                return i;
            }
        }
        T[] data1= Arrays.copyOf(data, (data.length+1));
        data=data1;
        data[data.length-1] = item;

        return data.length-1;
    }


    public T get(int index)
    {
        if (index>(data.length-1))
        {
            return null;
        }
        else if (index<0)
        {
            return null;
        }
        else
        {
            return data[index];
        }
    }

    public T[] getItems()
    {
        return data;
    }


    //7. Добавить метод boolean delete(int index) который будет удалять элемент из нашего поля data по индексу.
    //	7.1 Метод возвращает true если у нас получилось удалить данные.
    //		7.1.1 Пример data = [1, 2, 3, 777]. Вызывают delete(3).
    //		Должно получиться data = [1, 2, 3]. Метод delete вернёт true
    //	7.2 Метод возвращает false если нет такого индекса.
    //		7.2.1 Пример data = [1, 2, 3, 777]. Вызывают delete(9).
    //		Должно получиться data = [1, 2, 3, 777]. Метод delete вернёт false
    //	7.3. Освободившуюся ячейку в поеле data необходимо удалить полностью.
    //	Пустых элементов не должно быть.
    //		7.3.1 Пример data = [1, 2, 3, 777]. Вызывают delete(2). Должно получиться data = [1, 2, 777]. Метод delete вернёт true


    public boolean delete(int index)
    {
        if (index>(data.length-1))
        {
            return false;
        }
        else if (index<0)
        {
            return false;
        }

        T[] data1=Arrays.copyOf(data, (data.length-1));

        for (int i = index; i < data.length-1 ; i++) {
            data1[i]=data[i+1];
        }
        data=data1;
        return true;
    }

    public boolean delete(T item) {
        for (int i = 0; i < data.length ; i++) {
            if (data[i].equals(item)==true){
                T[] data1=Arrays.copyOf(data, (data.length-1));
                for (int j = i; j < data.length-1; j++) {
                    data1[j]=data[j+1];
                }
                data=data1;
                return true;
            }
        }
        return false;
    }


    public void sort(Comparator <T> comporator)
    {
                Arrays.sort(data, comporator);
    }





//9. Добавить НЕ СТАТИЧЕСКИЙ метод void sort(Comparator<.......> comparator). Данный метод занимается сортировкой
// данных записанных в поле data используя реализацию сравнения из ПЕРЕДАННОГО объекта comparator.


    @Override
    public String toString() {
        StringBuilder q = new StringBuilder();

        for (int i = 0; i < data.length; i++) {
            if (data[i]!=null){
                q.append("["+ data[i].toString() + "] ");
            }
        }
        return q.toString();
    }
}










