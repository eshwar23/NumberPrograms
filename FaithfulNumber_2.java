/*Faithful Numbers
A number is called faithful if you can write it as the sum of distinct powers of 7. 
e.g.,  2457 = 7 + 72 + 74 . If we order all the faithful numbers, 
we get the sequence 1 = 7^0, 7 = 7^1, 8 = 7^0 + 7^1, 49 = 7^2, 50 = 7^0 + 7^2 . . . and so on.
Given some value of N, you have to find the N'th faithful number.

Example 1:

Input:
N = 3
Output:
8
Explanation:
8 is the 3rd Faithful number.
Example 2:

Input:
N = 7
Output:
57
Explanation:
57 is the 7th Faithful number.

Your Task:
You don't need to read input or print anything. 
Your task is to complete the function nthFaithfulNum() 
which takes an Integer N as input and returns the answer.
This program prints the combinationational powers of 7 if the value is faithful number
* 
*/
import java.util.*;
class FaithfulNumber_2
{
    boolean checkFaithful(int num)
    {
        boolean res=false;
        int i=-1,val=0,s=0 ;
        String str="";
        while(val<=num)
        {
            i=i+1;
            val=(int)Math.pow(7,i);
        }
        i=i-1;
        val=0;
        while(i>-1)
        {
            s=s+(int)Math.pow(7,i);
            if(s>num)
            {
                s=s-(int)Math.pow(7,i);
            }
            else
            {
                str="7^"+i+"+"+str;
                if(s==num)
                {
                    break;
                }
            }
            i=i-1;
        }
        if(s==num)
        {
            System.out.println("Faithful number "+ str.substring(0,str.length()-1));
            res=true;
        }
        return res;
    }

    public static void main()
    {
        Scanner in = new Scanner(System.in);
        FaithfulNumber_2 obj=new FaithfulNumber_2();
        int nth,count=0,val=1;
        System.out.println("Enter nth limit");
        nth=in.nextInt();
        while(count<nth)
        {
            if(obj.checkFaithful(val))
            {
                count=count+1;
            }
            val=val+1;
        }
        System.out.println(nth +" Faithful number is "+ (val-1));
    }
}
 