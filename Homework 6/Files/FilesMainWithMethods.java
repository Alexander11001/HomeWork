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
        Scanner direcory = new Scanner(System.in);
        File dir = Methods.FindFolder(direcory);
        File FileBook = Methods.FindFile(direcory, dir);
        //для простоты теста введите "Через пищевод и в космос с тантрой, мантрой и крапчатыми колесами.txt";
        String Stringbook = Methods.FileToString(FileBook);
        FileWriter nFile = new FileWriter("result.txt");
        Methods.FindWordAndWriteToFile(direcory, Stringbook, FileBook);
        //для завершения программы - введите "exit"
        direcory.close();
    }
}



