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
