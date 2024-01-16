package com.techacademy;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

	@GetMapping("/dayofweek/{yyyymmdd}")
	public Calendar dispDayOfWeek(@PathVariable String yyyymmdd) {
		String YYYY = yyyymmdd.substring(0,4);
		int yyyy = Integer.parseInt(YYYY);
		String MM = yyyymmdd.substring(4,6);
		int mm = Integer.parseInt(MM)-1;
		String DD = yyyymmdd.substring(6,8);
		int dd = Integer.parseInt(DD);
		
		Calendar calDate = Calendar.getInstance();
		calDate.set(yyyy, mm, dd);
		
		return calDate;
		
	}
	
	@GetMapping("/plus/{val1}/{val2}")
	public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
		int res = 0;
		res = val1 + val2;
		return "足し算結果：" + res;
	}
	
	@GetMapping("/minus/{val1}/{val2}")
	public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
		int res = 0;
		res = val1 - val2;
		return "引き算結果：" + res;
	}
	
	@GetMapping("/times/{val1}/{val2}")
	public String calcTimes(@PathVariable int val1, @PathVariable int val2) {
		int res = 0;
		res = val1 * val2;
		return "掛け算結果：" + res;
	}
	
	@GetMapping("/divide/{val1}/{val2}")
	public String calcDivide(@PathVariable int val1, @PathVariable int val2) {
		int res = 0;
		res = val1 / val2;
		return "割り算結果：" + res;
	}
}
