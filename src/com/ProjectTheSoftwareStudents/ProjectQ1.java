package com.ProjectTheSoftwareStudents;

public class ProjectQ1 {

	public static void main(String[] args) {

		int sum=0;
		int[][] i= {
				{1,5,10,15},
				{5,4,5,8}
				
		};
			for (int a=0; a<i.length; a++)	 {
				for(int b=0; b< i[a].length; b++) {
					
					sum=sum+ i[a][b];
				}
				}
			System.out.println(sum);
		
		
		
		
		
		
		
		

	}

}
