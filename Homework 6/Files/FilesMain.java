package HomeworkCollections.Files;

import HomeworkCollections.NotDirectoryOrFileExecption;
import HomeworkCollections.RegExSearch;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FilesMain {
    public static void main(String[] args) throws NotDirectoryOrFileExecption, IOException {

// При запуске программы пользователь должен передать адрес папки,
// из которой мы будет считывать текстовые файлы. Наполнить данную директорию книгами, 100 книг мнинимум.
        Scanner direcory = new Scanner(System.in);

        System.out.println("Введите адрес папки, из которой будут считываться текстовые файлы ");
        String s = direcory.nextLine();
//        String s = "G:\\Роберт Шекли";
        File dir = new File(s);

// При запуске пользователю в консоль выдать список txt файлов и предложить выбрать текст,
// с которым мы будем работать.
        if (dir.isDirectory()) {
            for (File item : dir.listFiles()) {
                System.out.println(item.getName() + "\t ");
            }
        } else {
            throw new NotDirectoryOrFileExecption("Введенный адрес не является папкой");
        }

        System.out.println("\n" + "Введите название файла, который хотите прочитать:");
        String book = direcory.nextLine();
//        String book = "Через пищевод и в космос с тантрой, мантрой и крапчатыми колесами.txt";
        File FileBook = new File(String.valueOf(dir), book);
        System.out.println(FileBook.isFile());


        String Stringbook = null;
        if (FileBook.isFile()) {
            try {
                Stringbook = Files.readString(Path.of(String.valueOf(FileBook)));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            throw new NotDirectoryOrFileExecption("Введенный адрес не является файлом");
        }

        FileWriter nFile = new FileWriter("result.txt");
//Пользователь, выбрав текст вводит то, что он хочет найти в этом тексте.
//// После каждого ввода осуществляется поиск
// Вводит пока не надоест.
// Результат всех его поисков должен накапливаться в файла result.txt в формате «Имя файла – слово – количество»

        System.out.println("\n" + "Введите слово, которое вы хотите найти в файле :");
        String wordToFind =direcory.nextLine();
//        String wordToFind = "галлюцинации";
        RegExSearch RegExSearch = new RegExSearch();

        do {
            wordToFind = direcory.nextLine();
            Long finded = RegExSearch.search(Stringbook, wordToFind);
            nFile.write("\n" + FileBook.getName() + "-" + wordToFind + "-" + finded);

        }
        while (!wordToFind.equals("exit"));

        nFile.close();
        direcory.close();
    }

}

