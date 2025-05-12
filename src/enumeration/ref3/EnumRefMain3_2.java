package enumeration.ref3;

public class EnumRefMain3_2 {
    public static void main(String[] args) {
        int price = 10000;

        //이제 서비스 필요없음...
        System.out.println("Basic 할인금액: " + Grade.BASIC.discount(price));
        System.out.println("Gold 할인금액: " + Grade.GOLD.discount(price));
        System.out.println("Diamond 할인금액: " + Grade.DIAMOND.discount(price));
    }
}
