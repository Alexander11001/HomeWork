package HomeworkCollections;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchEngineWithoutReg implements ISearchEngine {
    public ISearchEngine iSearch;

    public SearchEngineWithoutReg(ISearchEngine iSearch) {
        this.iSearch=iSearch;
    }

    @Override
    public long search(String text, String word) {
        if(iSearch instanceof EasySearch)
        {
            long counter = 0L;
            int CounterForSearch = -1;
            String lowText=text.toLowerCase();
            String lowWord=word.toLowerCase();
            if (lowText.indexOf(lowWord, 0) < 0) {
                return 0;
            } else {
                do {
                    CounterForSearch = lowText.indexOf((" "+ lowWord + " "), CounterForSearch+1);
                    counter++;
                }
                while (CounterForSearch > 0);
                return counter-1;
            }

        }
        else if ((iSearch instanceof RegExSearch)){
            {
                long counter=0L;
                Pattern pattern = Pattern.compile("[\\s.,!?:;\"'()(--)*\\d]"+word+"[\\s.,!?:;\"'()(--)*\\d]+",
                        Pattern.CASE_INSENSITIVE);
                Matcher matcher = pattern.matcher(text);
                while(matcher.find())
                {
                    counter++;
                }
                return counter;
            }
        }
        else //если появится еще один класс, имплеминтирующий ISearchEngine и
        // используюший неперезаписанный метод search интерфейса ISearchEngine
        {
            long counter=0L;
            String[] spliterator = text.trim().split("[\\s.,!?:;<>\"'()(--)*\\d]+");

            for (int i = 0; i < spliterator.length; i++) {
                if (spliterator[i].equalsIgnoreCase(word))
                {
                    counter++;
                }
            }
            return counter;
        }
    }
}
