import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c=0;
        n=sc.nextInt();
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==1)
        System.out.println("prime");
        else
        System.out.print("not a prime");
    }
}