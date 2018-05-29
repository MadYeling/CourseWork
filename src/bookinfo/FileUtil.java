package bookinfo;

import java.io.*;

class FileUtil {

    static void loadBooks() {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader("book.txt"));
            String str;
            Books[] books = new Books[5];
            int i = 0;

            while ((str = bufferedReader.readLine()) != null) {

                if (str.equals("图书编号,图书名称,图书版本,图书价格,销售额,")) {
                    continue;
                }

                String[] str1 = str.split(",");
                books[i] = new Books(Integer.parseInt(str1[0]), str1[1], str1[2], Float.parseFloat(str1[3]), Integer.parseInt(str1[4]));
                i++;
            }

//            for (int j = 0; j < 5; j++)
//                System.out.println(books[j]);

            books[2].setPrice(books[2].getPrice() + 20);
            books[3].setPrice(books[3].getPrice() + 30);

            for (int j = 0; j < 5; j++) {
//                System.out.println(books[j]);
                saveBooks(books[j]);
            }
            System.out.println("完成了涨价");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void saveBooks(Books books) {
        String name = "book.txt";
        InputStream is;
        try {
            is = new FileInputStream(name);//尝试读一下文件，没有读到抛出FileNotFoundException
            is.close();
            createFile(name, true, books);

        } catch (FileNotFoundException e) {
            //没有读到文件，需要添加表头
            createFile(name, false, books);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createFile(String name, Boolean isLabel, Books books) {
        BufferedOutputStream out = null;
        StringBuilder sb = new StringBuilder();

        try {
            if (isLabel & !(isWrittenLast(name) | !isWrittenHead(name))) {
                //这里对文件开头与末尾进行判断，已存在信息则进行覆写，防止无限追加信息，开头无表头则追加表头。

                out = new BufferedOutputStream(new FileOutputStream(name, true));//参数true代表每次输入属于追加信息

            } else {

                out = new BufferedOutputStream(new FileOutputStream(name));
                String[] filedSort = new String[]{"图书编号", "图书名称", "图书版本", "图书价格", "销售额"};

                for (String filedKey : filedSort) {//每个字段后面加","
                    sb.append(filedKey).append(",");
                }

                System.out.println("加入了一个表头");

            }

            sb.append("\r\n");//换行
            sb.append(books.getNumber()).append(",");//图书编号
            sb.append(books.getName()).append(",");//图书名称
            sb.append(books.getVersion()).append(",");//图书版本
            sb.append(books.getPrice()).append(",");//图书价格
            sb.append(books.getSales()).append(",");//销量
            System.out.println("追加了一些信息");

            String str1 = sb.toString();
            byte[] b = str1.getBytes();

            for (byte aB : b) {//遍历字节
                out.write(aB);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {//无论是否出错都关闭out流
            try {
                if (out != null)
                    out.close();

            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }

    }

    private static boolean isWrittenLast(String name) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(name));
            String str;
            while ((str = bufferedReader.readLine()) != null) {

                if (!str.isEmpty()) {//防止读取到空行出现错误
                    if (str.substring(0, 4).equals("1005")) {//防止修改价格后读取不到对应字节
                        System.out.println("文件似乎被写过了");
                        bufferedReader.close();
                        return true;
                    }
                }

            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("未读取到文件");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }

    private static boolean isWrittenHead(String name) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(name));
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                if (str.equals("图书编号,图书名称,图书版本,图书价格,销售额,")) {
                    bufferedReader.close();
                    return true;
                }
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("未读取到文件");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("未读取到表头");
        return false;
    }
}
