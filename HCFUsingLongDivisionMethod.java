/*Write a program to print the H.C.F of two given numbers by using Long Division Method
To find the H.C.F. of the given number we will follow the following steps:
1.	We divide the bigger number by smaller one.
2.	Divide smaller number in step 1 with remainder obtained in step 1.
3.	Divide divisor of second step with remainder obtained in step 2.
4.	We will continue this process till we get remainder zero and divisor obtained in end is the required H.C.F.
Let’s take few examples for this:Example 1: Find the H.C.F. of 248 and 492?To find the solution we will follow the following method i.e. we divide bigger number 492 by smaller one i.e. 248
 * 
 */
import java.util.*;
class HCFUsingLongDivisionMethod
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int fn,sn,divisor,dividend,rem;
        System.out.println("Enter two different numbers");
        fn=in.nextInt();
        sn=in.nextInt();
        divisor=fn>sn?sn:fn;// minimum
        dividend=fn>sn?fn:sn;// maximum
        do
        {
            rem=dividend%divisor;
            if(rem==0)
            break;
            dividend=divisor;
            divisor=rem;
            
        }while(rem!=0);
        System.out.println("HCF "+divisor);
    }
}