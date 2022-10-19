package day3;

public class Forif {

	public static void main(String[] args)
	{
		//for loop with if condn
		System.out.println("even nos.");
		for (int i=1;i<=50;i++)
		{
			if (i%2==0)
			{
				System.out.println(i);
			}
		}
		
		//print all 1 to 50 except 5
		
		System.out.println("print all 1 to 50 except 5");
		for (int i=1;i<=50;i++)
		{
			if (i!=5)
			{
				System.out.println(i);
			
			}
		}
		
		//prgm shld brk on 5
		System.out.println("prgm shld brk on 5 wsing for loop");
		
		for (int i=1;i<=50;i++)
		{
			if (i!=5)
			{
				System.out.println(i);
							
			}
			else
			{
				break;
			}
		}
		
		
		System.out.println("prgm shld brk on 5 wsing while loop");
		
		
		int n = 1;
		
		while (n!=5)
		{
			System.out.println(n);
			n++;
			
		}
   
	}

}
// task = when i = 5 prgm shld brk

