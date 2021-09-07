import java.util.*;
class LuckyNumbers
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int arr[];
        int i ,n,p=1,c=0,k=0,not;
        System.out.println("Enter the limit");
        n=in.nextInt();
        arr=new int[n];
        not=(int)Math.sqrt(n);
        for(i=0;i<n;i++)
        {
            arr[i]=i+1;
        }
        do
        {
            c=0;
            p=p+1;
            for(i=0;i<n;i++)
            {
                if(arr[i]!=0)
                {
                    c=c+1;
                }
                if(c==p)
                {
                    arr[i]=0;
                    c=0;
                }
            }
            System.out.println("values after "+ p +" position deletion-->");
            for(i=0;i<n;i++)
            {
                if(arr[i]!=0)
                    System.out.print(arr[i]+" , ");
            }
            System.out.println();
        }while(++k<not);
        
        System.out.println("Lucky Numbers");
        for(i=0;i<n;i++)
        {
            if(arr[i]!=0)
                System.out.print(arr[i]+" , ");
        }
    }
}
