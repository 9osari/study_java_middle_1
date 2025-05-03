package lang.String.method;

public class StringChangMain1 {
    public static void main(String[] args) {
        String str = "Hello Java! Welcome to Java!";

        System.out.println("인덱스 7부터 부분 문자열: " + str.substring(7));
        System.out.println("인덱스 7부터 12까지의 부분 문자열: " + str.substring(7,12));
        System.out.println("문자열 결합: " + str.concat("!!!"));
        System.out.println("'Java'를 'Hello'로 대체: " + str.replace("Java", "Hello"));
        System.out.println("첫 번째 'Java'를 'World'로 대체: " + str.replace("Java", "World"));
    }
}
