package com.Day6;

	import java.util.Scanner;
	class Main{
	public static String reverseString(String input){
		String bag="";
		for (int i=input.length()-1;i>=0;i--) {
			bag+=input.charAt(i);
			
		}
		
         return bag;
	}
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String to reverse");
	String orignalString = sc.next();
	String result = reverseString(orignalString);
	System.out.println("Original String is :" + orignalString);
	System.out.println("Reversed String is :" + result);
	}
	}
	
	
