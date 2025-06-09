package exception.basic.checked;


/**
 * Exception을 상속받은 예외는 체크 예외가 된다.
 */
public class MyCHeckedException extends Exception {
    public MyCHeckedException(String message) {
        super(message);
    }
}
