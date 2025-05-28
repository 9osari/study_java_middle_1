package nasted.test;

public class OuterClass1Main {
    public static void main(String[] args) {
        //여기서 호출
        OuterClass1.NestedClass nestedClass = new OuterClass1.NestedClass();
        nestedClass.hello();
    }
}
