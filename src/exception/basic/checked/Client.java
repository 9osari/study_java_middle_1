package exception.basic.checked;

public class Client {
    public void call() throws MyCHeckedException {
        //문제 발생
        throw new MyCHeckedException("ex");
    }
}
