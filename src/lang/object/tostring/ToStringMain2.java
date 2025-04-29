package lang.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("Model Y");
        Dog dog = new Dog("멍1",2);
        Dog dog2 = new Dog("멍2",5);


        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString()); //toString 오버라이딩 안함 기본정보 출력
        System.out.println(dog.toString());
        System.out.println(dog2.toString());

        System.out.println("2. println 내부에서 toString 호출");
        System.out.println(car);
        System.out.println(dog);
        System.out.println(dog2);

        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog);
        ObjectPrinter.print(dog2);

        String refValue = Integer.toHexString(System.identityHashCode(dog));
        String refValue2 = Integer.toHexString(System.identityHashCode(dog2));
        System.out.println("refValue: = " + refValue);
        System.out.println("refValue2: = " + refValue2);
    }
}
