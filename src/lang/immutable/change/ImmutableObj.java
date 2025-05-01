package lang.immutable.change;

public class ImmutableObj {
    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    //불변도 유지하며 값도 바꿀 수 있음!!!
    public ImmutableObj add(int addValue) {
        //계산 결과를 기반으로 새로운 객체를 만들어 반환
        return new ImmutableObj(value + addValue);
    }

    public int getValue() {
        return value;
    }
}
