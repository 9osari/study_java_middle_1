package lang.String.test;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int extIndex = str.indexOf(ext);
        String filename = str.substring(0, extIndex);
        String extname = str.substring(extIndex);

        System.out.println(filename);
        System.out.println(extname);
    }
}
