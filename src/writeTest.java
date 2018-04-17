import java.io.FileWriter;
import java.io.IOException;

public class writeTest {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("E:\\hello.txt");
            for (int i = 0; i <= 100; i++) {
                fw.write("欢迎使用Java");
                fw.write("\r\n");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
