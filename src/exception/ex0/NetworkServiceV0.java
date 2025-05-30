package exception.ex0;

public class NetworkServiceV0 {

    public void sendMessage(String data) {
        String address = "http://example.com";

        //NerworkClientV0을 생성하고 외부 서버 주소 전달
        NerworkClientV0 client = new NerworkClientV0(address);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
