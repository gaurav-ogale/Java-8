package com.ho.functions;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

interface Printable {
	void print();
}

interface Calculate {
	int add(int a, int b);
}

interface multiple{
	int multi(int a, int b);
}

public class MethodReferenceExample {
	public MethodReferenceExample() {
		System.out.println("Constructor");
	}
	public MethodReferenceExample(String str, String str2) {
		System.out.println("Constructor" + str + ":" + str2);
	}

	///Static
	public static void print() {
		System.out.println("Printed!!");
	}

	public static int add(int a, int b) {
		return a + b;
	}
	//Instance
	public int multi(int a, int b) {
		return a*b;
	}

	public static void main(String[] args) {
		
		Printable print = MethodReferenceExample :: print;
		print.print();
		//Static
		Calculate cal = MethodReferenceExample :: add;
		System.out.println(cal.add(10, 20));
		//Instance MEthod ref
		multiple m = new MethodReferenceExample() :: multi;
		System.out.println(m.multi(10, 9));
		
		//Constructor
		Supplier<MethodReferenceExample> s1 = MethodReferenceExample :: new;
		s1.get();
		//Constructor with params
		BiConsumer<String, String> c1 = MethodReferenceExample::new;
		c1.accept("Ron", "Steer");

	}

}
