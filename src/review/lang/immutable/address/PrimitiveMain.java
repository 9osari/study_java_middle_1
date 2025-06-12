package review.lang.immutable.address;

//기본형 예제
public class PrimitiveMain {
    public static void main(String[] args) {
        //기본형은 같은 값을 절대 공유 안함
        int a = 10;
        int b = a;  //a에 b값 복사 후 대입
        //메모리 상에 a에 속하는 10과 b에 속하는 10 각각 따로 존재
        //자바는 항상 값을 복사해 대입.

        System.out.println("a = " + a); //10
        System.out.println("b = " + b); //10

        b = 20; //b의 값만 20으로 변경 a의 값은 유지
        System.out.println("b => 20");
        System.out.println("a = " + a); //10
        System.out.println("b = " + b); //20
    }
}
