package HomeworkCollections;

public interface ISearchEngine {

    default long search(String text, String word)
    {
        long counter=0L;
        String[] spliterator = text.trim().split("[\\s.,!?:;<>\"'()(--)*\\d]+");

        //при необходимости поиска знаков препинаия, исключенных реуглярным выражением, придется переписать spliterator
        for (int i = 0; i < spliterator.length; i++) {
            if (spliterator[i].equals(word)) //если необходимо искать без учета регистра можно использовать equalsIgnoreCase
            {
                counter++;
            }
        }
        return counter;
    }
}
