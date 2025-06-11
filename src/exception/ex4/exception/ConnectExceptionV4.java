package exception.ex4.exception;


public class ConnectExceptionV4 extends NetworkClientExceptionV4 {
    //내부 연결을 시도한 address 보관
    private final String address;

    public ConnectExceptionV4(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
