package bookinfo;

import java.io.*;

class FileUtil {
    static void saveBooks(Books books) {
        String name = "book.txt";
        InputStream is;
        try {
            is = new FileInputStream(name);//尝试读一下文件，没有读到抛出FileNotFoundException
            is.close();
            createFile(name, true, books);

        } catch (FileNotFoundException e) {
            //没有读到文件，添加label头
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
                //这里加入对文件末尾的判断，已存在信息则进行覆写，防止无限追加信息

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

            String str1 = sb.toString();//将StringBuilder转换为String
            byte[] b = str1.getBytes();//写入单个字节

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
                if (str.substring(0,4).equals("1005")) {//防止修改价格后读取不到对应字节
                    System.out.println("文件似乎被写过了");
                    bufferedReader.close();
                    return true;
                }
            }
            bufferedReader.close();
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
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("未读取到表头");
        return false;
    }
    //尝试合并isWrittenLast与isWrittenHead
}
