package nasted.local;

public class LocalOuterV3 {
    private int outInstanceVar = 3;

    public Printer process(int paramVar) {
        int localVar = 1;   //지역 변수는 스택 프레임이 종료되는 순간 함께 제거된다.

        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value); // 자신의 인스턴스 변수

                //인스턴스는 지역 변수보다 더 오래 살아남는다.
                System.out.println("localVar = " + localVar); // 지역변수
                System.out.println("paramVar = " + paramVar); // 매개변수
                System.out.println("outInstanceVar = " + outInstanceVar); // 바깥 클래스의 인스턴스 맴버
            }
        }
        LocalPrinter printer = new LocalPrinter();
        //printer.print() 를 여기서 실행하지 않고 Printer 인스턴스만 반환
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuter = new LocalOuterV3();
        Printer printer = localOuter.process(2);
        //printer.print() 를 나중에실행 process()의 스택 프레임이 사라진 이후에 실행
        printer.print();
    }
}
