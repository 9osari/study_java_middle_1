package exception.ex4;


import exception.ex4.exception.ConnectExceptionV4;
import exception.ex4.exception.SendExceptionV4;

public class NetworkClientV4 {
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV4(String address) {
        this.address = address;
    }

    public void connect() {
        if(connectError) {
            //오류 코드를 리턴하는게 아닌 예외를 던짐
            throw new ConnectExceptionV4(address,address + "서버 연결 실패");
        }
        //연결 성공
        System.out.println(address + " 서버 연결 성공!!");
    }

    public void send(String data) {
        if(sendError) {
            //오류 코드를 리턴하는게 아닌 예외를 던짐
            throw new SendExceptionV4(data,address + "서버 연결 실패");
        }
        //전송 성공
        System.out.println(address + " 서버에 데이터 전송: " + data);
    }

    public void disconnect() {
        System.out.println(address + " 서버 연결 해제!!");
    }


    public void initError(String data) {
        if(data.contains("error1")) {
            connectError = true;
        }
        if(data.contains("error2")) {
            sendError = true;
        }
    }
}
