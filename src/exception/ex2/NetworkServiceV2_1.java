package exception.ex2;


public class NetworkServiceV2_1 {

    public void sendMessage(String data) throws NerworkClientExceptionV2 {
        String address = "http://example.com";

        //NerworkClientV0을 생성하고 외부 서버 주소 전달
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
