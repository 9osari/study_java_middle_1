package enumeration.ref3;



public class EnumRefMain3_1 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(Grade.BASIC, price);
        int gold = discountService.discount(Grade.GOLD, price);
        int diamond = discountService.discount(Grade.DIAMOND, price);

        System.out.println("Basic 할인금액: " + basic);
        System.out.println("Gold 할인금액: " + gold);
        System.out.println("Diamond 할인금액: " + diamond);
    }
}
