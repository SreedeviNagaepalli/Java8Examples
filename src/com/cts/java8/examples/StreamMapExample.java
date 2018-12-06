package com.cts.java8.examples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public class StreamMapExample {

	public static void main(String[] args) {
		List<String> dateList = new ArrayList<String>();

		dateList.add("01/01/2018");
		dateList.add("06/10/2018");
		dateList.add("23/11/2018");
		dateList.add("24/08/2018");

		Stream<String> dateStream = dateList.stream();

		dateStream.map(StreamMapExample::convertDate)
		//.filter(StreamMapExample::isWeekEnd)
		.filter(d -> !StreamMapExample.isWeekEnd(d))
		.forEach(System.out::println);

	}

	public static boolean isWeekEnd(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || 
				calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY;
	}

	public static Date convertDate(String text) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			return sdf.parse(text);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
