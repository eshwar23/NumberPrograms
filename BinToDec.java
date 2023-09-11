// Binary to decimal
import java.util.*;
class BinToDec
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int bin,dec=0,d,p=0,t;
        System.out.println("Enter a binary value");
        bin=in.nextInt();
        t=bin;
        while(bin>0)
        {
            d=bin%10;
            dec=dec+d*(int)Math.pow(2,p);
            p=p+1;
            bin=bin/10;
        }
        System.out.println("Binary value = "+t +" Decimal Value is "+dec); 
    }
}