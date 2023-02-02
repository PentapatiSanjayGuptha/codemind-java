import java.util.*;
class Main
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n,x[],a=0,b=0,c=0;
    n=sc.nextInt();
    x=new int[n];
    for(int i=0;i<n;i++)
    {
        x[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
        if(x[i]%2==0)
        {
        a=i;
        break;
        }
    }
    for(int i=n-1;i>0;i--)
    {
        if(x[i]%2==0)
        {
        b=i;
        break;
        }
    }
    for(int i=a;i<=b;i++)
    {
        if(x[i]%2==1)
        c++;
    }
    System.out.println(c);
    }
}