import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s,t,b,c;
        s=sc.nextInt();
        t=sc.nextInt();
        b=sc.nextInt();
        c=(2*s*t*b*512)/1024;
        System.out.println(c+"KB");
    }
}