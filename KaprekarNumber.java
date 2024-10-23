/**
A Kaprekar number is a non-negative integer that, when squared and split into two parts, produces 
a sum equal to the original number.
Consider the number 45. 
45^2 = 2025.
Splitting 2025 into two parts: 20 and 25.
Adding the two parts together: 20 + 25 = 45, which is the original number.
-------------------------------------------------------------------------------------
297
297^2 = 88209, right-hand piece of 88209 = 209 and left hand piece of 88209 = 88 
Sum=88+209 = 297, i.e equal to the number
Write a program to input m and n (m<n) and print all the kaprekar numbers[m,n].
-------------------------------------------------------------------------------------*/
import java.util.*;
class KaprekarNumber
{
    public static void main()
    {
         Scanner in = new Scanner(System.in);
         int startvalue, endvalue,i,num,fh,sh,nod,den,sq;
         int den1,shh,fhh,freq=0;
         System.out.println("Enter the start and end limit");
         startvalue=in.nextInt();
         endvalue=in.nextInt();
         for(i=startvalue ;i<=endvalue;i++)
         {
             fhh=0; shh=0; fh=0;sh=0;
             num=i;
             sq=num*num;
             nod=(sq+"").length();
             if(nod%2==0)
             {
                 den=(int)Math.pow(10,nod/2);
                 fh=sq/den;
                 sh=sq%den;
             }
             else
             {
                 den=(int)Math.pow(10,(nod/2)+1);
                 fh=sq/den;
                 sh=sq%den;
                 den1=(int)Math.pow(10,nod/2);
                 shh=sq%den1;
                 fhh=sq/den1;
             }
             
             if(fh+sh==num || fhh+shh==num)
             {
                 freq++; 
                 System.out.print(num+",");   
             }
         }
         System.out.println("The frequency of Kaprekar numbers is "+freq);
    }
}