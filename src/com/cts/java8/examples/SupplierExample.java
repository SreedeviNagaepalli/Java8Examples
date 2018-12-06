package com.cts.java8.examples;

import java.util.Calendar;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		Supplier<Calendar> calendarSupplier = new Supplier<Calendar>() {

			@Override
			public Calendar get() {

				return Calendar.getInstance();
			};

		};
		
		Calendar c = calendarSupplier.get();
		
		c.clear();
	}

}
