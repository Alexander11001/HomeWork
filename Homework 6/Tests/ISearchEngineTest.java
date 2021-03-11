package HomeworkCollections;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ISearchEngineTest {
    EasySearch easySearch = new EasySearch();
    RegExSearch regExSearch = new RegExSearch();
    SearchEnginePunctuationNormalizer searchEnginePunctuationNormalizer = new SearchEnginePunctuationNormalizer(regExSearch);
    SearchEngineWithoutReg searchEngineWithoutReg = new SearchEngineWithoutReg(easySearch);

    String str1 = "привет, как дела!";
    String str2 = "привет,какдела!";
    String str3 = "привет;какдела!";
    String str4 = "как дела!.Что делаешь?";
    String str5 = "4-х";
    String str6 = "один и 1";
    String str7 = "бабушка бабушке бабушку";

    @Test
    void easySearchTest() {

        assertEquals(easySearch.search(str1, "как"), 1);
        assertEquals(easySearch.search(str2, "привет"), 0);
        //в EasySearch зашита "легкая" логика (" " + TextToSearch +" ")
        assertEquals(easySearch.search(str3, "привет"), 0);
        assertEquals(easySearch.search(str4, "делаешь"), 0);
        assertEquals(easySearch.search(str5, "x"), 0);
        assertEquals(easySearch.search(str6, "и"), 1);
        assertEquals(easySearch.search(str7, "бабушке"), 1);
        assertEquals(easySearch.search(str8, "видел"), 2);
        assertEquals(easySearch.search(str9, "Видно"), 10);
        assertEquals(easySearch.search(str10, "утят"), 4);



    }


    @Test
    void regExSearchTest() {

        assertEquals(regExSearch.search(str1, "как"), 1);
        assertEquals(regExSearch.search(str2, "привет"), 0);

        assertEquals(regExSearch.search(str3, "привет"), 0);
        assertEquals(regExSearch.search(str4, "делаешь"), 1);
        assertEquals(regExSearch.search(str5, "x"), 0);
        assertEquals(regExSearch.search(str6, "и"), 1);
        assertEquals(regExSearch.search(str7, "бабушке"), 1);

       assertEquals (regExSearch.search(str8, "видел"), 2);
        assertEquals(regExSearch.search(str9, "Видно"), 10);
        assertEquals(regExSearch.search(str9, "видно"), 9);
        assertEquals(regExSearch.search(str10, "утят"), 4);

    }


    @Test
    void SearchEnginePunctuationNormalizerTest() {

        assertEquals(searchEnginePunctuationNormalizer.search(str1, "как"), 1);
        assertEquals(searchEnginePunctuationNormalizer.search(str2, "привет"), 0);

        assertEquals(searchEnginePunctuationNormalizer.search(str3, "привет"), 0);
        assertEquals(searchEnginePunctuationNormalizer.search(str4, "делаешь"), 1);
        assertEquals(searchEnginePunctuationNormalizer.search(str5, "x"), 0);
        assertEquals(searchEnginePunctuationNormalizer.search(str6, "и"), 1);
        assertEquals(searchEnginePunctuationNormalizer.search(str7, "бабушке"), 1);
        assertEquals(searchEnginePunctuationNormalizer.search(str8, "видел"), 2);
        assertEquals(searchEnginePunctuationNormalizer.search(str9, "Видно"), 10);
        assertEquals(searchEnginePunctuationNormalizer.search(str9, "видно"), 9);
        assertEquals(searchEnginePunctuationNormalizer.search(str10, "утят"), 4);
    }


    @Test
    void searchEngineWithoutRegTest() {

        assertEquals(searchEngineWithoutReg.search(str1, "как"), 1);
        assertEquals(searchEngineWithoutReg.search(str2, "привет"), 0);

        assertEquals(searchEngineWithoutReg.search(str3, "привет"), 0);
        assertEquals(searchEngineWithoutReg.search(str4, "делаешь"), 0);
        assertEquals(searchEngineWithoutReg.search(str5, "x"), 0);
        assertEquals(searchEngineWithoutReg.search(str6, "и"), 1);
        assertEquals(searchEngineWithoutReg.search(str7, "бабушке"), 1);
        assertEquals(searchEngineWithoutReg.search(str8, "видел"), 2);
        assertEquals(searchEngineWithoutReg.search(str9, "Видно"), 19);
        assertEquals(searchEngineWithoutReg.search(str10, "утят"), 4);

    }

    String str8 = "Я видел нечто, во что вы, люди, просто не поверите. Горящие боевые корабли на подступах к Ориону. " +
            "Я видел Си-лучи... мерцающие во тьме близ врат Тангейзера. " +
            "И все эти мгновения исчезнут во времени как слёзы под дождём. Пора умирать.";


    String str9 = "Ветер с моря дул, ветер с моря дул" +
            "    Нагонял беду, нагонял беду" +
            "    И сказал ты мне, и сказал ты мне" +
            "    Больше не приду, больше не приду" +
            "    Видно не судьба, видно не судьба" +
            "    Видно нет любви, видно нет любви" +
            "    Видно надо мной, видно надо мной" +
            "    Посмеялся ты, посмеялся ты" +
            "    Я тебя люблю, я тебя люблю" +
            "    Честно говорю, честно говорю" +
            "    Ведь ты знаешь сам, ведь ты знаешь сам" +
            "    Как тебя я жду, как тебя я жду" +
            "    Видно не судьба, видно не судьба" +
            "    Видно нет любви, видно нет любви" +
            "    Видно надо мной, видно надо мной" +
            "    Посмеялся ты, посмеялся ты" +
            "    Видно не судьба, видно не судьба" +
            "    Видно нет любви, видно нет любви" +
            "    Видно надо мной, видно надо мной" +
            "    Посмеялся ты, посмеялся ты" +
            "    Времена пройдут, времена пройдут" +
            "    Годы пролетят, годы пролетят" +
            "    Первую любовь, первую любовь" +
            "    Не вернёшь назад, не вернёшь назад" +
            "    Видно не судьба,…";


    String str10 = "На шагающих утят быть похожими хотят,\n" +
            "Быть похожими хотят не зря, не зря.\n" +
            "Можно хвостик отряхнуть и пуститься в дальний путь\n" +
            "И пуститься в дальний путь, крича \"кря-кря\".\n" +
            "И природа хороша, и погода хороша,\n" +
            "Нет, не зря поет душа, не зря, не зря.\n" +
            "Даже толстый бегемот, неуклюжий бегемот\n" +
            "От утят не отстает, кряхтит \"кря-кря\"\n" +
            "\n" +
            "На мгновенье надо\n" +
            "Детство возвратить.\n" +
            "Мы теперь утята,\n" +
            "И так прекрасно\n" +
            "На свете жить.\n" +
            "\n" +
            "На веселых на утят быть похожими хотят,\n" +
            "Быть похожими хотят не зря, не зря.\n" +
            "Даже бабушка и дед, сбросив восемьдесят лет,\n" +
            "За утятами вослед кричат \"кря-кря\".\n" +
            "Вместе солнце, речка, дом кружат в танце озорном,\n" +
            "Кружат в танце озорном не зря, не зря.\n" +
            "Неуклюжий бегемот, ничего не разберет,\n" +
            "Но старательно поет \"кря-кря-кря-кря\".\n" +
            "\n" +
            "На мгновенье надо\n" +
            "Детство возвратить.\n" +
            "Мы теперь утята,\n" +
            "И так прекрасно\n" +
            "На свете жить.\n" +
            "\n" +
            "На танцующих утят быть похожими хотят,\n" +
            "Быть похожими хотят не зря, не зря.\n" +
            "Повторяйте все за мной, все фигуры до одной,\n" +
            "Все фигуры до одной, кря-кря-кря-кря.\n" +
            "Легче танца в мире нет, лучше танца в мире нет,\n" +
            "Вам раскрыт его секрет не зря, не зря.\n" +
            "Посмотрите, бегемот, неуклюжий бегемот,\n" +
            "Вот танцует, вот дает! кря-кря-кря-кря.\n" +
            "\n" +
            "На мгновенье надо\n" +
            "Детство возвратить.\n" +
            "Мы теперь утята,\n" +
            "И так прекрасно\n" +
            "На свете жить.";
}


