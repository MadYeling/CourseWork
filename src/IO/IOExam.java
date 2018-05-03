package IO;

import java.io.*;

public class IOExam {
    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("C:\\Users\\admin\\Desktop\\abc.txt");
            int a, b = 0, c = 0;

            while ((a = fr.read()) != -1) {
                if (a == 97)
                    b++;
                if (a == 65)
                    c++;
            }
            fr.close();

            System.out.println("字母a出现的次数为" + b);
            System.out.println("字母A出现的次数为" + c);

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();

        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Desktop\\abc.txt");
            int a, b = 0, c = 0;

            while ((a = fis.read()) != -1) {
                char d = (char) a;
                String e = d + "";

                if (e.equals("a"))
                    b++;
                if (e.equals("A"))
                    c++;

            }
            fis.close();

            System.out.println("字母a出现的次数为" + b);
            System.out.println("字母A出现的次数为" + c);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
