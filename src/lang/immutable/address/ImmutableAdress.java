package lang.immutable.address;

public class ImmutableAdress {
    private final String value;

    public ImmutableAdress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


    @Override
    public String toString() {
        return "Adress{" +
                "value='" + value + '\'' +
                '}';
    }
}
