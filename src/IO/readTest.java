package IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readTest {
    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("E:\\hello.txt");
            BufferedReader br = new BufferedReader(fr);
            String str;
            while ((str = br.readLine()) != null)
                System.out.println(str);
            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
