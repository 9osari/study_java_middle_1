package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalendarPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("년도 입력 ");
        int year = scanner.nextInt();

        System.out.print("월 입력 ");
        int month = scanner.nextInt();

        printCalender(year,month);
    }

    private static void printCalender(int year, int month) {
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);

        //월요일=1(1%7=1), ... 일요일=7(7&7=0)
        int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7;

        /*System.out.println("Su MO Tu We Th Fr Sa");*/
        System.out.println("일  월  화 수 목  금  토 ");
        for (int i = 0; i < offsetWeekDays; i++) {
            System.out.print("   ");
        }

        LocalDate dayIterator = firstDayOfMonth;
        while (dayIterator.isBefore(firstDayOfNextMonth)) {
            System.out.printf("%2d ", dayIterator.getDayOfMonth()); //오른쪽 정렬
            if(dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }
            dayIterator = dayIterator.plusDays(1);
        }
        System.out.println();
    }
}
