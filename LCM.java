import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,max=0,lcm=0,i;
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b)
        max=a;
        else
        max=b;
        for(i=max;i>0;i++)
        {
            if(i%a==0 && i%b==0)
            {
            lcm=i;
            break;
            }
        }
        System.out.println(lcm);
    }
}