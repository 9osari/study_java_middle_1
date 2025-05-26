package nasted.nasted;

public class NestedOuterMain {
    public static void main(String[] args) {
        NestedOuter.Nested nested = new NestedOuter.Nested(); //정적 중첩 클래스 생성
        nested.print();

        System.out.println("nestedClass = " + nested.getClass());
    }
}
