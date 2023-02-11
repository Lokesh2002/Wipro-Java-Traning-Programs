import java.util.*;
public class IsEven 
{
	public static void main(String args[]) 
	{
		Scanner in= new Scanner(System.in);
		System.out.print("Input a number: ");
		int n =  in.nextInt();
		if (n%2==0) 
		{
			return 2;
		}
		else 
		{
			return 1;
		}
	}
}
