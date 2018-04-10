package liu;

import java.io.FileWriter;
import java.io.IOException;

public class fw {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("E:\\Java\\src\\liu\\file\\c.txt");
            fw.write("从前有座灵剑山");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
