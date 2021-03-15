package HomeworkCollections.Files;
import HomeworkCollections.NotDirectoryOrFileExecption;
import HomeworkCollections.RegExSearch;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MethodsForFile {
    public File FindFolder (Scanner directory) throws NotDirectoryOrFileExecption {
        System.out.println("Введите адрес папки, из которой будут считываться текстовые файлы ");
        String s =directory.nextLine();

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

    public File FindFile (Scanner directory, File dir) throws NotDirectoryOrFileExecption {
        System.out.println("\n" + "Введите название файла, который хотите прочитать:");
        String book = directory.nextLine();
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

    public void FindWordAndWriteToFile(Scanner directory, String Stringbook, File FileBook) throws IOException {
        FileWriter nFile = new FileWriter("result.txt");
        System.out.println("\n" + "Введите слово, которое вы хотите найти в файле :");
        RegExSearch RegExSearch = new RegExSearch();
        String wordToFind = null;
        do {
            wordToFind = directory.nextLine();
            Long finded = RegExSearch.search(Stringbook, wordToFind);
            nFile.write("\n" + FileBook.getName() + "-" + wordToFind + "-" + finded);
        }
        while (!wordToFind.equals("exit"));
        nFile.close();
    }

    public void FindWordAndWriteToFileWithTreads(Scanner directory, String Stringbook, File FileBook) throws IOException {
        FileWriter nFile = new FileWriter("result.txt");
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        System.out.println("\n" + "Введите слово, которое вы хотите найти в файле :");
        RegExSearch RegExSearch = new RegExSearch();
        String wordToFind;
        do {
            wordToFind = directory.nextLine();
            if(!wordToFind.equals("exit")) {
                executorService.submit(new MyRunnableThread(wordToFind, Stringbook, FileBook, nFile, RegExSearch));
            }
        }
        while (!wordToFind.equals("exit"));
        nFile.close();
        executorService.shutdown();
    }

    class MyRunnableThread implements Runnable  {
        FileWriter nFile;
        String Stringbook;
        File FileBook;
        RegExSearch RegExSearch;
        String wordToFind;

        public MyRunnableThread(String wordToFind, String Stringbook, File FileBook, FileWriter nFile, RegExSearch RegExSearch ) {
            this.wordToFind = wordToFind;
            this.Stringbook = Stringbook;
            this.FileBook= FileBook;
            this.nFile = nFile;
            this.RegExSearch = RegExSearch;
        }
        @Override
        public void run( ) {
//           System.out.println("Start Runnable " + Thread.currentThread().getId());
            Long finded = RegExSearch.search(Stringbook, wordToFind);
            try {
                nFile.write("\n" + FileBook.getName() + "-" + wordToFind + "-" + finded);
            } catch (IOException e) {
                e.printStackTrace();
            }
//            System.out.println("Finish Runnable " + Thread.currentThread().getId());
        }
    }
}

