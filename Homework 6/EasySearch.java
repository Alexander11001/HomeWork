package HomeworkCollections;

public class EasySearch {
    public int IndexOfSearch(String text, String TextToSearch) {
        int counter = 0;
        int CounterForSearch = -1;
        if (text.indexOf(TextToSearch, 0) < 0) {
            return 0;
        } else {
            do {
                CounterForSearch = text.indexOf(TextToSearch, CounterForSearch+1);
                counter++;
            }
            while (CounterForSearch > 0);
            return counter-1;
        }
    }
}
//   return text.indexOf(TextToSearch);

//int indexOf(String str, int fromIndex) — возвращает индекс в данной строке первого вхождения указанной подстроки,
// начиная с указанного индекса. Если не встречается, возвращается -1.