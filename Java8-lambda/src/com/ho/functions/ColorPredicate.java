package com.ho.functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class ColorPredicate {

	public static void process(String[] strArr, Predicate<String> processStr) {
		Arrays.asList(strArr).forEach(str -> {
			if (processStr.test(str))
				System.out.println(str);
		});
	}

	public static String[] nullAndEmptyCheckMethod(String[] strArr, Predicate<String> processStr) {
		ArrayList<String> returnString = new ArrayList<String>();
		Arrays.asList(strArr).forEach(str -> {
			if (!processStr.test(str))
				returnString.add(str);
		});
		String[] returnArray = returnString.stream().toArray(String[]::new);
		return returnArray;
	}

	public static void main(String[] args) {

		Predicate<String> colorPredicate = str -> (str != null && str.startsWith("b"));
		Predicate<String> nullAndEmptyCheck = str -> (str == null || str.equals(""));
		String[] arr = { "black", "blue", "red", "green", "white", null, "", "brown", "pink", null, "" };
		process(arr, colorPredicate);
		String[] returnArray = nullAndEmptyCheckMethod(arr, nullAndEmptyCheck);
		Arrays.asList(returnArray).forEach(str -> System.out.print(str + " "));

	}

}
