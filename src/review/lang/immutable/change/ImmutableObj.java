package review.lang.immutable.change;

public class ImmutableObj {

    //불변이지만 값 변경이 필요할 떄
    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    //불변 객체는 값을 변경하면 안됨, 기존 값에 새로운 값을 더해야 함
    public ImmutableObj add(int addValue) {
        return new ImmutableObj(value + addValue);  //객체는 기존값을 변경하지 않고 계산값을 새로운 객체로 만들어 반환
    }

    public int getValue() {
        return value;
    }
}
