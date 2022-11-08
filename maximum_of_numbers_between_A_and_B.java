import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],a,b,i,count=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
         x[i]=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        int min=0;
        for(i=0;i<n;i++)
        {
        if(x[i]>=a && x[i]<=b)
        {
            if(min<x[i])
            min=x[i];
           count++;
        }
        }
        if(count==0)
         System.out.println("-1");
        else
          System.out.println(min);
          
    }
}