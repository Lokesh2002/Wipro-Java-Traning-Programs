package java1;

import java.util.*;
public class number { 
	    public static void main(String []s)
	    {
	        int num;
	        Scanner sc=new Scanner(System.in);	         
	        System.out.print("Enter any integer number: ");
	        num=sc.nextInt();	         	        
	        if(num>0)
	            System.out.println(num + " is POSITIVE NUMBER.");
	        else if(num<0)
	            System.out.println(num + " is NEGATIVE NUMBER.");
	        else
	            System.out.println("It's ZERO.");
	         
	    }

}
