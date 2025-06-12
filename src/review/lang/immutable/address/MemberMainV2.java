package review.lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");

        MemberV2 memberA = new MemberV2("memberA", address);
        MemberV2 memberB = new MemberV2("memberB", address);

        //memberA memberB 첫 주소는 서울
        System.out.println("memberA: " + memberA);
        System.out.println("memberB: " + memberB);

        //회원B의 주소 부산으로 변경
        //memberB.getAddress().setValue("부산");    //컴파일 오류
        memberB.setAddress(new ImmutableAddress("부산")); //새로운 객체 만들어 전달
        System.out.println("memberB -> 부산");
        System.out.println("memberA: " + memberA);
        System.out.println("memberB: " + memberB);
    }
}
