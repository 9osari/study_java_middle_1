package nasted.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter(); //x001
        InnerOuter.Inner inner = outer.new Inner(); //x001 의 내부에다 inner를 만든다
        inner.print(); //그래서 바깥 인스턴스 접근 가능

        System.out.println(inner.getClass());
    }
}
