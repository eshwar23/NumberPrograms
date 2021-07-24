import java.util.*;
class DuckNumber
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int num , d, k=0;
        System.out.println("Enter a number");
        num=in.nextInt();
        while(num>0)
        {
            d=num%10;
            if(d==0)
            {
                k=1;
                break;
            }
            num=num/10;
        }
        if(k==0)
        {
            System.out.println("the number is not a duck number");
        }
        else
        {
            System.out.println("The number is a Duck number");
        }
    }
}
        
        