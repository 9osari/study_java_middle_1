package lang.immutable.change;

public class MutableMain {
    public static void main(String[] args) {
        Mutableobj obj = new Mutableobj(10);
        obj.add(20);
        //계산 이후의 기존 값은 사라짐
        System.out.println("obj = " + obj.getValue());
    }
}
