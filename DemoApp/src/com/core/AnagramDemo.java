package com.core;

import java.util.Arrays;

public class AnagramDemo {

	public static void main(String[] args) {

		String s1 = "a gentle Man";
		String s2 = "elegant Man";
		s1 = s1.replace(" ","");
		s2 = s2.replace(" ","");
		s1 = s1.toLowerCase();   //manual to lowercase
		s2= s2.toLowerCase();
		char[] array1 = s1.toCharArray();
		char[] array2 = s2.toCharArray();
		Arrays.sort(array1);   //manually sort it
		Arrays.sort(array2);
		
		if(Arrays.equals(array1, array2))
		{
			System.out.println("Strings are anagram ");
		}
		else
		{
			System.out.println("Strings are not anagram");
		}
	}

}
