import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,s=0;
        n=sc.nextInt();
        for(i=1;i<=n/2;i++)
        {
            if(n%i==0)
            s=s+i;
        }
        if(s>n)
        System.out.println("True");
        else
        System.out.println("False");
    }
}