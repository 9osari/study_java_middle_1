package exception.ex2;

public class NerworkClientExceptionV2 extends Exception {

    private String errorCode;

    public NerworkClientExceptionV2(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
