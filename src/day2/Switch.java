package day2;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args)
	{
		// if else if ladder takes more time for execution as it chk each condition ...
		// ...b4 going to next condn., so we use switch as it will execute only the reqd case.
		Scanner sc = new Scanner(System.in);
//		System.out.println("enter a no. between 1 to 7 as a weekday");
//		int a = sc.nextInt();
//		sc.close();
//		switch (a) 
//		{
//		case 1:
//			System.out.println("MON");
//			
//			break;
//			
//		case 2:
//			System.out.println("TUE");
//			
//			break;
//			
//		case 3:
//			System.out.println("WED");
//			
//			break;
//			
//		case 4:
//			System.out.println("THU");
//			
//			break;
//			
//		case 5:
//			System.out.println("FRI");
//			
//			break;
//			
//		case 6:
//			System.out.println("SAT");
//			
//			break;
//			
//		case 7:
//			System.out.println("SUN");
//			
//			break;	
//			
//			
//
//		default:
//			System.out.println("invalid choice");
//			break;
//		}

		
		//====Arithmetic operators====
		
		System.out.println("Select the operator + - * /");
		char op = sc.next().charAt(0); //returns a char value at given index no. ie 0
		// if u simply write as char op = sc.next(),then it will consider the input as a string
		//so we hv to use charAt() after next() as to get i/p as a character, as we dont hv a direct fn. for the same.
		
		System.out.println("enter 2 nos.");
		int a = sc.nextInt(), b =sc.nextInt();
		sc.close();
		switch (op)
		{
		case '+':
			System.out.println("addn = " +(a+b));
			
			break;
			
		case '-':
			System.out.println("subn = "+ (a-b));
			break;
			
		case '*':
			System.out.println("mult = "+ (a*b));
			break;
			
		case '/':
			System.out.println("divs = "+ (a/b));
			break;

		default:
			System.out.println("Invalid operator");
			break;
		}
	}

}
