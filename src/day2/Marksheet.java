package day2;

import java.util.Scanner;

public class Marksheet {

	public static void main(String[] args)
	{
		
		//if else if ladder (preferred than nested if)
		Scanner sc = new Scanner(System.in);
//		System.out.println("enter marks of 3 subjects");
//		int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
//		sc.close();
//		int tot=(a+b+c);
//		System.out.println("the total is " + tot);
//		double avg = (tot/3);
//		System.out.println("the average is " + avg);
//		if (a<35 || b<35 || c<35)
//		{ 
//			System.out.println("Fail");
//		}
//		else if (avg>=75)
//		{
//			System.out.println("distinction");
//		}
//		else if (avg>=60 && avg<75)
//		{
//			System.out.println("fist class");
//			
//		}
//		else if (avg<60 && avg>=35)
//		{
//			System.out.println("pass");
//		}
		
		//=== nested if else ==========
		
		System.out.println("Enter a no.");
		int n =sc.nextInt();
		sc.close();
		if (n<100)
		{
			System.out.println("no. is less than 100");
			if (n>50)
			{
				System.out.println("no. is greater than 50");
			}
		}
		else
		{
			System.out.println("no. is greater than 100");
		}
		
		

	}

}
