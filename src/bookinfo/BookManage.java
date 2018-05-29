package bookinfo;

import java.util.ArrayList;
import java.util.Scanner;

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

    private static Books getBooks(int bookID) {
        for (Books thisBooks : bookList) {
            if (bookID == thisBooks.getNumber()) {
                return thisBooks;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        init();

//        for (Books aBookList : bookList)
//            System.out.println(aBookList);

        Scanner sc = new Scanner(System.in);
        int bookID = sc.nextInt();

        Books stockBooks = getBooks(bookID);
        if (stockBooks!=null){
            System.out.println(stockBooks);
        }
    }
}
