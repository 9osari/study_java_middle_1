package exception.ex4.exception;


public class SendExceptionV4 extends NetworkClientExceptionV4 {
    //내부 전송을 시도한 sendData를 보관
    private final String sendData;

    public SendExceptionV4(String sendData, String message) {
        super(message);
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }
}
