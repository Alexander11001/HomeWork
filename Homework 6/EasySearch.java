package HomeworkCollections;

public class EasySearch implements ISearchEngine {
    @Override
    public long search(String text, String TextToSearch) {
        long counter = 0L;
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
