package day3;

import java.util.Scanner;

public class Whileloop {

	public static void main(String[] args) {
		// Reverse the nos. and palindrome
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("enter a no.");
//		int n = sc.nextInt(), rev=0, temp=n;
//		sc.close();
//		
//		while (n!=0)
//		{
//			int d=n%10;
//			rev=rev*10+d;
//			n=n/10;
//		   						
//		}
//		System.out.println("the rev is " + rev);
//		if (temp==rev)
//		{
//			System.out.println("the given no. is a palindrome");
//		}
//		else
//		{
//			System.out.println("the given no. is not a palindrome ");
//		}
//		
		//table of 2
		System.out.println("table of 2 ");
		int m=1; int j = 0;
		
		while (m<=10)
		{
			j= 2*m;
			m++;
			System.out.println(j);
			
		}
		System.out.println("enter a no. to calulate its factorial");
		int num = sc.nextInt();
		sc.close();
		int i = 1; int fact=1;
		while (i<=num)
			
		{
			fact=fact*i;
			i++;
			
		}System.out.println("factorial of " + num + " is " + fact );
		
		
	}
 
	//task==display factorial of 5 nos. using while loop
	
	
}
