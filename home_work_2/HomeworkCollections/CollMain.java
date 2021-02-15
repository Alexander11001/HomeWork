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
//        System.out.println(Stringbook);
        String[] spliterator = Stringbook.trim().split("[\\s.,!?:;\"'()(--)*\\d]+");
        System.out.println(spliterator.length);
        Set<String> CollBook = new HashSet<>();
        for (int i = 0; i < spliterator.length; i++)
        {
            CollBook.add(spliterator[i]);
        }
        System.out.println(CollBook.size());

        Map<String, Integer> data = new HashMap<>();


        for (int i = 0; i < spliterator.length; i++)
        {
            Integer TotalUsing = data.get(spliterator[i]);
            data.put(spliterator[i], Methods.Using(TotalUsing));
        }
        System.out.println(data.size());
//       System.out.println(data);

        List<Map.Entry<String, Integer>> SortList = new ArrayList(data.entrySet());

        Collections.sort(SortList, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for (int i = 0; i < 10; i++)
        {
            System.out.println(SortList.get(i));
        }
        System.out.println(Methods.search(Stringbook, "его"));
        System.out.println(Methods.IndexOfSearch(Stringbook, "фельдфебель"));
    }
}