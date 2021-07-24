import java.util.*;
class PerfectNumber
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int num , sof=0,i;
        System.out.println("Enter a number");
        num=in.nextInt();
        for(i=1;i<num;i=i+1)
        {
            if(num%i==0)
            {
                sof=sof+i;
            }
        }
        if(sof==num)
        {
            System.out.println("perfect "+num);
        }
        else
        {
            System.out.println("Not perfect "+num);
        }
    }
}

/*Program 5.12
Write a program to input a number and print it is a perfect number or not.
Sample input:  6
Sample output: 6 is a perfect number
(A number is called perfect if its sum of the factors excluding the number 
is equal to the number some of the examples of perfect numbers are 6, 28).  
(6 = 1+2+3, 28 = 1+2+4+7+14)
*/