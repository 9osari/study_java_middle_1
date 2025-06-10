package exception.ex3;


import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_2 {

    public void sendMessage(String data) {
        String address = "http://example.com";

        //NerworkClientV0을 생성하고 외부 서버 주소 전달
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);  //1. SendExceptionV3 발생
        } catch (ConnectExceptionV3 e) { // 2. 대상이 다름
            System.out.println("[연결오류] 주소: " + e.getAddress() + "메세지: " + e.getMessage());
        } catch (NetworkClientExceptionV3 e) { // 3. NetworkClientExceptionV3은 부모이므로 여기서 잡음
            System.out.println("[네트워크 오류] 메세지 : " + e.getMessage());
        } catch (Exception e){ // 도저히 모르겠는 오류인 경우
            System.out.println("[알 수 없는 오류] 메세지 : " + e.getMessage());
        }finally {
            client.disconnect();
        }

    }
}
