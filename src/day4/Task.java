package day4;



import java.util.Scanner;

public class Task {

	public static void main(String[] args) 
	{
		// To display all vowels, consonants and spaces from the entered string and also there counts
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a string ");
		String str = sc.nextLine(); // to take string of sentences use line
		System.out.println("The string is " + str);
		sc.close();
		int m = 0, n=0, p=0; String str2 = " ", str3  = " ";
		for (int i=0 ; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if ( ch == 'a' || ch=='e' || ch=='i' || ch=='o'||ch=='u')
			{
				//System.out.println("The string has vowel " + ch + " at index postion " + i );
				m++;
			   str2 = str2 + str.charAt(i)+ "  ";
				
			}
			else if ( ch == ' ')
			{
				//System.out.println("The string has space at index value " + i);
			n++;
		
			}
			else
			{
				//System.out.println("The string has consonant " + ch + " at index postion " + i);
			p++;
			str3 = str3 + str.charAt(i)+ "  ";
			}
		}
		System.out.println("The vowels are " + str2);
		System.out.println("The Consonants are " + str3);
		System.out.println("The no. of vowels are " + m);
		System.out.println("The no. of consonants are " + p );
		System.out.println("The no. of spaces are " + n);

	}

}
