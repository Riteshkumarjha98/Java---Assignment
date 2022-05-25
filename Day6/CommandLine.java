package com.Day6;

public class CommandLine {

	public static void main(String[] args) {
		int len = args.length;
		int factorial = 1;
		if(len == 1) {
			for(int i = 1; i <= Integer.valueOf(args[0]); i++) {
				factorial *= i;
			}
			System.out.println(factorial);
		}
		else if(len == 2) {
			int absDiff = Math.abs(Integer.valueOf(args[0]) - Integer.valueOf(args[1]));
			for(int i = 1; i <= absDiff; i++) {
				factorial *= i;
			}
			System.out.println(factorial);
		}
		else if(len > 2) {
			System.out.println("Error");
		}
	}
}


