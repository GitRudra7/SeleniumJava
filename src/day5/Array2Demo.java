package day5;

import java.util.Scanner;

public class Array2Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the size of array");
		int size = sc.nextInt();
		int a[] = new int[size]; //declaration of array is done in this way
		
		// int a[]= {10,900,30,40,50}; // direct way of array declrn
		
		System.out.println("Enter the nos.");
		for (int i=0; i<size; i++)  //data is stored in / fetched from array using for loop.
		{
			a[i]=sc.nextInt();
						
		}
		sc.close();
		System.out.println("Display the nos");
		for (int i=0;i<size;i++)
		{
			System.out.println(a[i]);
			
		}
		System.out.println("Reverse of that array is");
		for (int i=size-1; i>=0; i-- )
		{
			System.out.println(a[i]);
		}

	}//plz chkk screenshot for tasks

}
