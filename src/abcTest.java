import java.io.*;

public class abcTest {
    public static void main(String[] args) {
        boolean ifWrite = true;
        String str2 = "我很喜欢java！！！";

        try {
            FileReader fileReader = new FileReader("C:\\Users\\admin\\Desktop\\abc.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String str;
            StringBuilder str1 = new StringBuilder();

            while ((str = bufferedReader.readLine()) != null) {
                str1.append(str);
                if (str.equals(str2)) {
                    ifWrite = false;
                    break;
                }
                System.out.println(str);
            }

            bufferedReader.close();
            fileReader.close();

            if (ifWrite) {
                FileWriter fileWriter = new FileWriter("C:\\Users\\admin\\Desktop\\abc.txt");
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                bufferedWriter.write(str1.toString());
                bufferedWriter.newLine();
                bufferedWriter.write(str2);

                bufferedWriter.flush();
                bufferedWriter.close();
                fileWriter.close();
                System.out.println("已将语句 " + str2 + " 写入文件");
            } else {
                System.out.println("文件末尾已存在语句: " + str2);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
