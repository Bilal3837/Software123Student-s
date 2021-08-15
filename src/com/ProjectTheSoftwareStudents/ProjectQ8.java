package com.ProjectTheSoftwareStudents;

import java.util.Scanner;

public class ProjectQ8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Please swip two numbers");
		int x = sc.nextInt();
		int y = sc.nextInt();

		System.out.println("before swapping numbers: " + x + " " + y);

		
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After swapping: " + x + " " + y);

	}

}
