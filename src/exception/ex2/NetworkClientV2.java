package exception.ex2;

public class NetworkClientV2 {
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV2(String address) {
        this.address = address;
    }

    public void connect() throws NerworkClientExceptionV2 {
        if(connectError) {
            //오류 코드를 리턴하는게 아닌 예외를 던짐
            throw new NerworkClientExceptionV2("connectError",address + "서버 연결 실패");
        }

        //연결 성공
        System.out.println(address + " 서버 연결 성공!!");
    }

    public void send(String data) throws NerworkClientExceptionV2 {
        if(sendError) {
            //오류 코드를 리턴하는게 아닌 예외를 던짐
            throw new NerworkClientExceptionV2("sendError",address + "서버 연결 실패");
            //중간에 다른 예외가 발생했다고 가정
            //throw new RuntimeException("ex");
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
