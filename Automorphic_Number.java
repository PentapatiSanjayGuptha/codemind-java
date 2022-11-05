import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,d,s,r;
        n=sc.nextInt();
        d=(int)Math.log10(n)+1;
        s=n*n;
        r=s%(int)Math.pow(10,d);
        if(r==n)
        System.out.print("Automorphic Number");
        else
        System.out.print("Not an Automorphic Number");
    }
}