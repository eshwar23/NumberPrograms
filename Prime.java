import java.util.*;
class Prime
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
        if(c==2)
        {
            System.out.println("prime "+num);
        }
        else
        {
            System.out.println("composite "+num);
        }
    }
}












/*Program 5.11
Write a program to input a number and 
print it is prime or a composite number.
Sample input : 9
Sample output : 9 is a composite number
(A number is prime if it has only 2 factors and
if the number contains more than 2 factors
then it is a composite number)               
 * 
 */

