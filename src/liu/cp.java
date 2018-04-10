package liu;

import java.io.*;

public class cp {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("E:\\aas.txt");
            FileWriter fw = new FileWriter("D:\\aas.txt");
            int len;
            while ((len = fr.read())!=-1){
                fw.write((char)len);
            }
            
            fw.flush();
            fw.close();
            fr.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
