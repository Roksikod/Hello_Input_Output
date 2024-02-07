package reader_writer_randomAccessFile;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File directory = new File("folder");
        File file = new File(directory, "file.txt");
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter next page or \"stop\" to exit");
            byte[] pageText = new byte[3000];
            String input = scanner.nextLine();
            while (!input.equals("stop")) {
                int page = Integer.parseInt(input);
                randomAccessFile.seek(pageText.length * (page - 1));
                int count = randomAccessFile.read(pageText); // читаем данные
                System.out.println(new String(pageText, 0, count));
                System.out.println("Enter next page or \"stop\" to exit");
                input = scanner.nextLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
