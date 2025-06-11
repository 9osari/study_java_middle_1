package exception.ex4;


import exception.ex4.exception.SendExceptionV4;

import java.util.Scanner;

public class MainV5 {
    public static void main(String[] args) {
        NetworkServiceV5 networkService = new NetworkServiceV5();

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("전송 문자: ");
            String input = scanner.nextLine();
            if(input.equals("exit")){
                break;
            }
            try {
                networkService.sendMessage(input);
            } catch (Exception e) { //Exception은 모든 예외를 다 잡음
                exceptionHandler(e);
            }
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }



    //공통 예외 처리
    private static void exceptionHandler(Exception e) {
        System.out.println("ㅈㅅㅈㅅ 알 수 없는 오류! ㅋㅋㅋ");
        System.out.println("==개발자용 디버깅 메세지 출력==");
        e.printStackTrace(System.out);  //스택 트레이스 출력
        //e.printStackTrace();

        //공통 처리를 하지만 예외 별로 분류할 수 있음
        if(e instanceof SendExceptionV4 sendEx) { //전송 오류는 다르게 봐야겠어!
            System.out.println("[전송오류] 전송 데이터: " + sendEx.getSendData());
        }
    }
}
