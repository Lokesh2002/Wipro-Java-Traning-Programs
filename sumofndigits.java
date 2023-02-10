public class ComputeSum  
{  
  
public int findSum1ToN(int num1, int num2)  
{  
int res = 0; // initializing result  
        
// For every number compute the sum of digits  
// starting from 1 to n  
for (int y = num1; y <= num2; y++)  
{  
res = res + findSumofDigits(y);  
}  
  
return res;  
}  
        
// The method is computing the sum of  
// the digits in the given number num  
public int findSumofDigits(int num)  
{  
    int s = 0;  
    while (num != 0)  
    {  
        s = s + num % 10;  
        num = num / 10;  
    }  
      
    return s;  
}  
  
// main method  
public static void main(String argvs[])  
{  
  
// creating an object of the class ComputeSum  
ComputeSum obj = new ComputeSum();  
int n1 = 1;  
int n2 = 17;  
int result = obj.findSum1ToN(n1, n2);  
  
// displaying the result  
System.out.println("The sum of digits of numbers from " + n1 + " to " + n2 + " is: " + result);  
  
n1 = 1;  
n2 = 340;  
result = obj.findSum1ToN(n1, n2);  
}
}
  