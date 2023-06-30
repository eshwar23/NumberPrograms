/*A Goldbach number is a positive even integer that can be expressed as the sum of two odd
primes.
Note: All even integers greater than 4 are Goldbach numbers
Example:
6=3+3
10 = 3 + 7
10 = 5 + 5
Hence, 6 has one off prime pair 3 and 3. Similarly, 10 has two odd prime pairs, i.e 3 and 7, 5
and 5.
Write a program to accept an even integer ‘N’ where N > 9 and N < 50. Find all the odd
prime pairs whose sum is equal to the number ‘N’.
 * 
 */
import java.util.*;
class GoldbachNumber
{
    int n;
    void input()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        n=in.nextInt();
    }
    boolean CheckEvenOdd()
    {
        boolean r=true;
        if((n%2==1) ||(n<=9 || n>=50))
        {
            r=false;
        }
        return r;
    }
    int checkPrime(int num)
    {
        int i,r=0;
        for(i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                r=1;
                break;
            }
        }
        return r;
    }
    void printPairs()
    {
        int i,j;
        
        for(i=3;i<=n/2;i=i+2)
        {
            for(j=3;j<n;j=j+2)
            {
                if(checkPrime(i)==0 && checkPrime(j)==0 && (i+j==n))
                {
                    System.out.println(i+ " + "+j);
                    break;
                }
            }
        }
    }
    public static void main()
    {
        GoldbachNumber obj = new GoldbachNumber();
        obj.input();
        if(obj.CheckEvenOdd()==false)
        {
            System.out.println("Input value is an even number or out of range");
        }
        else
        {
            obj.printPairs();
        }
    }
}
