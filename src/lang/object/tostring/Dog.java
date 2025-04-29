package lang.object.tostring;

public class Dog {
    private String dogname;
    private int age;

    public Dog(String dogname, int age) {
        this.dogname = dogname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogname='" + dogname + '\'' +
                ", age=" + age +
                '}';
    }
}
