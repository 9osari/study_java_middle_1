package exception.ex1;

public class NetworkServiceV1_2 {

    public void sendMessage(String data) {
        String address = "http://example.com";

        //NerworkClientV0을 생성하고 외부 서버 주소 전달
        NerworkClientV1 client = new NerworkClientV1(address);
        client.initError(data);

        String connectResult = client.connect();
        if(isError(connectResult)) { //결과가 성공이 아님 -> 에러
            System.out.println("[NETWORK ERROR] " + connectResult);
            return;
        }

        String sendResult = client.send(data);
        if(isError(sendResult)) {
            System.out.println("[NETWORK ERROR] " + sendResult);
            return;
        }

        client.disconnect();
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}
