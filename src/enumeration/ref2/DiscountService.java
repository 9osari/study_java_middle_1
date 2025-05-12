package enumeration.ref2;

public class DiscountService {
    public int discunt(Grade grade, int price) {
        return price * grade.getDiscountPercent() / 100;
    }
}
