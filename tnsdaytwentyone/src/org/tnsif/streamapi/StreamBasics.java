package org.tnsif.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamBasics {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(intList);
		
//		Iterator<Integer> itr = intList.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		List<Integer> sqList = new ArrayList<>();	
		
		for(Integer l : intList) {
			sqList.add(l*l);
		}
		System.out.println(sqList);
		
		// Using Stream
		List<Integer> cubeList;
		
		cubeList = intList.stream().map(x -> x*x*x).collect(Collectors.toList());
		System.out.println(cubeList);
		
		//split-up
		Stream<Integer> intStream = intList.stream();
		intStream = intStream.map(x -> x*x*x);
		cubeList = intStream.collect(Collectors.toList());
		
		System.out.println(cubeList);
		
		List<String> nameList = Arrays.asList("Abhishek", "Sandip", "Saish");
		System.out.println(nameList);
		
		Stream<String> nameStream = nameList.stream();
		intStream = nameStream.map(name -> name.length());
		intList = intStream.collect(Collectors.toList());
		System.out.println(intList);
		
		// filter - odd numbers
		intList = Arrays.asList(1, 2, 3, 4, 5);
		intStream = intList.stream();
		Stream<Integer> result = intStream.filter(n -> n % 2 != 0);
		List rList = result.collect(Collectors.toList());
		System.out.println(intList);
		System.out.println(rList);
		
		// filter() - returns palindrome
		List words = Arrays.asList("CAT", "ABCCBA", "AAA", "DaD");
		System.out.println(words);
		Stream<String> wordStream = words.stream();
		wordStream = wordStream.filter(w -> w.equals(new StringBuffer(w).reverse().toString()));
		wordStream.forEach(System.out::println);
//		words = wordStream.collect(Collectors.toList());
		System.out.println(words);
		
		// passing predicate
		Predicate<Integer> numbers;
		numbers = (no) -> no % 2 == 0;
		
		System.out.println(intList);
		intStream = intList.stream();
		intStream = intStream.filter(numbers);
		List evenNums = intStream.collect(Collectors.toList());
		System.out.println(evenNums);
		
		// User defined Object stream
		List<Student> studList = new ArrayList<>(
				Arrays.asList(
						new Student(1, "Abhishek", 45.45f),
						new Student(2, "Abhi", 4.45f),
						new Student(3, "Sandip", 70f),
						new Student(4, "Ashutosh", 80f)
						));
		
		System.out.println(studList);
		
		Predicate<Student> studPred = (s) -> (s.getPer() >= 70);
		
		List<Student> stud70 = studList.stream().filter(studPred).collect(Collectors.toList());
		System.out.println(stud70);
		
		System.out.println(intList);
		intStream = intList.stream();
		Optional<Integer> optList = intStream.reduce((x, y) -> x+x);
		System.out.println(optList);
		
		Integer[] values = {10, 20, 30, 40};
		Stream<Integer> stream = Arrays.stream(values);
		stream.forEach(System.out::println);
		
		Stream<String> strStream = Stream.of("Nashik", "Pune", "Mumbai", "Thane");
		strStream.forEach(System.out::println);
		
		Float[] f = {12.01f, 34.0f, 56.034f, 34.5f, 89.4f, 56.034f};
		Stream<Float> floatStream = Arrays.stream(f);
		
		Consumer<Float> c = (n) -> System.out.println("Price is " + n);
		floatStream.forEach(c);
		
		// limit
		System.out.println("\n--------Limiting first 2");
		floatStream = Arrays.stream(f);
		floatStream.limit(2).forEach(c);
		
		// Skip
		System.out.println("\n---------Skipping first 2");
		floatStream = Arrays.stream(f);
		floatStream.skip(2).forEach(c);
		
		// distinct
		System.out.println("\n----------Distinct");
		floatStream = Arrays.stream(f);
		floatStream.distinct().forEach(c);
		
		strStream = Stream.of("Abhishek", "Disha", "Ashutosh", "Saish");
		System.out.println("----Strings in Upper case");
				
 	}
}
