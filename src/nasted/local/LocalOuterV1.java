package nasted.local;

public class LocalOuterV1 {
    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;   //지역 변수

        class LocalPrinter {
            int value = 0;

            public void printData() {
                System.out.println("value = " + value); // 자신의 인스턴스 변수
                System.out.println("localVar = " + localVar); // 지역변수
                System.out.println("paramVar = " + paramVar); // 매개변수
                System.out.println("outInstanceVar = " + outInstanceVar); // 바깥 클래스의 인스턴스 맴버
            }
        }
        LocalPrinter printer = new LocalPrinter();
        printer.printData();
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuter = new LocalOuterV1();
        localOuter.process(2);
    }
}
