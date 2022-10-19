package day4;

import java.util.Scanner;

public class DemEqualsIgnoreCase {

	public static void main(String[] args)
	{
		System.out.println("Enter sal and desg");
		Scanner sc = new Scanner(System.in);
		int Sal = sc.nextInt();
		String desg = sc.next();
		sc.close();
		
		if (Sal>=50000 && desg.equalsIgnoreCase("Manager")) //inbuilt fn is used here
		{
			System.out.println("Bonus");
		}
		else
		{
			System.out.println("No Bonus");
		}

	}

}
