package com.ho;


interface a1{
	default void print() {
		System.out.println("From a1");
	}
}
interface a2{
	default void print() {
		System.out.println("From a2");
	}
}
interface a3{
	default void print() {
		System.out.println("From a3");
	}
}

public class DefaultMethods implements a1,a2,a3{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("From Main");
	}
	
	public static void main(String[] args) {
		DefaultMethods d1 = new DefaultMethods();
		d1.print();
	}

}
