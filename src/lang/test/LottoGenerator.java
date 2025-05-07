package lang.test;

import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random();
    private int[] lottoNumbers;
    private int count;

    public int[] generate() {
        lottoNumbers = new int[6];
        count = 0;

        while (count < 6) {
            //1-45 사이의 숫자 생성
            int number = random.nextInt(45) + 1;
            //중복이 안될 경우에만
            if(check(number)) {
                lottoNumbers[count] = number;
                count++;
            }
        }
        return lottoNumbers;
    }

    public boolean check(int number) {
        for (int i = 0; i < count; i++) {
            if(lottoNumbers[i] == number) {
                return false;
            }
        }
        return true;
    }


}
