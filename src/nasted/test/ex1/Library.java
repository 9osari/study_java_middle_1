package nasted.test.ex1;

import java.util.ArrayList;

public class Library {

    //객체 배열을 사용해야하는데..
    private Book[] books;
    private int booksCount;

    public Library(int size) {
        books = new Book[size]; //배열 생성
        booksCount = 0;
    }

    public void addBook(String title, String author) {
        if (booksCount < books.length) {
            books[booksCount++] = new Book(title, author); //책을 넣음
        } else {
            System.out.println("Library overflow");
        }
    }

    public void showBook() {
        System.out.println("=== books ===");
        for (int i = 0; i < booksCount; i++) {
            System.out.println("Title: " + books[i].title + " Author: " + books[i].author);
        }
    }

    //Book 클래스는 Library 내부에서만 사용 외부노출 불가
    private static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }


}
