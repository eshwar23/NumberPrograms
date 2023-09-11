// Binary to decimal
import java.util.*;
class DecToBin
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int bin=0,dec=0,d,p=0,t;
        System.out.println("Enter a decimal value");
        dec=in.nextInt();
        t=dec;
        while(dec>0)
        {
            d=dec%2;
            bin=bin+d*(int)Math.pow(10,p);
            p=p+1;
            dec=dec/2;
        }
        System.out.println("Decimal value = "+t +" Binary Value is "+bin); 
    }
}