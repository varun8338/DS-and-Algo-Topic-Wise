package com.arrays;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GoogleInterview {
	public static void main(String[] args) {
		Stream.of(1, 11, 111, 1111, 11111).filter(x -> x < 100).forEach(x -> System.out.println(x));

		List<Integer> list = Stream.of(1, 11, 111, 1111, 11111).collect(Collectors.toList());
		System.out.println(list);

		Integer[] numbers = { 10, 100, 20, 45, 643, 34 };
		Stream.of(numbers).sorted((i1, i2) -> (i1 - i2)).forEach(x -> System.out.println(x));
		Object[] t = Stream.of(numbers).sorted((i1, i2) -> (i1 - i2)).toArray();

		// find max
		System.out.println(Stream.of(numbers).min((i1, i2) -> i1 - i2).get());

		String a = "yes";
		String b = null;
		Optional<String> op1 = Optional.ofNullable(a);
		System.out.println(op1);
		if (op1.isPresent()) {
			System.out.println(op1.get());
		}

		System.out.println(op1.orElse("default string"));

		Integer[] arr = { 1, 2, 3, 4, 5 };
		Integer[] arr1 = {};
		Optional<Integer> mul = Optional.ofNullable(Stream.of(arr1).reduce((num1, num2) -> num1 * num2).orElse(0));
		System.out.println(mul.get());
		System.out.println("***********");
		String[] words = { "This", "is", "an", "array" };
		List<Integer> wordL = Stream.of(words).map(x -> x.length()).collect(Collectors.toList());
		
		
		
		int[] wordA=new int[wordL.size()];
		for(int i=0;i<wordA.length;i++) {
			wordA[i]=wordL.get(i);
		}
			
	}
}
