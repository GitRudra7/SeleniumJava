package day1;

import java.util.Scanner;

public class Swapping {

	private static void main(String[] args) 
	{
		
//		int x=12, y=21, z;
//		System.out.println("swapping b4 is = " + x + "   "+  y);
//		z=x;
//		x=y;
//		y=z;
//		System.out.println("swapping after is = " + x + "   "+  y);
//		press cntrl+/ to comment block of stms
//		below is the code to take user input.		
		
		Scanner sc = new Scanner(System.in); //type Scan then cntrl + space, scanner is instream
		// this will call the import utility of java
		System.out.println("enter 2 nos."); // syso is outstream
		int x=sc.nextInt(), y=sc.nextInt(), z; //mthds to take user input
		sc.close(); // closing scanner after taking all inputs is reqd else it will give warning
		System.out.println("swapping b4 is = " + x + "   "+  y);
		z=x;
		x=y;
		y=z;
		System.out.println("swapping after is = " + x + "   "+  y);
		
	

	}

}
