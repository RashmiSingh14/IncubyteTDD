package com.tddexample;

public class Add {
	public int addnumbers(String nums) {
		String numbers = nums.replaceAll("[^\\-\\d*]", " ").replaceAll("\\s+", " ").trim();
		int sum = 0;
		if (nums=="") {
			return sum;
		}
		String num[] = numbers.split("\\s+");
		for (String x : num) {
			if(Integer.parseInt(x)< 0) {
				return Integer.parseInt(x);
			}
			sum += Integer.parseInt(x);
		}
		System.out.println("Numbers "+numbers);
		return sum;
	}
	
}
