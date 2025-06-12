package review.lang.immutable.address;

public class RefMain1_2 {
    public static void main(String[] args) {
        Address a = new Address("서울");
        Address b = new Address("부산");  //a와 b가 서로다른 인스턴스 참조

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("b 를 부산으로 변경");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //참조형 변수는 참조값을 통해 같은 객체(인스턴스)를 공유
    }
}
