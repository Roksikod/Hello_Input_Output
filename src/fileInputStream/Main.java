package fileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {

        File directory = new File("folder");
        directory.mkdir();
        File file = new File(directory,"file.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (InputStream inputStream = new FileInputStream(file)) {
            int a = inputStream.read();
            while (a!= -1){
                System.out.print((char)a);
                a = inputStream.read();
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
