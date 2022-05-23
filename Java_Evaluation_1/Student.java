package com.Java_Evaluation_1;

import java.util.Scanner;

public class Student {
	private int rollNumber;
	private String StudentName;
	private int marks;
	
	//Zero argument Constructor
	public Student() {
		
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	//parametrized constructor
	public Student(int r, String n,int m) {
		this.rollNumber=r;
		this.StudentName=n;
		this.marks=m;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students you want to enter : ");
		int num = input.nextInt();
		System.out.println("=======================");
		for(int i = 0; i < num; i++) {
			System.out.print("Enter roll number of the student : ");
			int rollNumber = input.nextInt();
			input.nextLine();
			System.out.print("Enter name of the student : ");
			String studentName = input.nextLine();
			System.out.print("Enter marks of the student : ");
			int marks = input.nextInt();
			System.out.println();
			Student stud = new Student(rollNumber,studentName,marks);
			
			System.out.println("Student detail "+ (i+1));
			System.out.println("Student Roll Number : " + stud.getRollNumber());
			System.out.println("Student Name : " + stud.getStudentName());
			System.out.println("Student Mark : " + stud.getMarks());
			System.out.println("=======================");
		}
		
		
		
		
		
		
		
	}

}
