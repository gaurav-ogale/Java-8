package com.ho.functions;

import java.util.Random;
import java.util.function.Supplier;

public class PasswordSupplierExample {
	public static final String symbol = "@#$";
	public static final String cap_letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final String numbers = "0123456789";

	public static void main(String[] args) {
		Supplier<String> generatePassword = () -> {
			String randomString = symbol + numbers;
			Random random = new Random();
			char[] password = new char[8];
			for (int i = 0; i < 8; i++) {
				if (i % 2 == 0)
					password[i] = cap_letters.charAt(random.nextInt(cap_letters.length()));
				else
					password[i] = randomString.charAt(random.nextInt(randomString.length()));
				// for only numbers at odd locations
				// password[i] = numbers.charAt(random.nextInt(numbers.length()));
			}
			return String.valueOf(password);
		};

		System.out.println(generatePassword.get());
		System.out.println(generatePassword.get());
	}

}
