package review.lang.immutable.address;

public class RefMain1_1 {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유한다.
        //즉, 참조형 변수는 같은 참조값(x001)을 통해 같은 인스턴스를 참조
        Address a = new Address("서울"); //새로운 객체 참조
        Address b = a;  //참조값(x001) 복사해 전달 (참조값의 공유를 막을 방법 X)

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("b 를 부산으로 변경");
        b.setValue("부산");
        System.out.println("a = " + a); //사이드 이펙트 발생 -> 특정부분 변경이 예기치 않게 다른 부분에 영향을 줌 (나는 b만 바꾸고 싶었는데?)
        System.out.println("b = " + b);

        //참조형 변수는 참조값을 통해 같은 객체(인스턴스)를 공유
    }
}
