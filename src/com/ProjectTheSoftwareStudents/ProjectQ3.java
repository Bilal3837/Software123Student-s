package com.ProjectTheSoftwareStudents;

public class ProjectQ3 {

	public static void main(String[] args) {
	
		int sam = 0,sum=0;
		int[][] ados = {
				{ 1, 2, 3, 4, 5, },
				{ 6, 7, 8, 9, 10, },
				};
		for (int a = 0; a < ados.length; a++) {
			for (int b = 0; b < ados[a].length; b++)
			{
				if (ados[a][b] % 2 == 0) {
					sam += ados[a][b];
					
					
				}else {
					sum+= ados[a][b];
						
					}	
			}
		}
		
		System.out.println(sam);
		System.out.println(sum);
		

		
		

	}

}
