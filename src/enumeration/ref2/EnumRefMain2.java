package enumeration.ref2;

public class EnumRefMain2 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        int basic = discountService.discunt(Grade.BASIC, price);
        int gold = discountService.discunt(Grade.GOLD, price);
        int diamond = discountService.discunt(Grade.DIAMOND, price);

        System.out.println("Basic 할인금액: " + basic);
        System.out.println("Gold 할인금액: " + gold);
        System.out.println("Diamond 할인금액: " + diamond);
    }
}
