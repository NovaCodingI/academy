package remainingTime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PastDate {

	    public static void main(String[] args) {
	        LocalDate today = LocalDate.now();
	        LocalDate march14 = LocalDate.of(2023, 3, 14);
	        
	        long daysSinceMarch14 = ChronoUnit.DAYS.between(march14, today) + 1;
	        
	        System.out.println("3월 14일부터 지금까지 " + daysSinceMarch14 + "일이 지났습니다.");
	    }
}
