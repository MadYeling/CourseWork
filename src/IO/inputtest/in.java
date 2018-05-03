package IO.inputtest;

import java.io.*;

public class in {
    public static void main(String[] args) {
        int b;
        int c = 3;
        String d="";
        StringBuilder result = new StringBuilder();

        try {
            FileInputStream fis = new FileInputStream("E:\\Java\\src\\IO.inputtest\\in\\ads.txt");

            while ((b = fis.read()) != -1) {
                c++;
                d+=b;
//                System.out.println(b);
                if ((c % 3) == 0) {
                    int a = Integer.parseInt(d);
                    System.out.println(a);
                    d = "";
                }


            }
            fis.close();

            InputStreamReader reader = new InputStreamReader(new FileInputStream("E:\\Java\\src\\IO.inputtest\\in\\ads.txt"), "UTF-8");
            BufferedReader br = new BufferedReader(reader);
            String s;
            while ((s = br.readLine()) != null) {
                result.append(s);
            }
            System.out.println();
            System.out.println(result);
            reader.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
