/*
 * 
Write a program to perform the following two tasks according to the users choice using switch case

Task 1:
Print the n’th ugly number
Task 2:
Print all the ugly numbers between m and n 

Ugly numbers are numbers whose only prime factors are 2, 3 or 5. The sequence 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, … shows the first 11 ugly numbers. By convention, 1 is included

Note : To accomplish the above two tasks ensure that you use a function boolean Check_Ugly(int num) .This is important so that the code is not repeated.

For an inappropriate choice print the proper message 

 */
import java.util.*;
class UglyNumber
{
    boolean Check_Ugly(int num)
    {
        boolean result = true;
        int i;
        for(i=2;num>1;i++)
        {
            if(num%i==0 &&(i==2 ||i==3 || i==5))
            {
                num=num/i;
                i=i-1;
            }
            else if(num%i==0)
            {
                result=false;
                break;
            }
        }
        return result;
    }
    public static void main()
    {
        UglyNumber obj=new UglyNumber();
        Scanner in = new Scanner(System.in);
        int ch,nth,i=2,m,n,num=2;
        System.out.println("Menu\n1. N-th Ugly Number\n2.Range\n Input 1 or 2");
        ch=in.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Enter position of the Ugly Number required");
                nth=in.nextInt();
                while(i<=nth)
                {
                    if(obj.Check_Ugly(num)==true)
                    {
                        i=i+1;
                    }
                    num=num+1;
                }
                System.out.println("Nth Ugly number "+(num-1));
            break;
            case 2:
                System.out.println("Enter the range");
                m=in.nextInt();
                n=in.nextInt();
                for(i=m;i<=n;i++)
                {
                    if(obj.Check_Ugly(i)==true)
                    {
                        System.out.print(i+ " ,");
                    }
                }
            break;
            default:
                System.out.println("Wrong choice");
        }
    }
}
 