package day4;

import java.util.Scanner;

public class ReverseStringDemo {

	public static void main(String[] args) {
		System.out.println("enter a string");
		Scanner sc = new Scanner (System.in);
		String str = sc.nextLine();// if u use only sc.next(); then it wont consider rao.
		sc.close();
		int n = str.length(); String rev = " ";int i;
		for (i=n-1;i>=0;i--)
		{
			rev = rev + str.charAt(i);
			
		}
		
		System.out.println("the rev of string is " + rev);
		
		//Direct reverse using StringBuffer, pass the string str taken from user in sb string varb.
		// then call rev. fun
		StringBuffer sb = new StringBuffer(str); //just like scanner
		System.out.println("Reverse is "+ sb.reverse());
		
		
		
				

	}

}
