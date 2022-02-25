package com.ho;

public class TestClass {

	
	
	public static void main(String[] args) {
		Printable print = ()->System.out.println("hello");
		print.print();
		
		Sum sum = (x,y)->x+y;
		int x2 = sum.sum(10, 30);
		System.out.println("X " + x2);
		System.out.println(sum.sum(10, 30));
		
		Sum s2 = (x,y) ->{
			System.out.println("Values Are " + x + " " + y);
			return x+y;
		};
		System.out.println(s2.sum(11, 22));
	
	}
}
