import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,x[],a,b,max,c=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b)
        max=a;
        else
        max=b;
        for(i=n-1;i>0;i--)
        {
            if(x[i]>max)
            {
            max=x[i];
            c++;
            }
        }
        if(c>0)
        System.out.println(max);
        else
        System.out.println(-1);
        
    }
}