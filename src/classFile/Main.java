package classFile;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File directory = new File("folder1/folder2/folder3");
        File file1 = new File("folder1/folder2/folder3/Afile1.txt");
        File file2 = new File("folder1/folder2/folder3/file2.txt");
        File file3 = new File("folder1/folder2/folder3/file3.txt");
        try {
            directory.mkdirs();
            file1.createNewFile();
            file2.createNewFile();
            file3.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        File[] files = directory.listFiles((dir, name) -> name.startsWith("A"));

        for (File f : files) {
            System.out.println(f.getAbsolutePath());
        }

    }
}
