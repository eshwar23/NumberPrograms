import java.util.*;
class ReverseTheNumber
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int num , rev=0 , d ;
        System.out.println("Enter a number");
        num = in.nextInt();
        while(num>0)
        {
            d=num%10;
            rev = rev*10+d;
            num=num/10;
        }
        System.out.println("The reverse value is "+rev);
    }
}
