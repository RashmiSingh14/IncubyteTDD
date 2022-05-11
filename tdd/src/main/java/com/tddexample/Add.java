package com.tddexample;

public class Add {
	public int addnumbers(String nums) {
		String numbers = nums.replaceAll("[^\\d*]", " ").replaceAll("\\s+", " ").trim();
		int sum = 0;
		if (nums=="") {
			return sum;
		}
		String num[] = numbers.split("\\s+");
		for (String x : num) {
			sum += Integer.parseInt(x);
		}
		System.out.println("Numbers "+numbers);
		return sum;
	}
	
}
