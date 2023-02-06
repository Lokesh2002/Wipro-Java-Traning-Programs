package java1;

import java.util.Scanner;

public class greatervalue {
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter the first number:");
		int n1 = s1.nextInt();
		System.out.print("Enter the second number:");
		int n2 = s1.nextInt();
		
		if(n1>n2)
		{
			System.out.print(n1 +" is the greatest number");
		}
		else
		{
			System.out.print(n2 +" is the greatest number");
		}
		if(n1==n2)
		{
			System.out.print("Both are equal");
		}
	}
}