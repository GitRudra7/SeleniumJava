package day5;

public class Demoarray {

	public static void main(String[] args) {
		// 
//		int a[] = new int [5];
//		int n = a.length;
//		a[0]=10; a[1]=20; a[2]=30; a[3]=40; a[4]=50;
//		for (int i=0;i<n;i++)
//		{
//			System.out.println(a[i]);
//		}
//		
		
		int a[]= {10,900,30,40,50}; // direct way of array declrn
		for (int i:a)              //for-each loop is used to fetch elements from an array
		{                          //this will get each element frm a & will store in i.
			System.out.println(i);
		}
		
	}

}
