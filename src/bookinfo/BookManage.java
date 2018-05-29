package bookinfo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BookManage {
    private static ArrayList<Books> bookList = new ArrayList<>();

    private static void init() {
        Books books1 = new Books(1001, "Java程序设计", "第2版", 56.9f, 560);
        Books books2 = new Books(1002, "Java开发实践", "第1版", 98.9f, 820);
        Books books3 = new Books(1003, "C++程序设计指南", "第3版", 62.5f, 362);
        Books books4 = new Books(1004, "EJB3.0入门经典", "第1版", 59.8f, 1280);
        Books books5 = new Books(1005, "Spring3.0 in Action", "第3版", 95.8f, 1189);

        bookList.add(books1);
        bookList.add(books2);
        bookList.add(books3);
        bookList.add(books4);
        bookList.add(books5);
    }

    private static void Enter() throws IOException {//停顿
        System.out.println();
        System.out.println("按回车继续");
        new BufferedReader(new InputStreamReader(System.in)).readLine();
    }

    public static void main(String[] args) {
        init();

        for (Books aBookList : bookList)
            FileUtil.saveBooks(aBookList);

        try {//按回车继续
            Enter();
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileUtil.loadBooks();//读取图书并对第3本和第4本涨价然后重新写入book.txt

    }
}
