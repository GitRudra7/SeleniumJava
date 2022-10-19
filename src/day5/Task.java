package day5;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) 
	{
		char B[] = {'R' , 'U', 'D', 'R', 'A'};
		String str = " ";
		for (int i =0; i< B.length; i++)
		{
			str = str + B[i];
		}
		System.out.println(str);
		String str2 = " ";
		
		String str1 [] = {"Welcome", "In", "The", "World", "of", "Java"};
		for ( int j = 0; j<str1.length; j++)
		{
			str2 = str2 + str1 [j] +" ";
		}
		System.out.println(str2);
		
		// Create marksheet using array ie take marks n find total n %
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of Subjects");
		int n = sc.nextInt(), tot =0;
		
		int marks [] = new int [n];
		System.out.println("Enter the marks for each subject out of 100");
		for (int i = 0; i<n; i++)
		{
			marks[i]=sc.nextInt();
			tot = tot + marks[i];
		}
		sc.close();
		float p = (tot/n);
		System.out.println("The total is = " + tot); // tot is the obtained marks
		System.out.println("The Percaentage is = " + p);// while n*100 is sum of max marks in each sub.
		
		
		
		

		// Multi dimensional array is not mostly used by automation tester
		
	}
}
