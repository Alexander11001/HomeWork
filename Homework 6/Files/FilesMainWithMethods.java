package HomeworkCollections.Files;

import HomeworkCollections.NotDirectoryOrFileExecption;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FilesMainWithMethods {
    public static void main(String[] args) throws NotDirectoryOrFileExecption, IOException {

        MethodsForFile Methods = new MethodsForFile();
        //для простоты теста введите "G:\\Роберт Шекли"
        Scanner directory = new Scanner(System.in);
        File dir = Methods.FindFolder(directory);
        File FileBook = Methods.FindFile(directory, dir); //не все файлы в папке в формате UTF-8
        //для простоты теста введите "Через пищевод и в космос с тантрой, мантрой и крапчатыми колесами.txt";
        String Stringbook = Methods.FileToString(FileBook);
        Methods.FindWordAndWriteToFileWithTreads(directory, Stringbook, FileBook); //с пулом потоков, через Executors
//        Methods.FindWordAndWriteToFile(directory, Stringbook, FileBook); //без потоков
        //для завершения программы - введите "exit"
        directory.close();
    }
}



