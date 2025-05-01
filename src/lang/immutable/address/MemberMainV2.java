package lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAdress addr = new ImmutableAdress("서울");

        MemberV2 memberA = new MemberV2("회원A", addr);
        MemberV2 memberB = new MemberV2("회원B", addr);

        //회원 A,B 처음 주소는 모두 서울
        System.out.println("memberA: " + memberA);
        System.out.println("memberB: " + memberB);

        //회원B의 주소를 부산으로 변경해야함.
        /*memberB.getAddress().setValue();    //컴파일 오류*/
        memberB.setAddress(new ImmutableAdress("부산"));
        System.out.println("부산 -> memberB");
        System.out.println("memberA: " + memberA);
        System.out.println("memberB: " + memberB);
    }
}
