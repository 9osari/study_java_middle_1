package review.lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a; //참조값 대입을 막을 수 없다
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("b -> 부산");
        //b.setValue("부산"); //컴파일 오류 발생 setValue 없어 변경 불가
        b = new ImmutableAddress("부산"); //신규 생성
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //final로 단순한 제약을 만들어 사이드 이펙트라는 큰 문제를 막음
        //불변객체의 값을 변경하고 싶으면 새로운 불변객체 생성
    }
}
