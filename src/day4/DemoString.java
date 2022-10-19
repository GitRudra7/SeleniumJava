package day4;

public class DemoString {

	public static void main(String[] args) 
	{
		// Inbuilt Sting mthds, strings are immutable, but string buffer can be used to change them
		//to perform any action on string we use string_var_name.function_name
		//this is like objname.mthd
		// characters r taken in '', while string in " ".
		//toUpper/lower case,equals,equalsIgnoreCase,contains,replace,substring,length,concat,
		
		String str1 = "Rudra rao" ,str2 ="Welcome Rudra to java";
		System.out.println("Uppercase =" + str1.toUpperCase());
		System.out.println("Lowercase =" + str2.toLowerCase());
		System.out.println("Length =" + str1.length());
		System.out.println("Concatenate =" + str1.concat(str2));
		System.out.println("Concatenate =" + str1+str2);
		System.out.println("Equals = " + str1.equals(str2));//returns T or F, but also compares case.
		System.out.println("Equals = " + str1.equals(str1));
		System.out.println("Equals = " + (str1==str2));
		System.out.println("Equals Ignore Case =" + str1.equalsIgnoreCase(str2));
		System.out.println("Equals Ignore Case =" + str1.equalsIgnoreCase("rudra"));
		System.out.println("Contains =" + str2.contains(str1) );//used to find reqd words from web application while testing
		System.out.println("Contains =" + str2.contains("Rudra"));
		System.out.println("Replace = " + str1.replace('u','o'));
		System.out.println("Replace = " + str2.replace("Rudra","Ram"));
		System.out.println("Replace = " + str1.replaceFirst(str1, str2));
		System.out.println("Substring =" + str2.substring(9));
		System.out.println("Substring =" + str2.substring(8, 13));// returns 0 to n-1 & used to get any substring from main string
		System.out.println("CharAt =" + str1.charAt(0));
		
		StringBuffer sb = new StringBuffer("Welcome");
		System.out.println("Reverse =" +sb.reverse());
		
	

	}

}
