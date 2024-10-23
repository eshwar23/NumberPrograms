
/**
Question 1_2021
A Fascinating number is one which when multiplied by 2 and 3 and then, after the results are concatenated with the original number, the new number contains all the digits from 1 to 9 exactly once. There can be any number of zeros and are to be ignored.
Example: 273
273 x 1 = 273
273 x 2 = 546
273 x 3 = 819
Concatenating the results we get, 273546819 which contains all digits from 1 to 9 exactly once.
Thus, 273 is a Fascinating number.
Accept two positive integers m and n, where m must be less than n and the values of both ‘m’ and ‘n’ must be greater than 99 and less than 10000 as user input. Display all Fascinating numbers that are in the range between m and n (both inclusive) and output them along with the frequency in the format given below.
Test your program with the following data and some random data:
Example 1
INPUT: m =100
n = 500
OUTPUT: THE FASCINATING NUMBERS ARE:
192   219   273   327
FREQUENCY OF FASCINATING NUMBER IS: 4
Example 2
INPUT: m =900
n = 5000 
OUTPUT: THE FASCINATING NUMBERS ARE:
1902   1920   2019   2190   2703   2730   3027   3270
FREQUENCY OF FASCINATING NUMBER IS: 8

Example 3
INPUT: m =400
n = 900 
OUTPUT: THE FASCINATING NUMBERS ARE:
NIL
FREQUENCY OF FASCINATING NUMBER IS: 0
Example 4
INPUT: m =70
n = 450 
OUTPUT: INVALID INPUT

 */
import java.util.*;
class FascinatingNumber
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int ll,ul,len,i,j,k,count=0,c,freq=0;
        String stnum;
        System.out.println("Enter the upper and lower limit");
        ll=in.nextInt();
        ul=in.nextInt();
        if(ll<99 || ll>10000 || ul>99 && ul>10000)
        {
            System.out.println("Out of range: Invalid Input");
            System.exit(0);
        }
        else
        {
            for(i=ll;i<=ul;i++)
            {
                count=0;
                stnum=""+i+(i*2)+(i*3);
                out:
                for(j=49;j<=57;j++)
                {
                    len=stnum.length();
                    c=0;
                    for(k=0;k<len;k++)
                    {
                        if(stnum.charAt(k)==j)
                        {
                            c=c+1;
                        }
                    }
                    if(c==1)
                    {
                        count=count+1;
                    }
                    else
                    {
                        break out;
                    }
                }
                if(count==9)
                {
                    System.out.print(i+",");
                    freq=freq+1;
                }
            }
            System.out.println();
        }
        System.out.println("The number of fascinating numbers are "+freq);
    }
}  
