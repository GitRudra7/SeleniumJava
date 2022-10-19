package day3;

public class Loops {

	public static void main(String[] args)
	{
		System.out.println("Ascending");
		for (int i=1;i<=5;i++)
		{
		 	System.out.println(i);
		}
		System.out.println("A-Z");
		for (char ch='A';ch<='Z';ch++)
		{
			System.out.println(ch);
		}
		System.out.println("ASCII");
		for (int i='0';i<='9';i++)
		{
			System.out.println(i);
		}
		int j=0;
		System.out.println("Table of 5");
		for (int i=1; i<=10; i++)
		{
			j=5*i;
			System.out.println(j);
			
					
		}
	}

}
// print any table 