package com.revature.eval.java.core;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class SandboxTest {
	public static void main(String[] args) {
		EvaluationService e = new EvaluationService();
		int[] a = {1, 2, 3, 4, 5};
		System.out.println(IntStream.of(a).sum());
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(1); l.add(2); l.add(3);
		System.out.println(l.stream().mapToInt(Integer::intValue).sum());
		
		System.out.println(e.isArmstrongNumber(153));
		/*
		 * 		int len = String.valueOf(input).length();
				int result = 0; int j = input;
				for (int i = len; i > 0; i--) {
					result += Math.pow(j % 10, len);
					j = j / 10;
				}
				return (result == input);
		 */
		
		/*
		 * j = 153;
		 * 153 % 10 = 3 ^ 3 = 27
		 * result = 27
		 * 153 / 10 = 15
		 * 
		 * 15 % 10 = 5 ^ 3 = 125
		 * result = 27 + 125 = 152
		 * 15 / 10 = 1;
		 * 
		 * 1 % 10 = 1 ^ 3 = 1
		 * result = 152 + 1 = 153
		 * 1 / 10 = 0;
		 * 
		 * 153 == 153 = true
		 * 
		 * 
		 */
		
		System.out.println(e.cleanPhoneNumber("1  249 11aaa1 1944"));
		
	}
}
