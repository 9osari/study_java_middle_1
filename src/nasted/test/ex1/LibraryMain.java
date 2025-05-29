package nasted.test.ex1;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library(4); // 최대 4권의 도서를 저장할 수 있는 도서관 생성

        library.addBook("책1", "저자1");
        library.addBook("책2", "저자2");
        library.addBook("책3", "저자3");
        library.addBook("자바 ORM 표준", "김영한");
        library.addBook("자바의 정석", "ㅇㅇㅇ");
        library.showBook(); //모든 도서 출력
    }
}
