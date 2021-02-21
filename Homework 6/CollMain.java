package HomeworkCollections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class CollMain {
    public static void main(String[] args) throws IOException {
        MetodsForHomework Methods = new MetodsForHomework();

        String Stringbook = Files.readString
                (Path.of("G:\\Война и мир_книга.txt")
                );

        //2.1 Найти в тексте все использованные слова и поместить их в коллекцию Set.
        String[] spliterator = Stringbook.trim().split("[\\s.,!?:;\"'()(--)*\\d]+");
        System.out.println("Количество слов в тексте = " + spliterator.length);
        Set<String> CollBook = new HashSet<>();

        //2.2 Найти в тексте топ N (настраиваемое значение) слов и вывести количество этих слов используя Map и List.
        // Отсортировать по количеству. Распечатать в консоль.

        for (int i = 0; i < spliterator.length; i++)
        {
            CollBook.add(spliterator[i]);
        }
        System.out.println("Количество уникальных слов в тексте = "+ CollBook.size());

        Map<String, Integer> data = new HashMap<>();


        for (int i = 0; i < spliterator.length; i++)
        {
            Integer TotalUsing = data.get(spliterator[i]);
            data.put(spliterator[i], Methods.Using(TotalUsing));
        }

        List<Map.Entry<String, Integer>> SortList = new ArrayList(data.entrySet());

        Collections.sort(SortList, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        System.out.println("Рейтинг слов по наиболее частому использованию: ");

        for (int i = 0; i < 10; i++)
        {
            System.out.println(SortList.get(i));
        }

        //3. Написать интерфейс ISearchEngine. Это будет интерфейс в котором будут методы:
        //	3.1 long search(String text, String word)

        String WordToFind = "его";
        System.out.println("Количество использования слова " + WordToFind +" = "+Methods.search(Stringbook, WordToFind));

        //4. Реализовать интерфейс ISearchEngine:
        //	4.1 Написать класс EasySearch. Реализовать поиск используя метод indexOf из класса String.
        //	В данной реализации запрещено использовать регулярные выражения в любом виде, для любых задач.
        //	Данный класс ищет слова с учётом регистра.
        EasySearch easySearch = new EasySearch();
        System.out.println(easySearch.search(Stringbook, "фельдфебель"));



        //	4.2* Написать класс реализующий интерфейс ISearchEngine. Реализовать поиск при помощи класса Matcher.
        // 	Данный класс ищет слова с учётом регистра.
        RegExSearch RegExSearch = new RegExSearch();
        System.out.println(RegExSearch.search(Stringbook,"к" ));



        //	4.3* Написать декоратор SearchEnginePunctuationNormalizer для ISearchEngine который будет удалять нежелательные
        //	символы. Любые знаки препинания, лишние пробелы и например переводы строк.

        SearchEnginePunctuationNormalizer punctuationNormalizer = new SearchEnginePunctuationNormalizer(new RegExSearch());
        System.out.println(punctuationNormalizer.search(Stringbook, "его"));

        //4.4* Написать декоратор для ISearchEngine который будет позволять искать данные без учёта регистра.
        //+
        //5. Используя реализации интерфейса ISearchEngine вывести информацию как часто встречаются слова "война",
        // "и" (как союз), "мир" вне зависимости от регистра.
        System.out.println("----------------------------------");

        SearchEngineWithoutReg engineWithoutRegEasySearch =new SearchEngineWithoutReg(new EasySearch());
        System.out.println(engineWithoutRegEasySearch.search(Stringbook, "война"));
        System.out.println(engineWithoutRegEasySearch.search(Stringbook, "и"));
        System.out.println(engineWithoutRegEasySearch.search(Stringbook, "мир"));
        System.out.println("----------------------------------");
        SearchEngineWithoutReg engineWithoutReg2RegExSearch =new SearchEngineWithoutReg(new RegExSearch());
        System.out.println(engineWithoutReg2RegExSearch.search(Stringbook, "война"));
        System.out.println(engineWithoutReg2RegExSearch.search(Stringbook, "и"));
        System.out.println(engineWithoutReg2RegExSearch.search(Stringbook, "мир"));

    }
}




