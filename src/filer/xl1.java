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

        File file1 = new File("E:\\");
        String[] filenameFilter = file1.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir, name).isFile() && name.endsWith(".txt");
            }
        });
        System.out.println("\n以下是后缀为.txt的文件：");
        for (String name : filenameFilter)
        System.out.println(name);

    }
}
