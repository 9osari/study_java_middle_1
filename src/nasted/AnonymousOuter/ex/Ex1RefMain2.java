package nasted.AnonymousOuter.ex;

import java.util.Random;

public class Ex1RefMain2 {
    public static void hello(Process process) {
        System.out.println("프로그램 시작");

        //여기서 받아야함
        process.run();

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        class Dice implements Process {
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6)+1;
                System.out.println("주사위 = "+randomValue);
            }
        }

        class Sum implements Process {
            @Override
            public void run() {
                for(int i =1; i<=3; i++) {
                    System.out.println("i = " + i);
                }
            }
        }
        Dice dice = new Dice();
        Sum sum = new Sum();
        System.out.println("hello 실행");
        hello(dice);
        hello(sum);
    }
}
