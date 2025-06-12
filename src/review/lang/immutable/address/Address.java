package review.lang.immutable.address;

//참조형 예제 (가변 클래스)
public class Address {
    //주소를 보관하는 객체
    private String value;

    //생성자를 이용해 필드 초기화
    //https://9osari.netlify.app/posts/생성자/
    public Address(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
