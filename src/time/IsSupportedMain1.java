package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain1 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        int minute = now.get(ChronoField.SECOND_OF_MINUTE);
        System.out.println("Minute: " + minute);
        //LocalDate 는 날짜 정보만 가지고 있고 분에 대한 정보는 없어 예외 발생
    }
}
