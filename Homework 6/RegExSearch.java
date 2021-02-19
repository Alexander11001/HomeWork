package HomeworkCollections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {
        long counter=0L;
        Pattern pattern = Pattern.compile("[\\s.,!?:;\"'()(--)*\\d]"+word+"[\\s.,!?:;\"'()(--)*\\d]+");
        Matcher matcher = pattern.matcher(text);
        while(matcher.find())
        {
            counter++;
        }
        return counter;
    }
}