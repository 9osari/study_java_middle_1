package lang.String;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "hello";
        String b = " world";

        String result1 = a.concat(b);
        String result2 = a + b;
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
