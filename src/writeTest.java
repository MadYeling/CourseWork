import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class writeTest {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("E:\\hello.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i <= 100; i++) {
//                fw.write("欢迎使用Java");
//                fw.write("\r\n");
                bw.write("欢迎使用Java");
                bw.newLine();
            }
            bw.flush();
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
