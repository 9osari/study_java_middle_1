package enumeration.ex2;

import enumeration.ex1.StringGrade;

public class DiscountService {
    public int discount(ClassGrade classGrade, int price) {
        int discountPercent = 0;

        if(classGrade == ClassGrade.BASIC) {
            System.out.println("classGrade" + classGrade);
            System.out.println("ClassGrade.BASIC" + classGrade);

            discountPercent = 10;
        } else if(classGrade == ClassGrade.GOLD) {
            discountPercent = 20;
        } else if(classGrade == ClassGrade.DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println("할인 X");
        }

        return price * discountPercent / 100;
    }
}
