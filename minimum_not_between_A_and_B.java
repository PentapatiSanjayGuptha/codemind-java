import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],a,b,i,c=0,min=10;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
         x[i]=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(x[i]<a || x[i]>b)
            {
                if(min>x[i])
                min=x[i];
                c++;
            }
        }
        if(c==0)
        System.out.print(-1);
        else
        System.out.print(min);
    }
}