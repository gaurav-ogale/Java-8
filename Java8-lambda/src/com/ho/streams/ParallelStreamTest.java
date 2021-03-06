package com.ho.streams;

import java.util.stream.IntStream;

public class ParallelStreamTest {

	public static void main(String[] args) {
		long starttime = 0;
		long endtime = 0;

		starttime = System.currentTimeMillis();
		IntStream.range(1, 100).forEach(System.out::println);
		endtime = System.currentTimeMillis();
		System.out.println("Plain Stream time taken :" + (endtime - starttime));

		starttime = 0;
		endtime = 0;

		starttime = System.currentTimeMillis();
		IntStream.range(1, 100).parallel().forEach(System.out::println);
		endtime = System.currentTimeMillis();
		System.out.println("Parallel Stream time taken :" + (endtime - starttime));
	}

}
