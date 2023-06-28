import java.util.*;
class Evil
{
    int num;
    int bin;
    Evil()
    {
        num=0;
        bin=0;
    }
    void acceptNum()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a positive number");
        num=in.nextInt();
        binary(num);
    }
    void binary(int x)
    {
        int d,p=0;
        while(x>0)
        {
            d=x%2;
            bin=bin+d*(int)Math.pow(10,p);
            p=p+1;
            x=x/2;
        }
        System.out.println("The binary value is  "+ bin);
    }
    void check()
    {
        int c=0,d;
        while(bin>0)
        {
            d=bin%10;
            if(d==1)
            {
                c=c+1;
            }
            bin=bin/10;
        }
        if(c%2==0)
        {
            System.out.println("Evil number ");
        }
        else
        {
            System.out.println("Not an Evil Number");
        }
    }
    public static void main()
    {
        Evil obj=new Evil();
        obj.acceptNum();
        obj.check();
    }
}
    
    
    