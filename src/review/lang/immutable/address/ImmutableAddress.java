package review.lang.immutable.address;

//불변 객체 예제 (불변 클래스)
public class ImmutableAddress {
    private final String value; //final로 선언해 내부 값 변경 불가능

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ImmutableAddress{" +
                "value='" + value + '\'' +
                '}';
    }
}
