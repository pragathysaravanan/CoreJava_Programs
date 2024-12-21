package com.day12;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateAPIExample {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();// for current date
		System.out.println("Current Date using LocalDate: " + date);
		System.out.println("Current date of this month: " + date.getDayOfMonth());
		
		LocalTime time =LocalTime.now(); //for current time
		System.out.println("Current Time using LocalTime: " + time);
		
		LocalDateTime dateTime =  LocalDateTime.now();
		System.out.println("Both current date & time: " + dateTime);

	}

}
