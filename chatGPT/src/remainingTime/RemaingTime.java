package remainingTime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class RemaingTime {

	    public static void main(String[] args) {
	        LocalDate today = LocalDate.now();
	        LocalDate september19 = LocalDate.of(2023, 9, 19);
	        
	        long weekdaysUntilSeptember19 = ChronoUnit.DAYS.between(today, september19) + 1;
	        long holidays = 3; // 5월 5일 어린이날, 6월 6일 현충일, 8월 15일 광복절
	        long weekdaysExcludingHolidays = weekdaysUntilSeptember19 - holidays;
	        
	        System.out.println("오늘부터 9월 19일까지 남은 평일 수 (공휴일 제외): " + weekdaysExcludingHolidays);
	    }
}
