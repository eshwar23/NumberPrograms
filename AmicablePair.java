
/**
Program 5
Write a program to input two numbers and print they are amicable pair or not.
Sample input : 220  , 284
Sample output :  amicable pair
A pair is said to be amicable if the sum of factors of the first number excluding itself is equal to the second number 
and the sum of factors of the second number excluding itself is equal to the first number.
 */
import java.util.Scanner;
class AmicablePair
{
    public static void main()
    {
        Scanner in = new Scanner (System.in);
        int fn,sn,i,sfn=0,ssn=0;
        System.out.println("Enter two numbers ");
        fn=in.nextInt();
        sn=in.nextInt();
        for(i=1;i<fn;i++)
        {
            if(fn%i==0)
            {
                sfn=sfn+i;
            }
        }
        for(i=1;i<sn;i++)
        {
            if(sn%i==0)
            {
                ssn=ssn+i;
            }
        }
        if(fn==ssn && sn==sfn)
        {
            System.out.println("Amicable pair "+fn+" ,"+sn);
        }
        else
        {
            System.out.println("Not an Amicable pair "+fn+" ,"+sn);
        }
    }
}
