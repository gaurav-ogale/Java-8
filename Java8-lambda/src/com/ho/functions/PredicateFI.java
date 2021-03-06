package com.ho.functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class PredicateFI {
	
	public static void main(String[] args) {
		
		Predicate<Integer> maxInt = num ->(num%2==0);
		
		Integer[] a = {10,12,13,3,45,5,78};
		ArrayList<Integer> oddList = new ArrayList<Integer>();
		ArrayList<Integer> evenList = new ArrayList<Integer>();
		
		Arrays.asList(a).forEach(num->{
			if(maxInt.test(num))
				evenList.add(num);
			else
				oddList.add(num);				
		});
		
		System.out.println("Even List " + evenList);
		System.out.println("Odd List " + oddList);
		
	}

}
