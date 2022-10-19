package day2;

import java.util.Scanner;

public class Modulus {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no.");
		int a = sc.nextInt();
		sc.close();
		
	    if(a%2==0)
	    {
	    	System.out.println("no is even");
	    }
	    else
	    {
	    	System.out.println("no. is odd");
	    }
	    	
			

	}

}
