package review.lang.immutable.address;

public class MemberMainV1 {
    public static void main(String[] args) {
        Address address = new Address("서울");

        MemberV1 memberA = new MemberV1("memberA", address);
        MemberV1 memberB = new MemberV1("memberB", address);

        //memberA memberB 첫 주소는 서울
        System.out.println("memberA: " + memberA);
        System.out.println("memberB: " + memberB);

        //회원B의 주소 부산으로 변경
        memberB.getAddress().setValue("부산");    //사이드 이펙트 발생!
        System.out.println("memberB -> 부산");
        System.out.println("memberA: " + memberA);
        System.out.println("memberB: " + memberB);
    }
}
