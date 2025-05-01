package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        ImmutableAdress a = new ImmutableAdress("서울");
        ImmutableAdress b = a;  //참조값 대입을 막을 방법은 없음
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //b.setValue("부산"); // 컴파일 오류 발생
        b = new ImmutableAdress("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
