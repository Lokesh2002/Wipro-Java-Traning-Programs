public class IsSecondDigit 
{    
     public static void main(String[] args)
     {
        int a = 18020;
        int secondLastDigit = (a % 100) / 10;
        System.out.println(secondLastDigit);
     }
}