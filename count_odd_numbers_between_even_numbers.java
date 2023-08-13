import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,c=0,a=0,b=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<=n-1;i++)
        {
            if(x[i]%2==0){
            a=i;
            break;
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            if(x[i]%2==0)
            {
            b=i;
            break;
            }
        }
        for(int i=a+1;i<b;i++)
        {
            if(x[i]%2==1)
            c++;
        }
        System.out.print(c);
    }
}