package HomeworkCollections.Files;
import HomeworkCollections.NotDirectoryOrFileExecption;
import HomeworkCollections.RegExSearch;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class MethodsForFile {
    public File FindFolder (Scanner direcory) throws NotDirectoryOrFileExecption {
        System.out.println("Введите адрес папки, из которой будут считываться текстовые файлы ");
        String s =direcory.nextLine();

        File dir = new File(s);
        if (dir.isDirectory()) {
            for (File item : dir.listFiles()) {
                System.out.println(item.getName() + "\t ");
            }
        } else {
            throw new NotDirectoryOrFileExecption("Введенный адрес не является папкой");
        }
        return dir;
    }

    public File FindFile (Scanner direcory, File dir) throws NotDirectoryOrFileExecption {
        System.out.println("\n" + "Введите название файла, который хотите прочитать:");
        String book = direcory.nextLine();
        File FileBook = new File(String.valueOf(dir), book);
        if (!FileBook.isFile()) {
            throw new NotDirectoryOrFileExecption("Введенный адрес не является файлом");
        }
        else return FileBook;
    }


    public String FileToString (File FileBook) {
        String Stringbook = null;

        try {
            Stringbook = Files.readString(Path.of(String.valueOf(FileBook)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Stringbook;
    }

    public void FindWordAndWriteToFile(Scanner direcory, String Stringbook, File FileBook) throws IOException {
        FileWriter nFile = new FileWriter("result.txt");
        System.out.println("\n" + "Введите слово, которое вы хотите найти в файле :");
        RegExSearch RegExSearch = new RegExSearch();
        String wordToFind = null;
        do {
            wordToFind = direcory.nextLine();
            Long finded = RegExSearch.search(Stringbook, wordToFind);
            nFile.write("\n" + FileBook.getName() + "-" + wordToFind + "-" + finded);

        }
        while (!wordToFind.equals("exit"));

        nFile.close();
    }
}
