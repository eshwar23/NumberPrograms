/*Program 5.8
Write a program to print the factors of a given number.
Sample input : 8
Sample output : 1, 2, 4, 8
(Factors are numbers which divides the other number and gives a remainder of (zero) 0)               
*/
import java.util.*;
class PrintFactors
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int num,i;
        System.out.println("Enter a number");
        num=in.nextInt();
        for(i=1;i<=num;i=i+1)
        {
            if(num%i==0)
            {
                System.out.print(i+" ,");
            }
        }
    }
}
        