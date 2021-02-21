package HomeworkCollections;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {
    public ISearchEngine iSearch;

    public SearchEnginePunctuationNormalizer(ISearchEngine iSearch) {
        this.iSearch=iSearch;
    }

    @Override
    public long search(String text, String word) {
        String replace = text.replaceAll(".,!?:;\"'()(--)*\\d]+", " ").replaceAll("\\s+", " ");
        return this.iSearch.search(replace, word);
    }
}
