package filer;

import java.io.File;
import java.io.FilenameFilter;

public class xl1 {
    public static void main(String[] args) {

        File file = new File("E:\\");

        if (file.isDirectory()) {
            String[] names = file.list();

            if (names != null) {

                for (String name : names) {
                    System.out.println(name);
                }

            }

        }

    }
}
