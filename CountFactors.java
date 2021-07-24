import java.util.*;
class CountFactors
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int num , i , c=0;
        System.out.println("Enter a number");
        num=in.nextInt();
        for(i=1;i<=num;i=i+1)
        {
            if(num%i==0)
            {
                c=c+1;
            }
        }
        System.out.println("the number of factors "+c);
    }
}
            