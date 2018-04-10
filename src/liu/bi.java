package liu;

import java.io.*;

public class bi {
    public static void main(String[] args) {
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\Java\\src\\liu\\file\\a.txt"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\Java\\src\\liu\\file\\b.txt"));
            int len;
            while ((len = bis.read())!=-1){
                bos.write(len);
            }
            bis.close();
            bos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
