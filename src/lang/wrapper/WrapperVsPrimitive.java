package lang.wrapper;

public class WrapperVsPrimitive {
    public static void main(String[] args) {
        int iterations = 1_000_000_000; //반복 획수 설정, 10억
        long startTime, endTime;

        //기본형 long 사용
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for (int i =0; i < iterations; i++) {
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("Sum of primitive values: " + sumPrimitive);
        System.out.println("기본 자료형 long 실행 시간: " + (endTime - startTime) + "ms");


        //래퍼 클래스 Long 사용
        Long sumWapper = 0L;
        startTime = System.currentTimeMillis();
        for (int i =0; i < iterations; i++) {
            sumWapper += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("Sum of primitive values: " + sumWapper);
        System.out.println("래퍼 클래스  long 실행 시간: " + (endTime - startTime) + "ms");
    }
}
