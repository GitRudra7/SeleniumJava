package day1;

import java.util.Scanner;

public class ConditionalIf {

	public static void main(String[] args)
	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the age = ");
//		int age = sc.nextInt();
//		sc.close();
//		   if (age>=18)
//		   {
//		     System.out.println("Eligible to vote");
//		   } 
//		   else 
//		   {
//			   System.out.println("not eligible");
////		   }
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. = ");
		int a = sc.nextInt();
		sc.close();
		   if (a>=0)
		   {
		     System.out.println("no. is pos");
		   } 
		   else 
		   {
			   System.out.println("no. is neg");
		   }
		
		 

	}

}
