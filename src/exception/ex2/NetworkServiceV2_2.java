package exception.ex2;


public class NetworkServiceV2_2 {

    public void sendMessage(String data) {
        String address = "http://example.com";

        //NerworkClientV0을 생성하고 외부 서버 주소 전달
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
        } catch (NerworkClientExceptionV2 e) {
            System.out.println("[ERROR] " + e.getErrorCode() + " / [MESSAGE] " + e.getMessage());
            return;
        }
        try {
            client.send(data);
        } catch (NerworkClientExceptionV2 e) {
            System.out.println("[ERROR] " + e.getErrorCode() + " / [MESSAGE] " + e.getMessage());
            return;
        }
        client.disconnect();
    }
}
