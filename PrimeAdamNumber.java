import java.util.*;
class PrimeAdamNumber
{
    boolean Prime(int n)
    {
      boolean r=false;
      int i,c=0;
      for(i=1;i<=n;i++)
      {
          if(n%i==0)
          {
              c=c+1;
          }
      }
      if (c==2)
      {
          r=true;
      }
      return r;
    }
    int reverse(int n)
    {
        int rev=0,d;
        while(n>0)
        {
            d=n%10;
            rev=rev*10+d;
            n/=10;
        }
        return rev;
    }
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int num,rnum;
        System.out.println("Enter a number");
        num=in.nextInt();
        PrimeAdamNumber obj= new PrimeAdamNumber();
        rnum=obj.reverse(num);
        if(obj.Prime(num) && obj.reverse(num*num)==(rnum*rnum))
        {
            System.out.println(num + " is a PrimeAdamNumber");
        }
        else
        {
            System.out.println(num + " is NOT a PrimeAdamNumber");
        }
    }
}
