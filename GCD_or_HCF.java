import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,min,i,gcd=0;
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b)
        min=b;
        else
        min=a;
        for(i=min;i>0;i--)
        {
            if(a%i==0 && b%i==0)
            {
            gcd=i;
            break;
            }
        }
        System.out.print(gcd);
    }
}