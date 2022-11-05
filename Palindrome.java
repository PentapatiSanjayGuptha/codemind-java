import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,s=0,t;
        n=sc.nextInt();
        t=n;
        while(n>0)
        {
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        if(t==s)
        System.out.print("True");
        else
        System.out.print("False");
    }
}