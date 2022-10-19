package day2;

import java.util.Scanner;

public class Task {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the basic salary");
		float B = sc.nextFloat();
		sc.close();
		double ta = (0.05*B), da=(0.06*B), pf = (0.08*B);
		double gross = (B+ta+da+pf);
		System.out.println("gross sal = " + gross);
		double netsal = (B+ta+da);
		System.out.println("net sal = " + netsal);
		System.out.println("The Designation of employee for given Sal is ");
		if (netsal >= 50000 && netsal < 100000  )
		{
			System.out.println("Manager");
		}
		else if (netsal>=30000 && netsal<50000)
		{
			System.out.println("Senior Employee");
		}
		else if (netsal >=10000 && netsal < 30000)
		{
			System.out.println("Junior employee");
		}
		else
		{
			System.out.println("out of scope");
		}
		
		

	}

}
