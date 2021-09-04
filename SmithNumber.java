import java.util.*;
class SmithNumber
{
    int sod(int t)
    {
        int sum=0;
        while(t>0)
        {
            sum=sum+t%10;
            t/=10;
        }
        return(sum);
    }
    public static void main()
    {
        SmithNumber obj = new SmithNumber();
        Scanner in = new Scanner(System.in);
        int num , i ,s=0,temp;
        System.out.println("Enter a number");
        num=in.nextInt();
        temp=num;
        for(i=2;temp>1;i++)
        {
            if(temp%i==0)
            {
                s=s+obj.sod(i);
                temp=temp/i;
                i=i-1;
            }
        }
        if(obj.sod(num)==s)
        {
            System.out.println("smith number "+ num);
        }
        else
        {
            System.out.println("not a smith number "+ num);
        }
    }
}
