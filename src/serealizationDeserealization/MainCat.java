package serealizationDeserealization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainCat {
    public static void main(String[] args) {
        File file = new File("cats.txt");
//
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            List<Cat> cats = (List<Cat>) objectInputStream.readObject();
            for (Cat cat : cats) {
                System.out.println(cat.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
