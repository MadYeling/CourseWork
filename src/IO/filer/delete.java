package IO.filer;

import java.io.File;

public class delete {
    public static void main(String[] args) {
        File file = new File("E:\\deletetest\\test");
//        System.out.println(file.mkdir());
        System.out.println(file.delete());
        deleteDir(file);
    }

    private static void deleteDir(File dir) {
        if (dir.exists()) {
            File[] files = dir.listFiles();

            for (File file : files) {
                if (file.isDirectory()) {
                    deleteDir(file);    //递归
                } else {
                    System.out.println(file.delete());
                }
            }
            System.out.println(dir.delete());
        }

    }

}
