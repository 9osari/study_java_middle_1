package review.exception.ex0;

import java.util.Scanner;

public class MainV0 {
    public static void main(String[] args) {
        NetworkServiceV0 networkService = new NetworkServiceV0();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 데이터: ");
            String inputData = scanner.nextLine();
            if(inputData.equals("exit")) {
                break;
            }
            //입력받은 데이터를 보냄
            networkService.sendMessage(inputData);
            System.out.println();
        }
        System.out.println("프로그램 정상 종료");
    }
}
