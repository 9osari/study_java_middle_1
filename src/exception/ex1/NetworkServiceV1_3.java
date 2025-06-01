package exception.ex1;

public class NetworkServiceV1_3 {

    public void sendMessage(String data) {
        String address = "http://example.com";

        //NerworkClientV0을 생성하고 외부 서버 주소 전달
        NerworkClientV1 client = new NerworkClientV1(address);
        client.initError(data);

        String connectResult = client.connect();
        if(isError(connectResult)) { //결과가 성공이 아님 -> 에러
            System.out.println("[NETWORK ERROR] " + connectResult);
        } else {
            //disconnect()를 반드시 호출하게 끔 변경
            String sendResult = client.send(data);
            if(isError(sendResult)) {
                System.out.println("[NETWORK ERROR] " + sendResult);
            }
        }
        //정상흐름과 예외흐름이 섞여있어 어지러움
        client.disconnect();
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}
