package com.ProjectTheSoftwareStudents;

public class ProjectQ2 {

	public static void main(String[] args) {

		
	
		int[][] arr = { 
				{ 1,2,3,4,5,6},
				{ 7,8,9,10,11,12}
		};
		for (int a = 0; a < arr.length; a++) {
			for (int b = 0; b < arr[a].length; b++) {
				
				int even = 0;
				even = even + arr[a][b];
				if (even % 2 == 0)
				System.out.println(even);
			}
		}
	}


	}


