package nasted.test;

public class OuterClass2Main {
    public static void main(String[] args) {
        //InnerClass Hello() 호출
        OuterClass2 outerClass2 = new OuterClass2();
        OuterClass2.InnerClass innerClass = outerClass2.new InnerClass();
        innerClass.hello();
    }
}
