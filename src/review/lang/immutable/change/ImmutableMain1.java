package review.lang.immutable.change;

public class ImmutableMain1 {
    public static void main(String[] args) {

        ImmutableObj obj1 = new ImmutableObj(10);
        ImmutableObj obj2 = obj1.add(20);    //불변 유지

        System.out.println("obj1 = " + obj1.getValue());
        System.out.println("obj2 = " + obj2.getValue());

        //불변 객체를 설계할때 기존 값을 변경해야하는 메서드가 필요할 수 있는데
        //기존 객체의 값은 두고, 변경결과를 새로운 객체(x002)에 담아 반환 즉 기존 값(x001)은 유지

        obj2.add(30);
        System.out.println("obj2 = " + obj2.getValue());
        //변경 메서드들은 보통 새로운 객체로 만들어 반환!! 무조건 반환값을 받아야 한다!!!

    }
}
