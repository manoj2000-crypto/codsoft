package task2;

import java.util.Scanner;

public class StudentGradeCalculator {
	
	private static char calculateGrade(double averagePercentage) 
	{
		if(averagePercentage >= 90) 
		{
			return 'A';
		}
		else if(averagePercentage >= 80) 
		{
			return 'B';
		}
		else if(averagePercentage >= 70) 
		{
			return 'C';
		}
		else if(averagePercentage >= 60) 
		{
			return 'D';
		}
		else if(averagePercentage >= 50) 
		{
			return 'E';
		}
		else if(averagePercentage >= 35)
		{
			return 'P';
		}
		else 
		{
			return 'F';
		}
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of subjects : ");
		int numberOfSubjects = sc.nextInt();
		
		int totalMarks = 0;
		
		for(int i = 1; i<= numberOfSubjects; i++) 
		{
			System.out.print("Enter the marks obtained in subject " + i + " : ");
			int marks = sc.nextInt();
			
			if(marks < 0 || marks > 100) 
			{
				System.out.println("Marks should be betwwen 0 and 100");
				return;
			}
			
			totalMarks = totalMarks + marks;
		}
		
		double averagePercentage = (double)(totalMarks / numberOfSubjects);
		
		char grade = calculateGrade(averagePercentage);
		
		System.out.println("Total Marks : " + totalMarks);
		System.out.println("Average Percentage : " + averagePercentage);
		System.out.println("Grade : " + grade);
		
	}

}
