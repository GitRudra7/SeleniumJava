package day3;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) 
	{
		// Accept while from user unless user press 0, and add all the nos. entered
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter numbers");
		int n ,sum=0;
		do
		{
			n=sc.nextInt();
			sum=sum+n;
		}
		while (n!=0);
		sc.close();
		System.out.println("0 is pressed, program exited");
		System.out.println("sum of all nos. entered = " + sum);
			

	}

}
