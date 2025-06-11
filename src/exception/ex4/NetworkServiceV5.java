package exception.ex4;


public class NetworkServiceV5 {

    public void sendMessage(String data) {
        String address = "http://example.com";

        //try가 끝나면 close 자동 호출
        try(NetworkClientV5 client = new NetworkClientV5(address)) {
            client.initError(data);
            client.connect(); //여기서 터져도 close가 먼저 실행되어 자원적으로 이득 가독성도 좋아짐
            client.send(data);
        } catch (Exception e) {
            System.out.println("예외 확인: " + e.getMessage());
            throw e;
        }

    }
}
