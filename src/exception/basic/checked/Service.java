package exception.basic.checked;

public class Service {
    Client client = new Client();

    /**
     * 나 처리 할 수 있어
     * 예외를 잡아서 처리함.
     */
    public void callCatch() {
        try{
            client.call();
        } catch (MyCHeckedException e) { //MyCHeckedException 은 Exception 의 자식이니 Exception 사용 가능
            //예외 처리 로직
            System.out.println("예외처리, message = " + e.getMessage());
        }
        System.out.println("정상 흐름~~~~");
    }


    /**
     * 나 처리 못하겠는데?
     * 체크 예외를 밖으로 던지는 코드
     * 체크 예외는 예외를 잡지 않고 밖으로 던지려면 throws 예외를 메서드에 필수로 선언해야한다.
     */
    public void callThrow() throws MyCHeckedException {
        client.call();
    }
}
