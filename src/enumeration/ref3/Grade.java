package enumeration.ref3;

public enum Grade {
    BASIC(10),GOLD(20),DIAMOND(30),VIP(40);

    private final int discountPercent;

    //생성자를 통해서 필드에 값을 저장
    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    //값을 조회하기 위한 메서드 열거형도 클래스라 메서드 추가 가능
    public int getDiscountPercent() {
        return discountPercent;
    }

    //추가
    public int discount(int price) {
        return price * discountPercent / 100;
    }
}
