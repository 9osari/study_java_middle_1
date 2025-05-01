package lang.immutable.address;

public class MemberMainV1 {
    public static void main(String[] args) {
        Address addr = new Address("서울");

        MemberV1 memberA = new MemberV1("회원A", addr);
        MemberV1 memberB = new MemberV1("회원B", addr);

        //회원 A,B 처음 주소는 모두 서울
        System.out.println("memberA: " + memberA);
        System.out.println("memberB: " + memberB);

        //회원B의 주소를 부산으로 변경해야함.
        memberB.getAddress().setValue("부산");    //사이드 이펙트 발생
        System.out.println("부산 -> memberB.address");
        System.out.println("memberA: " + memberA);
        System.out.println("memberB: " + memberB);
    }
}
