package day3;

public class Nestedforloop {

	public static void main(String[] args) 
	{
		// Nested for loop
//		System.out.println("MONTH" + "  " +"DAY");
//		
//		for (int m=1;m<=12;m++)
//		{
//			for (int d=1;d<=31;d++)
//			{
//				System.out.println(m + "        " +d);
//			}
//			System.out.println("  ");
//		}

		
		
//		//pattern of 5 * in row n column
//		
//		for (int i=1;i<=5;i++)
//		{
//			for (int j=1;j<=5;j++)
//			{
//				System.out.print(" * ");// note here if u use println. then * will not be printed in a continuous row.
//			}
//			System.out.println("  "); // ln means print the content on new line
//			
//		}
//		
//		//ryt angle triangle
//		for (int i=1;i<=5;i++)
//		{
//			for (int j=1;j<=i;j++)
//			{
//				System.out.print(" * ");// note here if u use println. then * will not be printed in a continuous row.
//			}
//			System.out.println("  "); // ln means print the content on new line
//			
//		}
		
		System.out.println("reverse ryt angle triangle");
		
		for(int i=1;i<=5;i++)
		{
			for (int j=5;j>=i;j--)
			{
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
	}
	//task = print diff. paternns

}
