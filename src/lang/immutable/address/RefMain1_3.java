package lang.immutable.address;

public class RefMain1_3 {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("서울");
        Address b = a;       //a = x001 의 값을 복사 b도 x001 즉 같은 x001
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        change(b, "부산");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

    private static void change(Address address, String chagneAddress) {
        System.out.println("주소 값 변경 -> " + chagneAddress);
        address.setValue(chagneAddress);
    }
}
