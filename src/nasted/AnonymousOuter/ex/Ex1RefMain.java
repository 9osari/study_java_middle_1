package nasted.AnonymousOuter.ex;

import java.util.Random;

public class Ex1RefMain {
    public static void hello(Process process) {
        System.out.println("프로그램 시작");

        //여기서 받아야함
        process.run();

        System.out.println("프로그램 종료");
    }


    static class Dice implements Process {
        @Override
        public void run() {
            int randomValue = new Random().nextInt(6)+1;
            System.out.println("주사위 = "+randomValue);
        }
    }

    static class Sum implements Process {
        @Override
        public void run() {
            for(int i =1; i<=3; i++) {
                System.out.println("i = " + i);
            }
        }
    }

    public static void main(String[] args) {
        Dice dice = new Dice();
        Sum sum = new Sum();

        hello(dice);
        hello(sum);
    }
}
