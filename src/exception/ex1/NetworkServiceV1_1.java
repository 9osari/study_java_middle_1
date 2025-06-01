package exception.ex1;

public class NetworkServiceV1_1 {

    public void sendMessage(String data) {
        String address = "http://example.com";

        //NerworkClientV0을 생성하고 외부 서버 주소 전달
        NerworkClientV1 client = new NerworkClientV1(address);
        client.initError(data);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
