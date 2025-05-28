package nasted.AnonymousOuter;

import nasted.local.Printer;

public class AnonymusOuter {
    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;   //지역 변수

        //익명 클래스는 클래스의 본문의 정의하며 생성
        //printer를 구현 하며 바로 생성
        Printer printer = new Printer() {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value); // 자신의 인스턴스 변수
                System.out.println("localVar = " + localVar); // 지역변수
                System.out.println("paramVar = " + paramVar); // 매개변수
                System.out.println("outInstanceVar = " + outInstanceVar); // 바깥 클래스의 인스턴스 맴버
            }
        };

        printer.print();
        System.out.println("printer.class" + printer.getClass());
    }

    public static void main(String[] args) {
        AnonymusOuter main = new AnonymusOuter();
        main.process(2);
    }
}
