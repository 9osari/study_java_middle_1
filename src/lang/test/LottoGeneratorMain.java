package lang.test;

import java.util.Arrays;

public class LottoGeneratorMain {
    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();
        int[] lottoNumber = lottoGenerator.generate();
        System.out.println("로또 번호: ");
        for (int i = 0; i < lottoNumber.length; i++) {
            System.out.print(lottoNumber[i] + " ");
        }
    }
}
