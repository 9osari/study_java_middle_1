package enumeration.ex2;

public class ClassGradeEx2_1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(ClassGrade.BASIC, price);
        int gold = discountService.discount(ClassGrade.GOLD, price);
        int diamond = discountService.discount(ClassGrade.DIAMOND, price);

        System.out.println("Basic 할인금액 " + basic);
        System.out.println("Gold 할인금액 " + gold);
        System.out.println("Diamond 할인금액 " + diamond);
    }
}
