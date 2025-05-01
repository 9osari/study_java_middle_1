package lang.immutable.test;

public class ImmutableMyDateMain {
    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2025,1,1);
        System.out.println("date1 : " + date1);

        ImmutableMyDate date2 = date1.withYear(2077);
        System.out.println("date2 : " + date2);


    }
}
