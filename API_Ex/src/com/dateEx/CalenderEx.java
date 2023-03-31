package com.dateEx;

import java.util.Calendar;

public class CalenderEx {
	
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH); 	// 일을 리턴
		int week = now.get(Calendar.DAY_OF_WEEK); 	// 요일을 리턴
		int ampm = now.get(Calendar.AM_PM); 		// 오전/오후 리턴
		int hour = now.get(Calendar.HOUR); 		
		int minute = now.get(Calendar.MINUTE); 		
		int secound = now.get(Calendar.SECOND);
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		
		System.out.println(week);
		System.out.println(ampm);
		
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(secound);
		
		switch (week) {
		case Calendar.MONDAY:
			System.out.println("월요일");
			break;
			
		case Calendar.TUESDAY:
			System.out.println("화요일");
			break;

		case Calendar.WEDNESDAY:
			System.out.println("수요일");
			break;
			
		case Calendar.THURSDAY:
			System.out.println("목요일");
			break;
			
		case Calendar.FRIDAY:
			System.out.println("금요일");
			break;
			
		case Calendar.SATURDAY:
			System.out.println("토요일");
			break;
			
		case Calendar.SUNDAY:
			System.out.println("일요일");
			break;
			
		default:
			break;
		}
		if(ampm == Calendar.AM) {
			System.out.println("오전");
		} else {
			System.out.println("오후");
			
		}
		
	}

}
